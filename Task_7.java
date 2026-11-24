package Day_2.Polymorphism.Compiletime;
class Employee{
    double baseSalary=100000.00;
    double calculateSalary(){
        return this.baseSalary;
    }
}class salesEmployee extends Employee{
    double bonus=20000.00;
    double calculateSalary(){
        return super.calculateSalary()+bonus;
    }

}

public class Task_7 {
    public static void main(String[] args) {
        salesEmployee se=new salesEmployee();
        System.out.println("Toltal Salary :"+se.calculateSalary());
        
        
    }
    
}
