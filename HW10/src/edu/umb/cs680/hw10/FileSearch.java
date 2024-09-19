package edu.umb.cs680.hw10;


import java.util.LinkedList;

import edu.umb.cs680.hw10.fs.util.*;

public class FileSearch implements FSCommand{

	
	private String fileName;
	private LinkedList<File> SearchResult=new LinkedList<>();
	
	public void execute(Directory root) {
		
		FileSearchVisitor fcv=new FileSearchVisitor(fileName);
		root.accept(fcv);
		SearchResult=fcv.getFoundFiles();
	
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public LinkedList<File> getSearchResult() {
		return SearchResult;
	}

	

}
