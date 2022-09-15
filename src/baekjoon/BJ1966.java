package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BJ1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue queue = new LinkedList<Integer>();

        int testCase = Integer.parseInt(br.readLine());
        String[] prints;
        int importance;
        int idx, cnt;

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < testCase; i++) {
            int[] importances = new int[10];
            cnt = 0;
            idx = Integer.parseInt(br.readLine().split(" ")[1]);
            prints = br.readLine().split(" ");

            for(int j = 0; j < prints.length; j++) {
                importance = Integer.parseInt(prints[j]);
                queue.add(importance);
                importances[importance]++;
            }

            test:
            for(importance = 9; importance > 0; importance--) {
                while(importances[importance] > 0 && !queue.isEmpty()) {
                    if(queue.peek().equals(importance)) {
                        queue.poll();
                        importances[importance]--;
                        cnt++;
                        if(idx == 0) {
                            sb.append(cnt).append("\n");
                            break test;
                        }
                    } else {
                        queue.add(queue.poll());
                    }
                    idx--;
                    if(idx < 0) {
                        idx = queue.size() - 1;
                    }
                }
            }

            queue.clear();
        }

        System.out.println(sb);
    }
}
