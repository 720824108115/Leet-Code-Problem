class Solution {
    public String firstPalindrome(String[] words) {
     for(int i=0;i<words.length;i++) {
         String a=words[i];
     StringBuilder sb = new StringBuilder(a).reverse();

     if(a.equals(sb.toString()))
     {
        return a;
     }
     }
     return "";
    }
}