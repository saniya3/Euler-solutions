public class q4 {
		    public static void main(String[] args) {
		        int max = 999;
		        long ans = 0;
		        for(int i = max; i >=0; i--) {
		            for(int j = max; j >= 0; j--) {
		                long x = i * j;
		                if(x == reverse(x) && x>ans) {
		                    ans= x;
		                }
		            }
		        }
		        System.out.println(ans);
		    }
		    public static long reverse(long n) {
		        long reverse = 0;
		        while (n != 0) {
		            long d2 = n % 10;
		            reverse = reverse * 10 + d2;
		            n /= 10;
		        }
		        return reverse;
		    }
		}
