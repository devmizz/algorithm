package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BJ1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(br.readLine());

        Set<String> wordSet = new HashSet<>();

        for(int i = 0; i < inputNum; i++) {
            wordSet.add(br.readLine());
        }

        List<String> wordList = new ArrayList<>(wordSet);
        Collections.sort(wordList, ((o1, o2) -> {
            if(o1.length() == o2.length()) {
                return o1.compareTo(o2);
            } else if(o1.length() > o2.length()) {
                return 1;
            } else {
                return -1;
            }
        }));

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < wordList.size(); i++) {
            sb.append(wordList.get(i)).append("\n");
        }

        System.out.println(sb);
    }
}
