
public class Bag {
int id=0;
String name=null;
private Book book=null;
Bag(int id,String name)
{
	   this.id=id;
	   this.name=name;
	   
	  
}

public void setBook(Book book)
{
	   this.book=book;
}
public Book getBook()
{
	   return book;
}
	
}
