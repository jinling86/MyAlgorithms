package x.algorithms;

import java.util.ArrayList;

// A stack structure based on Array
public class ArrayListStack {
	
	private ArrayList<String> list;
	
	public ArrayListStack()
	{
		list=new ArrayList<>();
	}

	public void push(String aString)
	{
		list.add(aString);
	}

	public String pop()
	{
		int size=list.size();
		
		if(size > 0)
			return list.remove(size-1);
		else
			return null;
	}

	public String peek()
	{
		int size=list.size();
		
		if(size > 0)
			return list.get(size-1);
		else
			return null;
	}

	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	
	// End of class
}
