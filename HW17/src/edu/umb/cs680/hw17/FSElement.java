package edu.umb.cs680.hw17;

import java.time.LocalDateTime;


public abstract class FSElement {
	protected String name;
	protected int size;
	protected LocalDateTime creationTime;
	protected Directory parent;
	
	public FSElement(Directory parent,String name, int size, LocalDateTime creationTime){
		this.name=name;
		this.size=size;
		this.creationTime=creationTime;
		this.parent=parent;
		if(parent!=null) {
			parent.appendChild(this);
		}
	}
	
	public Directory getParent() {
		return parent;
	}
	
	public int getSize() {
		return size;
	}
	
	public String getName() {
		return name;
	}
	
	
	public LocalDateTime getCreationTime() {
		return creationTime;
	}
	public abstract boolean isDirectory();
	public abstract boolean isLink();
	public abstract boolean isFile();
	
	
}
