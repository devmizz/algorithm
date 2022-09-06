package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BJ3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Integer, Integer> xMap = new HashMap<>();
        HashMap<Integer, Integer> yMap = new HashMap<>();

        String[] inputs;
        int x, y;
        for(int i = 0; i < 3; i++) {
            inputs = br.readLine().split(" ");
            x = Integer.parseInt(inputs[0]);
            y = Integer.parseInt(inputs[1]);

            if(xMap.containsKey(x)) {
                xMap.put(x, xMap.get(x).intValue() + 1);
            } else {
                xMap.put(x, 1);
            }

            if(yMap.containsKey(y)) {
                yMap.put(y, yMap.get(y).intValue() + 1);
            } else {
                yMap.put(y, 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        int value;
        for(Integer i : xMap.keySet()) {
            value = xMap.get(i);
            if(value == 1) {
                sb.append(i).append(" ");
                break;
            }
        }
        for(Integer i : yMap.keySet()) {
            value = yMap.get(i);
            if(value == 1) {
                sb.append(i);
                break;
            }
        }

        System.out.println(sb);
    }
}
