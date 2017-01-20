import java.util.Scanner;
public class HumanDriver {
	public static void main(String args[]){
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your hair");
		String hair = kb.nextLine();
		System.out.println("Enter your eyes");
		String eyes = kb.nextLine();
		System.out.println("Enter your skin");
		String skin = kb.nextLine();
		Human object = new Human(hair, eyes, skin);
		System.out.println("Your Info \nHair: "+ object.getHair());
		System.out.println("Eyes: "+ object.getEyes());
		System.out.println("Skin: "+ object.getSkin());
		System.out.println("Enter someone else's hair :");
		hair = kb.nextLine();
		System.out.println("Enter their eyes:");
		eyes = kb.nextLine();
		System.out.println("Enter their skkin:");
		skin = kb.nextLine();
		object.setHair(hair);
		object.setEyes(eyes);
		object.setSkin(skin);
		System.out.println("Someone else's Info \nHair: "+ object.getHair());
		System.out.println("Eyes: "+ object.getEyes());
		System.out.println("Skin: "+ object.getSkin());
	}
}