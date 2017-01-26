import java.util.ArrayList; 
import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {
	
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter Equation: ");
		String eqString = kb.nextLine();
		ArrayList<String> equation = new ArrayList<String>(Arrays.asList(eqString.split(" ")));
		System.out.println(doEquation(equation));
	}
	
	public static ArrayList doEquation(ArrayList<String> equation){
		while(equation.size()>1){
		
			int i=0;
			while(i<equation.size()){
				if(equation.get(i).equals("*") || equation.get(i).equals("/")){
					if(equation.get(i).equals("*")){
						equation.set(i, Integer.toString((Integer.parseInt(equation.get(i-1))*Integer.parseInt(equation.get(i+1)))));
					}
					else {
						equation.set(i, Integer.toString((Integer.parseInt(equation.get(i-1))/Integer.parseInt(equation.get(i+1)))));
					}
					equation.remove(i-1);
					equation.remove(i);
				}
				i++;
			}
			
			i=0;
			while(i<equation.size()){
				if(equation.get(i).equals("+") || equation.get(i).equals("-")){
					if(equation.get(i).equals("+")){
						equation.set(i, Integer.toString((Integer.parseInt(equation.get(i-1))+Integer.parseInt(equation.get(i+1)))));
					}
					else {
						equation.set(i, Integer.toString((Integer.parseInt(equation.get(i-1))-Integer.parseInt(equation.get(i+1)))));
					}
					equation.remove(i-1);
					equation.remove(i);
				}
				i++;
			}
		}
		return equation;
	}
}