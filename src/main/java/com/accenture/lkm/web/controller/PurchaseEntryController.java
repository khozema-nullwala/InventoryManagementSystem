package com.accenture.lkm.web.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.accenture.lkm.business.bean.PurchaseBean;
import com.accenture.lkm.business.bean.VendorBean;
import com.accenture.lkm.exceptions.MicroServiceException;
import com.accenture.lkm.web.client.VendorServiceConsumer;

@Controller
public class PurchaseEntryController {

	@Autowired
	private VendorServiceConsumer vendorServiceConsumer;
	
	@RequestMapping(value = "purchaseEntry.html", method = RequestMethod.GET)
	public ModelAndView purchaseEntry() throws Exception {		
		ModelAndView mv = new ModelAndView();
		// prepare the model to attach with spring form modelAttribute
		PurchaseBean purchaseBean = new PurchaseBean();
		// pass the model to the view
		mv.addObject("purchaseBean", purchaseBean);
		//set the view to display
		mv.setViewName("PurchaseEntry");
		return mv;
	}

	@RequestMapping(value = "purchaseEntry.html", method = RequestMethod.POST)
	public ModelAndView savePurchaseEntry(@Valid @ModelAttribute PurchaseBean purchaseBean, BindingResult results) throws Exception {		
		ModelAndView mv = new ModelAndView();
		String viewName = null;
		if(results.hasErrors()) {
			// set the view name
			viewName = "PurchaseEntry";
			
			
		}else {
			// set the view name to redirect to success page displaying the transaction id
			viewName = "PurchaseSuccess";
			
		}
		
		mv.setViewName(viewName);		
		return mv;
	}
	
	@ModelAttribute("vendorList")
	public List<VendorBean> getVendorDetails() throws MicroServiceException {
		return vendorServiceConsumer.getVendorBeanList();
	}
	
	
	@ExceptionHandler(value = MicroServiceException.class)
	public ModelAndView error(Exception ex) {		
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("errMsg", ex.getMessage());
		return mv;		
	}
}
