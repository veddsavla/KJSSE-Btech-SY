package patients;

import java.util.Scanner;

class Medical {
    String med_name, med_comp, exp_date;
    int med_cost, count;

    public void new_medi() {
        Scanner input = new Scanner(System.in);
        System.out.print("Name: ");
        med_name = input.nextLine();
        System.out.print("Comp: ");
        med_comp = input.nextLine();
        System.out.print("Exp. Date: ");
        exp_date = input.nextLine();
        System.out.print("Cost: ");
        med_cost = input.nextInt();
        System.out.print("No of Units: ");
        count = input.nextInt();
    }

    public void find_medi() {
        System.out.println(med_name + " \t" + med_comp + " \t" + exp_date
                + " \t" + med_cost + " \t" + count);
    }
}

