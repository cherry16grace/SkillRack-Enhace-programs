import java.util.*;
public class wordSearch {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int R=sc.nextInt();
		int C=sc.nextInt();
		char[][] board=new char[R][C];
		for(int row=0;row<R;row++){
		    for(int col=0;col<C;col++){
		        board[row][col]=sc.next().charAt(0);
		        
		    }
		}
		String word=sc.next();
		boolean exist=false;
		for(int row=0;row<R;row++){
		    for(int col=0;col<C;col++){
		        if(board[row][col]==word.charAt(0)){
		            boolean[][] visited=new boolean[R][C];
		            if(dfs(row,col,board,visited,word,1)){
		                exist=true;
		                break;
		            }
		        }
		    }
		    if(exist) break;
		}
		System.out.print(exist ?"yes":"no");

	}
	public static boolean dfs(int r,int c,char[][] board,boolean[][] visited,String word,int len){
	    if(len==word.length()){
	        return true;
	    }
	    visited[r][c]=true;
	    
	    if(r-1>=0 && !visited[r-1][c] && board[r-1][c]==word.charAt(len)){
	        if(dfs(r-1,c,board,visited,word,len+1)) return true;
	    }
	    if(r+1<board.length && !visited[r+1][c] && board[r+1][c]==word.charAt(len)){
	        if(dfs(r+1,c,board,visited,word,len+1)) return true;
	    }
	    if(c-1>=0 && !visited[r][c-1] && board[r][c-1]==word.charAt(len)){
	        if(dfs(r,c-1,board,visited,word,len+1)) return true;
	    }
	    if(c+1<board[0].length && !visited[r][c+1] && board[r][c+1]==word.charAt(len)){
	        if(dfs(r,c+1,board,visited,word,len+1)) return true;
	    }
	    visited[r][c]=false;
	    return false;
	}
}