
public class Invoice {
	String number;
	String description;
	int quantity;
	double price;
	Invoice(String n, String des, int q, double p)
	{
		number=n;
		description=des;
		quantity=q;
		price=p;
	}
	public void setNumber(String nu)
	{
		number=nu;
	}
	public String getNumber()
	{
		return number; 
	}
	public void setDescription(String de)
	{
	    description =de;
	}
	public String getDescription()
	{
		return description; 
	}
	public void setQuantity(int qu)
	{
		if(quantity<0)
			quantity=0;
		else
			quantity=qu;
	}
	public int getQuantity()
	{
		return quantity; 
	}
	public void setPrice(double pr)
	{
		if(price<0)
			price=0.0;
		else
		    price=pr;
	}
	public double getPrice()
	{
		return price; 
	}
	double getInvoiceAmount()
	{
		return price*quantity;
	}
}
