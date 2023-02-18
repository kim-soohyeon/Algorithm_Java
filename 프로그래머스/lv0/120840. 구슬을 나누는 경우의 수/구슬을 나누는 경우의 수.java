class Solution {
    public int solution(int balls, int share) {
        return fact(balls, share);
    }

    public static int fact(int n, int r) {
        if (n == r || r == 0) return 1;
        return fact((n - 1), (r - 1)) + fact(n - 1, r);
    }
}