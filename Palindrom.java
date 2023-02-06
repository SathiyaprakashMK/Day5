package week3.day1;

public class Palindrom {

	public static void main(String[] args) {
		String pal="madam";
		String rev="";
		for(int i=pal.length()-1;i>=0;i--) {
			rev=rev+pal.charAt(i);
		}
		if(pal.equals(rev))System.out.println("Palindrom");
		else System.out.println("Not a palindrom");

	}

}
