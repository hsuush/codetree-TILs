import java.util.*;
import java.io.*;

public class Main { ;


    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0,-1,0,1};

        int x = 0, y = 0;
        int dirNum = 3;

        String str = sc.next();

        for(int i = 0; i < str.length(); i++){
            char method = str.charAt(i);

            switch(method){
                case 'R':
                    dirNum = (dirNum + 1) % 4;
                    break;
                case 'L':
                    dirNum = (dirNum - 1 + 4) % 4;
                    break;
                case 'F':
                    x += dx[dirNum];
                    y += dy[dirNum];
                    break;
            }
        }

        System.out.println(x + "  " + y);


    }

}