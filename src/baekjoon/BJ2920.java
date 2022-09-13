package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] ascending = new String[]{"1", "2", "3", "4", "5", "6", "7", "8"};
        String[] descending = new String[]{"8", "7", "6", "5", "4", "3", "2", "1"};

        String[] input = br.readLine().trim().split(" ");

        String result = "mixed";

        if(input[0].equals("1")) {
            if(Arrays.equals(ascending, input)) {
                result = "ascending";
            }
        } else if(input[0].equals("8")) {
            if(Arrays.equals(descending, input)) {
                result = "descending";
            }
        }

        System.out.println(result);
    }
}
