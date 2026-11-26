class Solution {
    public boolean canAliceWin(int n) {
        int b = 10;
        int j = 1;

        while (true) {
            if (n < b) {
                return j == 0;
            }

            n = n - b;
            b = b - 1;

            if (j == 1) {
                j = 0;
            } else {
                j = 1;
            }
        }
    }
}