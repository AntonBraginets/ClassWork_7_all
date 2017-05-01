package Task1;

public class Main {
    public static void main(String[] args) {
        Address adBook = new Address();
        adBook.setCountry("Ukraine");
        adBook.setCity("Odessa");
        adBook.setIndex("65000");
        adBook.setApartment("123");
        adBook.setStreet("Shevchenko ave.");
        adBook.setHouse("321");
        System.out.println("Country:\t\t" + adBook.getCountry());
        System.out.println("Postcode:\t\t" + adBook.getIndex());
        System.out.println("City:\t\t\t" + adBook.getCity());
        System.out.println("Street:\t\t\t" + adBook.getStreet());
        System.out.println("House No.:\t\t" + adBook.getHouse());
        System.out.println("Apartment No.:\t" + adBook.getApartment());
    }
}
