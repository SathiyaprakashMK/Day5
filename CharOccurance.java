package week3.day1;
public class CharOccurance {
	public static void main(String[] args) {
		//initialize a string
		String input="Hexaware";
		//Convert string to charArray
		char[] charArray=input.toCharArray();
		//initialize count variable as 0
		int count=0;
		//iterate the charArray
		for(int i=0;i<charArray.length;i++) {
			//check the occurrence of 'e' and increase the count
			if(charArray[i]=='e') {
				count++;
			}
		}
		//Print the count
		System.out.println(count);
	}
}