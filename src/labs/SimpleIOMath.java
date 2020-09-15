package labs; /**
 *
 * @author tylerpowers
 */

import java.util.Scanner;

public class SimpleIOMath {
    private String name;
    private int age;
    private int favNumber;

    private static int prime(int num) {
        // finds the first prime factor of user's age //
        if(num % 2 == 0){
            return 2;
        }
        else {
            for(int i = 3; i <= num; i++) {
                if(num % i == 0) {
                    return i;
                }
            }
        }
        return num;
    }

    public void promptUser() {
        // user data collection //
        Scanner sc = new Scanner(System.in);
        System.out.print("Question 1: What is your name? ");
        name = sc.nextLine();
        System.out.print("Question 2: How old are you? ");
        age = sc.nextInt();
        System.out.print("Question 3: What is your favorite number? ");
        favNumber = sc.nextInt();
    }
    public void printInfo() {
        // user data regurgitation //
        System.out.printf("Your name is: %s\nYour age is: %s\n" +
                "At your next birthday, you will turn %s.\n" +
                "The first prime factor of %s is: %s\n" +
                "Your favorite number is: %s\n" +
                "Your favorite number squared is: %s\n", name, age, age + 1, age, prime(age), favNumber, favNumber * favNumber);
    }

    public static void main(String[] args) {
        // main method that drives the program //
        System.out.println("* Sit yourself down, take a seat *\n* All you gotta do is repeat after me *");
        new SimpleIOMath().promptUser();
        System.out.println("I'm gonna teach you how to sing it out\nCome on, come on, come on\n" +
                "Let me tell you what it's all about\nReading, writing, arithmetic\n" +
                "Are the branches of the learning tree");
        new SimpleIOMath().printInfo();
        System.out.println("* end of program *");
    }
}
