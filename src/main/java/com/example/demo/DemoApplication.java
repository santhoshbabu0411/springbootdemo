package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication 
@Controller
public class DemoApplication {


	@GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "Hello this is my first spring-boot project");
        return "index";
    }

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
