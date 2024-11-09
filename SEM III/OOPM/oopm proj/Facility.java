package patients;

import java.util.Scanner;

class Facility {
    String fac_name;

    public void add_faci() {
        Scanner input = new Scanner(System.in);
        System.out.print("Facility: ");
        fac_name = input.nextLine();
    }

    public void show_faci() {
        System.out.println(fac_name);
    }
}
