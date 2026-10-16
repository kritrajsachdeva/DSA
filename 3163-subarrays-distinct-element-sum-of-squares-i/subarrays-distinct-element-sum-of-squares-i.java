class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum = 0;
        for(int i = 0; i<nums.size(); i++) {
            Set<Integer> list = new HashSet<>();
            for(int j = i; j<nums.size(); j++) {

                list.add(nums.get(j));
                sum+=list.size()*list.size();
            }
        }
        return sum;
    }
}