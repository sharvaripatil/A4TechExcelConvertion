package com.a4tech.supplier.mapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.util.StringUtils;

import parser.maxplus.MaxpluProductAttributeParser;
import parser.maxplus.MaxplusPriceGridParser;

import com.a4tech.excel.service.IExcelParser;
import com.a4tech.product.dao.service.ProductDao;
import com.a4tech.product.model.Color;
import com.a4tech.product.model.Image;
import com.a4tech.product.model.ImprintMethod;
import com.a4tech.product.model.ImprintSize;
import com.a4tech.product.model.Inventory;
import com.a4tech.product.model.PriceGrid;
import com.a4tech.product.model.Product;
import com.a4tech.product.model.ProductConfigurations;
import com.a4tech.product.model.ProductionTime;
import com.a4tech.product.model.RushTime;
import com.a4tech.product.model.ShippingEstimate;
import com.a4tech.product.model.Size;
import com.a4tech.product.model.Theme;
import com.a4tech.product.service.postImpl.PostServiceImpl;
import com.a4tech.util.ApplicationConstants;
import com.a4tech.util.CommonUtility;

public class GempirepromotionsMapping implements IExcelParser {
	private static final Logger _LOGGER = Logger
			.getLogger(GempirepromotionsMapping.class);
	
	private PostServiceImpl postServiceImpl;
	private ProductDao productDaoObj;
	private MaxpluProductAttributeParser maxplusAttribute;
	private MaxplusPriceGridParser pricegrid; 
	
