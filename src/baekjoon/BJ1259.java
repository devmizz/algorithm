package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack stack = new Stack();

        String str;
        int length, i;

        StringBuilder sb = new StringBuilder();

        outer:
        while(!(str = br.readLine()).equals("0")) {
            length = str.length();
            for(i = 0; i < length / 2; i++) {
                stack.add(str.charAt(i));
            }

            if(length % 2 == 1) {
                i += 1;
            }

            for( ; i < length; i++) {
                if(! stack.pop().equals(str.charAt(i))) {
                    sb.append("no").append("\n");
                    stack.clear();
                    continue outer;
                }
            }

            sb.append("yes").append("\n");
        }

        System.out.println(sb);
    }
}
