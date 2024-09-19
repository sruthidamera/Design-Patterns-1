package edu.umb.cs680.hw15;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw15.Directory;
import edu.umb.cs680.hw15.FileSystem;
import edu.umb.cs680.hw15.TestFixtureInitializer;

class FileSystemTest {
	static FileSystem fs;
	static Directory root;

	@BeforeAll
	public static void setUpFS() {
		fs=TestFixtureInitializer.createFS();
		root=fs.getRootDirs().get(0);
	}
    @Test
    public void SingletonTestWhetherReturnsSameObject() {
    	FileSystem fs1=FileSystem.getFileSystem();
    	FileSystem fs2=FileSystem.getFileSystem();
    	assertSame(fs1,fs2);
    }
    
    @Test
    public void GetRootDirsTest() {
    	assertEquals("repo",fs.getRootDirs().get(0).getName());
    }
    
    

}
