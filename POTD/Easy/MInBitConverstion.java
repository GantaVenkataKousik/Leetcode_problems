class Solution {
    public int minBitFlips(int start, int goal) {
        int xor = start ^ goal;
        int cnt = 0;
        while(xor>0){
            cnt += (xor&1);
            xor>>=1; 
        }
        return cnt;
    }
}
