package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BJ4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int inputNum = Integer.parseInt(br.readLine());
        int peopleNum;
        int overAvePeople = 0;
        int sum = 0;
        double ave;
        List<Integer> arr = new ArrayList<>();

        for(int i = 0; i < inputNum; i++) {

            arr = Arrays.stream(br.readLine().split(" "))
                    .map(grade -> Integer.parseInt(grade))
                    .collect(Collectors.toList());

            peopleNum = arr.get(0);

            for(int j = 1; j < peopleNum + 1; j++) {
                sum += arr.get(j);
            }
            ave = sum / peopleNum;

            for(int j = 1; j < peopleNum + 1; j++) {
                if(arr.get(j) > ave) {
                    overAvePeople++;
                }
            }

            sb.append(String.format("%.3f", (double)overAvePeople / peopleNum * 100) + "%\n");

            sum = 0;
            overAvePeople = 0;
        }

        System.out.println(sb);
    }
}
