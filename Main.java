import Algorithms.AlgorithmsMenu;
import Arrays.ArraysMenu;
import LinkedLists.LinkedListsMenu;
import Queues.QueuesMenu;
import Stacks.StacksMenu;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        running:
        while (true)
        {
          System.out.println("****** WELCOME TO DATA STRUCTURE AND ALGORITHMS ********");
          System.out.println("");
          System.out.println("1.Algorithms");
          System.out.println("2.Arrays");
          System.out.println("3.Queues");
          System.out.println("4.Stacks");
          System.out.println("5.LinkedList");
          System.out.println("6.Exit");

          System.out.println("Enter your Option(1,2,3,4,5,6) : ");
          int Option = scan.nextInt();

          switch (Option)
          {
             case 1:AlgorithmsMenu.AlgorithmsOperationsMethod();
                 break;
             case 2:ArraysMenu.ArraysOperationsMethod();
                 break;
             case 3:QueuesMenu.QueuesOperationsMethod();
                 break;
             case 4:StacksMenu.StacksOperationsMethod();
                 break;
             case 5:LinkedListsMenu.LinkedListOperationsMethod();
                 break;
             case 6:System.out.println("Exiting........");
                   System.exit(0);
             default:System.out.println("Invalid choice. Please try again.");
                 break;
          }
        }
    }
}