	@Override
	public String readExcel(String accessToken, Workbook workbook,
			Integer asiNumber, int batchId) {		
		List<String> numOfProductsSuccess = new ArrayList<String>();
		List<String> numOfProductsFailure = new ArrayList<String>();
		Set<String> productXids = new HashSet<String>();
		List<PriceGrid> priceGrids = new ArrayList<PriceGrid>();
		List<ProductionTime> listProductionTime = new ArrayList<ProductionTime>();
		List<Color> listColor = new ArrayList<Color>();
		List<ImprintMethod> listimprintMethods = new ArrayList<ImprintMethod>();
		List<ImprintSize> listimprintSize = new ArrayList<ImprintSize>();
		List<Image> listImage= new ArrayList<Image>();		
		Product productExcelObj = new Product();
		ProductConfigurations productConfigObj = new ProductConfigurations();
		ProductionTime prodtimeObj=new ProductionTime();
		RushTime rushserviceObj=new RushTime();
        StringBuilder ImprintMethod=new StringBuilder();
        StringBuilder ImprintSize=new StringBuilder();
        StringBuilder Image=new StringBuilder();
    	StringBuilder listOfQuantity = new StringBuilder();
		StringBuilder listOfPrices = new StringBuilder();
		
        ShippingEstimate shippingEstimateObj=new ShippingEstimate();
        Size sizeObj=new Size();

		
		String productName = null;
		String productId = null;
		String finalResult = null;
		Product existingApiProduct = null;
		int columnIndex = 0;
		String xid = null;
		Cell cell2Data = null;
		String ProdNo = null;
		String AdditionalInfo1=null;
		String ShippingItem=null;
		String Image1=null;
		String Image2=null;
		String Image3=null;
		String Image4=null;
		String Image5=null;
		String Image6=null;
		String Image7=null;
		String Image8=null;
		String Image9=null;
		String Image10=null;
		String Quantity1=null;
		String Quantity2=null;
		String Quantity3=null;
		String Quantity4=null;
		String Quantity5=null;

		String ListPrice1=null;
		String ListPrice2=null;
		String ListPrice3=null;
		String ListPrice4=null;
		String ListPrice5=null;
		
		String ListAllprice=null;
		String ListAllquantity=null;



		try {

			_LOGGER.info("Total sheets in excel::"
					+ workbook.getNumberOfSheets());
			Sheet sheet = workbook.getSheetAt(0);
			Iterator<Row> iterator = sheet.iterator();
			_LOGGER.info("Started Processing Product");

			while (iterator.hasNext()) {

				try {
					Row nextRow = iterator.next();
					if (nextRow.getRowNum() < 1)
						continue;
					Iterator<Cell> cellIterator = nextRow.cellIterator();
					if (productId != null) {
						productXids.add(productId);
					}
					boolean checkXid = false;

					while (cellIterator.hasNext()) {
						Cell cell = cellIterator.next();
						/* int */columnIndex = cell.getColumnIndex();
						cell2Data = nextRow.getCell(3);
						if (columnIndex + 1 == 1) {
							if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
								xid = cell.getStringCellValue();
							} else if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
								xid = String.valueOf((int) cell
										.getNumericCellValue());
							} else {
								ProdNo = CommonUtility
										.getCellValueStrinOrInt(cell2Data);
								ProdNo = ProdNo.substring(0, 14);
								xid = ProdNo;
							}
							checkXid = true;
						} else {
							checkXid = false;
						}
						if (checkXid) {
							if (!productXids.contains(xid)) {
								if (nextRow.getRowNum() != 1) {
									System.out
											.println("Java object converted to JSON String, written to file");

									productExcelObj.setPriceGrids(priceGrids);
			
									productExcelObj.setProductConfigurations(productConfigObj);
									productExcelObj
											.setProductConfigurations(productConfigObj);

									int num = postServiceImpl.postProduct(
											accessToken, productExcelObj,
											asiNumber, batchId);
									if (num == 1) {
										numOfProductsSuccess.add("1");
									} else if (num == 0) {
										numOfProductsFailure.add("0");
									} else {

									}
									_LOGGER.info("list size>>>>>>>"
											+ numOfProductsSuccess.size());
									_LOGGER.info("Failure list size>>>>>>>"
											+ numOfProductsFailure.size());

									productConfigObj = new ProductConfigurations();
							

								}
								if (!productXids.contains(xid)) {
									productXids.add(xid.trim());
								}
								existingApiProduct = postServiceImpl
										.getProduct(accessToken,
												xid = xid.replace("\t", ""));
								if (existingApiProduct == null) {
									_LOGGER.info("Existing Xid is not available,product treated as new product");
									productExcelObj = new Product();
								} else {
									 productExcelObj=existingApiProduct;
									 productConfigObj=existingApiProduct.getProductConfigurations();
									 
										List<Image> Img = existingApiProduct
												.getImages();
										productExcelObj.setImages(Img);
										
										List<Theme> themeList=productConfigObj.getThemes();
								    	 productConfigObj.setThemes(themeList);
								    	 
								    	 List<String>categoriesList=existingApiProduct.getCategories();
								    	 productExcelObj.setCategories(categoriesList);
									 
									 
								}
								// productExcelObj = new Product();
							}
							
						}

						switch (columnIndex + 1) {
						case 1://XID

							productExcelObj.setExternalProductId(xid);
							break;

						case 2:// productcode

							
							 ProdNo=cell.getStringCellValue();
							 productExcelObj.setAsiProdNo(ProdNo);

							break;
							
						case 3: // productname

							String Inventory=cell.getStringCellValue();
							
							if (!StringUtils.isEmpty(Inventory)) {
                            Inventory invtObj=new Inventory();
                            invtObj.setInventoryLink(Inventory);
							productExcelObj.setInventory(invtObj);
							}
							
							break;	
							
						case 8: // productdescription

							productName = cell.getStringCellValue();
							int len=productName.length();
							 if(len>60){
								String strTemp=productName.substring(0, 60);
								int lenTemp= strTemp.lastIndexOf(ApplicationConstants.CONST_VALUE_TYPE_SPACE);
								productName=(String) strTemp.subSequence(0, lenTemp);
							}
							productExcelObj.setName(productName);


							break;	
					
						case 9: // productdescription

							String Summary=cell.getStringCellValue();
							if (!StringUtils.isEmpty(Summary)) {
						    Summary=Summary.substring(0, 130);
							productExcelObj.setSummary(Summary);	
							}
							break;	
							
						case 23: //Size

							String description = cell.getStringCellValue();
							description=description.replace("?","").replace("�","").replace("�", "").replace(":", "");
							if (!StringUtils.isEmpty(description)) {
								productExcelObj.setDescription(description);
							} else {
								productExcelObj
										.setDescription(productName);
							}

							break;	
					
						case 25: // Options & Accessories

							 Image1=cell.getStringCellValue();
							 if (!StringUtils.isEmpty(Image1)) {	
								Image=Image.append(Image1).append(",");
							  }

							break;	
					
						case 26: //Set up Charge

							 Image2=cell.getStringCellValue();
							 if (!StringUtils.isEmpty(Image2)) {	
									Image=Image.append(Image2).append(",");
								  }

							break;	
							
						case 27: // Plating

							 Image3=cell.getStringCellValue();
							 if (!StringUtils.isEmpty(Image3)) {	
									Image=Image.append(Image3).append(",");
								  }

							break;	
							
						case 28: // Comments

							 Image4=cell.getStringCellValue();
							 if (!StringUtils.isEmpty(Image4)) {	
									Image=Image.append(Image4).append(",");
								  }
							break;	
							
						case 29: // Options & Accessories1

							 Image5=cell.getStringCellValue();
							 if (!StringUtils.isEmpty(Image5)) {	
									Image=Image.append(Image5).append(",");
								  }
							break;	
							
						case 30: // 2nd Side

							 Image6=cell.getStringCellValue();
							 if (!StringUtils.isEmpty(Image6)) {	
									Image=Image.append(Image6).append(",");
								  }
							break;	
							
						case 31: // Keyfetch

							 Image7=cell.getStringCellValue();
							 if (!StringUtils.isEmpty(Image7)) {	
									Image=Image.append(Image7).append(",");
								  }
							break;	
							
						case 32: //Standard Production

							 Image8=cell.getStringCellValue();
							 if (!StringUtils.isEmpty(Image8)) {	
									Image=Image.append(Image8).append(",");
								  }
							break;	
							
						case 34: // Carton Weight (Lbs)

							 Image9=cell.getStringCellValue();
							 if (!StringUtils.isEmpty(Image9)) {	
									Image=Image.append(Image9).append(",");
								  }
							break;	
	
						case 35: //Carton Width

							 Image10=cell.getStringCellValue();
							 if (!StringUtils.isEmpty(Image10)) {	
									Image=Image.append(Image10).append(",");
									Image10=Image1.toString();
									 listImage=maxplusAttribute.getImages(Image10);
								  }
							 productExcelObj.setImages(listImage);


							break;	
													
							
						case 36: // Carton Height

		                    ListPrice1=CommonUtility.getCellValueStrinOrDecimal(cell);

							break;	
							
							
						case 37: // Carton Length

							 Quantity1=CommonUtility.getCellValueStrinOrInt(cell);


							break;	
							
							
						case 38: // Units Per Carton

		                    ListPrice2=CommonUtility.getCellValueStrinOrDecimal(cell);


							break;	
							
							
						case 41: // price_1 start here

							 Quantity2=CommonUtility.getCellValueStrinOrInt(cell);

							break;	
							
						case 42: //pricename_1


							 Quantity2=CommonUtility.getCellValueStrinOrInt(cell);

							break;
							
							
						case 345: // quantityunit_5

		                    ListPrice3=CommonUtility.getCellValueStrinOrDecimal(cell);


							break;	
							

							
						

						} // end inner while loop

					}
					// set product configuration objects

					// end inner while loop
					productExcelObj.setPriceType("L");
					
					priceGrids = pricegrid.getPriceGrids(ListAllprice,
							ListAllquantity, "R", "USD",
					         "", true, "N",productName ,""/*,priceGrids*/);

				} catch (Exception e) {
					_LOGGER.error("Error while Processing ProductId and cause :"
								+ productExcelObj.getExternalProductId()
							+ " "
							+ e.getMessage() + "case" + columnIndex);
				}
			}
			workbook.close();

			
			productExcelObj.setPriceGrids(priceGrids);
			productExcelObj.setProductConfigurations(productConfigObj);
			int num = postServiceImpl.postProduct(accessToken, productExcelObj,
					asiNumber, batchId);
			if (num == 1) {
				numOfProductsSuccess.add("1");
			} else if (num == 0) {
				numOfProductsFailure.add("0");
			} else {

			}
			_LOGGER.info("list size>>>>>>" + numOfProductsSuccess.size());
			_LOGGER.info("Failure list size>>>>>>"
					+ numOfProductsFailure.size());
			finalResult = numOfProductsSuccess.size() + ","
					+ numOfProductsFailure.size();
			productDaoObj.saveErrorLog(asiNumber, batchId);
			productConfigObj = new ProductConfigurations();

