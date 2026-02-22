package src.Queue;

import java.util.Scanner;
import src.Queue.QueueWithArray.*;

public class QueueMenu{
  static Scanner scan = new Scanner(System.in);

  static void LinearQueueOperations(){
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
       case "1":LinearQueue.CreateQueue();
           break;
       case "2":LinearQueue.isEmpty();
           break;
       case "3":LinearQueue.EnQueue();
           break;
       case "4":LinearQueue.DeQueue();
           break;
       case "5":LinearQueue.Peek();
           break;
       case "6":LinearQueue.ViewElements();
           break;
       case "7":LinearQueue.Search();
           break;
       case "8":LinearQueue.Size();
           break;
       case "9":LinearQueue.Capacity();
           break;
       case "10":LinearQueue.RemainSlots();
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

  static void CircularQueueOperations(){
    running:
    while (true) {
      System.out.println("");
      System.out.println("1.Create Queue Data Structure, avilable Types are (Integer,String)");
      System.out.println("2.isEmpty (check wheather Queue is empty or not)");
      System.out.println("3.EnQueue (add elements to Queue via rear End)");
      System.out.println("4.DeQueue (remove front of the Queue element )");
      System.out.println("5.Peek (it returns the front of Queue element)");
      System.out.println("6.View (Show All Elements in Queue)");
      System.out.println("7.Capacity (it returns Capacity of Queue)");
      System.out.println("8.Goe's Back");
      System.out.println("9.Exit");
      System.out.println("");
      System.out.println("Enter your Option(1,2,3,4,5,6,7,8,9) : ");
      String Option = scan.nextLine();

      switch (Option)
      {
       case "1":CircularQueue.CreateQueue();
           break;
       case "2":CircularQueue.isEmpty();
           break;
       case "3":CircularQueue.EnQueue();
           break;
       case "4":CircularQueue.DeQueue();
           break;
       case "5":CircularQueue.Peek();
           break;
       case "6":CircularQueue.ViewElements();
           break;
       case "7":CircularQueue.Capacity();
           break;
       case "8":System.out.println("your are going Back");;
           break running;
       case "9":System.out.println("Exiting........");
             System.exit(0);
       default:System.out.println("Invalid choice. Please try again.");
           break;
      }
    }
  }

  static void QueueWithLinkedlistOperations(){
    System.out.println("");
  }

  public static void QueueTypes(){
    running:
    while (true) {
      System.out.println("");
      System.out.println("1.Linear Queue With Array (Size is Fixed But does't Utilize Memory)");
      System.out.println("2.Circular Queue With Array (Size is Fixed And Utilize Memory as Well)");
      System.out.println("3.Queue With LinkedList (Size is Dynamic)");
      System.out.println("4.Go's Back");
      System.out.println("5.Exit");
      System.out.println("");
      System.out.println("Enter your Option(1,2,3,4) : ");
      String Option = scan.nextLine();

      switch (Option)
      {
       case "1":LinearQueueOperations();
           break;
       case "2":CircularQueueOperations();
           break;
       case "3":QueueWithLinkedlistOperations();
           break;
       case "4":System.out.println("your are going Back");;
           break running;
       case "5":System.out.println("Exiting........");
             System.exit(0);
       default:System.out.println("Invalid choice. Please try again.");
           break;
      }
    }
  }
}
