import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class robot {
     public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=sc.nextInt();
		int t=sc.nextInt();
		int[] leap=new int[s];
		for(int i=0;i<s;i++){
		    leap[i]=sc.nextInt();
		}
		List<Integer> damaged=new ArrayList<>();
		for(int i=1;i<=t;i++){
		    damaged.add(sc.nextInt());
		}
		long[] dp=new long[n+1];
		dp[0]=1;
		for(int i=1;i<=n;i++){
		    if(damaged.contains(i)){
		        dp[i]=0;
		        continue;
		    }
		    for(int j=0;j<s;j++){
		        if(i>=dp[j]){
		            dp[i]+=dp[i-leap[j]];
		        }
		    }
		}
		System.out.print(dp[n]);

	}

}
