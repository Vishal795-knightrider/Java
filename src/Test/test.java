package Test;

interface Booking{
    void book();
    void refund();
    void cancel();
}

abstract class VehicleBooking implements Booking{
    String bookinhgId;
    double amount;

    VehicleBooking(String bookinhgId, double amount){
        bookinhgId = bookinhgId;
        amount = amount;
    }

    public void book(){
        System.out.println(bookinhgId+" "+amount);
    }
}



public class test {
    public static void main(String[] args) {
//        VehicleBooking cab=new VehicleBooking();
    }
}
