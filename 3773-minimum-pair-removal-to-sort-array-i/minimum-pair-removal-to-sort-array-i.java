class Solution {
    public int minimumPairRemoval(int[] nums) {
        // Brute Force --> Simulation (when gets min sum change there)
 
        ArrayList<Integer> ll = new ArrayList<>();
        for(int v : nums)ll.add(v);
        if(check(ll))return 0; // If Array is already sorted
        int ans = 0;
        while(!check(ll)){
            int sum = Integer.MAX_VALUE;
            int idx = -1;
            for(int i=0; i<ll.size()-1; i++){
                int curr = ll.get(i) + ll.get(i+1);
                if(curr < sum){
                    sum = curr;
                    idx = i;
                }
            }
            ll.set(idx , sum);
            ll.remove(idx+1);
            ans++;
            // System.out.println(ll);
        }
        return ans;
    }
    public boolean check(ArrayList<Integer> ll){
        for(int i=0; i<ll.size()-1; i++){
            if(ll.get(i) > ll.get(i+1))return false;
        }
        return true;
    }
}