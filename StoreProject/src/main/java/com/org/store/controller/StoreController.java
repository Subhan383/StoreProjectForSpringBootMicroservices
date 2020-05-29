package com.org.store.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.org.store.model.Devices;

@Controller
public class StoreController {

	private Devices result;
	private ModelAndView modelAndView;
	

	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@RequestMapping("/{brandName}")
	public ModelAndView device(@PathVariable("brandName") String brandName) {

		
		modelAndView = new ModelAndView("viewDevices");

		switch (brandName.toLowerCase()) {
		case "samsung":

			RestTemplate restTemplate = new RestTemplate();
			result = restTemplate.getForObject("http://SAMSUNG/samsung/devices", Devices.class);
			modelAndView.addObject("devices", result);
			return modelAndView;

		case "apple":

			restTemplate = new RestTemplate();
			result = restTemplate.getForObject("http://APPLE/apple/devices", Devices.class);
			modelAndView.addObject("devices", result);
			return modelAndView;

		default:
			return new ModelAndView("redirect: /error");

		}

	}

}
