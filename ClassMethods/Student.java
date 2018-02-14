
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
    
    public double calcGPA() {
        double avg = 0;
        for (double grade : grades) {
            avg += grade;
        }
        return avg/5;
    }
}
