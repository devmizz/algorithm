package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BJ9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> items = new HashMap<>();

        int testCase = Integer.parseInt(br.readLine());
        int inputNum;
        String[] item;
        String key;
        int value;
        int cases;

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < testCase; i++) {
            inputNum = Integer.parseInt(br.readLine());

            items.clear();
            cases = 1;

            for(int j = 0; j < inputNum; j++) {
                item = br.readLine().split(" ");
                key = item[1];
                value = 0;

                if(items.containsKey(key)) {
                    value = items.get(key);
                }

                value += 1;

                items.put(key, value);
            }

            for(String k : items.keySet()) {
                cases *= (items.get(k) + 1);
            }

            sb.append(cases - 1).append("\n");
        }

        System.out.println(sb);
    }
}
