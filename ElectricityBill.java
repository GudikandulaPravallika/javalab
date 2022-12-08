
public class ElectricityBill {
	int c_no;
	String c_name;
	double c_m_r, p_m_r;
	String type;
	double units=c_m_r-p_m_r;
      double s;
	double amount()
	{
		if(type=="Domestic")
		{
			if(units>=0 && units<=100)
				 s= units*1;
			else if(units>=101 && units<=200)
				s= units*2.50;
			else if(units>=201 && units<=500)
				s= units*4;
			else
				s=units*6;
		}
		else if(type=="Commercial")
		{
			if(units>=0 && units<=100)
				s= units*2;
			else if(units>=101 && units<=200)
				s= units*4.50;
			else if(units>=201 && units<=500)
				s= units*6;
			else
				s= units*7;
		}
       return s;
	}

	

}
