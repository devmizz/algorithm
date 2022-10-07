package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1107 {
    static final int THIS = 100;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String aim = br.readLine();

        int brokenNum = Integer.parseInt(br.readLine());
        String[] broken = new String[brokenNum];
        if(brokenNum != 0) {
            broken = br.readLine().split(" ");
        }

        boolean[] numberPad = new boolean[10];
        for(int i = 0; i < 10; i++) {
            numberPad[i] = true;
        }
        for(int i = 0; i < broken.length; i++) {
            numberPad[Integer.parseInt(broken[i])] = false;
        }

        int min = Integer.MAX_VALUE;
        int direct, via;
        for(int i = 0; i < 1000000; i++) {
            if(isDirect(i, numberPad)) {
                direct = move(THIS, Integer.parseInt(aim));
                via = move(i, Integer.parseInt(aim)) + (i == 0 ? 0 : (int) Math.log10(i)) + 1;
                min = Math.min(min, Math.min(direct, via));
            }
        }

        if(min == Integer.MAX_VALUE) {
            min = move(THIS, Integer.parseInt(aim));
        }

        System.out.println(min);
    }

    static int move(int now, int aim) {
        return Math.abs(now - aim);
    }

    static boolean isDirect(int aim, boolean[] numberPad) {
        if(aim == 0) {
            if(!numberPad[aim]) {
                return false;
            }
        }
        while(aim > 0) {
            if(!numberPad[aim % 10]) {
                return false;
            }
            aim /= 10;
        }
        return true;
    }
}
