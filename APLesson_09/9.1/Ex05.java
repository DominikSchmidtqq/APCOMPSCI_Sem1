
public class Ex05 {
    static String numList = "";

    public static void main(String[]args) {
        int [] numbers = new int[10];
        fillArray(numbers);
        System.out.println("For the following numbers " + printArray(numbers));
        System.out.println(getOdds(numbers) + " are all the odd numbers.");
    }

    public static void fillArray(int[] num) {
        for (int i = 0; i < num.length; i++) {
            num[i] = (int)((Math.random()*101));
        }
    }
    public static String printArray(int[] numb) {
        for (int n: numb) {
            numList += n + " " ;
        }
        return numList;
    }
    public static String getOdds(int[] numberz) {
        String odds = "";
        for (int nu: numberz) {
            if ((nu % 2) == 0) {
                odds += "";
            }
            else {
                odds += nu + " ";
            }
        }
        return odds;
    }
}