public class EmpUC3 {
    public static void main(String[] args) {
        int PartTime=1,FullTime=2,erph=20,emphrs=0,empWage=0;
        double EmpAttend=Math.floor(Math.random()*10)%3;
        if(EmpAttend==FullTime){
            emphrs=8;}
        else if(EmpAttend==PartTime){
            emphrs=4;
        }
        empWage=emphrs*erph;
        System.out.println("Employee Wage is:" +empWage);
    }
}
