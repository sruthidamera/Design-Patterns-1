package edu.umb.cs680.hw13;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class AlphabeticalComparatorTest  {

	static FileSystem fs;
	static Directory root;
	static Directory src ;
	static Directory test;
	static File readme;
	static File xyz;

	@BeforeAll
	public static void setUpFS() {
		fs=TestFixtureInitializer.createFS();
		root=fs.getRootDirs().get(0);
		src =(Directory) root.getChildren().get(1);
		test=(Directory) root.getChildren().get(2);
		readme=(File) root.getChildren().get(0);
		xyz=(File) root.getChildren().get(3);
		
	}
	
	@Test
    void GetChildrenTest() {
        AlphabeticalComparator comparator = new AlphabeticalComparator();
        LinkedList<FSElement> expected = new LinkedList<>(Arrays.asList(readme,src,test,xyz));
        LinkedList<FSElement> actual = root.getChildren(comparator);
        assertEquals(expected, actual);
    }

    @Test
    void GetSubDirectoriesTest() {
        AlphabeticalComparator comparator = new AlphabeticalComparator();
        LinkedList<Directory> expected = new LinkedList<>(Arrays.asList(src, test));
        LinkedList<Directory> actual = root.getSubDirectories(comparator);
        assertEquals(expected, actual);
    }

    @Test
    void GetFilesTest() {
        AlphabeticalComparator comparator = new AlphabeticalComparator();
        LinkedList<File> expected = new LinkedList<>(Arrays.asList(readme,xyz));
        LinkedList<File> actual = root.getFiles(comparator);
        assertEquals(expected, actual);
    }

}
