package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;

public class FileReadRunner {

	public static void main(String[] args) throws IOException {
		Path currentPath = Paths.get(".");
//		Files.list(currentPath).forEach(System.out::println);

		Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
		Files.walk(currentPath, 5).filter(predicate).forEach(System.out::println);

	}

}
