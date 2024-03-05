class Solution {
    public int minimumLength(String s) {
        int front = 0;
        int back = s.length() - 1;

        while(front < back) {
            if(s.charAt(front) != s.charAt(back)) break;
            char matchingChar = s.charAt(front);
            while(front <= back && s.charAt(front) == matchingChar){
                 front++;
            }
            while(front <= back && s.charAt(back) == matchingChar){
                back--;
            } 
        }
        return back - front + 1;
    }

}
