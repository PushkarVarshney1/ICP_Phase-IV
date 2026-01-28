
class Solution {
    public int triangularSum(int[] nums) {
        // Simulation 

        List<Integer> ll = new ArrayList<>();
        for (int num : nums) {
            ll.add(num);
        }

        while (ll.size() != 1) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < ll.size() - 1; i++) {
                temp.add((ll.get(i) + ll.get(i + 1)) % 10);
            }
            ll = temp;
        }

        return ll.get(0);
    }
}
