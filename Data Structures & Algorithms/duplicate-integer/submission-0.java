class Solution {
    public boolean hasDuplicate(int[] nums) {

        Map<Integer, Integer> map=new HashMap<>();

        for(int item: nums)
        {
            if(!map.containsKey(item))
            {
                map.put(item, 1);
            }
            else
            {
                return true;
            }
        }

        return false;
        
    }
}