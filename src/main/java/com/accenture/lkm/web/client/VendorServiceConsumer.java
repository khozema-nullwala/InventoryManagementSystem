package com.accenture.lkm.web.client;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.accenture.lkm.business.bean.VendorBean;
import com.accenture.lkm.exceptions.MicroServiceException;

@Service
public class VendorServiceConsumer {

	@Value("${VendorServiceConsumer.serviceURL}")
	private String serviceURL;

	@Value("${VendorServiceConsumer.apiURL}")
	private String apiURL;

	private RestTemplate restTemplate;

	List<VendorBean> vendorBeanList;

	Map<String, VendorBean> vendorBeanMap;

	public VendorServiceConsumer() {
		restTemplate = new RestTemplate();
	}

	public List<VendorBean> getVendorBeanList() throws MicroServiceException {
		if(vendorBeanList == null) {
			hitVendorService();
		}
		return vendorBeanList;
	}

	public Map<String, VendorBean> getVendorBeanMap() {
		// complete the code here to create map from vendorBeanList
		return null;
		
	}

	public void hitVendorService() throws MicroServiceException {
		try {
			ResponseEntity<VendorBean[]> response = restTemplate.getForEntity(serviceURL + apiURL, VendorBean[].class);
			List<VendorBean> vendorList = Arrays.asList(response.getBody());
			this.vendorBeanList = vendorList;
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new MicroServiceException();
		}
	}
}
