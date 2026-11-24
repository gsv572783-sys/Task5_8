package Day_2.Polymorphism.Compiletime;
class UserRegister{
    void Register(String name,int Id){
        System.out.println("User Name :"+name+" UserId :" +Id);
    }
    void Register(int Id,String name){
        System.out.println(" UserId :" +Id+" User Name :"+name);
    }
}

public class Task_5 {
    public static void main(String[] args) {
        UserRegister ur=new UserRegister();
        ur.Register("charan", 3241);
        ur.Register(3241, "Rodda Charan");
    }
    
}
