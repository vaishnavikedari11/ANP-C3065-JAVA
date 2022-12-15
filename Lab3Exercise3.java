public class Lab3Exercise3 {
    //create a method which accepts an integer array, reverse the numbers in the array and returns 
//the resulting array in sorted array
	public void reverseArray(int arr[]) {
		int start= arr[0];
		int end = arr.length;
		int temp;
		while(start < end) {
            //comparising
			temp = arr[start] ;
			arr[start] = arr[end];
			arr[end] = temp;
			start ++;
			end --;
		}
		for(int i=0;i<end;i++) {
			System.out.println("The reverse array is : "+  arr[i]);
		}
	}
    
	public int[] sortArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int temp1;
			for(int j=i+1;i<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp1 = arr[i];
					arr[i] = arr[j];
					arr[j] = temp1;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int number[]=  {1,8,5,6,3,7};
		Lab3Exercise3 e3 = new Lab3Exercise3();
		//System.out.println("The reverse array is :"+ e3.sortArray(number));
		e3.reverseArray(number);
	}


}
