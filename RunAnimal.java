import java.util.Scanner;

public class RunAnimal{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Choose an anime. Press B for bird, C for cat, D for dog: ");
		String input1 = sc.nextLine();
		
		if (input1.equalsIgnoreCase("B")){
			Bird b = new Bird();
			b.eat();
			b.sleep();
			b.makeSound();
		}
		else if (input1.equalsIgnoreCase("C")){
			Cat c = new Cat();
			c.eat();
			c.sleep();
			c.makeSound();
		}
		else if (input1.equalsIgnoreCase("D")){
			Dog d = new Dog();
			d.eat();
			d.sleep();
			d.makeSound();
		}
		else{
			System.out.println ("Invalid Input!");
		}
		sc.close();
}
}