package java2notice_tutorial.hashMap;


public class Price {
    private String item;
    private int price;

    public Price(String itm, int pr) {
        this.item = itm;
        this.price = pr;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Price) {

            Price pp = (Price) obj;
            return ((pp.item.equals(this.item)) && pp.price == this.price);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hashcode = 0;
        hashcode = price * 20;
        hashcode += item.hashCode();
        return hashcode;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "item: " + item +
                " price: " + price;
    }
}
