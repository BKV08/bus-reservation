package practice1;

public class rev {
	public static void main(String[] args) {
		String a="MAM";
		String rev="";
		
		
		for(int i=a.length();i<0;i--)
		{
			rev=a.charAt(i)+rev;
		}
		System.out.println(rev);
		//String rem;
		/*if(rev==a) {
			
		
		System.out.println("The given word is a panlindrome"+rev);
		
	}
		else
		{
			System.out.println("The given word is not a palindrome");
		}*/

}
}
