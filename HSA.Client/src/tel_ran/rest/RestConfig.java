package tel_ran.rest;

import java.util.Base64;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

public class RestConfig {
	public  RestTemplate restTemplate = new RestTemplate();
	public  String URL = "http://localhost:8080";
	public  HttpHeaders headers = new HttpHeaders();
	
	public RestConfig(String adminAuth){
		String tokenStr = adminAuth;
		String tokenBase64 = Base64.getEncoder().encodeToString(tokenStr.getBytes());
		headers.add("Authorization", "Basic " + tokenBase64);
		//headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set(HttpHeaders.CONTENT_TYPE, "application/json");
		
	}
}
