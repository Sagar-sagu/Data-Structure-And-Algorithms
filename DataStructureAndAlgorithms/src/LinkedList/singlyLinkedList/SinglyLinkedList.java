// package src.LinkedList.singlyLinkedList;
//
// import java.util.Scanner;
//
// public class SinglyLinkedList
// {
//   //inner class of outer class
//   static class NodeStructure
//   {
//     int IntegerData;
//     NodeStructure nextInteger;
//     String  StringData;
//     NodeStructure nextString;
//
//     //inner class constructor
//     public NodeStructure(int IntegerData)
//     {
//       this.IntegerData = IntegerData;
//       nextInteger = null;
//     }
//
//     public NodeStructure(String StringData)
//     {
//       this.StringData = StringData;
//       nextString = null;
//     }
//   }
//   //var declaration
//   static Scanner scan = new Scanner(System.in);
//   static int usrGaveType;
//   NodeStructure IntegerHead;
//   NodeStructure StringHead;
//
//   //outer class constructor
//   public SinglyLinkedList()
//   {
//     IntegerHead = null;
//     StringHead = null;
//   }
//
//   //Linked List operations Methods
//   public void CreateLinkedList(){
//     try {
//       System.out.println("");
//       System.out.println("1.Integer");
//       System.out.println("2.String");
//       System.out.println("Enter Data Type (1/2) ");
//       usrGaveType = scan.nextInt();
//       if (usrGaveType == 1) {
//         System.out.println("");
//         System.out.println("Succesfully Integer Type Linked List is Created");
//       }
//       else if (usrGaveType == 2) {
//         System.out.println("");
//         System.out.println("Succesfully String Type Linked List is Created");
//       }
//     } catch(Exception e) {
//       System.out.println("");
//       System.out.println("Enter Integer value");
//     }
//   }
//
//   public  void LinkedListIsEmpty(){
//     try {
//       System.out.println("");
//       if ((usrGaveType != 0) || (usrGaveType != 0)) {
//         if (usrGaveType == 1) {
//           if (IntegerHead == null){
//             System.out.println("Linked List is Empty? True");
//             return;
//           }
//           System.out.println("Linked List is  Empty? False");
//         }
//         else if (usrGaveType == 2) {
//           if (StringHead == null){
//             System.out.println("Linked List is Empty? True");
//             return;
//           }
//           System.out.println("Linked List is Empty? False");
//         }
//       }
//       else {
//         System.out.println("First You Create Linked List");
//       }
//     }
//     catch (Exception e) {
//       System.out.println("Exception" + e);
//     }
//   }
//
//   public  void InsertAtBeginning(){
//     try {
//       System.out.println("");
//       if ((usrGaveType != 0) || (usrGaveType != 0)) {
//         if (usrGaveType == 1) {
//           System.out.println("Enter Integer Node Data");
//           int IntegerNodeData = scan.nextInt();
//           NodeStructure newNode = new NodeStructure(IntegerNodeData);
//           newNode.nextInteger = IntegerHead;
//           IntegerHead = newNode;
//         }
//         else if (usrGaveType == 2) {
//           System.out.println("Enter String Node Data");
//           String StringNodeData = scan.nextLine();
//           NodeStructure newNode = new NodeStructure(StringNodeData);
//           newNode.nextString = StringHead;
//           StringHead = newNode;
//         }
//       }
//       else {
//         System.out.println("First You Create Linked List");
//       }
//     }
//     catch (Exception e) {
//       System.out.println("Exception" + e);
//     }
//   }
//
//   public  void InsertAtEnd(){
//     try {
//       System.out.println("");
//       if ((usrGaveType != 0) || (usrGaveType != 0)) {
//         if (usrGaveType == 1) {
//           System.out.println("Enter Integer Node Data");
//           int IntegerNodeData = scan.nextInt();
//           NodeStructure newNode = new NodeStructure(IntegerNodeData);
//           newNode.nextInteger = newNode;
//           //IntegerHead = newNode;
//         }
//         else if (usrGaveType == 2) {
//           System.out.println("Enter String Node Data");
//           String StringNodeData = scan.nextLine();
//           NodeStructure newNode = new NodeStructure(StringNodeData);
//           newNode.nextString = newNode;
//           //StringHead = newNode;
//         }
//       }
//       else {
//         System.out.println("First You Create Linked List");
//       }
//     }
//     catch (Exception e) {
//       System.out.println("Exception" + e);
//     }
//   }
//
//   public  void DeleteAtBeginning(){
//     try {
//       System.out.println("");
//       if ((usrGaveType != 0) || (usrGaveType != 0)) {
//         if (usrGaveType == 1) {
//           if (IntegerHead == null){
//             System.out.println("Linked List is Empty? True");
//             return;
//           }
//           NodeStructure newNode = new NodeStructure(IntegerNodeData);
//           newNode.nextInteger = IntegerHead;
//           IntegerHead = newNode;
//         }
//         else if (usrGaveType == 2) {
//           if (StringHead == null){
//             System.out.println("Linked List is Empty? True");
//             return;
//           }
//           NodeStructure newNode = new NodeStructure(StringNodeData);
//           newNode.nextString = StringHead;
//           StringHead = newNode;
//         }
//       }
//       else {
//         System.out.println("First You Create Linked List");
//       }
//     }
//     catch (Exception e) {
//       System.out.println("Exception" + e);
//     }
//   }
//
//   public  void DisplayNodes()
//   {
//     if (head == null)
//     {
//       System.out.println("Not Yet Insert Any Node");
//       return;
//     }
//
//     NodeStructure tempVar = head;
//     while (tempVar != null)
//     {
//       System.out.print("|" + tempVar.data + "|" + "->");
//       tempVar = tempVar.next;
//     }
//     System.out.println("null");
//   }
//
//   // public  void test()
//   // {
//   //   InsertAtBegining(1);
//   //   InsertAtBegining(2);
//   //   InsertAtBegining(3);
//   //   InsertAtBegining(4);
//   //   InsertAtBegining(5);
//   //
//   //   DisplayNodes();
//   // }
//
// }
