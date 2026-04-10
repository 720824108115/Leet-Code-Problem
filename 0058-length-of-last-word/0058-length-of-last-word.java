class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int lastSpace=s.lastIndexOf(" ");
        return s.length() - lastSpace - 1;
    }
    public static void main(String[] args)
    {
        Solution obj=new Solution();
      System.out.println(obj.lengthOfLastWord("Hello World"));
       System.out.println(obj.lengthOfLastWord("  fly me  to   the moon "));
        System.out.println(obj.lengthOfLastWord("luffy is still joyboy"));
    }
}