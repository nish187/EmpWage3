public class EmpUC2 {
    public static void main(String[] args) {
        int FullTime=1,erph=20,emphrs=0,empWage=0;
        double EmpAttend=Math.floor(Math.random()*10)%2;
        if(EmpAttend==FullTime){
            emphrs=8;}
        else {
            emphrs=0;
        }
        empWage=emphrs*erph;
        System.out.println("Employee Wage is:" +empWage);
    }
}
