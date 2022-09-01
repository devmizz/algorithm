package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ2108 {
    public static void main(String[] args) throws IOException {
        final int ABS_MAX = 8001;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(br.readLine());

        int[] counting = new int[ABS_MAX];
        int num;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        for(int i = 0; i < inputNum; i++) {
            num = Integer.parseInt(br.readLine());
            counting[num + 4000]++;
            sum += num;

            if(num > max) {
                max = num;
            }

            if(num < min) {
                min = num;
            }
        }

        int mode = Arrays.stream(counting).max().getAsInt();
        int value = 0;
        int middle = 0;
        int middleCnt = 0;
        boolean middleChk = false;
        int modeCnt = 0;
        for(int i = 0; i < ABS_MAX; i++) {
            if(counting[i] > 0) {
                middleCnt += counting[i];

                if(!middleChk) {
                    if (middleCnt >= (inputNum + 1) / 2) {
                        middle = i - 4000;
                        middleChk = true;
                    }
                }

                if(modeCnt < 2) {
                    if(counting[i] == mode) {
                        value = i - 4000;
                        modeCnt++;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        sb.append(Math.round(((double)sum / inputNum)) + "\n");
        sb.append(middle + "\n");
        sb.append(value + "\n");
        sb.append(max - min);

        System.out.println(sb);
    }
}
