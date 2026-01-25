package src.Stack;

import java.util.Scanner;

public class Stack{
  static Scanner scan = new Scanner(System.in);
  static int IntegerLength;
  static int StringLength;
  static int usrGaveType;
  static int[] IntegerStack;
  static String[] StringStack;
  static int IntegerTop = -1;
  static int StringTop = -1;

  public static void CreateStack(){
    try {
      System.out.println("");
      System.out.println("1.Integer");
      System.out.println("2.String");
      System.out.println("Enter Data Type (1/2) ");
      usrGaveType = scan.nextInt();
      if (usrGaveType == 1) {
        System.out.println("Enter Data Size");
        IntegerLength = scan.nextInt();
        IntegerStack = new int[IntegerLength];
        System.out.println("Succesfully Integer Type Stack is Created");
      }
      else if (usrGaveType == 2) {
        System.out.println("Enter Data Size");
        StringLength = scan.nextInt();
        StringStack = new String[StringLength];
        System.out.println("Succesfully String Type Stack is Created");
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
          boolean IsEmpty = false;
          if (IntegerTop == -1) {
            IsEmpty = true;
            System.out.println("Stack is Empty? " + IsEmpty);
          }
          else {
            System.out.println("Stack is Empty? " + IsEmpty);
          }
        }
        else if (usrGaveType == 2) {
          boolean IsEmpty = false;
          if (StringTop == -1) {
            IsEmpty = true;
            System.out.println("Stack is Empty? " + IsEmpty);
          }
          else {
            System.out.println("Stack is Empty? " + IsEmpty);
          }
        }
      }
      else {
        System.out.println("First You Create Stack");
      }
    }
    catch (Exception e) {
      System.out.println("");
    }
  }

  public static void Push(){
    try {
      System.out.println("");
      if ((IntegerLength != 0) || (StringLength != 0)) {
        if (usrGaveType == 1) {
          System.out.println("Enter Integer element");
          int IntegerStackElements = scan.nextInt();
          if (IntegerTop<IntegerLength-1) {
            IntegerStack[++IntegerTop] = IntegerStackElements;
          }
          else {
            System.out.println("Stack Size  is OverFlow ");
          }
        }
        else if (usrGaveType == 2) {
          System.out.println("Enter String element");
          String StringStackElements = scan.nextLine();
          if (StringTop<StringLength-1) {
            StringStack[++StringTop] = StringStackElements;
          }
          else {
            System.out.println("Stack Size  is OverFlow ");
          }
        }
      }
      else {
        System.out.println("First You Create Stack");
      }
    }
    catch (Exception e) {
      System.out.println("");
    }
  }

  public static void Pop(){
    try{
      System.out.println("");
      if ((IntegerLength != 0) || (StringLength != 0)) {
        if (usrGaveType == 1) {
          System.out.println("Poping element is " + IntegerStack[IntegerTop]);
          IntegerTop--;
        }
        else if (usrGaveType == 2) {
          System.out.println("Poping element is " + StringStack[StringTop]);
          StringTop--;
        }
      }
      else {
        System.out.println("First You Create Stack");
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
          if (IntegerTop == -1) {
            System.out.println("Stack is Empty");
          }
          System.out.println("Top of Stack element is " + IntegerStack[IntegerTop]);
        }
        else if (usrGaveType == 2) {
          if (StringTop == -1) {
            System.out.println("Stack is Empty");
          }
          System.out.println("Top of Stack element is " + StringStack[StringTop]);
        }
      }
      else {
        System.out.println("First You Create Stack");
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
          System.out.println("Enter Search element");
          int usrSearchElement = scan.nextInt();
          for (int i=0;i<IntegerLength;i++ ) {
            if (IntegerStack[i] == usrSearchElement) {
              System.out.println("True");
              break;
            }
            else {
              System.out.println("false");
              break;
            }
          }
        }
        else if (usrGaveType == 2) {
          System.out.println("Enter Search element");
          String usrSearchElement = scan.nextLine();
          for (int i=0;i<StringLength;i++ ) {
            if (StringStack[i] == usrSearchElement) {
              System.out.println("True");
              break;
            }
            else {
              System.out.println("false");
              break;
            }
          }
        }
      }
      else {
        System.out.println("First You Create Stack");
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
          System.out.println("Stack Size is " + IntegerLength);
        }
        else if (usrGaveType == 2) {
          System.out.println("Stack Size is " + StringLength);
        }
      }
      else {
        System.out.println("First You Create Stack");
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
          for (int i=IntegerLength;i>=0;i-- ) {
            System.out.println(IntegerStack[i]);
          }
        }
        else if (usrGaveType == 2) {
          for (int i=StringLength;i>=0;i-- ) {
            System.out.println(StringStack[i]);
          }
        }
      }
      else {
        System.out.println("First You Create Stack");
      }
    } catch(Exception e) {
      System.out.println("");
    }

  }
}
