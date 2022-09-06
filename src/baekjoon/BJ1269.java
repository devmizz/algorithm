package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;

public class BJ1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nums = br.readLine().split(" ");
        int n = Integer.parseInt(nums[0]);
        int m = Integer.parseInt(nums[1]);

        HashSet setA = new HashSet<>(List.of(br.readLine().split(" ")));
        HashSet setB = new HashSet<>(List.of(br.readLine().split(" ")));

        HashSet union = new HashSet(setA);
        union.addAll(setB);

        HashSet intersection = new HashSet(setA);
        intersection.retainAll(setB);

        union.removeAll(intersection);

        System.out.println(union.size());
    }
}
