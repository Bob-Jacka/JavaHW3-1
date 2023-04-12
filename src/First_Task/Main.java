package First_Task;

public class Main {
    public static void main(String[] args) {
        CalcMiles service = new CalcMiles();
        int price = 13_678;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println(miles);
    }
}