package com.web.scraping;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class WebScrapper {

	public static void main(String[] args) {
		try {
			String url = "https://news.ycombinator.com/";
			
			Document doc = Jsoup.connect(url).get();
			// This line will be printing the whole page html for us
			System.out.println(doc.toString());
			
			Elements titleLines = doc.select("span.titleline");
			//This will be getting all the titles present in ycombinator page
			System.out.println("This is printing all the titles in ycombinator page. :) ");
			
			int i=1;
            for (Element titleLine : titleLines) {
                System.out.println("Title " +i+" : "+ titleLine.text());
                i++;
            }
			System.out.println("Done getting all the titles");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
