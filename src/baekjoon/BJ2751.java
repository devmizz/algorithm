package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BJ2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(br.readLine());
        List<Integer> arr = new ArrayList<>();

        for(int i = 0; i < inputNum; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(arr);

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < inputNum; i++) {
            sb.append(arr.get(i) + "\n");
        }

        System.out.println(sb);
    }
}
