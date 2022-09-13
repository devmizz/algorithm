package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] originStr = br.readLine().split(" ");
        int[] origin = new int[n];
        for(int i = 0; i < n; i++) {
            origin[i] = Integer.parseInt(originStr[i]);
        }
        Arrays.sort(origin);


        int m = Integer.parseInt(br.readLine());
        String[] comparison = new String[m];
        comparison = br.readLine().split(" ");

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < m; i++) {
            if(Arrays.binarySearch(origin, Integer.parseInt(comparison[i])) > -1) {
                sb.append("1").append("\n");
            } else {
                sb.append("0").append("\n");
            }
        }

        System.out.println(sb);
    }
}
