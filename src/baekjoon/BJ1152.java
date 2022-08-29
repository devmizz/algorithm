package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] words = br.readLine().trim().split(" ");

        int result = 0;

        if(! words[0].equals("")) {
            result = words.length;
        }

        System.out.println(result);
    }
}
