package Incapsulation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        User[] users = new User[100];
        Scanner scanner = new Scanner(System.in);
        int count=0;
        while (true){
            System.out.println("1-> Ro'yxatdan o'tish;  2-> Tizimga kirish ");
            int n= scanner.nextInt();
            switch (n){
                case 1: {

                    System.out.print("First name: ");
                    String firtName = scanner.nextLine();
                    System.out.print("Last name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Password:");
                    String password = scanner.nextLine();
                    User u1 = new User(firtName, lastName, email, phoneNumber, password);
                    users[count] = u1;
                    count++;
                    System.out.println("Successfully registered !!!");

                }
                case 2: {

                    System.out.print("Phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Password:");
                    String password = scanner.nextLine();
                    int index = 0;
                    for (int i=0; i<count; i++){
                        if (users[i].phoneNumber.equals(phoneNumber)
                                && users[i].password.equals(password)){
                            index = i;
                            break;
                        }
                    }
                    if (index == 0 ){
                        System.out.println("Phone number or Passwor inncorrect");
                    }else {
                        System.out.println(users[index].firtName + users[index].lastName + "Welcome to our Calculator");
                    }

                }
            }
        }
    }
}
