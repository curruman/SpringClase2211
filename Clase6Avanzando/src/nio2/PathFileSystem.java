package nio2;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Iterator;

public class PathFileSystem {
	public static void path() {
		FileSystem fs = FileSystems.getDefault();
		//Path p1 = fs.getPath("c:\\tmp");
		Path p1 = fs.getPath("c://zcurso//bibliografia//ejemplo2.txt");
		//p1.forEach(path -> System.out.println(path.getFileName()));
		Iterator <Path> pathIterator = p1.iterator();
		while (pathIterator.hasNext()) {
			Path path = (Path) pathIterator.next();
	        System.out.format("getFileName: %s%n", path.getFileName());
	        System.out.format("getParent: %s%n", path.getParent());
	        System.out.format("getNameCount: %d%n", path.getNameCount());
	        System.out.format("getRoot: %s%n", path.getRoot());
	        System.out.format("isAbsolute: %b%n", path.isAbsolute());
	        System.out.format("toAbsolutePath: %s%n", path.toAbsolutePath());
	        System.out.format("toURI: %s%n", path.toUri());

		}
	}

}
