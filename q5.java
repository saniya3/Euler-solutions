public class q {
	public static void main(String args[])
	{
		int i,x,p=0;
		for(x=2520;x>0 && p!=1;x+=20)
		{
			for(i=11;i<=20;i++)
			{
				if(x%i!=0)
				{
					break;
				}
				else if(i==20)
				{
					p=1;
					break;
				}
			}
		}
x=x-20;
System.out.println(x);
}
}
