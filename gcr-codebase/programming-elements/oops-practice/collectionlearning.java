

import java.util.ArrayList;

public class collectionlearning {
    int id;
    String name;
    collectionlearning(int id,String name){
        this.id=id;
        this.name=name;
    }
   public static void main(String[] args) {
     ArrayList<Integer> list = new ArrayList<>();
       collectionlearning s1 = new collectionlearning(1, "Pragati");
        collectionlearning s2 = new collectionlearning(2, "Rahul");
        collectionlearning s3 = new collectionlearning(3, "Aman");

        // Adding objects
        // list.add(s1);
        // list.add(s2);
        // list.add(s3);

        // Printing objects
       

   }
    // The Java Collection Framework (JCF) is a set of interfaces and classes used
    // to store,manage, and manipulate groups of objects efficiently.
    // object store delete possible with collection

    // wrapper class->collection deals with object not with primitive.. to dealt with
    // use wrapper

    // wrapper convert primitive to object
    // valueof - > convert into wrapper object
    // intval- > wrapper object to primitive

    // autoboxing-> Autoboxing is the automatic conversion of a primitive data type
    // into its corresponding Wrapper class object by the Java compile
    // syntax-> Integer num=2

    // and autounboxing-> Auto-unboxing is the automatic conversion of a Wrapper
    // class object into its corresponding primitive data type.
    // syntax =Integer num = 50;
    // int x = num; // Auto-unboxing


    // utility method-> dont need to write core logic these are just static() method
    // Collections.sort()->utility
    // diffrence
    // Collections(utility class that contain utility method such as static method , static method depend upon class)
    // kyu class k name se call krte hae?-> static kyu? static block kya kaam krta h
    // 
    //  and Collection-> its an interface,used to store and manage group of objects->list,set, queue

    // interface to interface-extend
    // class to interface->implement
    // iterable collection use extend because both are interface
    // collection mae koi bhi data add krskte hae lekin array mae same data type rkhe jate hae


    // sbme extend hoga
// list(Interface)((Ordered,dynamic size,duplicates allow,null allow)-> ArrayList(Class)(indexes)
// ),LinkedList(Class)(not indexes)(prefer for insertion and deletion),Vector(Class),Stack(Class)(last two are legacy classes we dont use it)
// ->idhr hoga implementation

    // queue(Interface)->


    // set(Interface)(unique element,dont allow duplicate,order doesnt matter) - > NavigableSet(Interface),
    // SortedSet(Interface),HashSet(class),LinkHashSet(class)(unique data store krta hae order kae according)(order f insertion)
    // ,TreeSet(class)(sorted with unique)
    // HW -> READ ARRAYLIST,LINEKD LIST AND THEIR DIFFERENCE 
    //during classloaded object creation se pehle hi memory locate ho jati h isilye static -class pr depend hoti h ,object pr nhi
    
//--------------------------------------------------------------------------------
    //Iterable(interface)->collection(interface)->1) list(interface)[Arraylist(class),linkedlist(class),vector,Stack(legacy classes)],2)Queue(interface),3)Set(interface)[Hashset(class),linkedlist(c),treeset(c)]
    //
    // legacy classes -> array k limitation ko overcome krne k liye use kiya tha
   //null value tree set m accept nhi hoti h or or hashset m hoti  
   //interface class m impliment hogs
   
   
   
   
   /* QUEUE(FIFO)
   priority queue is an implement class , dequeue is ann interface in collection which support double ended queue
   dequeue-> double ended(kahi se bhi enter kr sakte h)

   Collection m object store hote h 
   Enumerator(I) -> legacy class k liye hi use hota h (vector , stack)
   iterator(I) is used for iterate the collection -> yhi cursor hota h collection ka (universal iterator  ye sb pr kaam krega )
   // Iterator itr = new Iterator();
   ListIterator(I) is introduce to overcome the disadv of iterator => only applicable on list classes 
   ListIterator k method
 class m methods or attribute hote h
 methods class ko call krte h 
 attributes se tum class ki define krte ho 








    */

}