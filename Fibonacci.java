import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[]){
	Scanner f = new Scanner(System.in);
	System.out.println("Enter No. ");
	int num = f.nextInt();
	System.out.println("Fibonacci Series");
	int n1=0, n2=0, n3=1;
	for (int i=1; i<=num; i++){
	System.out.print(""+n3+"");
	n1 = n2;
	n2 = n3;
	n3 = n1 + n2;
	}
}
}