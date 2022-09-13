package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BJ1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();
        List<Integer> divisor = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(Integer i : divisor) {
            if(i > max) {
                max = i;
            }
            if(i < min) {
                min = i;
            }
        }

        System.out.println(max * min);
    }
}
