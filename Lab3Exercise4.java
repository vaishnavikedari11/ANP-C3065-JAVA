public class Lab3Exercise4 {
    // create a method that accepts a character array and count the number of times each character 
//is present in the array 
	int MAX_CHAR=256;
	public void countNumberOfCharacter(String str) {
		int count[]= new int [MAX_CHAR] ;
		int length = str.length();
		
		for(int i=0;i<length;i++) {
			count[str.charAt(i)]++;
		}
		
		char ch[]= new char [str.length()];
		
		for(int i=0;i<length;i++) {
			ch[i] =str.charAt(i);
			int find = 0;
			for(int j =0;j<=i;j++) {
				if(str.charAt(i) == ch[j]) {
					find ++;
				}
			}
			if(find == 1) {
				System.out.println("Number of Occurance of "+str.charAt(i)+ " is :"+count[str.charAt(i)]);
				
			}
		}
		
	}
	public static void main(String[] args) {
		String str =" mynameisvaishnavi";
		Lab3Exercise4 e4= new Lab3Exercise4();
		e4.countNumberOfCharacter(str);
	}


}
