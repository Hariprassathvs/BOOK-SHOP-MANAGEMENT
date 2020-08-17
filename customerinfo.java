import java.util.Scanner;
import java.io.*;

class Customer {
  String name;
  int age;
  String addr;
  Long mobile;
  int noofbook;

  public Customer getData() {
    Scanner sc = new Scanner(System.in);
    System.out.println("------WELCOME TO ROYAL BOOK STORE----");
    System.out.print("Enter Your Name: ");
    String name = sc.nextLine();

    System.out.print("Enter Your Age: ");
    int age = sc.nextInt();

    System.out.print("Enter Your Address: ");
    String addr = sc.next();

    System.out.print("Enter Your contact number: ");
    Long mobile = sc.nextLong();
    if (String.valueOf(mobile).length() < 10) {
      System.out.println("Invalid contact number");
      System.exit(0);
    }

    System.out.print("Enter No. of books: ");
    int noofbook = sc.nextInt();

    System.out.println("\n");
    this.name = name;
    this.addr = addr;
    this.mobile = mobile;
    this.age = age;
    this.noofbook = noofbook;
    return this;
  }

  public void display() {

    System.out.println("Name - " + name);
    System.out.println("Address - " + addr);
    System.out.println("Age -" + age);
    System.out.println("Contact number - " + mobile);
    System.out.println("no of books -" + noofbook);
  }
}

public class customerinfo {
  public static void main(String args[]) {
    Customer[] c1;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number of customer: ");
    int num = sc.nextInt();
    c1 = new Customer[num];
    for (int i = 0; i < num; i++) {
      Customer c = new Customer();
      c1[i] = c.getData();
    }
    for (int i = 0; i < c1.length; i++) {
      c1[i].display();
    }
  }
}
