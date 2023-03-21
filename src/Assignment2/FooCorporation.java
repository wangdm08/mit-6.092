package Assignment2;

class FooCorporation{
    public static void totalPay(double base, int hours){
            double pay;
            if (base<8.00){
                System.out.println("base pay does not meet minimum,error");
            }
            else {
                if (hours<=40) {
                    pay = base*hours;
                    System.out.println("Total pay is" + pay);
                }
                else if (hours>60){
                    System.out.println("hours worked exceed the maximum,error");
                }
                else {
                    pay = base*40+(hours-40)*1.5*base;
                    System.out.println("Total pay is" + " " + pay);
                }
            }
    }
    public static void main(String[] args){
        totalPay(7.50,35);
        totalPay(8.20,47);
        totalPay(10.00,73);
    }
}