package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2477 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int maxWidth = Integer.MIN_VALUE;
        int maxHeight = Integer.MAX_VALUE;
        int direction, size, bigArea, smallArea;
        String[] inputs;

        int fruitPerArea = Integer.parseInt(br.readLine());

        for(int i = 0; i < 6; i++) {
            inputs = br.readLine().split(" ");
            direction = Integer.parseInt(inputs[0]);
            size = Integer.parseInt(inputs[1]);

            if(direction <= 2) {
                if(size > maxWidth) {
                    maxWidth = size;
                }
            } else {
                if(size > maxHeight) {
                    maxHeight = size;
                }
            }
        }

        bigArea = maxWidth * maxHeight;
    }
}
