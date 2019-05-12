class Anagram{
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter string 1:");
		String str1 = sc.nextLine();
		System.out.println("Enter string 2:");
		String str2 = sc.nextLine();
		str1 = str1.replace("\\s","");
		str2 = str2.replace("\\s","");
		int flag=0;
		if (str1.length()==str2.length()) 
		{
				for (int i=0; i<str1.length(); i++ ) 
				{
					flag = 0;
					for (int j=0; j<str2.length(); j++ ) {
						
						if (str1.charAt(i)==str2.charAt(j)) 
						{
							flag=1;
						}
				    }

				    if (flag==0) { break; }
			    }
		}
		
		if (flag==1) { 
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("not");
		}
	}
}