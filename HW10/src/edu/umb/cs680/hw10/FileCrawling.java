package edu.umb.cs680.hw10;

import java.util.LinkedList;

import edu.umb.cs680.hw10.fs.util.*;

public class FileCrawling implements FSCommand{

	private LinkedList<File> CrawlResult=new LinkedList<>();

	public void execute(Directory root) {
	
		FileCrawlingVisitor fcv=new FileCrawlingVisitor();
		root.accept(fcv);
		CrawlResult=fcv.getFiles();
	}
	
	public LinkedList<File> getCrawlResult() {
		return CrawlResult;
	}

}
