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

        int [] file1 = {1, 2, 3, 4};
        int [] file2 = {5, 6, 7, 8};
        
        System.out.println("Двухсвязный список: ");
          
        l.addArrayFirst(file1);
        l.addArrayFirst(file2);
       

        System.out.println(l.printFromStart());
        System.out.println("__________________");

        
        System.out.println(l.printFromEnd());
        System.out.println("__________________");

        int [] file3 = {1, 2, 4, 8};
           
        l.addArrayLast(file3);
        
        System.out.println(l.printFromStart());
        System.out.println(l.printFromEnd());

   }
}