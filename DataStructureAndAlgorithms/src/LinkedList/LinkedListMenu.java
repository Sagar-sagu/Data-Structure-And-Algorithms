
package src.LinkedList;

import src.LinkedList.singlyLinkedList.SinglyLinkedList;
import java.util.Scanner;
// import singlyLinkedList.*;

public class LinkedListMenu
{
    public static void LinkedListOperations()
    {
      Scanner scan = new Scanner(System.in);
      running:
      while (true)
      {
        System.out.println("");
        System.out.println("1.SinglyLinkedList ( can Traverse only Forword )");
        System.out.println("2.DoublyLinkedList ( can Traverse Both Forword and Backword )");
        System.out.println("3.CircularLinkedList ( can Traverse only Forword Circularly)");
        System.out.println("4.DoublyCircularLinkedList ( can Traverse Both Forword And Backword Circularly)");
        System.out.println("5.Back");

        System.out.println("Enter your Option(1,2,3,4,5) : ");
        int Option = scan.nextInt();

        switch (Option)
         {
             case 1:SinglyLinkedList obj = new SinglyLinkedList();
                    obj.test();
                    // SinglyLinkedList.DisplayNodes();
                 break;
             case 5:System.out.println("you are going back.....");
                   System.out.println("");
                  break running;
             default:System.out.println("Invalid choice. Please try again.");
                 break;
        }
      }
    }
}
