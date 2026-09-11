public class Abstraction {
    public static void main(String[] args) {
        // Payment p2=new Payment();  // here payment is interface so we can not make object of this..
        Payment p= new UPI();  
        Payment.display();
        p.makePayment();
        
        Payment  p1= new creditCard();
        p1.makePayment();
    }
    
}

interface Payment{
    int a=10;
    void makePayment();  //this method is abstract and public...
    static void display(){
        System.out.println("Payment Successfull");
    }
}

class UPI implements Payment{
    //a=20;  we cannot modify this
    @Override //annotataion
    public void makePayment(){
        System.out.println("Payment Using UPI");

    }
}

class creditCard implements Payment{
    @Override
    public void makePayment() {
        // TODO Auto-generated method stub
        System.out.println("Payment Using CreditCard");
    }
}