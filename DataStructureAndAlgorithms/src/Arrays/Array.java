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
                        IntegerArray = IntegerArrayElements;
                    }
                    else {
                        System.out.println("Insert Element less than Array Capacity ");
                    }
                }
                else if (usrGaveType == 2) {
                    System.out.println("Enter String element");
                    String StringStackElements = scan.nextLine();
                    if (String < StringArray.length) {
                        StringArray = StringArrayElements;
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
            System.out.println("");
        }
    }

    public static void Read(){

    }

    public static void Update(){

    }

    public static void Display(){

    }

    public static void Search(){

    }

    public static void Capacity(){

    }

    public static void RemainingIndexes(){

    }
}