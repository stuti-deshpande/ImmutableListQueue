package com.gmu.assignmentcode;

import java.util.ArrayList;

//OVERVIEW: 
public class ImmListQueue<E> {

	private ArrayList<E> immList;
	E front;
	
	public ImmListQueue()
	{
	//EFFECTS: It creates a new empty ArrayList	
		immList = new ArrayList<E>();
	}
	
	public ImmListQueue(ArrayList<E> L1,E ele,int index1)
	{
	//REQUIRES: An arraylist which contains 
		//the array elements,
		//immutable element 
		// an index which indicates the functionality
	//	        or to do the swapfront function.
	//EFFECTS: It creates a new object 
		//copies the previous elements into the new object.
		
		immList = new ArrayList<E>();
		for(int i=0;i < L1.size();i++)
		{
			immList.add(List1.get(i));
		}
		if(index1 == 1)
		{
			immList.add(ele);
		}
		if(index1 == 2)
		{
			front1  = pop();
			E front1 = immList.remove(0);
			immList.add(0,ele);
		}
	}
	
	public ImmListQueue(ArrayList<E> L1,int index1)
	{
	//REQUIRES: An arraylist which contains
		// array elements 
		// an index which indicates the functionality.
	//EFFECTS: It creates a new object 
		// copies the previous elements into the new object. 
		
		immList =new ArrayList<E>();
		if(index1 == 1)
		{
			for(int i=0;i < L1.size();i++)
		    {
			   immList.add(L1.get(i));
		    }
            front1 = pop();
            list.remove(0);
		}
		if(index1 == 2)
		{
			int length = L1.size()-1;
			int j = length;
			for(int i = 0; i <= length; i++)
		    {
			   immList.add(i,L1.remove(j));
			   j--;
		    }
		}
	}
	
	public ImmListQueue(ArrayList<E> L1,ArrayList<E> L2)
	{
	//REQUIRES: Two ArrayLists
	//EFFECTS: It creates a new object
		// copies the previous elements into the new object. 
		immList = new ArrayList<E>();
		int lim = L2.size();
		System.out.println(lim);
		E element;
		for(int i=0;i < L1.size();i++)
		{
			immList.add(L1.get(i));
		}
		immList.addAll(L2);
		
	
	}
	
	public E pop()
	{
	//EFFECTS: It returns the element at the first position of the queue
		return immList.get(0);
	}
	
	public ImmListQueue<E> enqueue(E element)
	{
	//REQUIRES: An element of type E and immutable.
	//EFFECTS: If the element does not exist in the queue, NullPointerExcepton is thrown else it adds the element to the end of the queue

		if(element != null)
		{
			ImmListQueue<E> newList1 = new ImmListQueue<E>(immList,element,1);
			return newList1;
		}
		else
		{
			throw new NullPointerException("Dont Pass null values");
		}
	}
	
	public ImmListQueue<E> dequeue()throws IllegalStateException
	{
	//EFFECTS: Removes an element from the front of the queue and returns the object containing the queue. 
	//         If the queue is null it throws a NullPointerException.
		if(immList.isEmpty())
		{
			throw new IllegalStateException("Queue is empty");
		}
		else
		{
			ImmListQueue<E> newList1 = new ImmListQueue<E>(immList,1);
			return newList;
		}	
	}
	
	public int length()
	{
	//EFFECTS: Returns the size of the queue.
		return immList.size();
	}
	
	public ImmListQueue<E> reverse()
	{
	//EFFECTS: It reverses all the elements in the queue 
		// also returns the object containing the queue.
		ImmListQueue<E> newList = new ImmListQueue<E>(immList,2);
		return newList;
	}
	
	public ImmListQueue<E> append(ImmListQueue<E> s)
	{
	//EFFECTS: This appends the queue s to the end of the existing queue 
		// returns the object containing the queue.
		ImmListQueue<E> newList1 = new ImmListQueue<E>(immList,s.immList);
		return newList1;
	}
	
	public ImmListQueue<E> SwapFront(E element)throws IllegalStateException
	{
	//EFFECTS: It replaces the immutable element at position zero with the new element and returns the object containing the queue.
		//If the immutable element is null it throws a IllegalStateException
		if(immList.isEmpty())
		{
			throw new IllegalStateException("The queue is empty");
		}
		else
		{
			ImmListQueue<E> newList1 = new ImmListQueue<E>(immList,element,2);
			return newList1;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImmListQueue<Integer> ob1 = new ImmListQueue<>();
		ImmListQueue<Integer> ob2 = new ImmListQueue<>();
		ImmListQueue<Integer> ob3 = new ImmListQueue<>();
		ob2 = ob1.enqueue(1);
		ob1 = ob2;
		ob2 = ob1.enqueue(2);
		ob1 = ob2;
		ob2 = ob1.enqueue(3);
		ob1 = ob2;
		ob2 = ob1.dequeue();
		ob1 = ob2;
		//System.out.println(ob1.queue);
		//System.out.println(ob1.top);
		ob2 = ob1.enqueue(1);
		ob1 = ob2;
		//System.out.println(ob1.queue);
		ob2 = ob1.reverse();
		ob1 = ob2;
		System.out.println(o1.list);
		o2 = o3.enqueue(4);
		o3 = o2;
		o2 = o1.append(o3);
		o1 = o2;
		System.out.println(o1.list);
		o2 = o1.SwapFront(6);
		o1 = o2;
		//System.out.println(ob1.queue);
	}

}
