package binarySearchTree;

public class Main {

	public static void main(String[] args) {
		BST bst=new BST();
		bst.insert(24);
		bst.insert(44);
		bst.insert(14);
		bst.insert(4);
		bst.insert(34);
		
		bst.preOrder();
		bst.inOrder();
		bst.postOrder();
	}

}
