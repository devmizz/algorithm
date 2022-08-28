package baekjoon;

public class BJ15596 {
    public static void main(String[] args) {

    }
}

class Test {
    long sum(int[] a) {
        long ans = 0;
        for(int i = 0; i < a.length; i++) {
            ans += a[i];
        }
        return ans;
    }
}