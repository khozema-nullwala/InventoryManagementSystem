package com.accenture.lkm.web.client;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.accenture.lkm.business.bean.MaterialTypeBean;
import com.accenture.lkm.exceptions.MicroServiceException;

@Service
public class MaterialTypeConsumer {
		
	@Value("${MaterialServiceConsumer.serviceURL}")
	private String serviceURL;
	
	@Value("${MaterialTypeConsumer.apiURL}")
	private String apiURL;
	
	@Value("${MaterialTypeConsumer.apiURLByCategoryId}")
	private String apiURLByCategoryId;
	
	private RestTemplate restTemplate;
	
	private List<MaterialTypeBean> materialTypeBeanList;
	
	private Map<String, String> categoryTypeMap;
	
	

	public List<MaterialTypeBean> getMaterialTypeBeanList() throws MicroServiceException {
		// Write Your Code Here
		
		return materialTypeBeanList;
	}

	public Map<String, String> getCategoryTypeMap() throws MicroServiceException {
		// Write Your Code Here
		
		return categoryTypeMap;
	}

	public MaterialTypeConsumer() {
		restTemplate = new RestTemplate();
	}
	
	
	/**
	 * This method is hitting microservice to get the list of Material type.
	 * 
	 * @return
	 * @throws MicroServiceException 
	 */
	private void hitGetMaterialType() throws MicroServiceException {
		// Write Your Code Here
		
	}

	/**
	 * This method is hitting microservice to get the details of Material type based on category id.
	 * @param categoryId
	 * @return
	 * @throws MicroServiceException 
	 */
	public List<MaterialTypeBean> hitGetTypesBasedOnCategoryId(String categoryId) throws MicroServiceException {
		// Write Your Code Here
		// For REST URI use -->  serviceURL + apiURL + apiURLByCategoryId
		
		return null;
	}

}
