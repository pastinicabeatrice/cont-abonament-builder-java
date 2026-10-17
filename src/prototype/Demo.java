package prototype;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        bs.setShopName("Anticariat");
        bs.loadData();

        BookShop bs1 = bs.clone();
        bs1.setShopName("Litera");

        System.out.println(bs);
        System.out.println(bs1);
    }
}
