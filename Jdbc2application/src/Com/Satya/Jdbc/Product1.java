package Com.Satya.Jdbc;

public class Product1 {

	private int pId;
	private String pName;
	private double pprice;
	public Product1(int pId, String pName, double pprice) {
		this.pId = pId;
		this.pName = pName;
		this.pprice = pprice;
	}
	public Product1() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product1 [pId=" + pId + ", pName=" + pName + ", pprice=" + pprice +   "]";
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getPprice() {
		return pprice;
	}
	public void setPprice(double pprice) {
		this.pprice = pprice;
	}

	}