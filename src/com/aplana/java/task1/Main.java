package com.aplana.java.task1;

import java.util.Scanner;

/**
 * Created by 1 on 20.02.2018.
 */
public class Main {
    public static void main(String[] args) {
            // write your code here
            TestStaticMethod [] arr=new TestStaticMethod[7];
            for (int i = 0; i <= 3; i++) {
                arr[i]=new TestStaticMethod(i+"_fname",i+"_sName");
            }
            arr[4]=new TestStaticMethod(4,"-End-","-End-");
            arr[5]=new TestStaticMethod(5+"_fname",5+"_sName");
            SalaryPerson sp =new SalaryPerson("manager1","manager1");
            sp.setSalary(5000.30f);
            arr[6]=sp;
            printTop();
            for (TestStaticMethod as:arr ) {
                if(as instanceof SalaryPerson)
                    System.out.printf("!%1$8d!%2$17s!%3$16s!%4$110.2f!%n",as.getId(),as.getfName(),as.getsName(),((SalaryPerson) as).getSalary());
                else
                    System.out.printf("!%1$8d!%2$17s!%3$16s!           !%n",as.getId(),as.getfName(),as.getsName());

            }
            printEnd();
            int menu=10;
            do {
                menu=printMenu();
                switch (menu){
                    case 0:
                    {break;}
                    case 1:
                    {break;}
                    default:
                    {
                        System.out.println("Error!");
                        break;}

                }
            } while (menu!=0);
            System.out.println("Good Bay!!");

            //     System.out.println("+-----------------------------------------------------+);
            //    System.out.printf("!%1$7d!%2$18s!%3$16s!%4$11.2f!%n",sp.getId(),sp.getfName(),sp.getsName(),sp.getSalary());
        }

        private static int printMenu() {
            System.out.println("1-New; 2-NewManager; 3-Edit; 4-Delete; 5-Refresh; 0-Exit");
            Scanner in= new Scanner(System.in);
            System.out.println("? ");
            return in.nextInt();
        }

        private static void printTop(){
            System.out.println("+--------+-----------------+----------------+-----------+");
            System.out.println("!   ID   !    Firstname    !   Secondname   !  Salary   !");
            System.out.println("+--------+-----------------+----------------+-----------+");
        }
        private static void printEnd(){
            System.out.println("+--------+-----------------+----------------+-----------+");

        }
}
