import java.util.*;
public class sudokuvalidity {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int R=9;
		int C=9;
		int[] rflag=new int[9];
		int[] cflag=new int[9];
		int[] smflag=new int[9];
		for(int i=0;i<R;i++){
		    rflag[i]=1;
		    cflag[i]=1;
		    smflag[i]=1;
		}
		for(int i=0;i<R;i++){
		    for(int j=0;j<C;j++){
		        int digit=sc.nextInt();
		        rflag[i]|=(1<<digit);
		        cflag[j]|=(1<<digit);
		        smflag[(i/3)*3 + j/3]|=(1<<digit);
		    }
		}
		int val=(1<<10)-1;
		for(int i=0;i<R;i++){
		    for(int j=0;j<C;j++){
		        if(rflag[i]!=val || cflag[i]!=val  || smflag[i]!=val){
		            System.out.print("INVALID");
                            return;

		        }
		    }
		}
		System.out.print("VALID");
	}
} 
