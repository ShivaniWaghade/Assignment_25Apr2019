class AddArgIntegers{
	public static void main(String[] args) {
		System.out.println("Enter integers");
		int sum=0;
		if(args.length<2)
		{
			System.out.println("Enter more than 1 integers for addition");
		}
		else
		{
			for(int i=0;i<args.length;i++)
			{
				sum=sum+Integer.parseInt(args[i]);
			}
		}
		System.out.println("addition: "+ sum);
	}
}