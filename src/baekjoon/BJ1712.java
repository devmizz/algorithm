package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int fixedCost = Integer.parseInt(input[0]);
        int variableCost = Integer.parseInt(input[1]);
        int price = Integer.parseInt(input[2]);
        int netProfit = price - variableCost;

        if(netProfit <= 0) {
            System.out.println(-1);
        } else {
            System.out.println(fixedCost / netProfit + 1);
        }
    }
}
