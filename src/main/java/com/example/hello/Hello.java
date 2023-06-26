package com.example.hello;




import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value="/hello")
public class Hello {
	RestTemplate rest = new RestTemplate();
	@GetMapping(value="/getHIviaHellow")
	public String getHellow(){
		String url = "http://localhost:8080/Hi";
		ResponseEntity<String> response=rest.exchange(url,HttpMethod.GET,null,String.class);
		String gr =response.getBody();
		return gr;
	}
	

}

