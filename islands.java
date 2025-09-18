import java.util.*;
public class islands{

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		
		int R=sc.nextInt();
		int C=sc.nextInt();
		int[][] grid=new int[R][C];
		boolean[][] visited=new boolean[R][C];
		for(int i=0;i<R;i++){
		    for(int j=0;j<C;j++){
		        grid[i][j]=sc.nextInt();
		    }
		}
		int count=0;
		for(int row=0;row<R;row++){
		    for(int col=0;col<C;col++){
		        if(grid[row][col]==1 && !visited[row][col]){
		            count++;
		            dfs(row,col,grid,visited);
		        }
		    }
		}
		System.out.print(count);

	}
	public static void dfs(int r,int c,int[][] grid,boolean[][] visited){
	    if(r<0 || c<0 || r>=grid.length ||c>=grid[0].length) return;
	    if(visited[r][c]) return ;
	    if(grid[r][c]==0) return;
	    visited[r][c]=true;
	    dfs(r+1,c,grid,visited);
	    dfs(r-1,c,grid,visited);
	    dfs(r,c+1,grid,visited);
	    dfs(r,c-1,grid,visited);
	    dfs(r+1,c+1,grid,visited);
	    dfs(r+1,c-1,grid,visited);
	    dfs(r-1,c+1,grid,visited);
	    dfs(r-1,c-1,grid,visited);
	    
	}
}