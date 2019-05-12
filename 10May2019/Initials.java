class Initials
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		String names[] = new String[3];
		names = str.split(" ");
		System.out.println("Initials:");
		for (int i = 0; i< names.length ;i++ ) 
		{
			//System.out.println(names[i]);
			System.out.println(names[i].charAt(0));
		}
		// System.out.println(i);
	}
}