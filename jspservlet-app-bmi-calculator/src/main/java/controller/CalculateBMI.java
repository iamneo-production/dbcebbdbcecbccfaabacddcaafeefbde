package controller;

public class CalculateBMI {

	//Enter the code here....

	
public static double calculate(double h,double w){
	double num=(w/(h*h))*10000;
        double ans    = Math.round(num * 100) / 100.0;
 
        
         
        return ans;
  }
  
 public static string description(int d){
	  if(d<18.5){
		  return "Under Weight";
	  }
	  if else(d>=18.5 && d<24.9){
		  return "Normal";
	  }
	  if else(d>=25 && d<29.9){
		  return "Over Weight";
	  }
  
	  if else(d>=30 && d<34.9){
		  return "Obese";
	  }
  
	  if else(d>35 ){
		  return "Extremely Obese";
	  }
  }
}
