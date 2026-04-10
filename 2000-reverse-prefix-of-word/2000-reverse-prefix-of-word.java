class Solution {
    public String reversePrefix(String word, char ch) {
        int right=word.indexOf(ch);
        if(right==-1){
            return word;
        }
        StringBuilder sb=new StringBuilder();
        
        for(int i=right;i>=0;i--){
            sb.append(word.charAt(i));
        }
        sb.append("");
        sb.append(word.substring(right+1));   
        return sb.toString();
    }
}