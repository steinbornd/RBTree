public class RBTreeTest {
	public static void main(String [] args){
		RBTree rbt = new RBTree();
		System.out.println(rbt.isEmpty());//true
		rbt.insert(new Integer(4));
		//rbt.insert(new Integer(4)); //throw exception
		rbt.insert(new Integer(5));
		rbt.insert(new Integer(8));
		rbt.insert(new Integer(0));
		System.out.println(rbt.isEmpty());//false
		rbt.insert(new Integer(2));
		rbt.insert(new Integer(12));
		rbt.insert(new Integer(15));
		rbt.insert(new Integer(27));
		rbt.insert(new Integer(41));
		rbt.insert(new Integer(64));
		rbt.insert(new Integer(71));
		
		rbt.find(new Integer(8));
		rbt.deleteMin();
		//rbt.find(new Integer(0)); //throw exception
		rbt.delete(new Integer(15));
		//rbt.find(new Integer(15)); //throw exception
		System.out.println("Minimum is " + rbt.findMin());//2
		System.out.println("Maximum is " + rbt.findMax());//71
		
		rbt.deleteMax();
		//rbt.find(new Integer(71)); //throw exception
		System.out.println("Maximum is " + rbt.findMax());//64
		
		rbt.makeEmpty();//clear
	}
}