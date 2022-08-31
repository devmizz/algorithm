package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2447 {
    static char[][] base = {{'*', '*', '*'}, {'*', ' ', '*'}, {'*', '*', '*'}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        char[][] arr = new char[num][num];

        arr = refactor(arr, num);

        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static char[][] refactor(char[][] arr, int num) {
        if(num == 3) {
            return base;
        }

        int inner = num / 3;

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                char[][] part = refactor(new char[inner][inner], inner);

                if(i == 1 && j == 1) {
                    for(int m = 0; m < part.length; m++) {
                        for(int n = 0; n < part.length; n++) {
                            arr[m + i * inner][n + j * inner] = ' ';
                        }
                    }
                } else {
                    for (int m = 0; m < inner; m++) {
                        for (int n = 0; n < inner; n++) {
                            arr[m + i * inner][n + j * inner] = part[m][n];
                        }
                    }
                }
            }
        }
        return arr;
    }
}
