package OOP;
import java.util.*;
public class collec{
    public static void main(String args[]){
    int a[]= new int[5];
    ArrayList<Integer> alist=new ArrayList<Integer>(); //flexible
    for(int i=1;i<=10;i++)
    alist.add(i);
    System.out.println(alist);
    ArrayList<String> slist=new ArrayList<String>();
    slist.add("Atlas");

    LinkedList<String> li=new LinkedList<String>();

}
}



public class que{
    public static void main(String args[])
    {
        Queue<Integer> q= new LinkedList(); //Priorityqueue
        q.add(4);
        q.add(8);
        q.add(6);
        q.add(2);
        System.out.println("Head is "+ q.peak());
        System.out.println("Head is "+ q.remove()); // q.poll()-null
        System.out.println("Head is "+ q.peak());
        System.out.println("Head is "+ q.size());
    }
}

//set-unique elements
public class setdemo{
    public static void main(String args[]){  //0 1 2 3 4 
        //key%n->n=5 //7%5=2
HashSet<String> b=new HashSet<String>(); //LinkedHashSet-maintain order TreeSet-Sorted
b.add("Avinash");
b.add("Avinash");
b.add("Druvan");
b.
    }
}