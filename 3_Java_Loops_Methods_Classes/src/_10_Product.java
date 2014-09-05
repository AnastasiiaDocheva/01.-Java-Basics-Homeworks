public class _10_Product implements Comparable<_10_Product> {
    private String name;
    private double price;

    public _10_Product(String name, double price) {
	super();
	this.name = name;
	this.price = price;
    }

    public _10_Product() {
    }

    public String getName() {
	return name;
    }

    public double getPrice() {
	return price;
    }

    public void setName(String name) {
	this.name = name;
    }

    public void setPrice(double price) {
	this.price = price;
    }

    @Override
    public int compareTo(_10_Product product) {
	double price = product.getPrice();
	if (this.price > price) {
	    return 1;
	} else if (this.price == price) {
	    return 0;
	} else {
	    return -1;
	}
    }    
}