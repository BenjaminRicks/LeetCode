// class Solution {
//     public String customSortString(String order, String s) {
//         StringBuilder sb = new StringBuilder();
//         for(int i = 0; i < order.length(); ++i) {
//             for(int j = 0; j < s.length(); ++j) {
//                 if(order.charAt(i) == s.charAt(j)) sb.append(s.charAt(j));
//             }
//         }

//         for(int i = 0; i < s.length(); ++i) {
//             if(!order.contains("" + s.charAt(i))) sb.append(s.charAt(i));
//         }
//         return sb.toString();
//     }
// }


class Solution {
    public String customSortString(String order, String s) {
        int[] letterCounts = new int[26];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); ++i) {
            letterCounts[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < order.length(); ++i) {
            for(int j = 0; j < letterCounts[order.charAt(i) - 'a']; ++j) {
                sb.append(order.charAt(i));
            }
            letterCounts[order.charAt(i) - 'a'] = 0;

        }

        for(int i = 0; i < letterCounts.length; ++i) {
            for(int j = 0; j < letterCounts[i]; ++j) {
                sb.append((char) (i + 'a'));
            }
        }
        return sb.toString();
    }
}
