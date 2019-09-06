package com.example.client.RestClient.controller;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.client.RestClient.model.Note;

@RestController
//@IgnoreJwt
public class NoteClient {
	
	@Autowired
	RestTemplate restTemplate;
	
	public NoteClient(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	public NoteClient()
	{
		
	}
	
	@RequestMapping(value = "/testclient")
	public String testclient()
	{
		
		/*
		 * HttpResponse<JsonNode> jsonResponse = null; try { jsonResponse =
		 * Unirest.get("https://www.mocky.io/v2/5185415ba171ea3a00704eed")
		 * .header("accept", "application/json").queryString("apiKey", "123").asJson();
		 * } catch (UnirestException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } return jsonResponse.getBody().toString();
		 */
		 
		
	
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		return restTemplate.exchange("http://localhost:8080/api/notes", HttpMethod.GET, entity, String.class).getBody();
		 
	}
	
	@RequestMapping(value = "/postnotewithclient",method = RequestMethod.POST)
	public String postNote(@RequestBody  Note notes)
	{
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Note> entity = new  HttpEntity<Note>(notes,headers);
		return restTemplate.exchange("http://localhost:8080/api/notes", HttpMethod.POST, entity, String.class).getBody();
		
	}
	
	// This code sample uses the  'Unirest' library:
	// http://unirest.io/java.html
	



}
