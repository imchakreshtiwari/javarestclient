package com.example.client.RestClient.model;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;




public class Note   {
	

	  @NotBlank
	  @JsonProperty
	  private String title;
	
	 @NotBlank
	 @JsonProperty
	 private String content;
	 
	
	
	 

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

	 
	

}
