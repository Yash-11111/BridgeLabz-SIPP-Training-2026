import java.util.Scanner;

public class multipleCatch {
    static void arrayCheck(int[] arr, int n){
        try{
            System.out.println("Value at n "+n+":"+arr[n]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index!");
        }
        catch(NullPointerException e){
            System.out.println("Array is NULL!!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr={10,20,30,40,50};
        //int [] arr = null;
        System.out.print("Enter index: ");
        int n = sc.nextInt();
        arrayCheck(arr, n);
        sc.close();
    }
}
