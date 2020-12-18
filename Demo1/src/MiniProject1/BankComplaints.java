package MiniProject1;
import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;
public class BankComplaints {
	   
	public static void main(String[] args)   
	{  
	String line = "";  
	String splitBy = ",";  
	try   
	{  
	BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Ijaz\\Downloads\\complaints.csv"));  
	while ((line = br.readLine()) != null)  
	{  
	String[] complaint = line.split(splitBy);  
	System.out.println("[Date received= " + complaint[0] + ", Product= " + complaint[1] + ", Sub-product= " + complaint[2] + ", Issue= " + complaint[3] + ", Sub-issue= " + complaint[4] + ", Company= " + complaint[5] + ", State= " + complaint[6]+ ", Zip Code= " + complaint[7]+ ", Submitted= " + complaint[8]+ ", Date sent to Company= " + complaint[9]+ ", Company response to customer= " + complaint[10]+ ", Timely Response" + complaint[11]+ ", Consumer Disputed" + complaint[12]+ ", Customer ID= " + complaint[13] + "]");  
	}  
	}   
	catch (IOException e)   
	{  
	e.printStackTrace();  
	}  
	}  
}
