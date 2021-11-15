/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




/**
 *
 * @author Shwartskopff
 */
public class Main {
   public static void main(String[] args) {
       
        DobleLinkedList l = new DobleLinkedList();

        int [] file1 = {1, 2, 3, 4, 5, 10, 15};
        int [] file2 = {20, 30, 40, 50};
        
        System.out.println("Двухсвязный список ");
          
        l.addArrayFirst(file1);
        l.addArrayFirst(file2);
       

        System.out.println(l.printFromStart());
        System.out.println("____________________________________________");

        
        System.out.println(l.printFromEnd());
        System.out.println("____________________________________________");

        int [] file3 = {1, 1, 2, 3, 5, 8, 13, 21};
           
        l.addArrayLast(file3);
        
        System.out.println(l.printFromStart());
        System.out.println(l.printFromEnd());

   }
}