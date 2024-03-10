import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String secret = st.nextToken();
        String space = st.nextToken();
        int time = Integer.parseInt(st.nextToken());

        Code code = new Code(secret, space, time);

        sb.append("secret code : " + code.secret + "\n");
        sb.append("meeting point : " + code.space + "\n");
        sb.append("time : " + code.time);

        System.out.print(sb);


    }

    public static class Code{
        String secret;
        String space;
        int time;

        Code(String secret, String space, int time){
            this.secret = secret;
            this.space = space;
            this.time = time;
        }
    }
}