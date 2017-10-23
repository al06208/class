package moduleTwo;

import java.io.BufferedWriter;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FlatExamples {

	public static void main(String[] args) throws Exception{
		File f = new File("src/moduleTwo/FlatExamples.java");
		System.out.println("Does this file exist "+f.exists());
		System.out.println("Where it? "+f.getAbsolutePath());

		BufferedWriter bw = Files.newBufferedWriter(Paths.get("src/test.txt"));
		bw.write("What's an eesix?");
		bw.write("Sounds fishy.");
		bw.close();
		
		
	}

}
