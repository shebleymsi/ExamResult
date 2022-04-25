package resultgrade;

import java.util.Scanner;

public class GpaResult {

    public static double score;

    public static void main(String[] args) {
        GpaResult obj = new GpaResult();
        obj.getGrade();
    }

    public void getGrade() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your score to get the result : ");
        double score = input.nextDouble();
         if( score >100){
             System.out.println("Please input  the number below 101 ");
        }else if (score >= 90) {
            System.out.println("Excellent");
       } else if (score >= 80) {
            System.out.println("Very Good");
        } else if (score >= 70) {
            System.out.println("Good");
        } else if (score >= 60) {
            System.out.println("Average");
        } else if (score >= 50) {
            System.out.println("Pass");
        } else if (score >= 40) {
            System.out.println("Poor");
        } else if (score >= 33) {
            System.out.println("Very poor");
        } else{
            System.out.println("Need to repeat this course");
        }
    }

}