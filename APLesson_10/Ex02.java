import java.util.*;
public class Ex02 {
	public static void main(String args[]){
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter Equation to be solved ");
		String eqString = kb.nextLine();
		ArrayList<String> equation = new ArrayList<String>(Arrays.asList(eqString.split(" ")));
		System.out.println("The answer is " +xEquation(equation)+" ,Duh!");
	}
	public static ArrayList xEquation(ArrayList<String> equation){
			int i = 0;
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
			while(equation.size()>1){
			i=0;
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
		}
		return equation;
	}
}