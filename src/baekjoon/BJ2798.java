package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BJ2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int testCase = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        List<Integer> arr = Arrays.stream(br.readLine().split(" "))
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toList());

        int sum = 0;
        int max = 0;

        for(int i = 0; i < testCase - 2; i++) {
            for(int j = i + 1; j < testCase - 1; j++) {
                for(int k = j + 1; k < testCase; k++) {
                    sum = arr.get(i) + arr.get(j) + arr.get(k);
                    if(sum > max && m >= sum) {
                        max = sum;
                    }
                }
            }
        }

        System.out.println(max);
    }
}
