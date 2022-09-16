package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Stack;

public class BJ4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack bracket = new Stack();
        String str;
        char c;
        StringBuilder sb = new StringBuilder();
        line:
        while(!(str = br.readLine()).equals(".")) {
            bracket.clear();

            for(int i = 0; i < str.length(); i++) {
                c = str.charAt(i);

                try {
                    if (c == '[' || c == '(') {
                        bracket.add(c);
                    } else if(c == ']') {
                        if(bracket.pop().equals('(')) {
                            sb.append("no").append("\n");
                            continue line;
                        }
                    } else if(c == ')') {
                        if(bracket.pop().equals('[')) {
                            sb.append("no").append("\n");
                            continue line;
                        }
                    }
                } catch(EmptyStackException e) {
                    sb.append("no").append("\n");
                    continue line;
                }
            }

            if(bracket.isEmpty()) {
                sb.append("yes").append("\n");
                continue;
            }

            sb.append("no").append("\n");
        }

        System.out.println(sb);
    }
}
