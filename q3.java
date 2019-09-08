public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long x=600851475143L;
long max;
for(long t=3;t<x;t=t+2)
{
	while(x%t==0 && t<x)
	{
		x=x/t;
	}
}
max=x;
System.out.println("largest prime factor="+max);
	}

}
