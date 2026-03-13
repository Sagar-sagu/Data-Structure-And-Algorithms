package src.LinkedList;

import java.util.Scanner;

public class SinglyLinkedList{
  //inner class of outer class
  public static class NodeStructure{
    int IntegerData;
    NodeStructure nextInteger;
    String  StringData;
    NodeStructure nextString;

    //inner class constructor
    public NodeStructure(int IntegerData){
      this.IntegerData = IntegerData;
      nextInteger = null;
    }

    public NodeStructure(String StringData){
      this.StringData = StringData;
      nextString = null;
    }
  }
  //var declaration
  static Scanner scan = new Scanner(System.in);
  static NodeStructure newNode = null;
  static int usrGaveType;
  public static NodeStructure IntegerHead=null;
  public static NodeStructure StringHead=null;
  static NodeStructure tempVar;
  //Linked List operations Methods
  public void CreateLinkedList(){
    try {
      System.out.println("");
      System.out.println("1.Integer");
      System.out.println("2.String");
      System.out.println("Enter Data Type (1/2) ");
      usrGaveType = scan.nextInt();
      if (usrGaveType == 1) {
        System.out.println("");
        System.out.println("Succesfully Integer Type Linked List is Created");
      }
      else if (usrGaveType == 2) {
        System.out.println("");
        System.out.println("Succesfully String Type Linked List is Created");
      }
    } catch(Exception e) {
      System.out.println("");
      System.out.println("Enter Integer value");
    }
  }

  public  void LinkedListIsEmpty(){
    try {
      System.out.println("");
      if ((usrGaveType != 0) || (usrGaveType != 0)) {
        if (usrGaveType == 1) {
          if (IntegerHead == null){
            System.out.println("Linked List is Empty? True");
            return;
          }
          System.out.println("Linked List is  Empty? False");
        }
        else if (usrGaveType == 2) {
          if (StringHead == null){
            System.out.println("Linked List is Empty? True");
            return;
          }
          System.out.println("Linked List is Empty? False");
        }
      }
      else {
        System.out.println("First You Create Linked List");
      }
    }
    catch (Exception e) {
      System.out.println("Exception" + e);
    }
  }

  public  void InsertAtBeginning(){
    try {
      System.out.println("");
      if ((usrGaveType != 0) || (usrGaveType != 0)) {
        if (usrGaveType == 1) {
          System.out.println("Enter Integer Node Data");
          int IntegerNodeData = scan.nextInt();
          newNode = new NodeStructure(IntegerNodeData);
          newNode.nextInteger = IntegerHead;
          IntegerHead = newNode;
          System.out.println("Inserted Node Succesfully");
        }
        else if (usrGaveType == 2) {
          System.out.println("Enter String Node Data");
          String StringNodeData = scan.nextLine();
          NodeStructure newNode = new NodeStructure(StringNodeData);
          newNode.nextString = StringHead;
          StringHead = newNode;
          System.out.println("Inserted Node Succesfully");
        }
      }
      else {
        System.out.println("First You Create Linked List");
      }
    }
    catch (Exception e) {
      System.out.println("Exception" + e);
    }
  }

  public  void InsertAtEnd(){
    try {
      System.out.println("");
      if ((usrGaveType != 0) || (usrGaveType != 0)) {
        if (usrGaveType == 1) {
        	 if (IntegerHead == null){
     	     InsertAtBeginning();
           return;
     	    }
     	    tempVar = IntegerHead;
     	    while (tempVar.nextInteger != null){
     	    	tempVar = tempVar.nextInteger;
     	    }
     	   System.out.println("Enter Integer Node Data");
           int IntegerNodeData = scan.nextInt();
           newNode = new NodeStructure(IntegerNodeData);
           tempVar.nextInteger = newNode;
           System.out.println("Inserted Node Succesfully");
        }
        else if (usrGaveType == 2) {
        	 if (StringHead == null){
     	      InsertAtBeginning();
            return;
     	    }
          tempVar = StringHead;
     	    while (tempVar.nextString != null){
     	    	tempVar = tempVar.nextString;
     	    }
     	   System.out.println("Enter String Node Data");
           int StringNodeData = scan.nextInt();
           newNode = new NodeStructure(StringNodeData);
           tempVar.nextString = newNode;
           System.out.println("Inserted Node Succesfully");
        }
      }
      else {
        System.out.println("First You Create Linked List");
      }
    }
    catch (Exception e) {
      System.out.println("Exception" + e);
    }
  }

  public  void DeleteAtBeginning(){
    try {
      System.out.println("");
      if ((usrGaveType != 0) || (usrGaveType != 0)) {
        if (usrGaveType == 1) {
          if (IntegerHead == null){
            System.out.println("Linked List is Empty? True");
            return;
          }
          IntegerHead = IntegerHead.nextInteger;
          System.out.println("Deleted Node Succesfully");
        }
        else if (usrGaveType == 2) {
          if (StringHead == null){
            System.out.println("Linked List is Empty? True");
            return;
          }
          StringHead = StringHead.nextString;
          System.out.println("Deleted Node Succesfully");
        }
      }
      else {
        System.out.println("First You Create Linked List");
      }
    }
    catch (Exception e) {
      System.out.println("Exception" + e);
    }
  }

