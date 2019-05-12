class AddArgFloat{
	public static void main(String[] args) {
		System.out.println("Enter numbers");
		float sum=0;
		if(args.length<2)
		{
			System.out.println("Enter more than 1 numbers for addition");
		}
		else
		{
			for(int i=0;i<args.length;i++)
			{
				sum=sum+Float.parseFloat(args[i]);
			}
		}
		
		
		System.out.printf("addition: %.2f", sum);
	}
}