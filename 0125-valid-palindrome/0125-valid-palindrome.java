class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String ns="",r="";
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)>=97 && s.charAt(i)<=122)||(s.charAt(i)>=48 && s.charAt(i)<=57))
                ns+=s.charAt(i);
        }
        int i=ns.length()-1;
        while(i>=0){
            r+=ns.charAt(i);
            i--;
        }
        return ns.equals(r)?true:false;
    }
}