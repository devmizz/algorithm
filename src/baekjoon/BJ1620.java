package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BJ1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, m;
        String[] inputs = br.readLine().split(" ");
        n = Integer.parseInt(inputs[0]);
        m = Integer.parseInt(inputs[1]);

        HashMap<String, String> hashMap = new HashMap<>();

        String word;
        for(int i = 0; i < n; i++) {
            word = br.readLine();

            hashMap.put(word, String.valueOf(i + 1));
            hashMap.put(String.valueOf(i + 1), word);
        }

        StringBuilder sb = new StringBuilder();
        String input;
        for(int i = 0; i < m; i++) {
            input = br.readLine();

            sb.append(hashMap.get(input)).append("\n");
        }

        System.out.println(sb);
    }
}
