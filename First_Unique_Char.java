class Solution {
    public int First_Unique_Char(String s) {
        HashMap <Character,Integer> map=new HashMap ();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        for(int j=0;j<s.length();j++){
            char c=s.charAt(j);
            if(map.get(c)==1){
                return j;
            }
        }
        return -1;
    }
}