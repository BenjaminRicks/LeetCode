class Solution {
    public String maximumOddBinaryNumber(String s) {
        int oneCount = 0;
        for(int i = 0; i < s.length(); ++i) {
            if(s.charAt(i) == '1') oneCount++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); ++i) {
            if(oneCount > 1 || i == s.length()-1) {
                sb.append('1');
                oneCount--;
            } 
            else{
                sb.append('0');
            }
        }
        return sb.toString();
    }
}
