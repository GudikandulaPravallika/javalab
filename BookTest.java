import java.util.Scanner;
public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Book test[]=new Book[30];
		for(int i=0;i<=4;i++)
		{
			System.out.println("enter books data:");
			String book_name;
			String author_name;
			String publisher_name;
			String ISBN;

			System.out.println("enter books name:\n");
			book_name=sc.next();
			System.out.println("enter author name:\n");
			author_name=sc.next();
			System.out.println("enter publisher name:\n");
			publisher_name=sc.next();
			System.out.println("enter ISBN number:\n");
			ISBN=sc.next();
			test[i]=new Book(book_name,author_name,publisher_name,ISBN);	
		}
		for(int i=0;i<=4;i++)
		{
			System.out.printf(" books info:\n",(i+1));
			System.out.printf("%s",test[i].getBookInfo());
			
	
		}
	}

}
