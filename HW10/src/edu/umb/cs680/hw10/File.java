package edu.umb.cs680.hw10;

import java.time.LocalDateTime;

import edu.umb.cs680.hw10.fs.util.FSVisitor;

public class File extends FSElement{

	File(Directory parent,String name, int size, LocalDateTime creationTime) {
		super(parent,name, size, creationTime);
		
	}

	@Override
	public boolean isDirectory() {
		return false;
	}
	
	
	@Override
	public boolean isLink() {
		
		return false;
	}

	@Override
	public void accept(FSVisitor v) {
		v.visit(this);
		
	}

	@Override
	public boolean isFile() {
		return true;
	}
}

