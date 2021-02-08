import java.util.*;
class ArrayListOps
{
	public ArrayList<Integer> makeArrayListInt(int n)
	{
			ArrayList<Integer> list=new ArrayList<> (Arrays.asList(new Integer[n]));
				
			Collections.fill(list, 0);
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
public class Source{
	public static void main(String[] args) 
	{
		ArrayListOps obj=new ArrayListOps();
		ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(10,25,33,28,10,12));
		obj.makeArrayListInt(4);
		obj.reverseList(list);
		obj.changeList(list,28,20);
	}
}



