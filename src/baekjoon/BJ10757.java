package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BJ10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        BigInteger bi1 = new BigInteger(input[0]);
        BigInteger bi2 = new BigInteger(input[1]);

        System.out.println(bi1.add(bi2));
    }
}
