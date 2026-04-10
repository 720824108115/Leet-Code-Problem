class Solution {
    public String multiply(String num1,String num2) {
        int n1=num1.length(),n2=num2.length();
        int[] prod=new int[n1+n2];
        for(int i=n1-1;i>=0;i--){
            int d1=num1.charAt(i)-'0', carry=0;
            for(int j=n2-1;j>=0;j--){
                int d2=num2.charAt(j)-'0';
                int mul=d1*d2+carry+prod[i+j+1];
                carry=mul/10;
                prod[i+j+1]=mul%10;
            }
            prod[i] += carry;
        }
        StringBuilder sb=new StringBuilder();
        for(int i:prod){
            if(sb.length() == 0 && i == 0)
            continue;
            sb.append(i);
        }
        return sb.length() == 0 ? "0":sb.toString();
    }
}