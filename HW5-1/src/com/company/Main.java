package com.company;

import javafx.scene.transform.Scale;

import java.util.*;
import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Employee e1=new Employee();
        Buy e2=new Buy();
        Sale e3=new Sale();
        Scanner input = new Scanner(System.in);
        System.out.println("برای استخدام عدد < 1 >\nخرید محصول < 2 >      \nفروش محضول < 3 >      ");
        String x=input.nextLine();
        switch (x){
            case "1":
                System.out.println("لطفا نام کارمند را وارد کنید");
                try {
                    e1.setName(input.nextLine());
                }catch (EmployeeExeption ex1){
                    ex1.printStackTrace();
                }
                System.out.println("لطفا نام خانوادگی کارمند را وارد کنید");
                try {
                    e1.setFamly(input.nextLine());
                }catch (EmployeeExeption ex1){
                    ex1.printStackTrace();
                }
                System.out.println("لطفا نام پدر کارمند را وارد کنید");
                try {
                    e1.setFatherName(input.nextLine());
                }catch (EmployeeExeption ex1){
                    ex1.printStackTrace();
                }
                System.out.println("لطفا رشته تحصیلی کارمند را وارد کنید");
                try {
                    e1.setMajor(input.nextLine());
                }catch (EmployeeExeption ex1){
                    ex1.printStackTrace();
                }
                System.out.println("لطفا مدرک تحصیلی کارمند را وارد کنید");
                try {
                    e1.setDiploma(input.nextLine());
                }catch (EmployeeExeption ex1){
                    ex1.printStackTrace();
                }
                System.out.println("لطفا حقوق پیشنهادی کارمند را وارد کنید");
                try {
                    e1.setSalary(input.nextLine());
                }catch (EmployeeExeption ex1){
                    ex1.printStackTrace();
                }
                e1.Saveinformation();

                break;
                
            case "2":
                System.out.println("Please enter your productName");
                try {
                    e2.setProductName(input.next());
                }
                catch (BuyExeption e){
                    e.PrintstackRace();
                }
                System.out.println("Please enter your productInformation");
                try {
                    e2.setProductInformation(input.next());
                }
                catch (BuyExeption e){
                    e.PrintStackRace();
                }
                System.out.println("Please enter your productPrice");
                try {
                    e2.setProductPrice(input.next());
                }
                catch (BuyExeption e){
                    e.PrintStackRace();
                }
                System.out.println("Please enter your productWeight");
                try {
                    e2.setProductWeight(input.next());
                }
                catch (BuyExeption e){
                    e.PrintSTackRace();
                }
                e2.Accepting();
                
                break;

            case "3":
                
                System.out.println("Please enter your productName");
                try {
                    e3.setProductName(input.next());
                }
                catch (BuyExeption e){
                    e.PrintstackRace();
                }
                System.out.println("Please enter your productPrice");
                try {
                    e3.setProductPrice(input.next());
                }
                catch (BuyExeption e){
                    e.PrintStackRace();
                }
                System.out.println("Please enter your productWeight");
                try {
                    e3.setProductWeight(input.next());
                }
                catch (BuyExeption e){
                    e.PrintSTackRace();
                }
                e3.Accepting();

                break;

        }
    }
}
