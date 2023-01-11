import java.lang.reflect.Array;
import java.util.ArrayList;

public class Store {
    ArrayList<CISItem> items = new ArrayList<CISItem>();
    ArrayList<CISItem> phones = new ArrayList<>();

    public ArrayList<CISItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<CISItem> items) {
        this.items = items;
    }

    public void addBook(Book book) {
        items.add(book);
    }

    public void addPhone(Phone phone) {
        items.add(phone);
    }

    public ArrayList<CISItem> getAllPhones() {
        for (CISItem phone : items) {
            if (phone.getClass().getSimpleName().equals("phone")) {
                phones.add(phone);
            }
        }
        return phones;
    }

    public void updatePhonesLocation(String location) {
        for (CISItem phone : items) {
            if (phone.getClass().getSimpleName().equals("phone")) {
                phone.setLocation(location);
            }
        }
    }

    public ArrayList<CISItem> getItems(String itemType) {
        ArrayList<CISItem> calledItems = new ArrayList<>();
        for (CISItem item : calledItems) {
            if (item.getClass().getSimpleName().equals(itemType)) {
                calledItems.add(item);
            }
        }
        return calledItems;
    }

    public void updateItems(String itemType, String property, String value) {
        ArrayList<CISItem> calledItems = new ArrayList<>();
        for (CISItem item : calledItems) {
            if (item.getClass().getSimpleName().equals(itemType)) {
                calledItems.add(item);
            }
        }
        for (CISItem item : calledItems) {
            if (property.equals("name")) {
                item.setName(value);
            }
            if (property.equals("location")){
                item.setLocation(value);
            }
            if (property.equals("description")){
                item.setDesc(value);
            }
            if (property.equals("price")){
                item.setPrice(Integer.parseInt(value));
            }
        }
    }
    public void showAllInfo() {
        for (CISItem item : items){
            System.out.println(item);
        }
    }
}
