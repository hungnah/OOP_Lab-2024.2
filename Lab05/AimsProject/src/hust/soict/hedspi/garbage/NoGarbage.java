package hust.soict.hedspi.garbage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class NoGarbage {
	public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Usage: java NoGarbage <file-path>");
            System.exit(1);
        }

        String filename = args[0];
        try {
            byte[] inputBytes = Files.readAllBytes(Paths.get(filename));

            long startTime = System.currentTimeMillis();

            // ✅ Dùng StringBuffer thay vì String + để cải thiện hiệu suất
            StringBuffer outputBuffer = new StringBuffer(inputBytes.length);
            for (byte b : inputBytes) {
                outputBuffer.append((char) b);
            }
            String outputString = outputBuffer.toString();

            long endTime = System.currentTimeMillis();

            System.out.println("Time using StringBuffer: " + (endTime - startTime) + " ms");
            System.out.println("Total length = " + outputString.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
