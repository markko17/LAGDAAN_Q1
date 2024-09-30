import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //get user info
        System.out.println("Please Fill the following Data:");
        System.out.println();
        System.out.print("Enter Student Name : ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Course : ");
        String course = scanner.nextLine();

        System.out.print("Enter Course Code : ");
        String courseCode = scanner.nextLine();

        System.out.print("Enter Number of Units : ");
        int numberOfUnits = scanner.nextInt();
        //payment computation
        int feePerUnit = 1000;
        int totalFee = numberOfUnits * feePerUnit;

        System.out.println("Student Name: " + studentName);
        System.out.println("Total Enrollment Fee: " + totalFee);

        System.out.print("Enter Payment Amount: ");
        int payment = scanner.nextInt();
        //verification of payment
        if (payment == totalFee){
            System.out.println("Payment fully paid");
        }else if (payment < totalFee){
            System.out.println("Parcial  payment!");
            System.out.println("Payment: " + payment);
        }else{
            System.out.println("Overpaid!");
            System.out.println("Payment: " + payment);

    }
    scanner.close();

    

    }
}
