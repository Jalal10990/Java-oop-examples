// Parent class
class SubjectMarks {
    protected int[] marks;

    // Constructor
    public SubjectMarks(int[] marks) {
        this.marks = new int[marks.length];
        System.arraycopy(marks, 0, this.marks, 0, marks.length);
    }

    // Overloaded constructor
    public SubjectMarks() {
        this.marks = new int[3]; // Default for 3 subjects
    }

    public double calculateAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }
}

// Child class
class EnhancedMarks extends SubjectMarks {
    private String studentName;

    // Constructor overloading
    public EnhancedMarks(String name, int[] marks) {
        super(marks);  // Call parent constructor
        this.studentName = name;
    }

    // Override method
    @Override
    public double calculateAverage() {
        double avg = super.calculateAverage();
        System.out.print(studentName + "'s ");
        return avg;
    }

    // Child-specific method
    public void displayAllMarks() {
        System.out.println("Marks for " + studentName + ":");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
    }
}

// Main class
public class InheritenceMarks {
    public static void main(String[] args) {
        int[] marks = {45, 67, 89};
        EnhancedMarks em = new EnhancedMarks("Jalal", marks);
        System.out.println("average: " + em.calculateAverage());
        em.displayAllMarks();
    }
}

