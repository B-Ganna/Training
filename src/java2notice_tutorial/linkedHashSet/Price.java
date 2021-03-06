package java2notice_tutorial.linkedHashSet;


public class Price {
    private String item;
    private int price;

    public Price(String itm, int pr) {
        this.item = itm;
        this.price = pr;
    }

    @Override
    public int hashCode() {
        System.out.println("In HashCode");
        int hashcode = 0;
        hashcode = price * 20;
        hashcode += item.hashCode();
        return hashcode;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("In equals");
        if (obj instanceof Price) {
            Price pp = (Price) obj;
            return (pp.item.equals(this.item) && pp.price == this.price);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Item: " + item + " --- Price: " + price;
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
}
