public class printno{
    public static void printnos(int n,int i){
         
        if(i>n){
            return;
        }
        System.out.println(i);
        printnos(n,i+1);

    }
    public static void main(String[] args) {
        printnos(5,1);
        
    }
}
