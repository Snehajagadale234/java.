// Interface
interface Sports {
    int sportsMarks = 20;
    void displaySportsMarks();
}

class Student {
    int rollNo;

    void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    int getRollNo() {
        return rollNo;
    }
}

class Exam extends Student {
    int sub1, sub2;

    void setMarks(int sub1, int sub2) {
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    void displayMarks() {
        System.out.println("Subject 1 Marks: " + sub1);
        System.out.println("Subject 2 Marks: " + sub2);
    }
}

class Result extends Exam implements Sports {

    public void displaySportsMarks() {
        System.out.println("Sports Marks: " + sportsMarks);
    }

    void displayResult() {
        int total = sub1 + sub2 + sportsMarks;

        System.out.println("Roll No: " + getRollNo());
        displayMarks();
        displaySportsMarks();
        System.out.println("Total Marks: " + total);
    }
}

// Changed Public Class Name
public class StudentResult {
    public static void main(String[] args) {

        Result r = new Result();

        r.setRollNo(101);
        r.setMarks(75, 85);

        r.displayResult();
    }
}