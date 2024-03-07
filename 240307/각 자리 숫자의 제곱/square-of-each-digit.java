import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        double res = add(num);
        System.out.print((int)res);

    }

    public static double add(int n){
        if(n < 10){
            return n*n;
        }

        return Math.pow(n % 10, 2) + add(n / 10);
    }
}