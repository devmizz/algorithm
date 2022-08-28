package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BJ10818 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputNum, input;
        int min, max;

        inputNum = Integer.parseInt(br.readLine());

        List<Integer> arr = Arrays.stream(br.readLine().split(" ")).map(i -> Integer.parseInt(i)).collect(Collectors.toList());

        min = arr.get(0);
        max = arr.get(0);

        for(int i = 1; i < inputNum; i++) {
            input = arr.get(i);
            if(min > input) {
                min = input;
            }
            if(max < input) {
                max = input;
            }
        }

        System.out.println(min + " " + max);
    }
}
