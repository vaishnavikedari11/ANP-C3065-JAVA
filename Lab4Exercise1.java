import java.util.Scanner;
public class Lab4Exercise1 {
    //Create a method to find the sum of the cubes of the digits of an n digit number 
	public void sumOfCubes(int n) {
		int sum=0;
		while(n!=0) {
			int digit = n%10;
			//condition
			sum = sum+digit*digit*digit;
			n= n/10;
			
		}
		System.out.println("THe sum of cubes of digits of the number is: "+ sum);
	}

	public static void main(String[] args) {
		Lab4Exercise1 e1 = new Lab4Exercise1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n =sc.nextInt();
		e1.sumOfCubes(n);
		
	}


}
