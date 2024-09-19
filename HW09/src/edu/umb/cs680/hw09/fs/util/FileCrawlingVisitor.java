package edu.umb.cs680.hw09.fs.util;

import java.util.LinkedList;

import edu.umb.cs680.hw09.Directory;
import edu.umb.cs680.hw09.File;
import edu.umb.cs680.hw09.Link;

public class FileCrawlingVisitor implements FSVisitor{
	
	LinkedList<File> files=new LinkedList<>();

	@Override
	public void visit(Link link) {
		return;
		
	}

	@Override
	public void visit(File file) {
		files.add(file);
		
	}

	@Override
	public void visit(Directory directory) {
		return;
		
	}
	
	public LinkedList<File> getFiles(){
		return files;
	}

}
