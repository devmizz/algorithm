package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BJ25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");

        int people = Integer.parseInt(inputs[0]);
        int rank = Integer.parseInt(inputs[1]);

        List<Integer> grades = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .sorted((o1, o2) -> o2 - o1)
                .collect(Collectors.toList());

        System.out.println(grades.get(rank - 1));
    }
}
