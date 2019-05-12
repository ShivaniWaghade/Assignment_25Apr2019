
class NumberOfVowels{
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		int len=str.length();
		int count=0;
		for (int i=0; i<len ;i++) 
		{
			if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i' || str.charAt(i)=='o'|| str.charAt(i)=='u')
			{
				count++;
			}	
		}
		System.out.println("Number of vowels in the string: "+count);
	}
}