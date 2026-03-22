package src.Algorithms;

import java.util.Scanner;

public class AlgorithmsMenu{
  static Scanner scan = new Scanner(System.in);

  public static void LinearSearchOperations(){
    System.out.println("comming soon");
  }

  public static void BinarySearchOperations(){
    System.out.println("comming soon");
  }

  public static void BubbleSortOperations(){
    System.out.println("comming soon");
  }

  public static void SelectionSortOperations(){
    System.out.println("comming soon");
  }

  public static void Algorithms(){
    running:
    while (true) {
      System.out.println("");
      System.out.println("1.LinearSearch");
      System.out.println("2.BinarySearch");
      System.out.println("3.BubbleSort");
      System.out.println("4.SelectionSort");
      System.out.println("5.Back");
      System.out.println("6.Exit");

      System.out.println("Enter your Option(1,2,3,4,5,6) : ");
      String Option = scan.nextLine();

      switch (Option)
      {
        case "1":LinearSearchOperations();
            break;
        case "2":BinarySearchOperations();
            break;
        case "3":BubbleSortOperations();
            break;
        case "4":SelectionSortOperations();
            break;
        case "5":System.out.println("Go's Back");
            break running;
        case "6":System.out.println("Exiting........");
              System.exit(0);
        default:System.out.println("Invalid choice. Please try again.");
            break;
      }
    }
  }
}
