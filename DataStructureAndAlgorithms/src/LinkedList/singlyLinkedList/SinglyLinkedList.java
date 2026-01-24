package src.LinkedList.singlyLinkedList;

public class SinglyLinkedList
{
  NodeStructure head;

  public SinglyLinkedList()
  {
    this.head = null;
  }
  public  void InsertAtBegining(int data)
  {
    NodeStructure newNode = new NodeStructure(data);
    newNode.next = this.head;
    this.head = newNode;
  }

  public  void DisplayNodes()
  {
    if (this.head == null)
    {
      System.out.println("Not Yet Insert Any Node");
      return;
    }

    NodeStructure tempVar = this.head;
    while (tempVar != null)
    {
      System.out.print(" " + tempVar.data + "->");
      tempVar = tempVar.next;
    }
    System.out.println("null");
  }

  public  void test()
  {
    this.InsertAtBegining(1);
    this.InsertAtBegining(2);
    this.InsertAtBegining(3);
    this.InsertAtBegining(4);
    this.InsertAtBegining(5);

    DisplayNodes();
  }

}
