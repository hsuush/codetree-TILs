import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printAcc(n);
        System.out.println();
        printDec(n);

    }

    
    public static void printAcc(int n){
        if(n == 0){
            return;
        }

        printAcc(n - 1);
        System.out.print(n + " ");
    }

    public static void printDec(int n){
        if(n == 0){
            return;
        }

        System.out.print(n + " ");
        printDec(n - 1);
    }
}