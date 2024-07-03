import java.util.*;
class Arraylist {
    public static void main(String[] args) {
        // Create arraylist in java 
        ArrayList<Integer> list =new ArrayList<Integer>();// in place of interger we can create an array of String , bool,float,double also
        list.add(0);// this is how we append the element in the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        
        System.out.println(list);
        int ele=list.get(1);//get used to get an element of that index
        System.out.println(ele);
        // add btw
        list.add(1,1);// add also used 2 parameter to add in b/w but it shift the other element in right side
        System.out.println(list);
        //set ele
        list.set(0,1); // set used to set element in particular index it set so no shifting is happening
        System.out.println(list);
        // del ele
        list.remove(1); // reomve or delete an element from the given index
        System.out.println(list);
        int n=list.size(); // used to get the size 
        System.out.println(n);
        for(int i=0;i<n;i++){
            System.out.print(list.get(i));
            System.out.print(" ");


        }
        Collections.sort(list);
        System.out.println(list);





        
        


        
        // ArrayList<String> list =new ArrayList<int>();
        
    }
