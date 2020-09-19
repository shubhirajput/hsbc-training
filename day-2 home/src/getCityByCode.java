
public class getCityByCode {

	
	
	public string City()
	{
		int i=1;
		
		String m="";
	    if(i==1)
	    {
	    	m="DELHI";
		return m;
	    }		
		if(i==2)
		{
		m="NOIDA”;"
		return m;
		}
		if(i==3)
		{
			m="Gurgaon"
			return m;
		}			
	    if(i==4)
	    {
	    	m="Bangalore"
	    return m;
	    }			
	    else 
	    	{
	    	m="invalidcode";
	    	return m;
	    	}		
		
		
		
	}
	
	public static void main(String[] args) {
		
		getCityByCode gc=new getCityByCode();
		gc.City();
	}

}

