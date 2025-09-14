import java.util.*;
public class LongestSubstring {
     public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=0,pos=0,max=0;
		Map<Integer,Integer> map=new HashMap<>();
		map.put(count,pos);
		for(char ch:s.toCharArray()){
                    pos++;
		    if(Character.isAlphabetic(ch)){
		        
		        count++;
		    }
		    else{
		        count--;
		    }
		    if(map.containsKey(count)){
		        int curr=pos-map.get(count);
		        if(curr>max){
		            max=curr;
		        }
		    }
		    else{
		        map.put(count,pos);
		    }
		}
		System.out.print(max);
		

	}

}
