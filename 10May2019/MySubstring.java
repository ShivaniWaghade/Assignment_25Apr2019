class MySubstring{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter string:");
		String str = sc.nextLine();
		System.out.println("Enter position:");
		int pos = sc.nextInt();
		System.out.println("Enter 1 for MySubstring(int n) or 2 for MySubstring(int n, int m)");
		int sel = sc.nextInt();
		MySubstring obj = new MySubstring();
		if (sel==1) 
		{
			System.out.println("Substring:");
			obj.mySub(str,pos);
		}
		else
		{	
			System.out.println("Enter length:");
			int len = sc.nextInt();
			System.out.println("Substring:");
			obj.mySub(str,pos,len);
		}
	}
	void mySub(String str,int pos)
	{
		for (int i=pos; i<str.length() ;i++ ) 
		{
			System.out.print(str.charAt(i));
		}
	}
	void mySub(String str,int pos, int len)
	{
		for (int i=pos; i<len ;i++ ) 
		{
			System.out.print(str.charAt(i));
		}
	}
}