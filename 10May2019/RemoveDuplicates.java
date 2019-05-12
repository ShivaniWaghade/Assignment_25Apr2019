class RemoveDuplicates
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		String str2;
		char []arr = str.toCharArray();
		char []remove = new char[arr.length];
		java.util.Arrays.sort(arr);
		int index =0;
		remove[index]=arr[0]; 
		for (int i=0; i<arr.length; i++) 
		{
			
			if(arr[i]==remove[index])
			{
			
			}
			else{
			index++;
			remove[index] = arr[i];
		   }
	   }
		
		for (int i=0; i<remove.length; i++) 
		{
			System.out.println(remove[i]);
		}
	}
}