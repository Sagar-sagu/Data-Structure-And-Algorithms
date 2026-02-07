package src.Queue.QueueWithArray;

import java.util.Scanner;

public class Queue{
  static Scanner scan = new Scanner(System.in);
  static int IntegerLength;
  static int StringLength;
  static int usrGaveType;
  static int[] IntegerQueue;
  static String[] StringQueue;
  static int IntegerFront = 0;
  static int StringFront = 0;
  static int IntegerRear = -1;
  static int StringRear = -1;

  public static void CreateQueue(){
    try {
      System.out.println("");
      System.out.println("1.Integer");
      System.out.println("2.String");
      System.out.println("Enter Data Type (1/2) ");
      usrGaveType = scan.nextInt();
      if (usrGaveType == 1) {
        System.out.println("Enter Data Size");
        IntegerLength = scan.nextInt();
        IntegerQueue = new int[IntegerLength];
        System.out.println("Succesfully Integer Type Queue is Created");
      }
      else if (usrGaveType == 2) {
        System.out.println("Enter Data Size");
        StringLength = scan.nextInt();
        StringQueue = new String[StringLength];
        System.out.println("Succesfully String Type Queue is Created");
      }
    } catch(Exception e) {
      System.out.println("Enter Integer value");
    }
  }

  public static void isEmpty(){
    try {
      System.out.println("");
      if ((IntegerLength != 0) || (StringLength != 0)) {
        if (usrGaveType == 1) {
          if (IntegerRear == -1) {
            System.out.println("Queue is Empty? True");
          }
          else {
            System.out.println("Queue is Empty? False");
          }
        }
        else if (usrGaveType == 2) {
          if (StringRear == -1) {
            System.out.println("Queue is Empty? True");
          }
          else {
            System.out.println("Queue is Empty? False");
          }
        }
      }
      else {
        System.out.println("First You Create Queue");
      }
    }
    catch (Exception e) {
      System.out.println("");
    }
  }

  public static void EnQueue(){
    try {
      System.out.println("");
      if ((IntegerLength != 0) || (StringLength != 0)) {
        if (usrGaveType == 1) {
          System.out.println("Enter Integer element");
          int IntegerQueueElements = scan.nextInt();
          if (IntegerRear<IntegerLength-1) {
            IntegerQueue[(IntegerFront+IntegerRear) % IntegerLength] = IntegerQueueElements;
            IntegerRear++;
          }
          else {
            System.out.println("Queue Size  is OverFlow ");
          }
        }
        else if (usrGaveType == 2) {
          System.out.println("Enter String element");
          String StringQueueElements = scan.nextLine();
          if (StringRear<StringLength-1) {
            StringQueue[(StringFront+StringRear) % StringLength] = StringQueueElements;
            StringRear++;
          }
          else {
            System.out.println("Queue Size  is OverFlow ");
          }
        }
      }
      else {
        System.out.println("First You Create Queue");
      }
    }
    catch (Exception e) {
      System.out.println("");
    }
  }

  public static void DeQueue(){
    try{
      System.out.println("");
      if ((IntegerLength != 0) || (StringLength != 0)) {
        if (usrGaveType == 1) {
          if (IntegerRear == -1) {
            System.out.println("Queue is Empty");
          }
          else {
            System.out.println("DeQueue element is " + IntegerQueue[IntegerFront]);
            IntegerFront++;
          }
        }
        else if (usrGaveType == 2) {
          if (StringRear == -1) {
            System.out.println("Queue is Empty");
          }
          else {
            System.out.println("DeQueue element is " + StringQueue[StringFront]);
            StringFront++;
          }
        }
      }
      else {
        System.out.println("First You Create Queue");
      }
    }
    catch (Exception e) {
      System.out.println("");
    }
  }

  public static void Peek(){
    try {
      System.out.println("");
      if ((IntegerLength != 0) || (StringLength != 0)) {
        if (usrGaveType == 1) {
          if (IntegerRear == -1) {
            System.out.println("Queue is Empty");
          }
          System.out.println("Front End Queue element is " + IntegerQueue[IntegerFront]);
        }
        else if (usrGaveType == 2) {
          if (StringRear == -1) {
            System.out.println("Queue is Empty");
          }
          System.out.println("Front End  Queue element is " + StringQueue[StringFront]);
        }
      }
      else {
        System.out.println("First You Create Queue");
      }
    }
    catch (Exception e) {
      System.out.println("");
    }
  }

