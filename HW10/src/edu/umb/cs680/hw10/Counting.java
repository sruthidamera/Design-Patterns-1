package edu.umb.cs680.hw10;


import edu.umb.cs680.hw10.fs.util.*;


public class Counting implements FSCommand{
	
	private int CountDirResult=0;
	private int CountFileResult=0;
	private int CountLinkResult=0;

	@Override
	public void execute(Directory root) {
		
		CountingVisitor cv=new CountingVisitor();
		root.accept(cv);
		CountDirResult=cv.getDirNum();
		CountFileResult=cv.getFileNum();
		CountLinkResult=cv.getLinkNum();
	}

	public int getCountDirResult() {
		return CountDirResult;
	}

	public int getCountFileResult() {
		return CountFileResult;
	}

	public int getCountLinkResult() {
		return CountLinkResult;
	}

	

}
