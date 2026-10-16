class Solution {
    public int sumCounts(List<Integer> nums) {
        int s = nums.size();
        int k = 0;
        for(int i = 0; i<s; i++) {
            Set<Integer> set = new HashSet<>();
            for(int j = i; j<s; j++) {
                set.add(nums.get(j));
                k+= set.size() * set.size();
            }
            
        }
        return k;
    }
}