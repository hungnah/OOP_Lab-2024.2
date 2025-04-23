package hust.soict.hedspi.garbage;
import java.util.Random;
public class ConcatenationInLoops {
	public static void main(String[] args) {
        Random r = new Random(123);
        
        // 1. String với +
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 65536; i++) {
            s += r.nextInt(2);
        }
        System.out.println("Time using String +: " 
            + (System.currentTimeMillis() - start) + " ms");  // ~4500 ms
        
        // 2. StringBuilder
        r = new Random(123);
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 65536; i++) {     // sửa 1++ thành i++
            sb.append(r.nextInt(2));
        }
        s = sb.toString();
        System.out.println("Time using StringBuilder: " 
            + (System.currentTimeMillis() - start) + " ms");  // ~5 ms
    }
}
