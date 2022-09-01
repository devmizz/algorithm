package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(br.readLine());
        int[] arr = new int[inputNum];
        int max = 0;

        for(int i = 0; i < inputNum; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        int[] counting = new int[max + 1];

        for(int i = 0; i < inputNum; i++) {
            counting[arr[i]]++;
        }

        for(int i = 1; i < counting.length; i++) {
            counting[i] += counting[i - 1];
        }

        int value;
        int index;
        int result[] = new int[inputNum];
        for(int i = arr.length - 1; -1 < i; i--) {
            value = arr[i];
            index = --counting[value];
            result[index] = value;
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < inputNum; i++) {
            sb.append(result[i] + "\n");
        }

        System.out.println(sb);
    }
}
