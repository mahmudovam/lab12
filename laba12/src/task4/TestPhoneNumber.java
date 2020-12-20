package task4;

public class TestPhoneNumber {

    public static void main(String[] args) {
        System.out.println("From international: ");
        System.out.println(PhoneNumber.fromInternational("+74564749786").toUnique());

        System.out.println("From *RUSSIAN*:");
        System.out.println(PhoneNumber.fromRussian("87386549876").toUnique());
    }
}