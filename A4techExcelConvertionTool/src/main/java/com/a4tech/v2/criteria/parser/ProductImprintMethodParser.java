package com.a4tech.v2.criteria.parser;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.a4tech.util.ApplicationConstants;
import com.a4tech.v2.core.model.ImprintMethod;

public class ProductImprintMethodParser {

	private Logger              _LOGGER              = Logger.getLogger(getClass());
	
	public List<ImprintMethod> getImprintCriteria(String imprintValue){
		
		List<ImprintMethod> impmthdList =new ArrayList<ImprintMethod>();
		try{
	    String impValue = imprintValue;
		String imprintArr[] = impValue.split(ApplicationConstants.CONST_DELIMITER_SPLITTING_PIPE);
		ImprintMethod imprintObj=null;
		for (String tempImpint : imprintArr) {
 			imprintObj=new ImprintMethod();
 			imprintObj.setType(tempImpint.trim());
 			imprintObj.setAlias(tempImpint.trim());
 			impmthdList.add(imprintObj);
		}
		
		}catch(Exception e){
			_LOGGER.error("Error while processing Imprint Method :"+e.getMessage());             
		   	return null;
		   	
		   }
		return impmthdList;
		
	}
}
