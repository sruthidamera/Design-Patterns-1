package edu.umb.cs680.hw10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import edu.umb.cs680.hw10.fs.util.CountingVisitor;
import edu.umb.cs680.hw10.fs.util.FileCrawlingVisitor;
import edu.umb.cs680.hw10.fs.util.FileSearchVisitor;


class FSVisitorTest {
	
	static FileSystem fs;
	static Directory root;

	@BeforeAll
	public static void setUpFS() {
		fs=TestFixtureInitializer.createFS();
		root=fs.getRootDirs().get(0);
	}
	
	
	@Test
	public void CountingVisitorTest() {
		CountingVisitor cv=new CountingVisitor();
		root.accept(cv);
		assertEquals(4,cv.getDirNum());
		assertEquals(5,cv.getFileNum());
		assertEquals(1,cv.getLinkNum());
	}
	
	@Test
	public void FileCrawlingVisitorTest() {
		FileCrawlingVisitor fcv=new FileCrawlingVisitor();
		root.accept(fcv);
		assertEquals(5,fcv.getFiles().size());
		
	}
	
	@Test
	public void FileSearchVisitorTest() {
		FileSearchVisitor fcv=new FileSearchVisitor("readme.md");
		root.accept(fcv);
		assertEquals(1,fcv.getFoundFiles().size());
		assertEquals("readme.md",fcv.getFoundFiles().get(0).getName());
		
	}
}
