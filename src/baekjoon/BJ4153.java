package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BJ4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input, result;
        List<Integer> inputs;
        int a, b, c;
        while(!(input = br.readLine()).equals("0 0 0")) {
            result = "wrong";
            inputs = Arrays.stream(input.split(" ")).map(Integer::parseInt).sorted().collect(Collectors.toList());

            a = inputs.get(0);
            b = inputs.get(1);
            c = inputs.get(2);

            if((a + b > c && b - a < c) && (a * a + b * b == c * c)) {
                result = "right";
            }

            sb.append(result).append("\n");
        }

        System.out.println(sb);
    }
}
