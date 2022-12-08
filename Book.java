
public class Book {
String book_name;
String author_name;
String publisher_name;
String ISBN;
Book(String book_name, String author, String publisher, String ISBN)
{
	this.book_name=book_name;
	this.author_name=author;
	this.publisher_name=publisher;
	this.ISBN=ISBN;	
}
public void setBookName(String name)
{
	this.book_name=name;
}
public String getBookName()
{
	return book_name;
}
public void setAuthor_name(String author)
{
	this.author_name=author;
}
public String getAuthor_name()
{
	return author_name;
}
public void setPublisher_name(String publisher)
{
	this.publisher_name=publisher;
}
public String getPublisher_name()
{
	return publisher_name;
}
public String getBookInfo()
{
	String s= "name"+book_name+"\nauthor"+author_name+"\npublisher"+publisher_name+"ISBN\n"+ISBN;
	return s;
}
}
