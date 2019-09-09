package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Additemlist {

	public static void main(String[] args) {

		List ls = new ArrayList();
		ls.add("lal");
		ls.add("bahadur");
		System.out.println(ls);
		Iterator itr = ls.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
