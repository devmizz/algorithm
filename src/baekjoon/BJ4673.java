package baekjoon;

public class BJ4673 {
    public static void main(String[] args) {
        boolean[] selfNumber = new boolean[10001];
        for(int i = 0; i < selfNumber.length; i++) {
            selfNumber[i] = true;
        }
        StringBuffer sb = new StringBuffer();
        int result;
        for(int i = 1; i < 10001; i++) {  // 9975부터는 생성하는 숫자가 10000을 넘는다
            if(selfNumber[i] == false)
                continue;

            sb.append(i + "\n");

            result = i;
            while((result = d(result)) <= 10000) {
                selfNumber[result] = false;
            }
        }

        System.out.println(sb);
    }

    static int d(int n) {
        String str = String.valueOf(n);

        int sum = 0;
        for(int i = 0; i < str.length(); i++) {
            sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        return sum + n;
    }
}
