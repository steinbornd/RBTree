import java.util.TreeMap;

public class RBTree extends TreeMap{
	/**
	Returns value based on whether the tree is empty or not
	Return true if it is empty, false if it is not empty
	@return boolean
	**/
	public boolean isEmpty(){
		if (size() == 0){//if size equals zero then it is empty
			return true;//return true
		}
		return false; //else return false
	}
	/**
	Clears the Red Black Tree
	**/
	public void makeEmpty(){
		clear();//clear the tree
	}
	/**
	Inserts comparable into the tree if it does not already exist
	Throws Duplicate Item Exception
	@param Comparable
	**/
	public void insert(Comparable x){
		if(containsKey(x)){//if the tree contains the key then throw exception
			throw new DuplicateItemException();
		}
		put(x,x);//else put the value in the tree
	}
	/**
	Deletes comparable if it is found in the tree
	Throws Item Not Found Exception
	@param Comparable
	**/
	public void delete(Comparable x){
		if(containsKey(x)){//if the tree contains the value then delete it
			remove(x);
		}
		else{ //else throw exception
			throw new ItemNotFoundException();
		}
	}
	/**
	Deletes the minimum value from the tree - Uses Find Min Method
	Throws Item Not Found Exception if the tree is empty 
	**/
	public void deleteMin(){
		if(isEmpty()){//if tree is empty throw exception
			throw new ItemNotFoundException();
		}
		remove(findMin());//else find min and remove it
	}
	/**
	Deletes the maximum value from the tree - Uses Find Max Method
	Throws Item Not Found Exception if the tree is empty
	**/
	public void deleteMax(){
		if(isEmpty()){//if tree is empty throw exception
			throw new ItemNotFoundException();
		}
		remove(findMax());//else find max and remove it
	}
	/**
	Finds and returns the value in the tree if it is found
	If it is not found the Item Not Found Exception is thrown
	@param Comparable
	@return Object
	**/
	public Object find(Comparable x){
		if(containsKey(x)){//if the key is in the tree get the value
			return get(x);
		}
		throw new ItemNotFoundException();//else throw exception
	}
	/**Finds the Minimum value in the tree and returns it if it exists
	If it is not found Item Not Found Exception is thrown
	@return Object
	**/
	public Object findMin(){
		if(firstKey() != null){//if the minimum key not null then return the key
			return firstKey();
		}
		throw new ItemNotFoundException();//else throw an exception
	}
	/**
	Finds the Maximum value in the tree and returns it if it exists
	If it is not found Item Not Found Exception is thrown
	@return Object
	**/
	public Object findMax(){
		if(lastKey() != null){//if the maximum key is not null return the key
			return lastKey();
		}
		throw new ItemNotFoundException();//else throw an exception
	}
}
