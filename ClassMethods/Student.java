
public class Student
{
    private double[] grades = new double[5];

    public Student () {
        for (double grade : grades) {
            grade = 0.0;
        }
    }

    public Student (double english, double math, double science, double fineArts, double socialScience) {
        grades[0] = english;
        grades[1] = math;
        grades[2] = science;
        grades[3] = fineArts;
        grades[4] = socialScience;
    }

    public void setGPA(double english, double math, double science, double fineArts, double socialScience) {
        grades[0] = english;
        grades[1] = math;
        grades[2] = science;
        grades[3] = fineArts;
        grades[4] = socialScience;
    }
    
    public static String doubleToLetter (double grade) {
        return (grade >= 3.7 ? "A" : grade >= 2.7 ? "B" : grade >= 1.7 ? "C" : grade >= 0.7 ? "D" : "F") + (grade%1 >= 0.7 ? "+" : grade%1 <= 0.3 ? "-" : "");
    }
    
    public double calcGPA() {
        double avg = 0;
        for (double grade : grades) {
            avg += grade;
        }
        return avg/5;
    }
}
