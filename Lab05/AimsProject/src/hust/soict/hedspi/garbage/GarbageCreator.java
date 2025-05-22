package hust.soict.hedspi.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class GarbageCreator {
	public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Usage: java GarbageCreator <file-path>");
            System.exit(1);
        }

        String filename = args[0];
        try {
            byte[] inputBytes = Files.readAllBytes(Paths.get(filename));

            long startTime = System.currentTimeMillis();
            String outputString = "";
            for (byte b : inputBytes) {
                outputString += (char) b;   // mỗi lần + sinh String mới -> garbage
            }
            long endTime = System.currentTimeMillis();

            System.out.println("Time using String +: " + (endTime - startTime) + " ms");
            System.out.println("Total length = " + outputString.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
