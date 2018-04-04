package parser.cb;
import java.util.ArrayList;
import java.util.List;

import com.a4tech.product.model.Color;
import com.a4tech.product.model.Combo;
import com.a4tech.product.model.Configurations;
import com.a4tech.product.model.ImprintMethod;
import com.a4tech.product.model.Inventory;
import com.a4tech.product.model.ProductNumber;
import com.a4tech.product.model.ProductSKUConfiguration;
import com.a4tech.product.model.ProductSkus;
import com.a4tech.product.model.Value;


public class CBAttributeParser {

	public List<Color> getColorValue(List<String> colorsList) {
		
		List<Color> colorList = new ArrayList<Color>();
		
		Color colorObj=new Color();
	    String colorArr[]=colorsList.toString().replace("[", "").replace("]", "").split(",");
		Combo combovalue = new Combo();

		
	    for (String colorsValue : colorArr) {
	    	colorObj=new Color();	
	    	
	    	if(colorsValue.contains("/"))
	    	{
	    	combovalue = new Combo();
	    	List<Combo> combolist = new ArrayList<Combo>();
	    	String ComboColorArr[]=	colorsValue.split("/");
	    	colorObj.setAlias(colorsValue.trim());
	    	if(CBlookup.COLOR_MAP.containsKey(ComboColorArr[0])){
	    		combovalue.setName(CBlookup.COLOR_MAP.get(ComboColorArr[0].trim()));
	    	}else{
	    		combovalue.setName("Other");	
	    	}
	    	if(CBlookup.COLOR_MAP.containsKey(ComboColorArr[1])){
	    	combovalue.setName(CBlookup.COLOR_MAP.get(ComboColorArr[1].trim()));
	    	}else{
	    		combovalue.setName("Other");	

	    	}
	    	combolist.add(combovalue);
	    	colorObj.setCombos(combolist);
	    	colorList.add(colorObj);
	    	}else
	    	{
	    		colorObj.setAlias(colorsValue);
	    		if(CBlookup.COLOR_MAP.containsKey(colorsValue)){
	    		colorObj.setName(CBlookup.COLOR_MAP.get(colorsValue.trim()));
	    		}else
	    		{
	    			colorObj.setName("Other");
	    		}
	    		colorList.add(colorObj);
	    	}
		}
		return colorList;
	}

	public List<ProductNumber> getProductNO(List<String> productNOList, List<String> colorsList) {
		List<ProductNumber> listOfProductNo = new ArrayList<>();
		List<Configurations> listOfConf= new ArrayList<>();
		List<Object> listOfValue= new ArrayList<>();

		ProductNumber ProdNoObj=new ProductNumber();
		Configurations confObj=new Configurations(); 
		
	    String prodNoArr[]=productNOList.toString().replace("[", "").replace("]", "").split(",");

	    String colorArr[]=colorsList.toString().replace("[", "").replace("]", "").split(",");

	    for(int i=0;i<prodNoArr.length;i++)
	    {
	    	listOfConf= new ArrayList<>();
			ProdNoObj=new ProductNumber();
	    	listOfValue= new ArrayList<>();
			confObj=new Configurations(); 
			
	   		listOfValue.add(colorArr[i]);
			confObj.setCriteria("Product Color");
			confObj.setValue(listOfValue);
			listOfConf.add(confObj);
			
			ProdNoObj.setProductNumber(prodNoArr[i]);
			ProdNoObj.setConfigurations(listOfConf);

			listOfProductNo.add(ProdNoObj);
	    }

		return listOfProductNo;
	}

	public List<ProductSkus> getSKU(List<String> sKUList,
			List<String> sizelist, List<String> colorsList) {

		ProductSkus productSku = new ProductSkus();
		List<ProductSkus> listProductSKU = new ArrayList<>();
		List<ProductSKUConfiguration> listSkuConfigs = new ArrayList<>();
		List<Object> listOfValue= new ArrayList<>();

		ProductSKUConfiguration confgObj = new ProductSKUConfiguration();
        Value valObj=new Value();
		
	    String skuArr[]=sKUList.toString().replace("[", "").replace("]", "").split(",");
	    String sizeNoArr[]=sizelist.toString().replace("[", "").replace("]", "").split(",");
	    String colorArr[]=colorsList.toString().replace("[", "").replace("]", "").split(",");

	    for(int i=0;i<skuArr.length;i++){
	    	productSku = new ProductSkus();
	    	Inventory inventory = getInventory();
	    	listOfValue= new ArrayList<>();
	    	listSkuConfigs = new ArrayList<>();
	    	productSku.setSKU(skuArr[i]);
	    	productSku.setHazmat("UNSPECIFIED");
	    	
	    	if(!colorArr[i].isEmpty()){
	    		listOfValue= new ArrayList<>();
	    		confgObj = new ProductSKUConfiguration();
	    	confgObj.setCriteria("Product Color");	
	    	listOfValue.add(colorArr[i]);
	    	confgObj.setValue(listOfValue);
	    	listSkuConfigs.add(confgObj);
	    	}
	    	sizeNoArr[i]=sizeNoArr[i].trim().replace("XXXL","3XL");
	    	if(!sizeNoArr[i].isEmpty())
	    	{
	    	valObj=new Value();
	    	listOfValue= new ArrayList<>();
	    	confgObj = new ProductSKUConfiguration();
	    	if(sizeNoArr[i].trim().length()==4)
	    	{
	    		sizeNoArr[i]=sizeNoArr[i].trim();
	    		sizeNoArr[i]=sizeNoArr[i].substring(0, 2)+"x"+ sizeNoArr[i].substring(2, sizeNoArr[i].length()) ;

		    	confgObj.setCriteria("Apparel-Waist/Inseam");
	    	}else{
	    	confgObj.setCriteria("Standard & Numbered");
	    	}
	    	valObj.setValue(sizeNoArr[i]);
		    listOfValue.add(valObj);
		    confgObj.setValue(listOfValue);
		    listSkuConfigs.add(confgObj);

	    	}
	    	
	    	productSku.setConfigurations(listSkuConfigs);
			productSku.setInventory(inventory);
			listProductSKU.add(productSku);

      	}
		
		
		return listProductSKU;
	}
	
	
	private Inventory getInventory(){
		Inventory inventory = new Inventory();
		inventory.setInventoryLink("");
		inventory.setInventoryQuantity("");
		inventory.setInventoryStatus("");
		return inventory;
	}

	public List<ImprintMethod> getImprintMethod(String ImprintMethod) {

		List<ImprintMethod> listOfImprintMethod = new ArrayList<>();
		ImprintMethod imprintMethdObj=new ImprintMethod();

		imprintMethdObj.setAlias("Unimprinted");
		imprintMethdObj.setType("Unimprinted");
		
		listOfImprintMethod.add(imprintMethdObj);
		
		return listOfImprintMethod;
	}
}
