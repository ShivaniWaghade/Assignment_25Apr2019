class FirstNonRepeatingChar{
	public static void main(String[] args)
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		
		for (char ch: str.toCharArray()) 
		{
		
				if (str.indexOf(ch)==str.lastIndexOf(ch)) 
				{
					System.out.println("Non repeating character is: "+ ch);
					break;
				}
		}

	}
}