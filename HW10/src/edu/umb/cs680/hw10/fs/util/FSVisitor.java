package edu.umb.cs680.hw10.fs.util;

import edu.umb.cs680.hw10.Directory;
import edu.umb.cs680.hw10.File;
import edu.umb.cs680.hw10.Link;

public interface  FSVisitor {
	
	public void visit(Link link);
	public void visit(File file);
	public void visit(Directory directory);

}
