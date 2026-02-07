package src.Queue;

import java.util.Scanner;
import src.Queue.QueueWithArray.Queue;


public class QueueMenu{
  static void QueueWithArray(){
    Scanner scan = new Scanner(System.in);
    running:
    while (true) {
      System.out.println("");
      System.out.println("1.Create Queue Data Structure, avilable Types are (Integer,String)");
      System.out.println("2.isEmpty (check wheather Queue is empty or not)");
      System.out.println("3.EnQueue (add elements to Queue via rear End)");
      System.out.println("4.DeQueue (remove front of the Queue element )");
      System.out.println("5.Peek (it returns the front of Queue element)");
      System.out.println("6.View (Show All Elements in Queue)");
      System.out.println("7.Search (check wheather Searching element is there in Queue or not)");
      System.out.println("8.Size (it returns the number of elements in the queue)");
      System.out.println("9.Capacity (it returns Capacity of Queue)");
      System.out.println("10.Remaing Slots (it returns Remaing index of Capacity)");
      System.out.println("11.Goe's Back");
      System.out.println("12.Exit");

      System.out.println("Enter your Option(1,2,3,4,5,6,7,8,9,10) : ");
      String Option = scan.nextLine();

      switch (Option)
      {
       case "1":Queue.CreateQueue();
           break;
       case "2":Queue.isEmpty();
           break;
       case "3":Queue.EnQueue();
           break;
       case "4":Queue.DeQueue();
           break;
       case "5":Queue.Peek();
           break;
       case "6":Queue.ViewElements();
           break;
       case "7":Queue.Search();
           break;
       case "8":Queue.Size();
           break;
       case "9":Queue.Capacity();
           break;
       case "10":Queue.RemainSlots();
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

  public static void QueueOperations(){
    Scanner scan = new Scanner(System.in);
    running:
    while (true) {
      System.out.println("");
      System.out.println("1.Queue With Array (Size is Fixed)");
      System.out.println("2.Queue With LinkedList (Size is dynamic)");
      System.out.println("3.Go's Back");
      System.out.println("4.Exit");

      System.out.println("Enter your Option(1,2,3,4) : ");
      String Option = scan.nextLine();

      switch (Option)
      {
       case "1":QueueWithArray();
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
