package edu.umb.cs680.hw15;

import java.time.LocalDateTime;


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
	public boolean isFile() {
		return true;
	}
}

