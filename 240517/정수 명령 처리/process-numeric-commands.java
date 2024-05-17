import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++){
            String method = sc.next();
            
            int a;

            switch(method){
                case "push":
                    a = sc.nextInt();
                    st.push(a);
                    break;
                case "size":
                    System.out.println(st.size());
                    break;
                case "empty":
                   if(st.empty()){
                        System.out.println(1);
                        break;
                    } else {
                    System.out.println(0);
                    break;
                    }
                case "pop":
                    if(st.empty()){
                        System.out.println(0);
                        break;
                    } else {
                    System.out.println(st.pop());
                    break;
                    }
                case "top":
                    if(st.empty()){
                        System.out.println(0);
                        break;
                    } else {
                    System.out.println(st.peek());
                    break;
                    }
            
            }
        }
    }
}