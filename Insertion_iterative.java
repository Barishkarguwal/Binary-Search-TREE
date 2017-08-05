package BST;
import java.util.Scanner;

import BST.insetion.Node;

public class Insertion_iterative {
                  public static node root;
                   public static class node{
                	   int key;
                	   node left,right;
                	   node(int data){
                		   key=data;
                		   left=right=null;
                	   }
                   }
                   public void insert(int data){
                	   root=insertion(data,root);
                   }
                   public node insertion(int data,node root){
                	   node prev=null,ptr=root;
                	   boolean left=false;
                	   
                	   while(ptr!=null){
                		   if(ptr.key==data){
                			   throw new IllegalArgumentException();
                		   }
                		   prev=ptr;
                		   if(ptr.key>data){
                			   ptr=ptr.left;
                			   left=true;
                		   }
                		   else{
                			   ptr=ptr.right;
                			   left=false;
                		   }
                	   }
                	   node temp=new node(data);
                	   if(root==null)
                		   return temp;
                	   
                	   if(left)
                		   prev.left=temp;
                	   else
                		   prev.right=temp;
                	   
                	   return root;
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
            	 Insertion_iterative tree=new Insertion_iterative();
            	 int k;
            	 do{
            	    Scanner in=new Scanner(System.in);
            	    System.out.println("enter node");
            	    int n=in.nextInt();
            	    tree.insert(n);
            	    System.out.println("enter 1 if you want to continue");
            	     k=in.nextInt();
            	 }while(k==1);
             
             tree.inorder();

             } }
