import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class rangeSumQueries{
    public static void main(String[] args) throws IOException {
       BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st=new StringTokenizer(br.readLine());
       int n=Integer.parseInt(st.nextToken());
       int q=Integer.parseInt(st.nextToken());
       long[] arr=new long[n];
       st=new StringTokenizer(br.readLine());
       for(int i=0;i<n;i++){
         arr[i]=Long.parseLong(st.nextToken());
       }
       long[] prefix=new long[n+1];
       for(int i=1;i<=n;i++){
        prefix[i]=prefix[i-1]+arr[i-1];
       }
       StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            long sum = prefix[b] - prefix[a - 1];
            sb.append(sum).append("\n");
        }
        
        System.out.print(sb);
    }
}