  public  void DisplayNodes(){
  	try {
      System.out.println("");
      if ((usrGaveType != 0) || (usrGaveType != 0)) {
        if (usrGaveType == 1) {
          if (IntegerHead == null){
            System.out.println("Not Yet Insert Any Node");
            return;
          }
          NodeStructure tempVar = IntegerHead;
          System.out.println("Linked List elements are:");
          while (tempVar != null){
            System.out.print("|" + tempVar.IntegerData + "|AONN|" + "->");
            tempVar = tempVar.nextInteger;
          }
          System.out.println("null");
        }
      }
      else if (usrGaveType == 2) {
        if (StringHead == null){
          System.out.println("Linked List is Empty? True");
          return;
        }
        NodeStructure tempVar = StringHead;
        System.out.println("Linked List elements are:");
        while (tempVar != null){
          System.out.print("|" + tempVar.StringData + "|AONN|" + "->");
          tempVar = tempVar.nextString;
        }
        System.out.println("null");
      }
  	}catch (Exception e) {
  		System.out.println("Exception: " + e);
  	}
  }

  public  void InsertAtGivenPosition(){
    System.out.println("comming soon");
  }

  public  void DeleteAtEnd(){
    try {
      System.out.println("");
      if ((usrGaveType != 0) || (usrGaveType != 0)) {
        if (usrGaveType == 1) {
        	if (IntegerHead == null){
            System.out.println("Not Yet Insert Any Node");
            return;
     	    }
          if (IntegerHead.nextInteger == null) {
            IntegerHead = null;
            return;
          }
     	    tempVar = IntegerHead;
     	    while (tempVar.nextInteger.nextInteger != null){
     	    	tempVar = tempVar.nextInteger;
     	    }
          tempVar.nextInteger = null;
        }
        else if (usrGaveType == 2) {
        	 if (StringHead == null){
             System.out.println("Not Yet Insert Any Node");
             return;
     	    }
          if (StringHead.nextString == null) {
            StringHead = null;
            return;
          }
          tempVar = StringHead;
     	    while (tempVar.nextString != null){
     	    	tempVar = tempVar.nextString;
     	    }
        }
      }
      else {
        System.out.println("First You Create Linked List");
      }
    }
    catch (Exception e) {
      System.out.println("Exception" + e);
    }
  }

  public  void DeleteAtGivenPosition(){
    System.out.println("comming soon");
  }

  public  void Search(){
    try {
      System.out.println("");
      if ((usrGaveType != 0) || (usrGaveType != 0)) {
        if (usrGaveType == 1) {
          if (IntegerHead == null){
            System.out.println("Not Yet Insert Any Node");
            return;
          }
          NodeStructure tempVar = IntegerHead;
          System.out.println("Enter Searching Node data:");
          int searchElement = scan.nextInt();
          int count = 1;
          while (tempVar != null){
            if (tempVar.IntegerData == searchElement) {
              System.out.println("is There? True");
              System.out.println("assuming  stored elements are in  assending order");
              System.out.println("index number of " + searchElement + " is " + count );
              break;
            }
            count++;
            tempVar = tempVar.nextInteger;
          }
          if (tempVar == null) {
            System.out.println("is There? False");
          }
        }
        else if (usrGaveType == 2) {
          if (StringHead == null){
            System.out.println("Linked List is Empty? True");
            return;
          }
          NodeStructure tempVar = StringHead;
          System.out.println("Enter Searching Node data:");
          String searchElement = scan.nextLine();
          int count = 1;
          while (tempVar != null){
            if (tempVar.StringData == searchElement) {
              System.out.println("is There? True");
              System.out.println("assume store elements assending order");
              System.out.println("index number of " + searchElement + " is " + count );
              break;
            }
            count++;
            tempVar = tempVar.nextString;
          }
          if (tempVar == null) {
            System.out.println("is There? False");
          }
        }
      }
      else {
        System.out.println("First You Create Linked List");
      }
  	}catch (Exception e) {
  		System.out.println("Exception: " + e);
  	}
  }

  public  void Size(){
    try {
      System.out.println("");
      if ((usrGaveType != 0) || (usrGaveType != 0)) {
        if (usrGaveType == 1) {
          if (IntegerHead == null){
            System.out.println("Not Yet Insert Any Node");
            return;
          }
          int count = 0;
          NodeStructure tempVar = IntegerHead;
          while (tempVar != null){
            count++;
            tempVar = tempVar.nextInteger;
          }
          System.out.println("Size of SinglyLinkedList elements: " + count);
        }
        else if (usrGaveType == 2) {
          if (StringHead == null){
            System.out.println("Linked List is Empty? True");
            return;
          }
          int count = 0;
          NodeStructure tempVar = StringHead;
          while (tempVar != null){
            count++;
            tempVar = tempVar.nextString;
          }
          System.out.println("Size of SinglyLinkedList elements: " + count);
        }
      }
      else {
        System.out.println("First You Create Linked List");
      }
  	}catch (Exception e) {
  		System.out.println("Exception: " + e);
  	}
  }
}
