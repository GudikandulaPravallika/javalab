
public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice t=new Invoice("50A","car toy",50,250.00);
		System.out.println("Number:"+t.number+"Description:"+t.description+"quantity"+t.quantity+"price"+t.price+"InvoiceAmount is"+t.getInvoiceAmount());
		t.setNumber("0x500");
		t.setDescription("XYZ");
		t.setQuantity(100);
		t.setPrice(2550.00);
		System.out.println("After changing :");
		System.out.println("Number:"+t.getNumber()+"Description:"+t.getDescription()+"Quantity:"+t.getQuantity()+"Price:"+t.getPrice()+"InvoiceAmount:"+t.getInvoiceAmount());
	}
}
