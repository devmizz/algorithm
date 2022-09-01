package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BJ11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        int[][] cordinates = new int[testCase][2];
        String[] inputs;

        for(int i = 0; i < testCase; i++) {
            inputs = br.readLine().split(" ");
            cordinates[i][0] = Integer.parseInt(inputs[0]);
            cordinates[i][1] = Integer.parseInt(inputs[1]);
        }

        Arrays.sort(cordinates, (o1, o2) -> {
            if(o1[0] == o2[0]) {
                return o1[1] - o2[1];
            } else {
                return o1[0] - o2[0];
            }
        });

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < testCase; i++) {
            sb.append(cordinates[i][0]).append(" ").append(cordinates[i][1]).append("\n");
        }

        System.out.println(sb);
    }
}
