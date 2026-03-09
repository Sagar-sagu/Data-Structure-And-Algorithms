package src.LinkedList.singlyLinkedList;

import java.util.Scanner;

public class SinglyLinkedList
{
  //inner class of outer class
  public static class NodeStructure
  {
    int IntegerData;
    NodeStructure nextInteger;
    String  StringData;
    NodeStructure nextString;

    //inner class constructor
    public NodeStructure(int IntegerData)
    {
      this.IntegerData = IntegerData;
      nextInteger = null;
    }

    public NodeStructure(String StringData)
    {
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

  //outer class constructor
//  public SinglyLinkedList()
//  {
//    IntegerHead = null;
//    StringHead = null;
//  }

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
        	 if (IntegerHead == null)
     	    {
     	      System.out.println("Not Yet Insert Any Node");
     	      return;
     	    }
     	    tempVar = IntegerHead;
     	    while (tempVar != null)
     	    {
     	    	tempVar = tempVar.nextInteger;
     	    	  
     	    }
     	   System.out.println("Enter Integer Node Data");
           int IntegerNodeData = scan.nextInt();
           newNode = new NodeStructure(IntegerNodeData);
           newNode.nextInteger = tempVar;
           tempVar = newNode;
           System.out.println("Inserted Node Succesfully"); 
        }
        else if (usrGaveType == 2) {
        	 if (IntegerHead == null)
     	    {
     	      System.out.println("Not Yet Insert Any Node");
     	      return;
     	    }
     	    NodeStructure tempVar = IntegerHead;
     	    System.out.println("Linked List elements are:");
     	    while (tempVar != null)
     	    {
     	      System.out.print("|" + tempVar.IntegerData + "|AONN|" + "->");
     	      tempVar = tempVar.nextInteger;
     	    }
     	    System.out.println("null");
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
          IntegerHead = newNode.nextInteger;
          System.out.println("Deleted Node Succesfully");
        }
        else if (usrGaveType == 2) {
          if (StringHead == null){
            System.out.println("Linked List is Empty? True");
            return;
          }
          IntegerHead = newNode.nextInteger;
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

  public  void DisplayNodes()
  {
	try {
	    if (IntegerHead == null)
	    {
	      System.out.println("Not Yet Insert Any Node");
	      return;
	    }
	
	    NodeStructure tempVar = IntegerHead;
	    System.out.println("Linked List elements are:");
	    while (tempVar != null)
	    {
	      System.out.print("|" + tempVar.IntegerData + "|AONN|" + "->");
	      tempVar = tempVar.nextInteger;
	    }
	    System.out.println("null");
	}
	catch (Exception e) {
		System.out.println("Exception: " + e);
	}
  }

  public  void InsertAtGivenPosition(){
    System.out.println("comming soon");
  }

  public  void DeleteAtEnd(){
    System.out.println("comming soon");
  }

  public  void DeleteAtGivenPosition(){
    System.out.println("comming soon");
  }

  public  void Search(){
    System.out.println("comming soon");
  }

  public  void Size(){
    System.out.println("comming soon");
  }
}
