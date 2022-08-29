package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class BJ1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toUpperCase(Locale.ROOT);
        Character ch;

        int[] arr = new int[26];

        for(int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);

            arr[(int)ch - 65] += 1;
        }

        int max = 0;
        int element;
        int index = 0;
        int duplicateCnt = 0;

        for(int i = 0; i < 26; i++) {
            element = arr[i];

            if(max < element) {
                max = element;
                index = i;
                duplicateCnt = 0;
            } else if(max == element) {
                duplicateCnt++;
            }
        }

        if(duplicateCnt > 0) {
            System.out.println("?");
        } else {
            System.out.println(String.format("%c", index + 65));
        }
    }
}
