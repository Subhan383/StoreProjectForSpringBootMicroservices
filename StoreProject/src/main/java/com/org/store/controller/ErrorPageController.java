package com.org.store.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;

public class ErrorPageController implements ErrorController {

	@Override
	public String getErrorPath() {

		return "/error";
	}

	@RequestMapping("/error")
	public String error() {
		return "error";
	}

}
