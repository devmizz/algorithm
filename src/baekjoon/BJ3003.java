package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        String[] input = br.readLine().split(" ");
        int king = 1 - Integer.parseInt(input[0]);
        int queen = 1 - Integer.parseInt(input[1]);
        int rook = 2 - Integer.parseInt(input[2]);
        int bishop = 2 - Integer.parseInt(input[3]);
        int knight = 2 - Integer.parseInt(input[4]);
        int pawn = 8 - Integer.parseInt(input[5]);

        sb.append(king + " ");
        sb.append(queen + " ");
        sb.append(rook + " ");
        sb.append(bishop + " ");
        sb.append(knight + " ");
        sb.append(pawn + " ");

        System.out.println(sb);
    }
}
