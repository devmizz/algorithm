package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BJ1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(br.readLine());

        List<Integer> grades = Arrays.stream(br.readLine().split(" "))
                .map(grade -> Integer.parseInt(grade))
                .sorted()
                .collect(Collectors.toList());

        int max = grades.get(inputNum - 1);

        double sum = 0;
        for(int i = 0; i < inputNum; i++) {
            sum += (double)grades.get(i) / max * 100;
        }

        System.out.println(sum / inputNum);
    }
}
