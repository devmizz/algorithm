package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class BJ1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nums = br.readLine().split(" ");

        int n = Integer.parseInt(nums[0]);
        int m = Integer.parseInt(nums[1]);

        HashSet hashSet = new HashSet<>();

        for(int i = 0; i < n; i++) {
            hashSet.add(br.readLine());
        }

        List<String> answers = new ArrayList<>();
        String input;
        for(int i = 0; i < m; i++) {
            input = br.readLine();
            if(hashSet.contains(input)) {
                answers.add(input);
            }
        }

        Collections.sort(answers);

        StringBuilder sb = new StringBuilder();
        sb.append(answers.size()).append("\n");
        for(String answer:answers) {
            sb.append(answer).append("\n");
        }

        System.out.println(sb);
    }
}
