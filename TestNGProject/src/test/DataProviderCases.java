package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderCases {

@Test(dataProvider="getData")
public void setData(String username,String password)
{
	
	System.out.println(username);
	System.out.println(password);
		
}
@DataProvider
public Object[][] getData()
{
	Object[][] data=new Object[3][2];
	data[0][0]="1Passenger";
	data[0][1]="Password";
	
	data[1][0]="2Passenger";
	data[1][1]="2Password";
	
	data[2][0]="3Passenger";
	data[2][1]="3Password";
	return data;
}




	
}
