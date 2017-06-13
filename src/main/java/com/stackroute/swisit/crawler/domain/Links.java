package com.stackroute.swisit.crawler.domain;

import java.util.*;

public class Links {

	private HashSet<String> links;
	private List<List<String>> articles;

	public Links() {
		links = new HashSet<>();
		articles = new ArrayList<>();
	}




	public HashSet<String> getLinks() {
		return links;
	}

	public void setLinks(HashSet<String> links) {
		this.links = links;
	}

	public List<List<String>> getArticles() {
		return articles;
	}

	public void setArticles(List<List<String>> articles) {
		this.articles = articles;
	}



	@Override
	public String toString() {
		return "Links [links=" + links + ", articles=" + articles + "]";
	}
	/*private String link;

	public Links() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Links(String link) {
		super();
		this.link = link;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Override
	public String toString() {
		return "Links [link=" + link + "]";
	}

	 */
}
