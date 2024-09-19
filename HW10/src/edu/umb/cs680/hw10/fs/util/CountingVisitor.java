package edu.umb.cs680.hw10.fs.util;

import edu.umb.cs680.hw10.Directory;
import edu.umb.cs680.hw10.File;
import edu.umb.cs680.hw10.Link;

public class CountingVisitor implements FSVisitor{
	int dirNum=0, fileNum=0,linkNum=0;

	@Override
	public void visit(Link link) {
		linkNum++;
		
	}

	@Override
	public void visit(File file) {
		fileNum++;
		
	}

	@Override
	public void visit(Directory directory) {
		dirNum++;
		
	}
	
	public int getDirNum() {
		return dirNum;
	}

	public int getFileNum() {
		return fileNum;
	}
	
	public int getLinkNum() {
		return linkNum;
	}
}
