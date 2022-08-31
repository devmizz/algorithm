package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ17478 {
    static String question = "\"재귀함수가 뭔가요?\"";
    static String str1 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
    static String str2 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
    static String str3 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
    static String answer = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
    static String end = "라고 답변하였지.";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        sb.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");
        repeat(num, 0, sb);
        sb.append(end);

        System.out.println(sb);
    }

    static StringBuilder repeat(int num, int cnt, StringBuilder sb) {

        sb.append(getBar(cnt) + question + "\n");

        if(num == cnt) {
            sb.append(getBar(cnt) + answer + "\n");
            return sb;
        }

        sb.append(getBar(cnt) + str1 + "\n");
        sb.append(getBar(cnt) + str2 + "\n");
        sb.append(getBar(cnt) + str3 + "\n");

        cnt++;
        repeat(num, cnt, sb);

        sb.append(getBar(cnt) + end + "\n");

        return sb;
    }

    static StringBuilder getBar(int num) {
        String bar = "____";
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < num; i++) {
            sb.append(bar);
        }

        return sb;
    }
}
