package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayManage {
    static int[] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        setArray();
        int choice = 0;

        while (choice < 6) {
            System.out.println("===== Menu ======");
            System.out.println("| 1. Add element");
            System.out.println("| 2. Show array");
            System.out.println("| 3. Edit element in array by index");
            System.out.println("| 4. Delete Element");


            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter element");
                    int element = scanner.nextInt();
                    array = addElement(element);
                    showArray();
                    break;
                case 2:
                    showArray();
                    break;
                case 3:

                    System.out.println("enter index of element: ");
                    int index = scanner.nextInt();

                    System.out.println("Enter new element: ");
                    int newElement = scanner.nextInt();
                    editElement(index, newElement);
                    break;
                case 4:
                    System.out.println("enter index: ");
                    index = scanner.nextInt();
                    array = deleteElementByIndex(index);
                    break;
                case 5:
                    System.out.println("enter new element: ");
                    newElement = scanner.nextInt();
                    System.out.println("enter number: ");
                    int number = scanner.nextInt();
                    editElementByNumber(number, newElement);
            }
        }
    }
    static void setArray() {
        array = new int[]{1, 2, 3, 5, 2 , 8};
    }


    static int [] deleteElementByIndex(int index){
        int [] newArr = new int[array.length-1];

        for (int i =0; i< index; i++){
            newArr[i] = array[i];
        }

        for (int i = array.length-1; i > index; i--){
            newArr[i-1] = array[i];
        }
        return newArr;
    }
    static void editElementByNumber(int number, int newElement){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number){
                array[i] = newElement;
            }
        }
    }
    static void editElement(int index, int element){
        array[index] = element;
    }

    static int[] addElement(int element) {
        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        newArray[array.length] = element;
        return newArray;
    }

    static void showArray() {
        for (int ele : array) {
            System.out.print(ele + ", ");
        }
        System.out.println();
    }



}
