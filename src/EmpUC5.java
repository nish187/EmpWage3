public class EmpUC5 {
    public static final int PartTime = 1, FullTime = 2, erph = 20, Nwd = 2;

    public static void main(String[] args) {
        int emphrs = 0, empWage = 0, totalempWage = 0;
        int EmpAttend = (int) Math.floor(Math.random() * 10) % 3;
        for (int d = 0; d < Nwd; d++) {
            switch (EmpAttend) {
                case FullTime:
                    emphrs = 8;
                    break;
                case PartTime:
                    emphrs = 4;
                    break;
                default:
                    emphrs = 0;
            }

            empWage = emphrs * erph;
            totalempWage = totalempWage + empWage;
            System.out.println("Employee Wage is:" + empWage);
        }
        System.out.println("Total Employee Wage is:" + totalempWage);
    }
}
