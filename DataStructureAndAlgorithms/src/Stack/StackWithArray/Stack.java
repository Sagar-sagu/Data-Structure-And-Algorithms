package src.Stack.StackWithArray;

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
          if (IntegerTop == -1) {
            System.out.println("Stack is Empty? True");
          }
          else {
            System.out.println("Stack is Empty? False");
          }
        }
        else if (usrGaveType == 2) {
          if (StringTop == -1) {
            System.out.println("Stack is Empty? True");
          }
          else {
            System.out.println("Stack is Empty? False");
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
            System.out.println("Stack Size  is OverFlow so, For Not To Take Elements ");
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
          if (IntegerTop == -1) {
            System.out.println("Stack is Empty");
          }
          else {
            System.out.println("Poping element is " + IntegerStack[IntegerTop]);
            IntegerTop--;
          }
        }
        else if (usrGaveType == 2) {
          if (StringTop == -1) {
            System.out.println("Stack is Empty");
          }
          else {
            System.out.println("Poping element is " + StringStack[StringTop]);
            StringTop--;
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
          if (IntegerTop == -1) {
            System.out.println("Stack is Empty");
          }
          else {
            System.out.println("Enter Search element");
            int usrSearchElement = scan.nextInt();
            for (int i=0;i<=IntegerLength-1;i++ ) {
              if (IntegerStack[i] == usrSearchElement) {
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
          if (StringTop == -1) {
            System.out.println("Stack is Empty");
          }
          else {
            System.out.println("Enter Search element");
            String usrSearchElement = scan.nextLine();
            for (int i=0;i<=StringLength-1;i++ ) {
              if (StringStack[i].equals(usrSearchElement)) {
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
          if (IntegerTop != -1) {
            int TempVar = IntegerTop;
            System.out.println("Stack Size is " + ++TempVar);
            return;
          }
          System.out.println("Stack is Empty");
        }
        else if (usrGaveType == 2) {
          if (IntegerTop != -1) {
            int TempVar = StringTop;
            System.out.println("Stack Size is " + ++TempVar);
            return;
          }
          System.out.println("Stack is Empty");
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
          if (IntegerTop == -1) {
            System.out.println("Stack is Empty");
          }
          else {
        	  System.out.println("Stack Elements are:-");
            for (int i=IntegerTop;i>=0 && i<=IntegerLength-1;i-- ) {
              System.out.println(" ----");
              System.out.println("| " + IntegerStack[i] + " |");
            }
            System.out.println(" ----");
          }
        }
        else if (usrGaveType == 2) {
          if (StringTop == -1) {
            System.out.println("Stack is Empty");
          }
          else {
        	  System.out.println("Stack Elements are:-");
            for (int i=StringTop;i>=0 && i<=StringLength-1;i-- ) {
              System.out.println(" ----");
              System.out.println("| " + StringStack[i] + " |");
            }
            System.out.println(" ----");
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

  public static void Capacity(){
    try {
      System.out.println("");
      if ((IntegerLength != 0) || (StringLength != 0)) {
        if (usrGaveType == 1) {
          System.out.println("Stack Capacity is " + IntegerLength);
          return;
        }
        else if (usrGaveType == 2) {
          System.out.println("Stack Capacity is " + StringLength);
          return;
        }
      }
      else {
        System.out.println("First You Create Stack");
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
          if (IntegerTop != -1) {
            System.out.println("Remaining Slots is " + ((IntegerLength-1)-IntegerTop));
            return;
          }
          System.out.println("Stack is Empty");
        }
        else if (usrGaveType == 2) {
          if (IntegerTop != -1) {
            System.out.println("Remaining Slots is " + ((StringLength-1)-StringTop));
            return;
          }
          System.out.println("Stack is Empty");
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
