package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Optional;

public class BJ10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");

        HashMap<Integer, Integer> hasCard = new HashMap<>();

        int key, value;
        for(int i = 0; i < n; i++) {
            key = Integer.parseInt(inputs[i]);

            value = 1;

            if(hasCard.containsKey(key)) {
                value += hasCard.get(key);
            }

            hasCard.put(key, value);
        }

        int m = Integer.parseInt(br.readLine());

        inputs = br.readLine().split(" ");

        StringBuilder sb = new StringBuilder();

        Optional<Integer> optInt;

        for(int i = 0; i < m; i++) {
            key = Integer.parseInt(inputs[i]);
            optInt = Optional.ofNullable(hasCard.get(key));

            if(optInt.isEmpty()) {
                sb.append(0);
            } else {
                sb.append(optInt.get());
            }
            sb.append(" ");
        }

        System.out.println(sb);
    }
}
