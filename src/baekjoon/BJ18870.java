package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BJ18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        int[][] cordinates = new int[testCase][2];

        String[] inputs = br.readLine().split(" ");

        for(int i = 0; i < testCase; i++) {
            cordinates[i][0] = Integer.parseInt(inputs[i]);
            cordinates[i][1] = i;
        }

        Arrays.sort(cordinates, Comparator.comparingInt(o -> o[0]));

        int num = 1;
        int beforeNum = cordinates[0][0];
        cordinates[0][0] = 0;

        for(int i = 1; i < testCase; i++) {
            if(cordinates[i][0] == beforeNum) {
                cordinates[i][0] = cordinates[i - 1][0];
            } else {
                beforeNum = cordinates[i][0];
                cordinates[i][0] = num++;
            }
        }

        Arrays.sort(cordinates, Comparator.comparingInt(o -> o[1]));

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < testCase; i++) {
            sb.append(cordinates[i][0]).append(" ");
        }

        System.out.println(sb);
    }
}
