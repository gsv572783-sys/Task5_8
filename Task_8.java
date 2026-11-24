package Day_2.Polymorphism.Compiletime;
class payment{
    void pay(double amount){
        System.out.println("Processing generic payment of ₹" + amount);
    }
}class CreditCard extends payment{
    void pay(double amount){
        System.out.println("Paid ₹" + amount + " via Credit Card");
    }
}class UPI extends payment{
    void pay(double amount){
        System.out.println("Paid ₹" + amount + " via UPI");
}
}
public class Task_8 {
    public static void main(String[] args) {
       payment pay=new payment();
       CreditCard cd=new CreditCard();
       UPI upi=new UPI();
       pay.pay(32323.343);
       upi.pay(322364.8779);
       cd.pay(25647.347);

       
        
    }
    
}
