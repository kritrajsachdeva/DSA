class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> found = new HashSet<>();
        for(int n : nums1) {
            for(int k : nums2) {
                if(n == k) found.add(n);
            }
        }
        int[] arr = new int[found.size()];
        int index = 0;
        for (Integer value : found) {
        arr[index++] = (value != null) ? value : 0; 
        }
        return arr;
    }
}