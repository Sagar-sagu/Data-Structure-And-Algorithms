package src.LinkedList.singlyLinkedList;

public class SinglyLinkedList
{
  static class NodeStructure
  {
    int IntData;
    NodeStructure nextInt;
    String  StringData;
    NodeStructure nextString;

    public NodeStructure(int IntData)
    {
      this.IntData = IntData;
      nextInt = null;
    }

    public NodeStructure(String StringData)
    {
      this.StringData = StringData;
      nextString = null;
    }
  }

  NodeStructure IntHead;
  NodeStructure StringHead;

  public SinglyLinkedList()
  {
    IntHead = null;
    StringHead = null;
  }
  public  void InsertAtBegining(int data)
  {
    NodeStructure newNode = new NodeStructure(data);
    newNode.next = head;
    head = newNode;
  }

  public  void DisplayNodes()
  {
    if (head == null)
    {
      System.out.println("Not Yet Insert Any Node");
      return;
    }

    NodeStructure tempVar = head;
    while (tempVar != null)
    {
      System.out.print("|" + tempVar.data + "|" + "->");
      tempVar = tempVar.next;
    }
    System.out.println("null");
  }

  public  void test()
  {
    InsertAtBegining(1);
    InsertAtBegining(2);
    InsertAtBegining(3);
    InsertAtBegining(4);
    InsertAtBegining(5);

    DisplayNodes();
  }

}
