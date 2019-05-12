class StringPalindrome
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		int len=str.length();
		String palindrome="";
		for(int i=len-1; i>=0; i--)
		{
			palindrome += str.charAt(i);
			//System.out.print(str.charAt(i));
		}
		System.out.println("\n"+palindrome);
		if(str.equals(palindrome)){
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
	}
}