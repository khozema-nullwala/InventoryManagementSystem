package com.accenture.lkm.web.client;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.accenture.lkm.business.bean.UnitBean;
import com.accenture.lkm.exceptions.MicroServiceException;

@Service
public class UnitServiceConsumer {
		
	@Value("${MaterialServiceConsumer.serviceURL}")
	private String serviceURL;
	
	@Value("${UnitServiceConsumer.apiURL}")
	private String apiURL;
	
	@Value("${UnitServiceConsumer.apiURLByCategoryId}")
	private String apiURLByCategoryId;
	
	private List<UnitBean> unitBeanList;
	
	private Map<String, String> unitMap;
	
	private RestTemplate restTemplate;	
	
	public List<UnitBean> getUnitBeanList() throws MicroServiceException {
		// Write Your Code Here
		
		return unitBeanList;
	}

	public Map<String, String> getUnitMap() throws MicroServiceException {
		// Write Your Code Here
		
		return unitMap;
	}

	public UnitServiceConsumer(){
		restTemplate =  new RestTemplate();
	}
	
	/**
	 * This method is hitting microservice to get the list of unit.
	 * 
	 * @return
	 * @throws MicroServiceException 
	 */
	private void hitGetUnitDetails() throws MicroServiceException {
		// Write Your Code Here
	
	}

	/**
	 * This method is hitting microservice to get the list of unit available for a given category id.
	 * @param categoryId
	 * @return
	 * @throws MicroServiceException 
	 */
	public List<UnitBean> hitGetUnitsByCategoryId(String categoryId) throws MicroServiceException{
		// Write Your Code Here
		
		return null;
	}


}
