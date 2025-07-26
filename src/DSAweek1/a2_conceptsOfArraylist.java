//package DSAweek1;
//
//import java.util.ArrayList;
//
//public class a2_conceptsOfArraylist {
//    public static void main(String[] args){
//
//        ArrayList<Integer>  list1 = new ArrayList<>();
//        //this creates a new object of Arraylist of type Integer. and gives it a reference variableName list1
//
//        list1.add(10);
//        list1.add(20);
//
//        ArrayList<Integer> list2 = new ArrayList<>(list1);
//        // this creates a new object of ArrayList type Integer, gives it a reference name list2
//        // is list_one and list_two same? NO they are different lists with 2 different objects. they both are just having similar values stored.
//        // when we give 'new ArrayList<>(list1)' --> this tells JAVA that we are asking to build new Arraylist object, But this time Not-empty. But copy all elements of list1 in this new ArrayList object
//        // Now list1 and list2 both contain [10, 20]
//        // any update in list1 or list2 will be independent of each other
//        // once the copy (list2) is created using 'new arrayList<>(list1)' they both are now different arraylists
//        list2.add(30);
//
//        // list1 → [10, 20]
//        // list2 → [10, 20, 30]
//
//        // but what if created copy of a arrayList with same name?
//
//        ArrayList<Integer> list3 = new ArrayList<>(); // this creates a new empty ArrayList obj. and with reference as 'list3'
//
//        ArrayList<Integer> list3 = new ArrayList<>(list3);
//
//    }
//}
