import java.util.*;

public class InsertionSort {
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	public InsertionSort()
	{
		list.add(6);
		list.add(98);
		list.add(9);
		list.add(3);
		list.add(0);
		list.add(7);
		list.add(4);
		list.add(1);
		list.add(5);
		sort();
		printList();
	}
	
	public void sort()
	{
		for( int i = 0; i< list.size()-1; i++)
		{
			int j = i;
			
			while( j != -1 )
			{
				int first = list.get(j);
				int second = list.get(j+1);
				
				if( second < first )
				{
					list.set( j, second );
					list.set(j+1, first);
				}
				j--;
			}
		}
	   	
	}
	
	public void printList()
	{
		for( Integer i : list )
		{
			System.out.println( i );
		}
	}

}
