class Solution {
    public boolean isPalindrome(String s) {
        s=s.replace(" ","");
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s=s.toLowerCase();
        System.out.println(s);
        int n= s.length();

        for(int i=0; i< n ;i++){
            if(s.charAt(i) !=s.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
}
