package facilities;

import patients.Facility;

import java.util.Scanner;

public class Lab extends Facility {
    private String facility;
    private int lab_cost;

    public Lab() {
        Scanner input = new Scanner(System.in);
        System.out.print("Facility: ");
        facility = input.nextLine();
        System.out.print("Cost: ");
        lab_cost = input.nextInt();
    }

    public void new_faci() {
        Scanner input = new Scanner(System.in);
        System.out.print("Facility: ");
        facility = input.nextLine();
        System.out.print("Cost: ");
        lab_cost = input.nextInt();
    }

    public void faci_list() {
        System.out.println(facility + "\t\t" + lab_cost);
    }
}
