package id.go.pajak.training.customermag.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController implements ErrorController {
	private static final String PATH = "/error";
	
	@RequestMapping("/")
	public String index() {
		return "Hello world";
	}

	@RequestMapping(value = PATH)
	public String error() {
		return "Error handling";
	}

	public String getErrorPath() {
		return PATH;
	}
}
