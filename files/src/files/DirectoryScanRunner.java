package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class DirectoryScanRunner {

	public static void main(String[] args) throws IOException {
		Path currentPath = Paths.get("./directory/file1.txt");
		List<String> lines = Files.readAllLines(currentPath);
		System.out.println(lines);
	}

}
