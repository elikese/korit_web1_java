package _22_Static.ticket;

public class Main {
    public static void main(String[] args) {
        // 번호대기표
        NumberTicket ticket1 = new NumberTicket(); // 1 -> 2
        NumberTicket ticket2 = new NumberTicket(); // 2 -> 3
        NumberTicket ticket3 = new NumberTicket(); // 3 -> 4
        NumberTicket ticket4 = new NumberTicket(); // 4 -> 5

        System.out.println(NumberTicket.nextNum); // 값? 5
    }
}
