package hospital;

import java.util.Scanner;

public class Doctor {
    private String did;
    private String dname;
    private String specilist;
    private String appoint;
    private String doc_qual;
    private int droom;

    public Doctor() {
        Scanner input = new Scanner(System.in);
        System.out.print("ID: ");
        did = input.nextLine();
        System.out.print("Name: ");
        dname = input.nextLine();
        System.out.print("Specialization: ");
        specilist = input.nextLine();
        System.out.print("Work Time: ");
        appoint = input.nextLine();
        System.out.print("Qualification: ");
        doc_qual = input.nextLine();
        System.out.print("Room No.: ");
        droom = input.nextInt();
    }

    public String getDoctorID() {
        return did;
    }

    public String getDoctorName() {
        return dname;
    }

    public String getSpecialization() {
        return specilist;
    }

    public String getWorkTime() {
        return appoint;
    }

    public String getQualification() {
        return doc_qual;
    }

    public int getRoomNumber() {
        return droom;
    }

    public void doctor_info() {
        System.out.println(did + "\t" + dname + " \t" + specilist + " \t"
                + appoint + " \t" + doc_qual + " \t" + droom);
    }
}
