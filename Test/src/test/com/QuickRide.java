package test.com;
abstract class Quickride {
    String id;
    int fare;
    abstract void book();
}
class Cab extends Quickride {
    String time;
    @Override
    void book() {
        System.out.println("Cab booked: " + id);
        System.out.println("Fare: " + fare);
        System.out.println("Time: " + time);
    }
    class Train extends Quickride {
        String time;
        @Override
        void book() {
            System.out.println("Train booked: " + id);
            System.out.println("Fare: " + fare);
            System.out.println("Time: " + time);
        }
        void cancel(int refund) {
            try {
                if (refund < fare) {
                    throw new Exception("Refund is only " + refund);
                }
            } catch (Exception e) {
                System.out.println("Booking cancelled! " + e.getMessage());
            }
        }
        public static void main(String[] args) {
            Cab cab = new Cab();
            cab.id = "CAB101";
            cab.fare = 500;
            cab.time = "10:00 AM";
            cab.book();
            cab.cancel(300);
    }