  public static void Search(){
    try{
      System.out.println("");
      if ((IntegerLength != 0) || (StringLength != 0)) {
        if (usrGaveType == 1) {
          if (IntegerRear == -1) {
            System.out.println("Queue is Empty");
          }
          else {
            System.out.println("Enter Search element");
            int usrSearchElement = scan.nextInt();
            for (int i=0;i<=IntegerLength-1;i++ ) {
              if (IntegerQueue[i] == usrSearchElement) {
                System.out.println("is There? True");
                break;
              }
              else if (IntegerLength-1 == i) {
            	  System.out.println("is There? False");
              }
            }
          }
        }
        else if (usrGaveType == 2) {
          if (StringRear == -1) {
            System.out.println("Queue is Empty");
          }
          else {
            System.out.println("Enter Search element");
            String usrSearchElement = scan.nextLine();
            for (int i=0;i<=StringLength-1;i++ ) {
              if (StringQueue[i].equals(usrSearchElement)) {
                System.out.println("is There? True");
                break;
              }
              else if (StringLength-1 == i) {
            	  System.out.println("is There? False");
              }
            }
          }
        }
      }
      else {
        System.out.println("First You Create Queue");
      }
    }
    catch (Exception e) {
      System.out.println("");
    }
  }

  public static void Size(){
    try {
      System.out.println("");
      if ((IntegerLength != 0) || (StringLength != 0)) {
        if (usrGaveType == 1) {
          if (IntegerRear != -1) {
            int TempVar = IntegerRear;
            System.out.println("Queue Size is " + ++TempVar);
            return;
          }
          System.out.println("Queue is Empty");
        }
        else if (usrGaveType == 2) {
          if (IntegerRear != -1) {
            int TempVar = StringRear;
            System.out.println("Queue Size is " + ++TempVar);
            return;
          }
          System.out.println("Queue is Empty");
        }
      }
      else {
        System.out.println("First You Create Queue");
      }
    }
    catch (Exception e) {
      System.out.println("");
    }
  }

  public static void ViewElements(){
    System.out.println("");
    try {
      if ((IntegerLength != 0) || (StringLength != 0)) {
        if (usrGaveType == 1) {
          if (IntegerRear == -1) {
            System.out.println("Queue is Empty");
          }
          else {
        	  System.out.println("Queue Elements are:-");
            System.out.println(" -------------------------");
            for (int i=0;i<=IntegerLength-1;i++ ) {
              System.out.print("| " + IntegerQueue[i] + " |");
            }
            System.out.println(" -------------------------");
          }
        }
        else if (usrGaveType == 2) {
          if (StringRear == -1) {
            System.out.println("Queue is Empty");
          }
          else {
        	  System.out.println("Queue Elements are:-");
            System.out.println(" -------------------------");
            for (int i=0;i<=StringLength-1;i++ ) {
              System.out.print("| " + StringQueue[i] + " |");
            }
            System.out.println(" -------------------------");
          }
        }
      }
      else {
        System.out.println("First You Create Queue");
      }
    } catch(Exception e) {
      System.out.println("");
    }
  }

  public static void Capacity(){
    try {
      System.out.println("");
      if ((IntegerLength != 0) || (StringLength != 0)) {
        if (usrGaveType == 1) {
          System.out.println("Queue Capacity is " + IntegerLength);
          return;
        }
        else if (usrGaveType == 2) {
          System.out.println("Queue Capacity is " + StringLength);
          return;
        }
      }
      else {
        System.out.println("First You Create Queue");
      }
    } catch(Exception e) {
      System.out.println("");
    }
  }

  public static void RemainSlots(){
    try {
      System.out.println("");
      if ((IntegerLength != 0) || (StringLength != 0)) {
        if (usrGaveType == 1) {
          if (IntegerRear != -1) {
            System.out.println("Remaining Slots is " + ((IntegerLength-1)-IntegerRear));
            return;
          }
          System.out.println("Queue is Empty");
        }
        else if (usrGaveType == 2) {
          if (IntegerRear != -1) {
            System.out.println("Remaining Slots is " + ((StringLength-1)-StringRear));
            return;
          }
          System.out.println("Queue is Empty");
        }
      }
      else {
        System.out.println("First You Create Queue");
      }
    } catch(Exception e) {
      System.out.println("");
    }
  }
}