			return finalResult;
		} catch (Exception e) {
			_LOGGER.error("Error while Processing excel sheet "
					+ e.getMessage());
			return finalResult;
		} finally {
			try {
				workbook.close();
			} catch (IOException e) {
				_LOGGER.error("Error while Processing excel sheet "
						+ e.getMessage());

			}
			_LOGGER.info("Complted processing of excel sheet ");
			_LOGGER.info("Total no of product:" + numOfProductsSuccess.size());
		}

	}
	
	public MaxpluProductAttributeParser getMaxplusAttribute() {
		return maxplusAttribute;
	}

	public void setMaxplusAttribute(MaxpluProductAttributeParser maxplusAttribute) {
		this.maxplusAttribute = maxplusAttribute;
	}

	public PostServiceImpl getPostServiceImpl() {
		return postServiceImpl;
	}

	public void setPostServiceImpl(PostServiceImpl postServiceImpl) {
		this.postServiceImpl = postServiceImpl;
	}

	public ProductDao getProductDaoObj() {
		return productDaoObj;
	}

	public void setProductDaoObj(ProductDao productDaoObj) {
		this.productDaoObj = productDaoObj;
	}

	public MaxplusPriceGridParser getPricegrid() {
		return pricegrid;
	}

	public void setPricegrid(MaxplusPriceGridParser pricegrid) {
		this.pricegrid = pricegrid;
	}
	
	

}