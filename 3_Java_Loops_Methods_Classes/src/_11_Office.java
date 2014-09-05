public class _11_Office implements Comparable<_11_Office> {
    private String town;
    private double income;

    public _11_Office(String town, double income) {
	super();
	this.town = town;
	this.income = income;
    }

    public String getTown() {
	return town;
    }

    public void setTown(String town) {
	this.town = town;
    }

    public double getIncome() {
	return income;
    }

    public void setIncome(double income) {
	this.income = income;
    }

    @Override
    public int compareTo(_11_Office off) {	
	return this.town.compareTo(off.getTown());
    }
}