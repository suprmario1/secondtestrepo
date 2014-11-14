/*
Assignment 1
Mario Lacayo 5657
Csc 221
06/1/2012 
 */

import java.util.GregorianCalendar;

public class HeartRates{
	String firstname;
	String lastname;
	String Birthdate;
	int month, day, year;
	int age, maxheart;
	double upper, lower;
	GregorianCalendar gc = new GregorianCalendar();
	GregorianCalendar current = new GregorianCalendar();
	
	public HeartRates(){
		
	}
	
	public HeartRates(String firstn, String lastn, int m, int d, int y){
		firstname = firstn;
		lastname = lastn;
		month = m;
		day = d;
		year = y;
		this.Set_Date(m, d, y);

	}
	public void Set_Date(int m, int d, int y){
        try {

            gc.setLenient(false);        // must do this
            gc.set(GregorianCalendar.YEAR, y);
            gc.set(GregorianCalendar.MONTH, m);// invalid month
            gc.set(GregorianCalendar.DATE, d);

            gc.getTime(); // exception thrown here
        }
        catch (Exception e) {
            e.printStackTrace();
        }
	}
	public String Get_Date(){
		String DOB = Integer.toString(gc.get(GregorianCalendar.MONTH))+" "+Integer.toString(gc.get(GregorianCalendar.DATE))+" "+Integer.toString(gc.get(GregorianCalendar.YEAR));

		return DOB;
	}
	public void Set_Firstname(String n){
		firstname=n;
	}
	public String Get_Firstname(){
		return firstname;
	}
	public void Set_Lastname(String g){
		lastname=g;
	}
	public String Get_Lastname(){
		return lastname;
	}
	public int Calc_Age(){
		
		     age = current.get(GregorianCalendar.YEAR) - gc.get(GregorianCalendar.YEAR);
		     if((gc.get(GregorianCalendar.MONTH) > current.get(GregorianCalendar.MONTH))
		       || (gc.get(GregorianCalendar.MONTH) == current.get(GregorianCalendar.MONTH)
		       && gc.get(GregorianCalendar.DAY_OF_MONTH) > current.get(GregorianCalendar.DAY_OF_MONTH)))
		     {
		        age--;
		     }

		return age;
	}
	public int Calc_Maxheart(){
		maxheart=220-age;
		return maxheart;
		
	}
	public double Calc_Tarheartup(){

		upper=maxheart*.85;
		return upper;
		
	}
	public double Calc_Tarheartdown(){

		lower=maxheart*.5;
		
		return lower;
	}
	
	
}