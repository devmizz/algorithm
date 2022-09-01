package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1018 {
    static final char[][] whiteBoard = {
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}
    };
    static final char[][] blackBoard = {
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
            {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
            {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int height = Integer.parseInt(input[0]);
        int width = Integer.parseInt(input[1]);

        String line;
        char[][] chess = new char[width][height];

        for(int i = 0; i < height; i++) {
            line = br.readLine();
            for(int j = 0; j < width; j++) {
                chess[j][i] = line.charAt(j);
            }
        }

        int min = width * height;

        int whiteCnt = 0;
        int blackCnt = 0;
        int changeBlock;

        for(int i = 0; i <= width - 8; i++) {
            for(int j = 0; j <= height - 8; j++) {

                for(int m = 0; m < 8; m++) {
                    for(int n = 0; n < 8; n++) {
                        if(chess[m + i][n + j] != whiteBoard[m][n]) {
                            whiteCnt++;
                        }
                        if(chess[m + i][n + j] != blackBoard[m][n]) {
                            blackCnt++;
                        }
                    }
                }

                changeBlock = Math.min(whiteCnt, blackCnt);

                if(changeBlock < min) {
                    min = changeBlock;
                }

                whiteCnt = 0;
                blackCnt = 0;
            }
        }

        System.out.println(min);
    }
}
