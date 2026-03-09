package src.Arrays;

import java.util.Scanner;

public class Array{
  static Scanner scan = new Scanner(System.in);
  static int IntegerLength;
  static int StringLength;
  static int usrGaveType;
  static int[] IntegerArray;
  static String[] StringArray;
  static int Integer = -1;
  static int String = -1;

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
        System.out.println("Succesfully Integer Type Array is Created");
      }
      else if (usrGaveType == 2) {
        System.out.println("Enter Data Size");
        StringLength = scan.nextInt();
        StringArray = new String[StringLength];
        System.out.println("Succesfully String Type Array is Created");
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
          if (Integer == -1) {
            Integer++;
          }
          if (Integer < IntegerArray.length) {
              IntegerArray[Integer] = IntegerArrayElements;
              Integer++;
          }
          else {
              System.out.println("Insert Element less than Array Capacity ");
          }
        }
        else if (usrGaveType == 2) {
          System.out.println("Enter String element");
          String StringArrayElements = scan.nextLine();
          if (String == -1) {
            String++;
          }
          if (String < StringArray.length) {
              StringArray[String] = StringArrayElements;
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
          if (Integer == -1) {
            System.out.println("Array is Empty");
          }
          else {
            System.out.println("Enter Index of Delete Element");
            int DeleteIndex = scan.nextInt();
            int DeleteEle = IntegerArray[DeleteIndex];
            if (DeleteIndex == 0 && IntegerArray[1] == 0) {
              IntegerArray[0] = 0;
              Integer = -1;
              return;
            }
            for (int i=Integer-1;i>=0 ;i-- ) {
            	if(i==0) {break;}
              IntegerArray[i-1] = IntegerArray[i];
            }
            if (IntegerArray[Integer] == 0 && IntegerArray[Integer] != IntegerLength) {
              IntegerArray[Integer-1] = 0;
            }
            System.out.println("Deleteing Element is " + DeleteEle);
            if (DeleteIndex <= Integer-1) {
              Integer--;
            }
          }
        }
        else if (usrGaveType == 2) {
          if (String == -1) {
            System.out.println("Array is Empty");
          }
          else {
            System.out.println("Enter Index of Delete Element");
            int DeleteIndex = scan.nextInt();
            String DeleteEle = StringArray[DeleteIndex];
            if (DeleteIndex == 0) {
              StringArray[0] = null;
              String = -1;
              return;
            }
            for (int i=String;i>=1 ;i++ ) {
              StringArray[i] = StringArray[i-1];
            }
            System.out.println("Deleteing Element is " + DeleteEle);
            if (DeleteIndex <= IntegerLength-1) {
              Integer--;
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

  public static void Read(){
    try{
      System.out.println("");
      if ((IntegerLength != 0) || (StringLength != 0)) {
        if (usrGaveType == 1) {
          if (Integer == -1) {
            System.out.println("Array is Empty");
          }
          else {
            System.out.println("Enter Index of Reading Element");
            int ReadEle = scan.nextInt();
            System.out.println("Reading Element is " + IntegerArray[ReadEle]);
          }
        }
        else if (usrGaveType == 2) {
          if (String == -1) {
            System.out.println("Array is Empty");
          }
          else {
            System.out.println("Enter Index of Reading Element");
            int ReadEle = scan.nextInt();
            System.out.println("Reading Element is " + StringArray[ReadEle]);
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
          if (Integer == -1) {
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
          if (String == -1) {
            System.out.println("Array is Empty");
          }
          else {
            System.out.println("Enter Update Element");
            String UpdateEle = scan.nextLine();
            System.out.println("Enter Index of Update Element");
            int UpdateIndex = scan.nextInt();
            System.out.println(StringArray[UpdateIndex] = UpdateEle);
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
          if (Integer == -1) {
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
          if (String == -1) {
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
          if (Integer == -1) {
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
              else if (IntegerArray.length-1 == i) {
                System.out.println("is There? False");
              }
            }
          }
        }
        else if (usrGaveType == 2) {
          if (String == -1) {
            System.out.println("Array is Empty");
          }
          else {
            System.out.println("");
            System.out.println("Enter Search Element");
            int searchEle = scan.nextInt();
            for (int i=0;i<=StringArray.length-1;i++ ) {
              if (StringArray[i].equals(searchEle)) {
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
    System.out.println("Comming soon");
  }
}
