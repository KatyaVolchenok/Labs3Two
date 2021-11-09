/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Shwartskopff
 */
public class DobleLinkedList {
    private Element head;
    private Element tail;
     
 private class Element {
        private int data;
        private Element priv;
        private Element next;
    }
     
     public void addListLast(DobleLinkedList line) {
        if (line != null && line.tail !=null) {
            if (tail != null) {
                tail.next=line.head;
                line.head.priv = tail;
                tail= line.tail;
            } else {
                head =line.head;
                head =line.tail;
            }
        }
    }

    public void addListFirst(DobleLinkedList line) {
        if (line != null && line.head !=null) {
            if (head != null) {
                line.head.priv = head;
                head.priv = line.tail;
                head =line.head;
            } else {
                head =line.head;
                tail =line.tail;
            }
        }
    }

    public void addArrayLast(int [] array) {
        if (array != null && array.length != 0) {
            if (tail != null) {
                for (int i = 0; i < array.length; i++) {
                    Element newElement = new Element();
                    newElement.data = array[i];
                    newElement.priv = tail;
                    tail.next = newElement;
                    tail = newElement;
                }
            } else {
                for (int i = 0; i < array.length; i++) {
                    if (i == 0) {
                        tail = new Element();
                        head = tail;
                        tail.data = array[i];
                    } else {
                        Element newElement = new Element();
                        newElement.data = array[i];
                        newElement.priv = tail;
                        tail.next = newElement;
                        tail = newElement;
                    }
                }
            }
        }
    }

    public void addArrayFirst(int [] array) {
        if (array != null && array.length != 0) {
            if (head != null) {
                for (int i = 0; i < array.length; i++) {
                    Element newElement = new Element();
                    newElement.data = array[i];
                    newElement.next = head;
                    head.priv = newElement;
                    head = newElement;
                }
            } else {
                for (int i = 0; i < array.length; i++) {
                    if (i == 0) {
                        head = new Element();
                        tail = head;
                        head.data = array[i];
                    } else {
                        Element newElement = new Element();
                        newElement.data = array[i];
                        newElement.next = head;
                        head.priv = newElement;
                        head = newElement;
                    }
                }
            }
        }
    }


    public String printFromStart() {
        if (head != null) {
            String line = "";
            Element l = head;
            while (l != null) {
                line = line + " " + l.data;
                l = l.next;
            }
            return line;
        } else return "список пуст";
    }

    public String printFromEnd() {
        if (tail != null) {
            String line = "";
            Element l = tail;
            while (l != null) {
                line = line + " " + l.data;
                l = l.priv;
            }
            return line;
        } else return "список пуст";
    }
    
}
