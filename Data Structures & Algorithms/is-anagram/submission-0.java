class Solution {
    public boolean isAnagram(String s, String t) {

       if(s.length()!=t.length())
       {
            return false;
       }

       char[] firstStringArray=s.toCharArray();
       char[] secondStringArray=t.toCharArray();

       Arrays.sort(firstStringArray);
       Arrays.sort(secondStringArray);

       return Arrays.equals(firstStringArray, secondStringArray);
    }
}
