class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int front = 0;
        int back = tokens.length - 1;
        int score = 0;
        int maxScore = 0;
        Arrays.sort(tokens);

        while(front <= back) {
            if(tokens[front] <= power) {
                power -= tokens[front];
                front++;
                score++;
            }
            else if (score > 0) {
                power += tokens[back];
                back--;
                score--;
            }
            else {
                return 0;
            }
            if(maxScore < score) maxScore = score;
        }
        return maxScore;

    }
}
