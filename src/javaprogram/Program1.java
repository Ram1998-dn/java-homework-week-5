package javaprogram;

public class Program1 {

    public static void main(String [] args) {


        String name = "Ram Patel";
        int age = 28;
        String gender = "Female";
        String address = "Harrow-on-the-hill";
        String phone = "+44 7798565897";
        String email = "rampatel8@gmail.com";

        // Educational Background
        String highestQualification = "Bachelor of Engineering in CSE";
        String university = "Atmiya University";
        int graduationYear = 2018;

        // Work Experience
        String currentJobTitle = "Software Tester";
        String company = "White Label.";
        int yearsOfExperience = 3;

        // Skills
        String[] skills = {"Manual Testing", "JAVA", "SQL", "Postmen", "Mobile Testing"};

        // Printing Bio Data
        System.out.println("----------BIO DATA:----------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println(); // Used for new line or space
        System.out.println("Educational Background:");
        System.out.println("Highest Qualification: " + highestQualification);
        System.out.println("University: " + university);
        System.out.println("Year of Graduation: " + graduationYear);
        System.out.println();
        System.out.println("Work Experience:");
        System.out.println("Current Job Title: " + currentJobTitle);
        System.out.println("Company: " + company);
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.println();
        System.out.println("Skills:");
        for (String skill : skills) {
        System.out.println(" " + skill);
            }

    }
}
