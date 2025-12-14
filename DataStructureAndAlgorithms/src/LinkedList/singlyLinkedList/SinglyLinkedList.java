package src.LinkedList.singlyLinkedList;

public class SinglyLinkedList
{
  TemplateOfCreateNode head;

  public SinglyLinkedList()
  {
    this.head = null;
  }
  public  void InsertAtBegining(int data)
  {
    TemplateOfCreateNode newNode = new TemplateOfCreateNode(data);
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

    TemplateOfCreateNode tempVar = this.head;
    while (tempVar != null)
    {
      System.out.print("  " + tempVar + "--->");
      tempVar = tempVar.next;
    }
  }

  public  void test()
  {
    int data=1;
    int data1=2;
    int data2=3;
    int data3=4;
    int data4=5;

    this.InsertAtBegining(data);
    this.InsertAtBegining(data1);
    this.InsertAtBegining(data2);
    this.InsertAtBegining(data3);
    this.InsertAtBegining(data4);

    DisplayNodes();
  }

}
