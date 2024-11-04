package gu2024.os.test.spring_boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "스프링";
	}

	@GetMapping("/search")
	public String search() {
		return "검색";
	}

}