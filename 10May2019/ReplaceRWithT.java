class ReplaceRWithT
{
	public static void main(String[] args) {
	
	java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		String str2 = str.replace('r','t');
		System.out.println("STring after replacing: "+str2);
}
}