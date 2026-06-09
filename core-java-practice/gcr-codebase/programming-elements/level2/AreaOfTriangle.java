import java.util.Scanner;

public class AreaOfTriangle{
public static void main (String [] args){
	Scanner sc = new Scanner(System.in);
	
	double base = sc.nextInt();
	double height = sc.nextInt();
	
	double areacm = 0.5(base * height);
	double areain = 0.5(base * height)*0.3936;
	
	System.out.println("The Area of the triangle in sq in is" + areacm "and sq cm is ___"+ areain);

}
}