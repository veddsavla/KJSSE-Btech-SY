package hospital;

import java.util.Scanner;

class Patient {
    String pid, pname, disease, sex, admit_status;
    int age;

    public void new_patient() {
        Scanner input = new Scanner(System.in);
        System.out.print("Id: ");
        pid = input.nextLine();
        System.out.print("Name: ");
        pname = input.nextLine();
        System.out.print("Disease: ");
        disease = input.nextLine();
        System.out.print("Sex: ");
        sex = input.nextLine();
        System.out.print("Admit Status: ");
        admit_status = input.nextLine();
        System.out.print("Age: ");
        age = input.nextInt();
    }

    public void patient_info() {
        System.out.println(pid + "\t" + pname + " \t" + disease + " \t"
                + sex + " \t" + admit_status + "\t" + age);
    }
}
