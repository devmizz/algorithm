package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10870 {
    static int[] fivot = new int[21];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        System.out.println(fivot(num));
    }

    static int fivot(int num) {
        if(num == 0) {
            return 0;
        }
        if(num == 1) {
            return 1;
        }
        return fivot(num - 2) + fivot(num - 1);
    }

    static void fivotInit() {
        fivot[0] = 0;
        fivot[1] = 1;
    }
}
