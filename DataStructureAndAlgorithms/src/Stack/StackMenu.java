package src.Stack;

import java.util.Scanner;
import src.Stack.StackWithArray.Stack;

public class StackMenu
{
  static void StackWithArrayOperations(){
    Scanner scan = new Scanner(System.in);
    running:
    while (true) {
      System.out.println("");
      System.out.println("1.Create Stack Data Structure, avilable Types are (Integer,String)");
      System.out.println("2.isEmpty (check wheather stack is empty or not)");
      System.out.println("3.Push (add elements to stack)");
      System.out.println("4.Pop (remove  top of the stack element )");
      System.out.println("5.Peek (it returns top of the stack element)");
      System.out.println("6.View (Show All Elements in Stack)");
      System.out.println("7.Search (check wheather Searching element is there in stack or not)");
      System.out.println("8.Size (it returns the number of elements in the Stack)");
      System.out.println("9.Capacity (it returns Capacity of Stack)");
      System.out.println("10.Remaing Slots (it returns Remaing index of Capacity)");
      System.out.println("11.Goe's Back");
      System.out.println("12.Exit");

      System.out.println("Enter your Option(1,2,3,4,5,6,7,8,9,10) : ");
      String Option = scan.nextLine();

      switch (Option)
      {
       case "1":Stack.CreateStack();
           break;
       case "2":Stack.isEmpty();
           break;
       case "3":Stack.Push();
           break;
       case "4":Stack.Pop();
           break;
       case "5":Stack.Peek();
           break;
       case "6":Stack.ViewElements();
           break;
       case "7":Stack.Search();
           break;
       case "8":Stack.Size();
           break;
       case "9":Stack.Capacity();
           break;
       case "10":Stack.RemainSlots();
           break;
       case "11":System.out.println("your are going Back");;
           break running;
       case "12":System.out.println("Exiting........");
             System.exit(0);
       default:System.out.println("Invalid choice. Please try again.");
           break;
      }
    }
  }

  public static void StackImplementTypes()
  {
    Scanner scan = new Scanner(System.in);
    running:
    while (true) {
      System.out.println("");
      System.out.println("1.Stack With Array (Size is Fixed)");
      System.out.println("2.Stack With LinkedList (Size is dynamic)");
      System.out.println("3.Go's Back");
      System.out.println("4.Exit");

      System.out.println("Enter your Option(1,2,3,4) : ");
      String Option = scan.nextLine();

      switch (Option)
      {
       case "1":StackWithArrayOperations();
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
