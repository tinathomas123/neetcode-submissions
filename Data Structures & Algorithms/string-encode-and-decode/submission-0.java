class Solution {

    public String encode(List<String> strs) {

        if(strs.isEmpty())
        {
            return "";
        }

        List<Integer> sizes=new ArrayList<>();
        for(String str: strs)
        {
            sizes.add(str.length());
        }

        StringBuilder encodedString=new StringBuilder();

        for(Integer size:sizes)
        {
            encodedString.append(size).append(",");
        }

        encodedString.append("#");

        for(String str: strs)
        {
            encodedString.append(str);
        }

        return encodedString.toString();

    }

    public List<String> decode(String str) {

        if(str.length()==0) return new ArrayList<>();

        List<Integer> sizes=new ArrayList<>();
        int i=0;
        while(str.charAt(i)!='#')
        {
            StringBuilder size=new StringBuilder();
            while(str.charAt(i)!=',')
            {
                size.append(str.charAt(i));
                i++;
            }

            sizes.add(Integer.parseInt(size.toString()));
            i++;
        }

        i++;

        List<String> decodeStringsList=new ArrayList<>();
        for(int size:sizes)
        {
            decodeStringsList.add(str.substring(i, i+size));
            i=i+size;
        }

        return decodeStringsList;

    }
}
