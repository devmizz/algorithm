package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2775 {
    static int[][] people = new int[15][15];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 14; i++) {
            people[0][i] = 1 + i;
            people[i][0] = 1;
        }

        for(int i = 1; i < 14; i++) {
            for(int j = 1; j < 14; j++) {
                people[i][j] = 0;
            }
        }

        int testCase = Integer.parseInt(br.readLine());

        int floor, roomNum;

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i <testCase; i++) {
            floor = Integer.parseInt(br.readLine());
            roomNum = Integer.parseInt(br.readLine()) - 1;

            sb.append(getNum(floor, roomNum) + "\n");
        }

        System.out.println(sb);
    }

    static int getNum(int floor, int roomNum) {
        if(roomNum == 0) {
            return 1;
        }

        if(people[floor][roomNum - 1] == 0) {
            people[floor][roomNum - 1] = getNum(floor, roomNum - 1);
        }

        if(people[floor - 1][roomNum] == 0) {
            people[floor - 1][roomNum] = getNum(floor - 1, roomNum);
        }

        people[floor][roomNum] = people[floor][roomNum - 1] + people[floor - 1][roomNum];

        return people[floor][roomNum];
    }
}
