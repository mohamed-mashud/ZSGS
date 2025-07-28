// 1. Design a Java program to maintain hospital medical records.
// Create a base class named MedicalRecord that includes common attributes:
// --- recordId, patientName, dateOfVisit, and diagnosis.
// --- inputRecordDetails() – to input common record information.
// --- override displayRecord() – to display the common record details.
// ‌
// Create a subclass InPatientRecord that extends MedicalRecord and adds:
// --- roomNumber, numberOfDaysAdmitted, roomCharges.
// --- calculateTotalCharges() – to compute and return total inpatient cost.
// --- displayRecord() – to include all details, including total charges.
// ‌
// Create another subclass OutPatientRecord that extends MedicalRecord and adds:
// --- doctorName, consultationFee.
// --- override displayRecord() – to include all outpatient-specific details.
// Include all the necessary classes if its needed.
// ‌

import java.util.Scanner;

public class Questions_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for MedicalRecord
        System.out.println("Enter Record ID (int):");
        int recordId = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Enter Patient Name (String):");
        String patientName = scanner.nextLine();

        System.out.println("Enter Date of Visit (String):");
        String dateOfVisit = scanner.nextLine();

        System.out.println("Enter Diagnosis (String):");
        String diagnosis = scanner.nextLine();

        System.out.println("\n--- Medical Record Details ---");
        MedicalRecord kavery = new MedicalRecord();
        kavery.inputRecordDetails(recordId, patientName, dateOfVisit, diagnosis);
        kavery.displayRecord();

        // Input for InPatientRecord
        InPatientRecord inPatientRecord = new InPatientRecord();
        inPatientRecord.inputRecordDetails(recordId, patientName, dateOfVisit, diagnosis);

        System.out.println("\nEnter Room Number (int):");
        int roomNumber = scanner.nextInt();
        System.out.println("Enter Number of Days Admitted (int):");
        int numberOfDaysAdmitted = scanner.nextInt();
        System.out.println("Enter Daily Room Charges (double):");
        double roomCharges = scanner.nextDouble();

        inPatientRecord.setRoomNumber(roomNumber);
        inPatientRecord.setNumberOfDaysAdmitted(numberOfDaysAdmitted);
        inPatientRecord.setRoomCharges(roomCharges);

        System.out.println("\n--- InPatient Record Details ---");
        inPatientRecord.displayRecord();

        // Input for OutPatientRecord
        OutPatientRecord outPatientRecord = new OutPatientRecord();
        outPatientRecord.inputRecordDetails(recordId, patientName, dateOfVisit, diagnosis);

        scanner.nextLine(); 
        System.out.println("\nEnter Doctor Name (String):");
        String doctorName = scanner.nextLine();
        System.out.println("Enter Consultation Fee (double):");
        double consultationFee = scanner.nextDouble();

        outPatientRecord.setDoctorName(doctorName);
        outPatientRecord.setConsultationFee(consultationFee);

        System.out.println("\n--- OutPatient Record Details ---");
        outPatientRecord.displayRecord();
    }
}   

class MedicalRecord {
    int recordId;
    String patientName;
    String dateOfVisit;
    String diagnosis;

    public void inputRecordDetails(
        int recordId, String patientName, String dateOfVisit, String diagnosis
        ) {
            this.recordId = recordId;
            this.patientName = patientName;
            this.dateOfVisit = dateOfVisit;
            this.diagnosis = diagnosis;
    }

    public void displayRecord() {
        System.out.println(
            "Record ID: " + this.recordId +
            "\nPatient Name: " + this.patientName +
            "\nDate of Visit: " + this.dateOfVisit + 
            "\nDiagnosis: " + this.diagnosis    
        );
    }
}

class InPatientRecord extends MedicalRecord {
    int roomNumber;
    int numberOfDaysAdmitted;
    double roomCharges;

    public double calculateTotalCharges() {
        return numberOfDaysAdmitted * roomCharges;
    } 
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setNumberOfDaysAdmitted(int numberOfDaysAdmitted) {
        this.numberOfDaysAdmitted = numberOfDaysAdmitted;
    }

    public void setRoomCharges(double roomCharges) {
        this.roomCharges = roomCharges;
    }

    @Override
    public void displayRecord() {
        super.displayRecord();
        System.out.println(
            "Room Number: " + this.roomNumber +
            "\nNumber of Days Admitted: " + this.numberOfDaysAdmitted +
            "\nRoom Charges: " + this.roomCharges +
            "\nTotal Charges: " + this.calculateTotalCharges()
        );
    }
}

class OutPatientRecord extends MedicalRecord {
    String doctorName;
    double consultationFee;

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }

    @Override
    public void displayRecord() {
        super.displayRecord();
        System.out.println(
            "Doctor's Name: " + this.doctorName +
            "\nConsultation Fee: " + this.consultationFee
        );
    }
}