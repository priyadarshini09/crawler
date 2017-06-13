package com.stackroute.swisit.crawler.controller;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.swisit.crawler.domain.Links;
import com.stackroute.swisit.crawler.service.CoreCrawlerService;

@RestController
@RequestMapping(value="/crawler")
public class CoreCrawlerController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	private CoreCrawlerService coreCrawlerService;
	
	@Autowired
	public void setCoreCrawlerService(CoreCrawlerService coreCrawlerService){
		this.coreCrawlerService=coreCrawlerService;
	}
	
	@RequestMapping(value="/link" , method=RequestMethod.GET)
	public void getPageLinks(){
		System.out.println("url done");
		coreCrawlerService.getPageLinks("http://www.mkyong.com");
		coreCrawlerService.getArticles();
		coreCrawlerService.writeToFile("urlLinks");
		
	}
}