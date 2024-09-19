package edu.umb.cs680.hw10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;



public class FSCommandTest {
	
	static FileSystem fs;
	static Directory root;

	@BeforeAll
	public static void setUpFS() {
		fs=TestFixtureInitializer.createFS();
		root=fs.getRootDirs().get(0);
	}
	
	@Test
	public void CountingTest() {
		
		Counting c=new Counting();
		c.execute(root);
		assertEquals(4,c.getCountDirResult());
		assertEquals(5,c.getCountFileResult());
		assertEquals(1,c.getCountLinkResult());
		
	}
	
	@Test
	public void FileCrawlingTest() {
		FileCrawling fc=new FileCrawling();
		fc.execute(root);
		assertEquals(5,fc.getCrawlResult().size());
		
	}
	
	@Test
	public void FileSearchTest() {
		FileSearch fc=new FileSearch();
		fc.setFileName("readme.md");
		fc.execute(root);
		assertEquals(1,fc.getSearchResult().size());
		assertEquals("readme.md",fc.getSearchResult().get(0).getName());
		
	}
}
