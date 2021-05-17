package com.minigamestory;
import lombok.Data;

@Data
public class Report {

	   private String date;
	   private String news;

	   public Report(String date, String news) { 
	      this.date = date;
	      this.news = news;
	   }

}
