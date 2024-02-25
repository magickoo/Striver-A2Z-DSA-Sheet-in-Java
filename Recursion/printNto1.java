public class printno{
    public static void printnos(int n){
         
        if(n==0){
            return;
        }

        System.out.println(n);
        printnos(n-1);

    }
    public static void main(String[] args) {
        printnos(5);
        
    }
}
