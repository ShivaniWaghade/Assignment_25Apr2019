class CharAtPosition{
public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		System.out.println("Enter position:");
		int pos = sc.nextInt();
		System.out.println("Character at position "+pos+" is "+str.charAt(pos));
}
}