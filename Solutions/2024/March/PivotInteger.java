class Solution {
    public int pivotInteger(int n) {
        int big = 0;
        int small = n;
        for(int i = 1; i <= n; ++i) {
            big += i;
        }

        for(int i = n; i >= 1; --i) {

            if(big == small) {
                return i;
            }
            else if(big < small) {
                return -1;
            }
            small += i;
            big -= i-1;

        }
        return -1;


    }
}
