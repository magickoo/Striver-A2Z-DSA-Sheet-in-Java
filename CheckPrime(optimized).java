import java.util.*;
public class Solution {
    public static boolean bool(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            } 
        }
        return true;
    }
    public static void main(String[] args) {
        //Your code goes here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean ans=bool(n);
        if(n==1){
            System.out.println("false");
        }
        else{
        System.out.println(ans);
        }
}
}

Complexity Analysis
Time Complexity: O(√n)

Space Complexity: O(1)
