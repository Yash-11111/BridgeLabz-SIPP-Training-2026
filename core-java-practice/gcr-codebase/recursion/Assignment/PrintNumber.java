import java.util.*;
public class PrintNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Print(n);
        sc.close();
    }
    public static void Print(int n){
        for(int i=n;i<0;i--){
            System.out.print(i+" ");
        }
    }
}
