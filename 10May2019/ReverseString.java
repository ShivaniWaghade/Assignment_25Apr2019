
class ReverseString
{
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		int len=str.length();
		String reverse="";
		for(int i=len-1; i>=0; i--)
		{
			reverse += str.charAt(i);
			//System.out.print(str.charAt(i));
		}
		System.out.println("Reverse of the String: \n"+reverse);
	}
}