package src.Queue.QueueWithArray;

import java.util.Scanner;

public class CircularQueue{
  static Scanner scan = new Scanner(System.in);
  static int IntegerLength;
  static int StringLength;
  static int usrGaveType;
  static int[] IntegerQueue;
  static String[] StringQueue;
  static int IntegerFront = -1;
  static int StringFront = -1;
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
      else{
        System.out.println("Invalid choice. Please try again.");
      }
    } catch(Exception e) {
      System.out.println("Enter Integer value");
    }
  }

  public static void isEmpty(){
    try {
      System.out.println("");
      if ((IntegerLength != 0) || (StringLength != 0)){
        if (usrGaveType == 1) {
          if (IntegerRear == -1 && IntegerFront == -1){
            System.out.println("Queue is Empty? True");
          }
          else {
            System.out.println("Queue is Empty? False");
          }
        }
        else if (usrGaveType == 2) {
          if (StringRear == -1 && StringFront == -1){
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
      if ((IntegerLength != 0) || (StringLength != 0)){
        if (usrGaveType == 1) {
          System.out.println("Enter Integer element");
          int IntegerQueueElements = scan.nextInt();
          if (IntegerFront == ((IntegerRear+1)%IntegerLength)){
            System.out.println("Capacity of Queue Size is OverFlow");
          }
          else if (IntegerFront == -1 && IntegerRear == -1) {
            IntegerRear++;
            IntegerFront++;
            IntegerQueue[IntegerRear] = IntegerQueueElements;
          }
          else{
            IntegerRear = (IntegerRear+1)%IntegerLength;
            IntegerQueue[IntegerRear] = IntegerQueueElements;
          }
        }
        else if (usrGaveType == 2) {
          System.out.println("Enter String element");
          String StringQueueElements = scan.nextLine();
          if (StringFront == ((StringRear+1)%StringLength)){
            System.out.println("Capacity of Queue Size is OverFlow");
          }
          else if (StringFront == -1 && StringRear == -1) {
            StringRear++;
            StringFront++;
            StringQueue[StringRear] = StringQueueElements;
          }
          else{
            StringRear = (StringRear+1)%StringLength;
            StringQueue[StringRear] = StringQueueElements;
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
          if (IntegerRear == -1 && IntegerFront == -1) {
            System.out.println("Queue is Empty");
          }
          else if(IntegerRear == IntegerFront){
            System.out.println("DeQueue element is " + IntegerQueue[IntegerFront]);
            IntegerFront=IntegerRear=-1;
          }
          else {
            System.out.println("DeQueue element is " + IntegerQueue[IntegerFront]);
            IntegerFront = (IntegerFront+1)%IntegerLength;
          }
        }
        else if (usrGaveType == 2) {
          if (StringRear == -1 && StringFront == -1) {
            System.out.println("Queue is Empty");
          }
          else if(StringRear == StringFront){
            System.out.println("DeQueue element is " + StringQueue[StringFront]);
            StringFront=StringRear=-1;
          }
          else {
            System.out.println("DeQueue element is " + StringQueue[StringFront]);
            StringFront = (StringFront+1)%StringLength;
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
          if (IntegerRear == -1 && IntegerFront == -1) {
            System.out.println("Queue is Empty");
          }
          System.out.println("Front End Queue element is " + IntegerQueue[IntegerFront]);
        }
        else if (usrGaveType == 2) {
          if (StringRear == -1 && StringFront == -1) {
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



  public static void ViewElements(){
    System.out.println("");
    try {
      if ((IntegerLength != 0) || (StringLength != 0)) {
        if (usrGaveType == 1) {
          if (IntegerRear == -1 && IntegerFront == -1) {
            System.out.println("Queue is Empty");
          }
          else {
        	  System.out.println("Queue Elements are:-");
            for (int i=IntegerFront;i!=IntegerRear;i=(i+1)%IntegerLength ) {
              System.out.print("| " + IntegerQueue[i] + " |");
            }
            System.out.print("| " + IntegerQueue[IntegerRear] + " |");
            System.out.println("");
          }
        }
        else if (usrGaveType == 2) {
          if (StringRear == -1) {
            System.out.println("Queue is Empty");
          }
          else {
        	  System.out.println("Queue Elements are:-");
            for (int i=StringFront;i!=StringRear;i=(i+1)%StringLength ) {
              System.out.print("| " + StringQueue[i] + " |");
            }
            System.out.print("| " + StringQueue[StringRear] + " |");
            System.out.println("");
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
}
