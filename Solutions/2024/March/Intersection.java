class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<>();
        List<Integer> combined = new ArrayList<Integer>();
        for(int num: nums1) s.add(num);
        for(int num: nums2) {
            if(s.contains(num)) {
                s.remove(num);
                combined.add(num);
            }

        }

        int[] newArray = new int[combined.size()];

        for(int i = 0; i < newArray.length; i++) {
            newArray[i] = combined.get(i);
        }

        return newArray;

    }
}
