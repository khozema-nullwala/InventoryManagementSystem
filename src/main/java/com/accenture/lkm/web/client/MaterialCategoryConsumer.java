package com.accenture.lkm.web.client;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import com.accenture.lkm.business.bean.MaterialCategoryBean;
import com.accenture.lkm.exceptions.MicroServiceException;

public class MaterialCategoryConsumer {
	@Value("${MaterialServiceConsumer.serviceURL}")
	private String serviceURL;
	@Value("${MaterialCategoryConsumer.apiURL}")
	private String apiURL;
	@Value("${MaterialCategoryConsumer.apiURLByCategoryId}")
	private String apiURLByCategoryId;
	private RestTemplate restTemplate;
	private List<MaterialCategoryBean> materialCategoryBeanList;
	private Map<String, String> categoryMap;

	public Map<String, String> getCategoryMap() throws MicroServiceException {
		// Write Your Code Here

		return categoryMap;
	}

	public List<MaterialCategoryBean> getMaterialCategoryBeanList() throws MicroServiceException {

		// Write Your Code Here
		
		return materialCategoryBeanList;
	}

	public MaterialCategoryConsumer() {
		restTemplate = new RestTemplate();
	}

	/**
	 * This method is hitting microservice to get the list of Material category.
	 * 
	 * @return
	 * @throws MicroServiceException 
	 */
	private void hitGetMaterialCategories() throws MicroServiceException {
		// Write Your Code Here
		
	}

	/**
	 * This method is hitting microservice to get the details of Material category
	 * for given category id.
	 * 
	 * @param categoryId
	 * @return
	 * @throws MicroServiceException 
	 */
	public MaterialCategoryBean hitGetMaterialCategoryById(String categoryId) throws MicroServiceException {
		MaterialCategoryBean materialCategoryBean = null;		
		// Write Your Code Here
		// For REST URI use -->  serviceURL + apiURL + apiURLByCategoryId
		
		return materialCategoryBean;
	}
}
