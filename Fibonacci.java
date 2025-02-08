import java.util.*;
class Fibonacci
{
// public static int f(int n,int dp[])
// {
// if(n<=1) return n;
// if(dp[n]!=-1)
// {
	// return dp[n];
// }
// return dp[n]=f(n-1,dp)+f(n-2,dp);
// }
public static void main(String ar[])
{
int n=6;
// int dp[]=new int[n+1];
// Arrays.fill(dp,-1);
int prev2=0;
int prev=1;
int curr=0;
for(int i=2;i<=n;i++)
{
	curr=prev2+prev;
	prev2=prev;
	prev=curr;
}

System.out.println(curr);

}
}

//T.C =o(n)
//S.C=o(1)