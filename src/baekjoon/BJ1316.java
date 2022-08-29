package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BJ1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        String str;
        int cnt = 0;
        for(int i = 0; i < testCase; i++) {
            str = br.readLine();
            if(isGroupWord(str)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    static boolean isGroupWord(String str) {
        Character ch;
        List<Character> characters = new ArrayList<>();
        characters.add(str.charAt(0));
        for(int j = 1; j < str.length(); j++) {
            ch = str.charAt(j);
            if(str.charAt(j - 1) != ch) {
                if(characters.contains(ch)) {
                    return false;
                }
                characters.add(ch);
            }
        }
        return true;
    }
}
