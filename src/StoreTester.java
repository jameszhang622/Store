import org.testng.annotations.Test;
import java.util.ArrayList;


import static org.testng.AssertJUnit.assertTrue;

public class StoreTester {
    @Test
    public void addBookTest() {
        Store store = new Store();
        Book book = new Book("Book", "Book Store", 50, "Hary potter book", 1000,"2003","J.K. rowling", "978-3-16-148410-0", "2", "Harry Potter");
        store.addBook(book);
        assertTrue(store.getItems().size() == 1);
    }

    @Test
    public void addBookAndPhoneTest() {
        Store store = new Store();
        Book book = new Book("Book", "Book Store", 50, "Hary potter book", 1000, "2003", "J.K. rowling", "978-3-16-148410-0", "2", "Harry Potter");
        Phone phone = new Phone("iPhone", "Apple", 9000, "iPhone X 256GB", 256, "X", "Apple", "IOS", "Mobile", 6);
        store.addBook(book);
        store.addPhone(phone);
        assertTrue(store.getItems().size() == 2);
    }

    @Test
    public void updatePhoneLocationTest(){
        Store store = new Store();
        Phone phoneOne = new Phone("iPhone", "Apple", 9000, "iPhone X 256GB", 256, "X", "Apple", "IOS", "Mobile", 6);
        Phone phoneTwo = new Phone("Samsung Galaxy", "Samsung", 10000, "Samsung Galaxy X", 512, "X", "Samsung", "Android", "Mobile", 9);
        store.addPhone(phoneOne);
        store.addPhone(phoneTwo);
        ArrayList<CISItem> phones = new ArrayList<>();
        phones = store.getAllPhones();
        store.updatePhonesLocation("Room 512");
        for (CISItem phoneCheck : phones){
            assertTrue(phoneCheck.getLocation().equals("Room 512"));
        }
    }

    @Test
    public void getItemsTest(){
        Store store = new Store();
        Phone phoneOne = new Phone("iPhone", "Apple", 9000, "iPhone X 256GB", 256, "X", "Apple", "IOS", "Mobile", 6);
        Phone phoneTwo = new Phone("Samsung Galaxy", "Samsung", 10000, "Samsung Galaxy X", 512, "X", "Samsung", "Android", "Mobile", 9);
        Book book = new Book("Book", "Book Store", 50, "Hary potter book", 1000, "2003", "J.K. rowling", "978-3-16-148410-0", "2", "Harry Potter");
        ArrayList<CISItem> books = new ArrayList<>();
        books = store.getItems("book");
        ArrayList<CISItem> phones = new ArrayList<>();
        phones = store.getItems("phone");
        for (CISItem phoneCheck : phones){
            assertTrue(phoneCheck.getClass().getSimpleName().equals("phones"));
        }
        for (CISItem bookCheck : books){
            assertTrue(bookCheck.getClass().getSimpleName().equals("book"));
        }
    }
    @Test
    public void updateItemsTest(){
        Store store = new Store();
        Phone phoneOne = new Phone("iPhone", "Apple", 9000, "iPhone X 256GB", 256, "X", "Apple", "IOS", "Mobile", 6);
        Phone phoneTwo = new Phone("Samsung Galaxy", "Samsung", 10000, "Samsung Galaxy X", 512, "X", "Samsung", "Android", "Mobile", 9);
        Book book = new Book("Book", "Book Store", 50, "Hary potter book", 1000, "2003", "J.K. rowling", "978-3-16-148410-0", "2", "Harry Potter");
        store.addBook(book);
        store.addPhone(phoneOne);
        store.addPhone(phoneTwo);
        store.updateItems("phone","name","iphone");
        ArrayList<CISItem> phones = new ArrayList<>();
        phones = store.getAllPhones();
        for (CISItem phone : phones){
            assertTrue(phone.getName().equals("iphone"));
        }
    }

    @Test
    public void showAllInfoTest(){
        Store store = new Store();
        Phone phoneOne = new Phone("iPhone", "Apple", 9000, "iPhone X 256GB", 256, "X", "Apple", "IOS", "Mobile", 6);
        Phone phoneTwo = new Phone("Samsung Galaxy", "Samsung", 10000, "Samsung Galaxy X", 512, "X", "Samsung", "Android", "Mobile", 9);
        Book book = new Book("Book", "Book Store", 50, "Hary potter book", 1000, "2003", "J.K. rowling", "978-3-16-148410-0", "2", "Harry Potter");
        store.addBook(book);
        store.addPhone(phoneOne);
        store.addPhone(phoneTwo);
        store.showAllInfo();
    }
}
