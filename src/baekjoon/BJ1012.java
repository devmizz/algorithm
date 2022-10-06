package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1012 {

    static Boolean[][] map;
    static int width;
    static int height;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        String[] inputs, cabbage;
        int cabbageNum, x, y;
        int larvaCnt = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < testCase; i++) {
            inputs = br.readLine().split(" ");
            width = Integer.parseInt(inputs[0]);
            height = Integer.parseInt(inputs[1]);
            cabbageNum = Integer.parseInt(inputs[2]);

            map = new Boolean[width][height];
            for(int m = 0; m < width; m++) {
                for(int n = 0; n < height; n++) {
                    map[m][n] = false;
                }
            }
            // 초기화
            for(int j = 0; j < cabbageNum; j++) {
                cabbage = br.readLine().split(" ");

                x = Integer.parseInt(cabbage[0]);
                y = Integer.parseInt(cabbage[1]);

                map[x][y] = true;
            }

            for(int m = 0; m < width; m++) {
                for(int n = 0; n < height; n++) {
                    if(map[m][n] == true) {
                        dfs(m, n);
                        larvaCnt++;
                    }
                }
            }

            sb.append(larvaCnt).append("\n");

            larvaCnt = 0;
        }

        System.out.println(sb);
    }

    static void dfs(int x, int y) {
        if(map[x][y] == false) {
            return;
        }
        map[x][y] = false;

        if(x + 1 < width) {
            dfs(x + 1, y);
        }

        if(0 < y) {
            dfs(x, y - 1);
        }

        if(y + 1 < height) {
            dfs(x, y + 1);
        }

    }
}
