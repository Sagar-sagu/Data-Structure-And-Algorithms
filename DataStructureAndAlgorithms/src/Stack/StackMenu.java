package src.Stack;

import java.util.Scanner;

public class StackMenu
{
  public static void StackOperations()
  {
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
      System.out.println("8.Size (it returns size of stack)");
      System.out.println("9.Goe's Back");
      System.out.println("10.Exit");

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
       case "9":System.out.println("your are going Back");;
           break running;
       case "10":System.out.println("Exiting........");
             System.exit(0);
       default:System.out.println("Invalid choice. Please try again.");
           break;
      }
    }
  }
}
