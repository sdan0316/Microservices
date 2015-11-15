package com.example.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@RestController
public class ClientController {
	
	 @Value("${lucky-word}") String luckyWord;
	  			
	  @RequestMapping("/lucky-word")
	  public String showLuckyWord() {
	    return "The lucky word is: " ;//+ luckyWord;
	  }
}
