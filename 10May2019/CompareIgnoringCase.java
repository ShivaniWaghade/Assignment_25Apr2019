class CompareIgnoringCase
{
		public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter a string 1:");
		String str1 = sc.nextLine();
		System.out.println("Enter string 2:");
		int str2 = sc.nextLine();
		int result = str1.compareToIgnoreCase(str2);
		if (result==0) {
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("not equal");
		}
}