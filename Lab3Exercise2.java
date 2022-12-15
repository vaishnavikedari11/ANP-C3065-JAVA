public class Lab3Exercise2 {
    //create a method that can accepts an array of string objects and sort in alphabetical order.
// the elements in the lest half should completely in uppercase and the elements in the right
//half should be completely in lower case.Return the resulting array. 

	public void sortString(char arr[]){
		//outer loop
		for(int i=0;i<arr.length;i++) {	
			//inner loop		  
			//arr.length=size
			for(int j=i+1 ;j<arr.length;j++) {   
				//condition 
				if(arr[j] < arr[i]){
					//swapping or compairing arrays
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
				}
				
			}
			
		}
		System.out.println(arr);
	}
	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array");
		 */
		//input string
		String str=  "geeksforgeeks";
		//converting string into array
		char arr []= str.toCharArray();
		Lab3Exercise2 e2 = new  Lab3Exercise2();
		e2.sortString(arr);
	}

}
