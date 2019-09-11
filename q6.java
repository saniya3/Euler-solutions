public class q6 {

	public static void main(String[] args) {
int s1 = 0,s2=0;
int n=100;
for(int i=1;i<=n;i++)
{
	s1=(n*(n+1)*((2*n)+1))/6;
	s2=(n*(n+1))/2;
}
System.out.println((s2*s2)-s1);
	}

}
