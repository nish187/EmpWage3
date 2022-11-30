public class EmpUC4 {
    public static final int PartTime=1,FullTime=2,erph=20;
    public static void main(String[] args) {
        int emphrs=0,empWage=0;
        int EmpAttend=(int)Math.floor(Math.random()*10)%3;
        switch(EmpAttend){
            case FullTime:
                emphrs=8;
                break;
            case PartTime:
                emphrs=4;
                break;
            default:
                emphrs=0;}

        empWage=emphrs*erph;
        System.out.println("Employee Wage is:" +empWage);
    }
}
