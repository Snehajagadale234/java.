// Base class
class Student {
    int rollNo;

    void setRollNo(int r) {
        rollNo = r;
    }

    void displayRollNo() {
        System.out.println("Roll No: " + rollNo);
    }
}

// Derived class 1
class Test extends Student {
    int sub1, sub2;

    void setMarks(int s1, int s2) {
        sub1 = s1;
        sub2 = s2;
    }

    void displayMarks() {
        System.out.println("Subject 1 Marks: " + sub1);
        System.out.println("Subject 2 Marks: " + sub2);
    }
}

// Derived class 2
class Result extends Test {
    int total;

    void calculateTotal() {
        total = sub1 + sub2;
    }

    void displayResult() {
        System.out.println("Total Marks: " + total);
    }
}

// Main class
public class MultiLevelDemo {
    public static void main(String[] args) {

        Result r = new Result();

        r.setRollNo(101);
        r.setMarks(75, 85);
        r.calculateTotal();

        r.displayRollNo();
        r.displayMarks();
        r.displayResult();
    }
}
