package ru.AndJava2020.Ex1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(task3_1());
        System.out.println(task3_2());
        System.out.println(task3_3());
        System.out.println(task4(args));
        task5();
        task6_1();
        task6_2();
        System.out.println(task7(5));
    }
    public static int task3_1() {
        System.out.println("Ans3_1");
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int n = in.nextInt();
        int arr[] = new int[n];
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
        }

        for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i]);
            s += arr[i];
        }
        return s;
    }
    public static int task3_2() {
        System.out.println("Ans3_2");
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int n = in.nextInt();
        int arr[] = new int[n];
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
        }

        int i=0;
        while (i< arr.length){
            //System.out.println(arr[i]);
            s+=arr[i];
            i++;
        }
        return s;
    }
    public static int task3_3() {
        System.out.println("Ans3_3");
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int n = in.nextInt();
        int arr[] = new int[n];
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
        }

        int i=0;
        do {
            System.out.println(arr[i]);
            s+=arr[i];
            i++;
        } while(i<arr.length);
        return s;
    }
    public static String task4(String []args){
        System.out.println("Ans4");
        String s="";
        for (int i = 0; i < args.length; i++) {
            s+=args[i]+" ";
        }
        return s;
    }
    public static void task5(){
        System.out.println("Ans5");
        double S=0;
        for (int i = 1; i <= 10; i++) {
            String L = String.format("%f", 1.0 / i);
            System.out.println(L);
        }
    }
    public static void task6_1(){
        System.out.println("Ans6_1");
        Random rand = new Random();
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i]=(int)(Math.random()*100);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void task6_2(){
        System.out.println("Ans6_2");
        Random rand = new Random();
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i]= rand.nextInt(100);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static int task7(int n){
        System.out.println("Ans7");
        int s=1;
        for (int i = n; i >1 ; i--) {
            s*=i;
        }
        String L = String.format("%d", s);
        return s;
    }
}
