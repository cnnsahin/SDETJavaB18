package class18;

public class DegreeTester {
        public static void main(String[] args) {
            // Create objects of each class and call the getPrerequisite method
            Degree degree = new Degree();
            System.out.println("Degree Prerequisite:");
            degree.getPrerequisite();
            System.out.println();

            Bachelors bachelors = new Bachelors();
            System.out.println("Bachelors Prerequisite:");
            bachelors.getPrerequisite();
            System.out.println();

            Masters masters = new Masters();
            System.out.println("Masters Prerequisite:");
            masters.getPrerequisite();
        }
    }

