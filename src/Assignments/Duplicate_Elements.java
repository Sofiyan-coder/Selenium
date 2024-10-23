package Assignments;
import java.util.*;
public class Duplicate_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[]={"java","c++","python","java","c++"};
//		String res = new ArrayList<String>();
		String res2 ="";
		for (int i = 0; i < arr.length; i++) {
			 for (int j = 0; j < arr.length; j++) {
				 
				 if(arr[i] == arr[j]) {
					 res2 = arr[i] + " ";
				 }
				
			}
			
		}
		
		System.out.println(res2.toString());
		
		

	}

}
