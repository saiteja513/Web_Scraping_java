package com.web.scraping;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


public class WebScrapper {

	public static void main(String[] args) {
		try {
			String url = "https://news.ycombinator.com/";
			Document doc = Jsoup.connect(url).get();
			// This line will be printing the whole page html for us
			System.out.println(doc.toString());
			
            
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
