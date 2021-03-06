package binarySearchTree;

public class BST {
	Node root;
	
	public BST()
	{
		this.root=null;
	}
	
	public void insert(int value)
	{
		Node tmp=new Node(value);
		if(root==null)
		{
			root=tmp;
		}
		else
		{
			Node itr=root;
			while(true)
			{
				if (value<itr.data)//smaller value to the left
				{
					if(itr.left==null)
					{
						itr.left=tmp;
						break;
					}
					else
						itr=itr.left;

				}			
				else if(value>itr.data)//large value to the right
				{
					if(itr.right==null)
					{
						itr.right=tmp;
						break;
					}
					else
						itr=itr.right;
				}
				else//duplicate values not allowed
					break;
			}
		}
	}
	
	public void preOrder()
	{
		printPreOrder(root);
		System.out.println();
	}

	public void printPreOrder(Node itr)
	{
		if(itr!=null)
		{
			System.out.print(itr.data+",");
			printPreOrder(itr.left);
			printPreOrder(itr.right);
		}
	}
	
	public void inOrder()
	{
		printInOrder(root);
		System.out.println();
	}

	public void printInOrder(Node itr)
	{
		if(itr!=null)
		{
			printInOrder(itr.left);
			System.out.print(itr.data+",");
			printInOrder(itr.right);
		}
	}
	
	public void postOrder()
	{
		printPostOrder(root);
		System.out.println();
	}

	public void printPostOrder(Node itr)
	{
		if(itr!=null)
		{
			printPostOrder(itr.left);
			printPostOrder(itr.right);
			System.out.print(itr.data+",");
		}
	}
}
