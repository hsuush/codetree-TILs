import java.util.*;

public class Main {
    public static int res;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(add(n));

    }

    public static int add(int n){
        if(n == 1) return 1;

        return n + add(n-1);

    }
}