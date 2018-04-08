import java.util.Scanner;

public class Index{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Select an option (1-6):");
    System.out.println();
    System.out.println("1. Break");
    System.out.println("2. Switch");
    System.out.println("3. Methods");
    System.out.println("4. Shadowing");
    System.out.println("5. Overloading");
    System.out.println("6. First Array");
	System.out.println("7. Second Array");
	System.out.println("8. Try Catch");
	System.out.println("9. Enhanced For");
	System.out.println("10. Multi-Dimensional Array");
    System.out.println("11. Project Exercise 1");
    System.out.printlnt("12. Project Exercise 2");
    System.out.println("13. Exit");

    System.out.println();

    System.out.print("Choice: ");
    int choice = input.nextInt();
    System.out.println();

    switch(choice){
      case 1:
        System.out.println("Break lab");
        Break_Ex2.main(null); 
        break;
      case 2:
        System.out.println("Switch lab");
        System.out.println();
        FirstSwitch.main(null);
        break;
      case 3:
      	System.out.println("Methods lab");
      	Methods.main(null);
      	break;
      case 4:
      	System.out.println("Shadowing lab");
      	Shadow.main(null);
      	break;
      case 5:
      	System.out.println("Overloading lab");
      	Power.main(null);
      	break;
      case 6:
        System.out.println("First Array lab");
	    FirstArray.main(null);
      	break;
      case 7:
		System.out.println("Second Array lab");
		Power.main(null);
      	break;
      case 8:
		System.out.println("Try and Catch lab");
		SecondArray.main(null);
      	break;
      case 9:
		System.out.println("Enhanced for lab");
		EnhancedFor.main(null);
      	break;
	  case 10:
	    System.out.println("Search Multi-Dimensional Array");
	    SearchStudent.main(null);
      	break;
      case 11:
        System.out.println("Project Exercise 1");
        Convert.main(null);
        break;
       case 12;
        System.out.println("Project Exercise 2");
        Search.main(null);
        break;
       case 13;
        System.out.prinlnt("Exiting... ");
        break;
    }
    System.out.println();

  }
}