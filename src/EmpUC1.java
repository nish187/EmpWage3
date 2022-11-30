public class EmpUC1 {
    public static void main(String[] args) {
        int FullTime=1;
        double EmpAttend=Math.floor(Math.random()*10)%2;
        if(EmpAttend==FullTime){
            System.out.println("Employee Is Present");
        }
        else{
            System.out.println("Employee Is Absent");
        }
    }
}
