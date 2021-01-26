/*import java.awt.*;
import java.awt.event.*;
import java.time.Year;

import javax.swing.*;*/

import java.util.*;
public class BroCodeMain {
    private static String name;
    private static int experience;
    private static int age;
    private static double height;
    public static String animal;
    
	public static void main(String[] args) throws InterruptedException {
            
        Scanner scan = new Scanner(System.in);
        int[] ages = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        

        Constructors Kevin = new Constructors("Kevin", 16, 5.10);

        System.out.println("What is your first name?");
        name = (String) scan.next();
        System.out.print("How many times would you like your name to be printed out?");
        int counter = 0;
        for (int i = 0; i <= Integer.parseInt(scan.next()); i++) {
            System.out.println(name);
            Thread.sleep(500);
            counter++;
        }
        System.out.println("Random fact time! The average age of homosapians below 18 is " + averageAge(ages) + ".");
        Thread.sleep(3000);
        System.out.println("The loop was run " + counter + " times and printed your name that many times as well."); //Uses statement execution counts
        if(name.length()%2 == 0) { //If evenly divisible
            System.out.println("What a beautiful name! Your first name has an even amount of letters!");
        } else {
            System.out.println("What a beautiful name! Your first name has an odd amount of letters!");
        }
        Thread.sleep(3000);
        double[] fav = new double[3];
        System.out.println("Random fact time! Is there a even number in the ages below 18? " + checkOneEven(ages) + ". Are all ages below 18 even? " + checkAllEven(ages) + ".");
        System.out.println("What are your 3 favourite numbers?");
        fav[0] = Double.parseDouble(scan.next());
        fav[1] = Double.parseDouble(scan.next());
        fav[2] = Double.parseDouble(scan.next());
        System.out.println("The average of your 3 numbers is" + ((fav[0] + fav[1] + fav[2])/3)); //average
        System.out.println("Random fact time! The sum of all ages below 18 is " + sumi(ages) + ".");
        Thread.sleep(3000);
        System.out.println("The sum of your 3 numbers is " + ((fav[0] + fav[1] + fav[2]))); //sum
        Thread.sleep(3000);
        System.out.println("Random fact time! The minimum age below 18 is " + mini(ages) + " and the maximum age below 18 is " + maxi(ages) + ".");
        Thread.sleep(3000);
        System.out.println("How tall are you? (Enter 5.4 for 5 foot 4");
        height = Double.parseDouble(scan.next());
        System.out.println("Random cool event time! Here are some consecutive pair of ages below 18 ");
        prinTwoAtATime(ages);
        Thread.sleep(3000);
        System.out.println("How old are you?"); 
        age = Integer.parseInt(scan.next());

        Constructors Player = new Constructors(name, age, height);
        Constructors[] obj = {Kevin,Player};
        System.out.println(crazyName(Kevin, Player));

        System.out.println("Random fact time! Did you know that the creator of this messy program is " + (obj[1]).getname() + ".");
        System.out.println(older(age)); 
        Thread.sleep((3000));
        System.out.println("Random quiz time! What do you think the age 1 would be if 2 became 1 and 17 became 16 if it were all ages below 18? The answer is " + (shiftRight(ages))[1] + ".");
        Thread.sleep(3000);
        System.out.println("Together, we would be " + (age + 16) + " years old!");
        Thread.sleep(2000);
        System.out.println("Random fact time! Did you know that there were " + numberOfEvens(ages) + " even ages below the age of 18?");
        int y = 10 - age%10; //finds the one place digit
        int x = age - age%10; //finds the tens digit 
        int z = age + y; //rounds tens digit up
        System.out.println("You have " + y + " more years until you become " + z + " years old");
        Thread.sleep(2000);
        System.out.println("Based on that information, I think but im not sure, you will live until you are " + Integer.MAX_VALUE + " years old!"); //MAX_VALUE
        Thread.sleep(3000);
        System.out.println("By the way, the sum of our age is " + (sumAge(Kevin, Player)).getAge());
        System.out.println("So how many years have you been playing FPS games?");
        experience = Integer.parseInt(scan.next());
        String[] games = new String[experience]; 
        for (int i = 1; i <= experience ; i++) {
            System.out.println("On year " + i + ", what FPS game were you playing?");
            games[i-1] = scan.next();
            Thread.sleep(1000);
            System.out.println();
        }
        if (mode(games) == "") { //mode
            System.out.print("You have plaed some cool games!");
        }   else {
            System.out.println("Seems like you play " + mode(games) + " the most.");
        }

        System.out.println("Interesing, well lets test your skills!");
        System.out.println("But before that, did you know that there were " + dupl(ages) + " duplicate ages below 18?");
        Thread.sleep(500);
        System.out.println("Sorry, I need to give you a hard test before you enter. What would be the 4th age if the ages below 18 were reversed?");
        int play = Integer.parseInt(scan.next());
        if (play == (reverse(ages))[4]) {
            new MyFrame();
        }   else {
            System.out.println("Please restart the program as your punishment for getting it wrong. LMAO");
        }

    }
    /*public void paint(Graphics g) {

		g.setColor(Color.yellow);
        g.fillOval(MyFrame.getX(), MyFrame.getY, 50, 50);
    }*/
    private static String older(int a) { //private method
        if (a > 16) {
            return "Wow, you are older than me by " + (a - 16) + " years old!"; //return statment
        } else {
            return "Wow, you are younger than me by " + (16 - a) + " years old!";
        }
    }
    /** @param Precondition = a String array is given that must have more than one element otherwise no there is no mode possible
     * 
       @return PostCondtion = it will return the elemnent of the array that appears the most in the array. If there is no mode then it will print the first element that it checks. 
       **/
    public static String mode(String[] a) { //loops within loops or nested iteration         public method      
         String m = "";
        int max = 0;
        for(int i = 0; i < a.length; i++) {
            int current = 0;
            for(int j = i+1; j < a.length; j++) {
                if (a[j].equals(a[i]))
                current++;
                if (current > max) {
                    max = current;
                    m = a[i];
                } 
            }
        }
        return m;
     }
    public static Constructors sumAge(Constructors a, Constructors b) { //Object other than a String
        Constructors sum = new Constructors((a.getAge() + b.getAge()));
        return sum;
    }
    public static Constructors toString(int a) {
        Constructors string = new Constructors("" + a);
        return string;
    }
    public static int averageAge(int[] a) { //enhanced for loop 
        int result = 0;
        for (int x : a) {   //iteration that traverses the array
            result += x;
        }
        return result;
    }
    public static String crazyName(Constructors a, Constructors b) {
        return a.getname() + b.getname();
    }
    public static int mini(int[] a) { //minimum of int
        int min = a[0];
        for (int i=0; i <= a.length-1; i++) {
            if (a[i] < min)
            min = a[i];
        }
        return min;
    }
    public static int maxi(int[] a) { //maximum of int
        int max = a[0];
        for (int i=0; i <= a.length-1; i++) {
            if (a[i] > max)
            max = a[i];
        }
        return max;
    }
    public static int sumi(int[] a) {  //sum of int
        int total = 0;
        for(int x: a) {
            total += x;
        }
        return total;
    }
    public static boolean checkOneEven(int[] a) {
        boolean even = false;
        for (int x: a) {
            if (x%2 == 0) {
                even = true;
            }
        }
        return even;
    }
    public static boolean checkAllEven(int[] a) {
        boolean even = true;
        for (int x: a) {
            if (x%2 != 0) {
                even = false;
            }
        }
        return even;
    }
    public static void prinTwoAtATime(int[] a) {
        if (a.length%2 == 0) {
            for (int i = 0; i < a.length-1; i+=2) {
                System.out.println(""+a[i] + " " + a[i+1]);
            }
        } else {
            for (int i = 0; i < a.length-1; i+=2) {
                if (i == a.length-1) {
                    System.out.println(""+a[i]);
                } else {
                    System.out.println(""+a[i] + " " + a[i+1]);
                }
            }
        }
    }
    public static int numberOfEvens(int[] a) {
        int counter=0;
        for (int x: a) {
            if (x%2 == 0) {
                counter++;
            }
        }
        return counter;
    }
    public static boolean dupl(int[] a) { //Checks if array a has duplicate values
        boolean dup = false;
        for (int i=0; i<= a.length-2; i++) {
            for (int e=1; e <= a.length-2; e++) {
            if (a[i] == a[e+1])
            dup = true;
            }
        }
        return dup;
    }
    public static int[] shiftRight(int[] a) { // Shifts each element to the right
        int b[] = new int[a.length];
        int ind = 0;
        b[0] = a[a.length-1];
        for (int i=1; i <=a.length-2; i++) {
            b[i] = a[ind];
            ind++;
        }
        return b;
    }
    public static int[] reverse(int[] a) { //Reverses the int array a and returns the new array
        int b[] = new int[a.length];
        int c = 0;
        for (int i = a.length-1 ; i >= 0; i--) {
            b[c] = a[i];
            c++;
        }
        return b;
    }
}