package src.Arrays;

import java.util.Scanner;

public class Array{
  static Scanner scan = new Scanner(System.in);
  static int IntegerLength;
  static int StringLength;
  static int usrGaveType;
  static int[] IntegerArray;
  static String[] StringArray;
  static int Integer = 0;
  static int String = 0;

  public static void CreateArray(){
    try {
      System.out.println("");
      System.out.println("1.Integer");
      System.out.println("2.String");
      System.out.println("Enter Data Type (1/2) ");
      usrGaveType = scan.nextInt();
      if (usrGaveType == 1) {
        System.out.println("Enter Data Size");
        IntegerLength = scan.nextInt();
        IntegerArray = new int[IntegerLength];
        System.out.println("Succesfully Integer Type Stack is Created");
      }
      else if (usrGaveType == 2) {
        System.out.println("Enter Data Size");
        StringLength = scan.nextInt();
        StringArray = new String[StringLength];
        System.out.println("Succesfully String Type Stack is Created");
      }
    } catch(Exception e) {
        System.out.println("Enter Integer value");
    }
  }

  public static void Insert(){
    try {
      System.out.println("");
      if ((IntegerLength != 0) || (StringLength != 0)) {
        if (usrGaveType == 1) {
          System.out.println("Enter Integer element");
          int IntegerArrayElements = scan.nextInt();
          if (Integer < IntegerArray.length) {
              IntegerArray[0] = IntegerArrayElements;
              Integer++;
          }
          else {
              System.out.println("Insert Element less than Array Capacity ");
          }
        }
        else if (usrGaveType == 2) {
          System.out.println("Enter String element");
          String StringStackElements = scan.nextLine();
          if (String < StringArray.length) {
              StringArray[0] = StringArrayElements;
              String++;
          }
          else {
              System.out.println("Insert Element less than Array Capacity ");
          }
        }
      }
      else {
          System.out.println("First You Create Array");
      }
    }
    catch (Exception e) {
        System.out.println("Exception: " + e);
    }
  }

  public static void Delete(){
    try{
      System.out.println("");
      if ((IntegerLength != 0) || (StringLength != 0)) {
        if (usrGaveType == 1) {
          if (IntegerTop == -1) {
              System.out.println("Array is Empty");
          }
          else {
              System.out.println("Poping element is " + IntegerStack[IntegerTop]);
              IntegerTop--;
          }
        }
        else if (usrGaveType == 2) {
          if (StringTop == -1) {
              System.out.println("Array is Empty");
          }
          else {
              System.out.println("Poping element is " + StringStack[StringTop]);
              StringTop--;
          }
        }
      }
      else {
          System.out.println("First You Create Array");
      }
    }
    catch (Exception e) {
        System.out.println("Exception: " + e);
    }
  }

  public static void Read(){
    try{
      System.out.println("");
      if ((IntegerLength != 0) || (StringLength != 0)) {
        if (usrGaveType == 1) {
          if (IntegerTop == -1) {
            System.out.println("Array is Empty");
          }
          else {
            System.out.println("Enter Index of Reading Element");
            int ReadEle = scan.nextInt();
            System.out.println(IntegerArray[ReadEle]);
          }
        }
        else if (usrGaveType == 2) {
          if (StringTop == -1) {
            System.out.println("Array is Empty");
          }
          else {
            System.out.println("Enter Index of Reading Element");
            String ReadEle = scan.nextInt();
            System.out.println(StringArray[ReadEle]);
          }
        }
      }
      else {
          System.out.println("First You Create Array");
      }
    }
    catch (Exception e) {
        System.out.println("Exception: " + e);
    }
  }

  public static void Update(){
    try{
      System.out.println("");
      if ((IntegerLength != 0) || (StringLength != 0)) {
        if (usrGaveType == 1) {
          if (IntegerTop == -1) {
            System.out.println("Array is Empty");
          }
          else {
            System.out.println("Enter Update Element");
            int UpdateEle = scan.nextInt();
            System.out.println("Enter Index of Update Element");
            int UpdateIndex = scan.nextInt();
            System.out.println(IntegerArray[UpdateIndex] = UpdateEle);
          }
        }
        else if (usrGaveType == 2) {
          if (StringTop == -1) {
            System.out.println("Array is Empty");
          }
          else {
            System.out.println("Enter Update Element");
            String UpdateEle = scan.nextInt();
            System.out.println("Enter Index of Update Element");
            String UpdateIndex = scan.nextInt();
            System.out.println(IntegerArray[UpdateIndex] = UpdateEle);
          }
        }
      }
      else {
          System.out.println("First You Create Array");
      }
    }
    catch (Exception e) {
        System.out.println("Exception: " + e);
    }
  }

  public static void Display(){
    try{
      System.out.println("");
      if ((IntegerLength != 0) || (StringLength != 0)) {
        if (usrGaveType == 1) {
          if (IntegerTop == -1) {
            System.out.println("Array is Empty");
          }
          else {
            System.out.println("");
            System.out.println("Array Elements");
            for (int elements : IntegerArray ) {
              System.out.println(elements);
            }
          }
        }
        else if (usrGaveType == 2) {
          if (StringTop == -1) {
            System.out.println("Array is Empty");
          }
          else {
            System.out.println("");
            System.out.println("Array Elements");
            for (String elements : StringArray ) {
              System.out.println(elements);
            }
          }
        }
      }
      else {
          System.out.println("First You Create Array");
      }
    }
    catch (Exception e) {
        System.out.println("Exception: " + e);
    }
  }

  public static void Search(){
    try{
      System.out.println("");
      if ((IntegerLength != 0) || (StringLength != 0)) {
        if (usrGaveType == 1) {
          if (IntegerTop == -1) {
            System.out.println("Array is Empty");
          }
          else {
            System.out.println("");
            System.out.println("Enter Search Element");
            int searchEle = scan.nextInt();
            for (int i=0;i<=IntegerArray.length-1;i++ ) {
              if (IntegerArray[i] == searchEle) {
                System.out.println("is There? True");
                break;
              }
              else if (Integerarray.length-1 == i) {
                System.out.println("is There? False");
              }
            }
          }
        }
        else if (usrGaveType == 2) {
          if (StringTop == -1) {
            System.out.println("Array is Empty");
          }
          else {
            System.out.println("");
            System.out.println("Enter Search Element");
            int searchEle = scan.nextInt();
            for (int i=0;i<=StringArray.length-1;i++ ) {
              if (StringArray[i] == searchEle) {
                System.out.println("is There? True");
                break;
              }
              else if (StringArray.length-1 == i) {
                System.out.println("is There? False");
              }
            }
          }
        }
      }
      else {
          System.out.println("First You Create Array");
      }
    }
    catch (Exception e) {
        System.out.println("Exception: " + e);
    }
  }

  public static void Capacity(){
    try {
      System.out.println("");
      if ((IntegerLength != 0) || (StringLength != 0)) {
        if (usrGaveType == 1) {
          System.out.println("Array Capacity is " + IntegerLength);
          return;
        }
        else if (usrGaveType == 2) {
          System.out.println("Array Capacity is " + StringLength);
          return;
        }
      }
      else {
        System.out.println("First You Create Stack");
      }
    } catch(Exception e) {
      System.out.println("Exception: " + e);
    }
  }

  public static void RemainingIndexes(){

  }
}
