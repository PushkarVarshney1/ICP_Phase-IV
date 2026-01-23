class Solution {
    public long maxTotal(int[] value, int[] limit) {
        TreeMap<Integer , ArrayList<Integer>> map = new TreeMap<>();
        for(int i=0;i<value.length;i++){
            map.computeIfAbsent(limit[i] , k -> new ArrayList<>()).add(value[i]);
        }
        long res = 0;
        for(Integer key : map.keySet()){
            ArrayList<Integer> list = map.get(key);
            Collections.sort(list);
            int ind = list.size() - 1;
            while(key-->0 && ind >= 0){
                   res += list.get(ind--);
            }
        }
        return res;
    }
}