package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs;
        String[] comparison = new String[]{"0", "0"};
        int a, b;

        StringBuilder sb = new StringBuilder();

        while((inputs = br.readLine().split(" ")) != comparison) {
            a = Integer.parseInt(inputs[0]);
            b = Integer.parseInt(inputs[1]);

            if(a == 0 || b == 0) {
                break;
            }

            if(a % b == 0) {
                sb.append("multiple").append("\n");
                continue;
            }

            if(b % a == 0) {
                sb.append("factor").append("\n");
                continue;
            }

            sb.append("neither").append("\n");
        }

        System.out.println(sb);

    }
}
