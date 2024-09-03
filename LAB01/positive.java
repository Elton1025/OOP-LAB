class positive {
	public static void main(String args[]) {

		int a[]=new int[10];
		int pos=0;
		int neg=0;
		int z=0;
		for(int j=0;j<10;j++)
		{
			a[j]=Integer.parseInt(args[j]);
			if(a[j]>0)
			{
				pos++;	
			}
			else if(a[j]<0) 
			{
				neg++;
			}
			else {
				z++;
			}
		}
		System.out.println("Number of positive numbers:"+pos);
		System.out.println("Number of negative numbers:"+neg);
		System.out.println("Number of Zero's:"+z);
	}
}