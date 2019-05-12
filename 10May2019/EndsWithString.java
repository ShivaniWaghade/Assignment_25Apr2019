class EndsWithString{
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter a string 1:");
		String str1 = sc.nextLine();
		System.out.println("Enter string 2:");
		int str2 = sc.nextLine();
		boolean result = str1.endsWith(str2);
		if (result == true) {
			System.out.println("ends  with");
		}
		else
		{
			System.out.println("does not end with");
		}
	}
}