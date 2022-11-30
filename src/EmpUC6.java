public class EmpUC6 {
    public static final int PartTime = 1, FullTime = 2, erph = 20, Nwd = 2,Mrm=10;

    public static void main(String[] args) {
        int emphrs = 0, empWage = 0, totalempWage = 0, totalemphrs=0,totalWdays=0;
        while(totalemphrs<Mrm && totalWdays<Nwd){
            int EmpAttend = (int) Math.floor(Math.random() * 10) % 3;
            totalWdays++;

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
            totalemphrs=totalemphrs+emphrs;
            empWage = emphrs * erph;
            totalempWage = totalempWage + empWage;
            System.out.println("Employee Wage is:" + empWage);
        }
        System.out.println("Total Employee Wage is:" + totalempWage);
    }
}
