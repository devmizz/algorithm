package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BJ11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int length = str.length();

        HashSet<String> hashSet = new HashSet<>();
        String sub;

        for(int i = 0; i < length; i++) {
            for(int j = i + 1; j <= length; j++) {
                sub = str.substring(i, j);
                hashSet.add(sub);
            }
        }

        System.out.println(hashSet.size());
    }
}
