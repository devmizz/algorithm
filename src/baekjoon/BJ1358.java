package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1358 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        String[] coordinate;

        int width, height, x, y, person, px, py;

        width = Integer.parseInt(inputs[0]);
        height = Integer.parseInt(inputs[1]);
        x = Integer.parseInt(inputs[2]);
        y = Integer.parseInt(inputs[3]);
        person = Integer.parseInt(inputs[4]);
        int radius = height / 2;

        int cnt = 0;
        for(int i = 0; i < person; i++) {
            coordinate = br.readLine().split(" ");
            px = Integer.parseInt(coordinate[0]);
            py = Integer.parseInt(coordinate[1]);

            if(px < x - radius || px > x + width + radius || py < y || py > y + height) {
                continue;
            }

            if((px >= x && px <= x + width) && (py >= y && py <= y+height)) {
                cnt++;
                continue;
            }

            if(px < x) {
                if(isInner(x, y + radius, px, py, radius)) {
                    cnt++;
                }
                continue;
            }

            if(px > x + width) {
                if(isInner(x + width, y + radius, px, py, radius)) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }

    static boolean isInner(int x, int y, int px, int py, int radius) {
        int width = Math.abs(px - x);
        int height = Math.abs(py - y);

        double length = Math.sqrt(width * width + height * height);

        if(length <= radius) {
            return true;
        }

        return false;
    }
}
