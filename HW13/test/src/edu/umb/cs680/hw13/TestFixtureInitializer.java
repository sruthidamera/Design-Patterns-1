package edu.umb.cs680.hw13;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeAll;

import edu.umb.cs680.hw13.Directory;
import edu.umb.cs680.hw13.File;
import edu.umb.cs680.hw13.FileSystem;
import edu.umb.cs680.hw13.Link;

public class TestFixtureInitializer {
	static Directory repo;
	static Directory src ;
	static Directory test;
	static File readme;
	static File A;
	static File B;
	static Directory SrcTest;
	static File Atest;
	static File Btest;
	static File xyz;
	static Link rm;
	
	public static FileSystem createFS() {
		
	FileSystem fs= FileSystem.getFileSystem();
	
	LocalDateTime currentTime = LocalDateTime.of(2023, 11, 2, 14, 30, 0);
	
	
	repo =new Directory(null,"repo",0,currentTime);
	
	fs.appendRootDir(repo);
	
	
	//root 1st child
	src=new Directory(repo,"src",8,LocalDateTime.of(2023, 11, 2, 14, 30, 2));
	A=new File(src,"A.java",1,LocalDateTime.of(2023, 11, 2, 14, 30, 1));
	B=new File(src,"B.java",1,LocalDateTime.of(2023, 11, 2, 14, 30, 1));
	
	//2nd child
	test=new Directory(repo,"test",1,LocalDateTime.of(2023, 11, 2, 14, 30, 4));
	SrcTest=new Directory(test,"test-src",0,LocalDateTime.of(2023, 11, 2, 14, 30, 1));
	Atest= new File(SrcTest,"Atest.java",1,LocalDateTime.of(2023, 11, 2, 14, 30, 1));
	Btest= new File(SrcTest,"Btest.java",1,LocalDateTime.of(2023, 11, 2, 14, 30, 1));
	
	
	
	
	//3rd child
	readme=new File(repo,"readme.md",3,LocalDateTime.of(2023, 11, 2, 14, 30, 1));
	
	xyz=new File(repo,"xyz",0,LocalDateTime.of(2023, 11, 2, 14, 30, 0));
	
	
	//link
	rm=new Link(SrcTest,"rm.md",0, LocalDateTime.of(2023, 11, 2, 14, 30, 1),readme);
	
	
	

	
	return fs;
	}
}
