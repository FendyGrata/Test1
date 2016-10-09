package myooptry;

import java.util.Scanner;

class Person {

    Scanner input = new Scanner(System.in);
    private String name;
    private int age;
    private int balance;

    public Person(int balance) {
        this.balance = balance;
    }

    public void introduce() {
        System.out.println("hi, your name is " + name + " and you're " + age + " years old now");
        if (age > 25 && age < 46) {
            System.out.println(" lol getting old now huh....");
        } else if (age > 45) {
            System.out.println("Be careful with your health :( ,gonna die sooner or later....");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void askName() {
        System.out.print("Please iput your name:");
        String personName = input.nextLine();
        setName(personName);
    }

    public void askAge() {
        System.out.print("please input your age:");
        age = input.nextInt();
        setAge(age);
    }

    public void showBalance() {
        System.out.println(name + ",your balance is:" + balance + "$ now");
    }
    public void deposit(int deposit){
        balance=deposit+balance;
    }
    public void withdraw(int withdraw){
        if(withdraw<balance){
        balance=balance-withdraw;
            System.out.println("Withdraw Success");
        }
        else
        {System.out.println(" Not enough money");
            System.out.println("withdraw failed");
        }
        
        
    }
}

public class MyOOPTry {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person person1 = new Person(200);
        person1.askName();
        person1.askAge();
        person1.introduce();
        person1.showBalance();
        int ulang = 1, x;
        do {
        do {
            System.out.print("\n\nMenu:\n1.deposit \n2.withdraw\n3.check balance\n4.exit");
            System.out.print("\ninput:");
            x = input.nextInt();
        } while (x < 0 || x > 5);
        if(x==1){
            System.out.println("Please specify ammount to deposit");
            System.out.print("Deposit:");
            int y=input.nextInt();
            person1.deposit(y);
            System.out.println("Deposit Success");
        }
        else if(x==2){
            System.out.println("Please specify ammount to withdraw");
            System.out.print("Withdraw:");
            int y=input.nextInt();
            person1.withdraw(y);  
        }
        else if(x==3){
            person1.showBalance();
        }
        else if(x==4){
            System.out.println("Bye... ");
            ulang=2;
        }
        
        }while (ulang==1);
    }

}
