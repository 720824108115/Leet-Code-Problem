class Solution {
    public int strStr(String haystack, String needle) {
    int a=needle.length();
    for(int i=0;i<=haystack.length()-a;i++){
        String curr=haystack.substring(i,i+a);
        if(curr.equals(needle)){
            return i;
        }
    }
    return -1;
    }
}