import java.util.Scanner;

public class Glavna {
	public static void main(String[]args) {
	
		Scanner scanner = new Scanner(System.in);
		
		Zbir b= new Zbir();
		System.out.print("Enter value for 'a': ");
        int aValue = scanner.nextInt();
        b.seta(aValue);
        
        System.out.print("Enter value for 'b': ");
        int bValue = scanner.nextInt();
        b.setb(bValue);
        
        int c = b.geta() + b.getb();
        System.out.println("Sum of a and b is: " + c);

        scanner.close(); 
	}
		
	

}
