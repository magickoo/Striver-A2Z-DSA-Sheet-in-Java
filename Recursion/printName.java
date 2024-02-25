public class printno{
    public static void printName(int n){
        if(n==0){
            return;
        }
        System.out.println("Khushi");
        printName(n-1);
    }
    public static void main(String[] args) {
        printName(5);
    }
}

//Time complexity: O(n)
//space complexity: O(1)
