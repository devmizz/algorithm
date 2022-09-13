package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BJ11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");

        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);

        Queue queue = new LinkedList();
        for(int i = 1; i <= n; i++) {
            queue.add(i);
        }

        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        sb.append("<");
        while(!queue.isEmpty()) {
            if(cnt == k) {
                sb.append(queue.poll());
                if(queue.isEmpty()) {
                    sb.append(">");
                    continue;
                }
                sb.append(", ");
                cnt = 1;
                continue;
            }
            queue.add(queue.poll());
            cnt++;
        }

        System.out.println(sb);
    }
}
