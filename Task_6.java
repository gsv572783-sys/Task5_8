package Day_2.Polymorphism.Compiletime;
class Book{
    Book(){
        System.out.println("title : Unkonown "+" Price :0.0");
    }
    Book(String name){
        System.out.println("Title :"+name+" Price : 0.0");
    }
    Book(String name,double price){
        System.out.println("Title :"+name+" Price :"+price);
    }

}

public class Task_6 {
    public static void main(String[] args) {
        Book b=new Book();
        Book b2=new Book("Ready");
        Book b3=new Book("Ready", 100.00);
        
    }
    
}
