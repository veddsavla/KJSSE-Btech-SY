import hospital.Doctor;
import hospital.Patient;
import patients.Medical;
import patients.Facility;
import facilities.Lab;
import staff.Staff;

import java.util.Calendar;
import java.util.Scanner;

class HospitalManagement {
    public static void main(String[] args) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
                "Aug", "Sep", "Oct", "Nov", "Dec"};
        Calendar calendar = Calendar.getInstance();
        
        Doctor[] doctors = new Doctor[25];
        Patient[] patients = new Patient[100];
        Lab[] labs = new Lab[20];
        Facility[] facilities = new Facility[20];
        Medical[] medicines = new Medical[100];
        Staff[] staff = new Staff[100];
        
        int doctorCount = 0, patientCount = 0, labCount = 0, facilityCount = 0, medicineCount = 0, staffCount = 0;
        
        System.out.println("\t\tWelcome to Hospital Management System");
        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " "
                + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));
        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR)
                + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
        
        Scanner input = new Scanner(System.in);
        int choice, subChoice, status = 1;
        
        while (status == 1) {
            System.out.println("\nMAIN MENU");
            System.out.println("1. Doctors 2. Patients 3. Medicines 4. Laboratories 5. Facilities 6. Staff ");
            choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("DOCTOR SECTION");
                    subChoice = 1;
                    
                    while (subChoice == 1) {
                        System.out.println("1. Add New Entry\n2. Existing Doctors List");
                        subChoice = input.nextInt();
                        
                        switch (subChoice) {
                            case 1:
                                doctors[doctorCount] = new Doctor();
                                doctors[doctorCount].newDoctor();
                                doctorCount++;
                                break;
                            case 2:
                                System.out.println("id \t Name\t Specialist \t Timing \t Qualification \t Room No.");
                                for (int i = 0; i < doctorCount; i++) {
                                    doctors[i].doctorInfo();
                                }
                                break;
                            default:
                                System.out.println("Invalid Input!");
                        }
                        
                        System.out.println("\nReturn to Main Menu Press 0");
                        subChoice = input.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("PATIENT SECTION");
                    subChoice = 1;
                    
                    while (subChoice == 1) {
                        System.out.println("1. Add New Entry\n2. Existing Patients List");
                        subChoice = input.nextInt();
                        
                        switch (subChoice) {
                            case 1:
                                patients[patientCount] = new Patient();
                                patients[patientCount].newPatient();
                                patientCount++;
                                break;
                            case 2:
                                System.out.println("id \t Name \t Disease \t Gender \t Admit Status \t Age");
                                for (int i = 0; i < patientCount; i++) {
                                    patients[i].patientInfo();
                                }
                                break;
                            default:
                                System.out.println("Invalid Input!");
                        }
                        
                        System.out.println("\nReturn to Main Menu Press 0");
                        subChoice = input.nextInt();
                    }
                    break;
                case 3:
                    subChoice = 1;
                    System.out.println("MEDICINE SECTION");
                    
                    while (subChoice == 1) {
                        System.out.println("1. Add New Entry\n2. Existing Medicines List");
                        subChoice = input.nextInt();
                        
                        switch (subChoice) {
                            case 1:
                                medicines[medicineCount] = new Medical();
                                medicines[medicineCount].newMedicine();
                                medicineCount++;
                                break;
                            case 2:
                                System.out.println("Name \t Company \t Expiry Date \t Cost");
                                for (int i = 0; i < medicineCount; i++) {
                                    medicines[i].findMedicine();
                                }
                                break;
                            default:
                                System.out.println("Invalid Input!");
                        }
                        
                        System.out.println("\nReturn to Main Menu Press 0");
                        subChoice = input.nextInt();
                    }
                    break;
                case 4:
                    subChoice = 1;
                    System.out.println("LABORATORY SECTION");
                    
                    while (subChoice == 1) {
                        System.out.println("1. Add New Entry \n2. Existing Laboratories List");
                        subChoice = input.nextInt();
                        
                        switch (subChoice) {
                            case 1:
                                labs[labCount] = new Lab();
                                labs[labCount].newFacility();
                                labCount++;
                                break;
                            case 2:
                                System.out.println("Facilities\t\t Cost");
                                for (int i = 0; i < labCount; i++) {
                                    labs[i].facilityList();
                                }
                                break;
                            default:
                                System.out.println("Invalid Input!");
                        }
                        
                        System.out.println("\nReturn to Main Menu Press 0");
                        subChoice = input.nextInt();
                    }
                    break;
                case 5:
                    subChoice = 1;
                    System.out.println("HOSPITAL FACILITY SECTION");
                    
                    while (subChoice == 1) {
                        System.out.println("1. Add New Facility\n2. Existing Facilities List");
                        subChoice = input.nextInt();
                        
                        switch (subChoice) {
                            case 1:
                                facilities[facilityCount] = new Facility();
                                facilities[facilityCount].addFacility();
                                facilityCount++;
                                break;
                            case 2:
                                System.out.println("Hospital Facility are:");
                                for (int i = 0; i < facilityCount; i++) {
                                    facilities[i].showFacility();
                                }
                                break;
                            default:
                                System.out.println("Invalid Input!");
                        }
                        
                        System.out.println("\nReturn to Main Menu Press 0");
                        subChoice = input.nextInt();
                    }
                    break;
                case 6:
                    subChoice = 1;
                    System.out.println("STAFF SECTION");
                    
                    while (subChoice == 1) {
                        String a = "Nurse", b = "Worker", c = "Security";
                        System.out.println("1. Add New Entry \n2. Existing Nurses List\n3. Existing Workers List \n4. Existing Security List");
                        subChoice = input.nextInt();
                        
                        switch (subChoice) {
                            case 1:
                                staff[staffCount] = new Staff();
                                staff[staffCount].newStaff();
                                staffCount++;
                                break;
                            case 2:
                                System.out.println("Nurses List");
                                System.out.println("id \t Name \t Gender \t Salary");
                                for (int i = 0; i < staffCount; i++) {
                                    if (a.equals(staff[i].desg))
                                        staff[i].staffInfo();
                                }
                                break;
                            case 3:
                                System.out.println("Workers List");
                                System.out.println("id \t Name \t Gender \t Salary");
                                for (int i = 0; i < staffCount; i++) {
                                    if (b.equals(staff[i].desg))
                                        staff[i].staffInfo();
                                }
                                break;
                            case 4:
                                System.out.println("Security List");
                                System.out.println("id \t Name \t Gender \t Salary");
                                for (int i = 0; i < staffCount; i++) {
                                    if (c.equals(staff[i].desg))
                                        staff[i].staffInfo();
                                }
                                break;
                            default:
                                System.out.println("Invalid Input!");
                        }
                        
                        System.out.println("\nReturn to Main Menu Press 0");
                        subChoice = input.nextInt();
                    }
                    break;
                default:
                    System.out.println("Input Not Valid!");
            }
            
            System.out.println("\nReturn to MAIN MENU Press 1");
            status = input.nextInt();
        }
    }
}
