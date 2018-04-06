package parser.evansManufacturing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.springframework.util.StringUtils;

import com.a4tech.product.model.Color;
import com.a4tech.product.model.Image;
import com.a4tech.product.model.Product;
import com.a4tech.product.model.ProductConfigurations;
import com.a4tech.util.ApplicationConstants;
import com.a4tech.util.CommonUtility;

public class EveanManufactureVariationMapping{
	private static final Logger _LOGGER = Logger.getLogger(EveanManufactureVariationMapping.class);
    private EveanManufactureAttributeParser eveanManufacturAttriParser;
	
	public Map<String, Product> readMapper(Map<String, Product> productMaps, Sheet sheet) {

		int columnIndex = 0;

		Set<String> productXids = new HashSet<String>();
		List<String> repeatRows = new ArrayList<>();
		ProductConfigurations productConfigObj = null;
		Product productExcelObj = new Product();
		//String productId = null;
		String xid = null;
		String prdXid = null;
		List<String> productIds = new ArrayList<>(); 
		List<String> colorsList = new ArrayList<>();
		List<String> imageList = new ArrayList<>();
		StringBuilder colorImage = new StringBuilder();
		try {
			Iterator<Row> iterator = sheet.iterator();
			Product existingProduct = null;
			Row  headerRow = null;
			while (iterator.hasNext()) {

				try {
					Row nextRow = iterator.next();

					if (nextRow.getRowNum() == ApplicationConstants.CONST_NUMBER_ZERO) {
						headerRow = nextRow;
						continue;
					}
					Cell cell1 = nextRow.getCell(1);
					prdXid = CommonUtility.getCellValueStrinOrInt(cell1);
					// this condition used to check xid is present list or not ,
					// if xid present in Map means already fetch product from
					// Map
					if (!productIds.contains(prdXid)) {
						existingProduct = productMaps.get(prdXid);
						productConfigObj = existingProduct.getProductConfigurations();
					}
					productIds.add(prdXid);
					Iterator<Cell> cellIterator = nextRow.cellIterator();
					if (xid != null) {
						productXids.add(xid);
					}
					boolean checkXid = false;

					while (cellIterator.hasNext()) {
						Cell cell = cellIterator.next();
						columnIndex = cell.getColumnIndex();

						if (columnIndex + 1 == 1) {
							Cell cell2 = nextRow.getCell(1);
							prdXid = CommonUtility.getCellValueStrinOrInt(cell2);
							checkXid = true;
						} else {
							checkXid = false;
						}

						if (checkXid) {
							if (!productXids.contains(xid)) {
								if (nextRow.getRowNum() != 1) {
									List<Color> colorList = eveanManufacturAttriParser.getProductColor(colorsList);
									productConfigObj.setColors(colorList);
									productExcelObj.setProductConfigurations(productConfigObj);
									List<Image>  imagesList = eveanManufacturAttriParser.getImages(imageList);
									productExcelObj.setImages(imagesList);
									productMaps.put(prdXid, existingProduct);
									repeatRows.clear();
									colorsList = new ArrayList<>();
									imageList = new ArrayList<>();
								}
								if (!productXids.contains(xid)) {
									productXids.add(xid);
									repeatRows.add(xid);
								}
								
							}
						} else {

							if (productXids.contains(xid) && repeatRows.size() != 1) {
								if (isRepeateColumn(columnIndex + 1)) {
									continue;
								}
							}
						}
						switch (columnIndex+1 ) {
						case 1:// XID
						case 2:// MaterialNumber
						case 3: //price
						case 4:
							break;
						case 5:// COLOR
							String color = cell.getStringCellValue();
							 colorImage.append(color).append(",");
							 colorsList.add(color);
							break;
						case 6: //Images
							String image = cell.getStringCellValue();
							colorImage.append(image);
						break;
					} // end inner while loop
					}
					imageList.add(colorImage.toString());
					
				} catch (Exception e) {
					_LOGGER.error(
							"Error while Processing ProductId and cause :" + productExcelObj.getExternalProductId()
									+ " " + e.getMessage() + "at column number(increament by 1):" + columnIndex);
				}
			}
						if (!StringUtils.isEmpty(productExcelObj.getExternalProductId())) {

			}
			repeatRows.clear();
			productMaps.put(prdXid, existingProduct);
			return productMaps;
		} catch (Exception e) {
			_LOGGER.error(
					"Error while Processing " + sheet.getSheetName() + "+ sheet ,Error message: " + e.getMessage());
			return productMaps;
		} finally {
		}

	}
	private String getHeaderName(int columnIndex,Row headerRow){
		 Cell cell2 =  headerRow.getCell(columnIndex);  
		 String headerName=CommonUtility.getCellValueStrinOrInt(cell2);
		//columnIndex = ProGolfHeaderMapping.getHeaderIndex(headerName);
		return headerName;
	}

	public boolean isRepeateColumn(int columnIndex) {
		if (columnIndex != 5 && columnIndex !=6) {
			return ApplicationConstants.CONST_BOOLEAN_TRUE;
		}
		return ApplicationConstants.CONST_BOOLEAN_FALSE;
	}
	public void setEveanManufacturAttriParser(EveanManufactureAttributeParser eveanManufacturAttriParser) {
		this.eveanManufacturAttriParser = eveanManufacturAttriParser;
	}
}
