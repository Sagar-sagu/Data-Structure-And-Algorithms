package src.Arrays;

import java.util.Scanner;

public class ArraysMenu{
  public static void ArrayOperations(){
    Scanner scan = new Scanner(System.in);
    running:
    while (true) {
      System.out.println("");
      System.out.println("1.Create Array, avilable Types are (Integer,String)");
      System.out.println("2.Insert elements");
      System.out.println("3.Delete Elements (it means shifting elements)");
      System.out.println("4.Read Elements");
      System.out.println("5.Update (change the elements)");
      System.out.println("6.Display (Show All Elements)");
      System.out.println("7.Search (check wheather Searching element is there in Array or not)");
      System.out.println("8.Capacity (it returns Capacity of Stack)");
      System.out.println("9.Remaining Slots (it returns Remaing index of Capacity)");
      System.out.println("10.Go's Back");
      System.out.println("11.Exit");

      System.out.println("Enter your Option(1,2,3,4,5,6,7,8,9,10,11) : ");
      String Option = scan.nextLine();

      switch (Option)
      {
        case "1":Array.CreateArray();
            break;
        case "2":Array.Insert();
            break;
        case "3":Array.Delete();
            break;
        case "4":Array.Read();
            break;
        case "5":Array.Update();
            break;
        case "6":Array.Display();
            break;
        case "7":Array.Search();
            break;
        case "8":Array.Capacity();
            break;
        case "9":Array.RemainingIndexes();
            break;
        case "10":System.out.println("your are going Back");;
            break running;
        case "11":System.out.println("Exiting........");
              System.exit(0);
        default:System.out.println("Invalid choice. Please try again.");
            break;
      }
    }
  }

  public static void ArrayListOperations(){
    Scanner scan = new Scanner(System.in);
    running:
    while (true) {
      System.out.println("");
      System.out.println("1.Array (Size is Fixed)");
      System.out.println("2.ArrayList (Size is dynamic)");
      System.out.println("3.Go's Back");
      System.out.println("4.Exit");

      System.out.println("Enter your Option(1,2,3,4) : ");
      String Option = scan.nextLine();

      switch (Option){
        case "1":ArrayOperations();
            break;
        case "2":System.out.println("Comming Soon");;
            break;
        case "3":System.out.println("your are going Back");;
            break running;
        case "4":System.out.println("Exiting........");
              System.exit(0);
        default:System.out.println("Invalid choice. Please try again.");
            break;
      }
    }
  }

  public static void ArrayImplementTypes(){
    Scanner scan = new Scanner(System.in);
    running:
    while (true) {
      System.out.println("");
      System.out.println("1.Array (Size is Fixed)");
      System.out.println("2.ArrayList (Size is dynamic)");
      System.out.println("3.Go's Back");
      System.out.println("4.Exit");

      System.out.println("Enter your Option(1,2,3,4) : ");
      String Option = scan.nextLine();

      switch (Option)
      {
        case "1":ArrayOperations();
            break;
        case "2":System.out.println("Comming Soon");;
            break;
        case "3":System.out.println("your are going Back");;
            break running;
        case "4":System.out.println("Exiting........");
              System.exit(0);
        default:System.out.println("Invalid choice. Please try again.");
            break;
      }
    }
  }
}
