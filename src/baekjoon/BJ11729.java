package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ11729 {

    static StringBuilder sb = new StringBuilder();
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int disk = Integer.parseInt(br.readLine());

        hanoi(disk, 1, 2, 3);

        System.out.println(cnt);
        System.out.println(sb);
    }

    static int hanoi(int disk, int from, int sub, int to) {
        if(disk == 1) {
            sb.append(from + " " + to + "\n");
            cnt++;
            return 0;
        }

        hanoi(disk - 1, from, to, sub);
        sb.append(from + " " + to + "\n");
        cnt++;
        hanoi(disk - 1, sub, from, to);

        return 0;
    }
}
