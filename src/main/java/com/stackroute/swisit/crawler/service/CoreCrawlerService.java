package com.stackroute.swisit.crawler.service;

public interface CoreCrawlerService {

	public void getPageLinks(String URL);
	public void getArticles();
	public void writeToFile(String filename);
}
