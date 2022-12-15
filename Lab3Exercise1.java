
public class Lab3Exercise1 {
//create a  method which accepts an array of integer elements and return the second smallest 
//element in the array 

	public int getSecondSmallest(int number []) {
		int temp;
		for(int i=0;i<number.length;i++) {
			for(int j =i+1;j<number.length;j++) {
				if(number[i] > number[j]) {
					temp = number[i];
					number[i] =number[j];
					number[j]= temp;
				}		
			}
		}
		return number[1];
	}

	public static void main(String[] args) {
		int number[]= {2,5,8,1,6,3,4};
		Lab1Exercise1 e1 = new Lab1Exercise1();
		System.out.println("Second Smallest number: "+e1.getSecondSmallest(number));	
	}


}
