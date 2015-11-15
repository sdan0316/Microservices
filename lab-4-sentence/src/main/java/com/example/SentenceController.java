package com.example;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SentenceController {
	@Autowired 
	DiscoveryClient client;
	  @RequestMapping("/sentence")
	  public String getSentence() {
	    return 
	     // getWord("LAB-4-SUBJECT") + " "
	     // + getWord("LAB-4-VERB") + " "
	    //  + getWord("lab-4-article") + " "
	    //  + getWord("LAB-4-ADJECTIVE") + "."
	      
	    		 getWord("lab-4-article")  ;
	  }

	  public String getWord(String service) {
	    List<ServiceInstance> list = client.getInstances(service);
	    System.out.println("getWordMethod in Sentence Contoller"+list);
	    if (list != null && list.size() > 0 ) {
	      URI uri = list.get(0).getUri();
	      System.out.println(uri);
	  if (uri !=null ) {
	    return (new RestTemplate()).getForObject(uri,String.class);
	  }
	    }
	    return null;
	  }

}
