package BST;


public class deletion_BST {
                  public static node root;
                  public static class node{
                	  int key;
                	  node left,right;
                	  node(int data){
                		  key=data;
                		  left=right=null;
                	  }
                  }
                  deletion_BST() { 
          	        root = null; 
          	    }
          	    void insert(int key) {
          	       root = insertRec(root, key);
          	    }
          	     
          	    node insertRec(node root, int key) {
          	 
          	        if (root == null) {
          	            root = new node(key);
          	            return root;
          	        }
          	 
          	        if (key < root.key)
          	            root.left = insertRec(root.left, key);
          	        else if (key > root.key)
          	            root.right = insertRec(root.right, key);
          	 
          	        return root;
          	    }
          	    void delete(int data){
          	    	root=deletekey(root,data);
          	    }
          	    node deletekey(node new_node,int value){
          	    	
          	          if (new_node== null)  
                	  return root;
           
                if (value < new_node.key)
                  new_node.left = deletekey(new_node.left, value);
                 
                else if (value > new_node.key)
                      new_node.right = deletekey(new_node.right, value);
           
                  else
                  {
                     
                      if (new_node.left == null)
                          return new_node.right;
                      else if (new_node.right == null)
                          return new_node.left;
           
                     new_node.key = minValue(new_node.right);
          
                     new_node.right = deletekey(new_node.right,new_node.key);
                  }
           
                  return new_node;
              }
           
              int minValue(node root)
              {
                  int minv = root.key;
                  while (root.left != null)
                  {
                      minv = root.left.key;
                      root = root.left;
                  }
                  return minv;
              }
          	    
          	 
          	    void inorder()  {
          	    	 inorderRec(root);
          	    }
          	    
          	    void inorderRec(node root) {
          	        if (root != null) {
          	            inorderRec(root.left);
          	            System.out.println(root.key);
          	            inorderRec(root.right);
          	        }
          	    }
                  public static void main(String args[]){
                	  deletion_BST tree=new deletion_BST();
                	  tree.insert(50);
          	        tree.insert(30);
          	        tree.insert(20);
          	        tree.insert(40);
          	        tree.insert(70);
          	        tree.insert(60);
          	        tree.insert(80);
          	        tree.inorder();
                	
          	        tree.delete(80);
                	 System.out.println("Inorder traversal of the given tree");
                     tree.inorder();
              
                     System.out.println("\nDelete 20");
                     tree.delete(20);
                     System.out.println("Inorder traversal of the modified tree");
                     tree.inorder();
              
                     System.out.println("\nDelete 30");
                     tree.delete(30);
                     System.out.println("Inorder traversal of the modified tree");
                     tree.inorder();
              
                     System.out.println("\nDelete 50");
                     tree.delete(50);
                     System.out.println("Inorder traversal of the modified tree");
                     tree.inorder();
                  }
}
