package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] holdCards = new int[n];

        String[] inputs = br.readLine().split(" ");

        for(int i = 0; i < n; i++) {
            holdCards[i] = Integer.parseInt(inputs[i]);
        }

        Arrays.sort(holdCards);

        int m = Integer.parseInt(br.readLine());

        inputs = br.readLine().split(" ");

        StringBuilder sb = new StringBuilder();

        int index;
        for(int i = 0; i < m; i++) {
            index = Arrays.binarySearch(holdCards, Integer.parseInt(inputs[i]));

            if(index < 0) {
                sb.append("0 ");
            } else {
                sb.append("1 ");
            }
        }

        System.out.println(sb);
    }
}
