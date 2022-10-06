package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1003 {
    static int[] callZero = new int[41];
    static int[] callOne = new int[41];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());



        callZero[0] = 1;
        callZero[1] = 0;
        callOne[0] = 0;
        callOne[1] = 1;

        int input;

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < testCase; i++) {
            input = Integer.parseInt(br.readLine());

            sb.append(getZeroCount(input)).append(" ").append(getOneCount(input)).append("\n");
        }

        System.out.println(sb);
    }

    static int getZeroCount(int num) {
        if(num == 0) {
            return 1;
        } else if(num == 1) {
            return 0;
        }

        if(callZero[num]  != 0) {
            return callZero[num];
        }

        callZero[num] = getZeroCount(num - 2) + getZeroCount(num - 1);

        return callZero[num];

    }

    static int getOneCount(int num) {
        if(num == 0) {
            return 0;
        } else if(num == 1) {
            return 1;
        }

        if(callOne[num]  != 0) {
            return callOne[num];
        }

        callOne[num] = getOneCount(num - 2) + getOneCount(num - 1);

        return callOne[num];
    }
}
