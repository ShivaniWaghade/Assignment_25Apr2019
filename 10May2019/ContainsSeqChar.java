class ContainsSeqChar{
public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		System.out.println("Enter Sequence:");
		String seq = sc.nextLine();
		boolean result = str.contains(seq);
		if (result==true) {
			System.out.println("contains "+ seq);
		}
		else
		{
			System.out.println("doe not contain");
		}
	}
}