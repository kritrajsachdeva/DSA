class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int[] account : accounts) {
            int wealth = 0;
            for(int money:account) {
                wealth += money;
            }
            maxWealth = wealth > maxWealth ? wealth : maxWealth;
        }
        return maxWealth;
    }
}