package edu.umb.cs680.hw09.fs.util;

import edu.umb.cs680.hw09.Directory;
import edu.umb.cs680.hw09.File;
import edu.umb.cs680.hw09.Link;

public interface  FSVisitor {
	
	public void visit(Link link);
	public void visit(File file);
	public void visit(Directory directory);

}
