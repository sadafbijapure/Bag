//import Bag.Bag;

public class Book implements Cloneable {
   public int id=0;
   public String bookName=null,authorName=null;
   public int section=0;
   
 public  Book(int id,String name,String aname)
 {
	  super();
	   this.id=id;
	   this.bookName=name;
	   this.authorName=aname;
	  
   }
   public String toString()
   {
	   System.out.println("displaying books in the bag");
   	   return this.id+"\n"+this.bookName+"\n"+this.authorName;
   }
   	public static void main(String args[]) throws CloneNotSupportedException//cloning
   	{
   		Book b =new Book(1,"A","B");
   		
   		Book b1= b;
   		Book b2= b1;
   	    b1.id= 10;
   		
   	    Book b3= (Book)b.clone();
   	    
   		System.out.println(b);
   		System.out.println(b1);
   		System.out.println(b2);
   		System.out.println(b3);
   	}
   	
  

}
