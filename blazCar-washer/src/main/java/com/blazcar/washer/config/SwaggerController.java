package com.blazcar.washer.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SwaggerController {

	@RequestMapping(value = "/")
	public String index() {
		return "redirect:swagger-ui.html";
	}
}
