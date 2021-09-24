package tgl09092021;//this class is input prompt
import java.util.*;

public class Asking {
	
 public static String ask(){
	 Scanner asking=new Scanner(System.in); 
	 System.out.print("enter number");
	 int str= asking.nextInt(); 
	 int stp= asking.nextInt();
	 System.out.println(str+stp);
	 asking.close();//closing the scanner 
	 return("fixed");
}
	

}