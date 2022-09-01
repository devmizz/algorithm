package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        char[] arr = new char[input.length()];

        for(int i = 0; i < input.length(); i++) {
            arr[i] = input.charAt(i);
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for(int i = arr.length - 1; i > -1; i--) {
            sb.append(arr[i]);
        }

        System.out.println(sb);
    }
}
