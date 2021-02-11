import java.util.*;
class ArrayListOps
{
	public ArrayList<Integer> makeArrayListInt(int n)
	{
			ArrayList<Integer> list=new ArrayList<>(n);
				
			for(int i=0;i<n;i++)
				list.add(i,0);
			System.out.println(list);
			return list;
	}
	public ArrayList<Integer> reverseList(ArrayList<Integer> list)
	{
		
			Collections.reverse(list);
			System.out.println(list);
			return list;
	}
	public ArrayList<Integer> changeList(ArrayList<Integer> list,int m,int n)
	{
		
		
			list.set(list.indexOf(m), n);
			System.out.println(list);
			return list;
	}

	
}
public class Problem1{
	public static void main(String[] args) 
	{
		ArrayListOps obj=new ArrayListOps();
		ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(10,25,33,28,10,12));
		int n=4;
		int m=28;
		
		obj.makeArrayListInt(n);
		obj.reverseList(list);
		n=20;
		obj.changeList(list,m,n);
	}
}



