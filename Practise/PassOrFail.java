package Practise;
    import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter marks of math");
        int mathmarks = sc.nextInt();
        double mathPercentage = (mathmarks / 100.0) * 100;
        if (mathPercentage>= 30) {
            System.out.println("pass in mathmatics");
        } else {
            System.out.println("fail in mathmatics");
        }

        System.out.println("Enter marks of Science");
        int scienceMarks = sc.nextInt();
        double sciencePercentage = (scienceMarks / 100.0) * 100;
        if (sciencePercentage >= 30) {
            System.out.println("pass in Science");
        } else {
            System.out.println("fail in Science");
        }

        System.out.println("Enter marks of English");
        int englishMarks = sc.nextInt();
        double englishPercentage = (englishMarks / 100.0) * 100;
        if (englishPercentage >= 30) {
            System.out.println("pass in English");
        } else {
            System.out.println("fail in English");
        }
        double total = ((mathmarks + englishMarks + scienceMarks) / 300.0) * 100;
        if (total >= 40) {
            System.out.println("final result : pass");

        } else {
            System.out.println("final result : fail");
        }
      }

    }

}


