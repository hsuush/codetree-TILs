import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char[] charStr = str.toCharArray();

        Arrays.sort(charStr);

        String sortedStr = new String(charStr);

        System.out.print(sortedStr);

    
    }
}