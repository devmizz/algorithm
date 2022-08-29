package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int cnt = 0;
        Character ch, nextCh;

        for(int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            try {
                nextCh = str.charAt(i + 1);
            } catch(StringIndexOutOfBoundsException e) {
                nextCh = 0;
            }
            if(ch == 'c') {
                if(nextCh == '=' || nextCh == '-') {
                    i++;
                }
            } else if(ch == 'd') {
                if(i < str.length() - 2 && nextCh == 'z') {
                    if(str.charAt(i + 2) == '=') {
                        i += 2;
                    }
                } else if(nextCh == '-') {
                    i++;
                }
            } else if(ch == 'l' && nextCh == 'j') {
                i++;
            } else if(ch == 'n' && nextCh == 'j') {
                i++;
            } else if(ch == 's' && nextCh == '=') {
                i++;
            } else if(ch == 'z' && nextCh == '=') {
                i++;
            }
            cnt++;
        }

        System.out.println(cnt);

    }
}
