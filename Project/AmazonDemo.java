package Project;

public class AmazonDemo  {//implements Comparable{

	private int price;
	private int ram;
	private int battery;
	private String modelName;
	private String color;
	private int Storage;
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price
	 * @param ram
	 * @param batteryCapacity
	 * @param brandName
	 * @param color
	 * @param storage
	 */
	public AmazonDemo(int price, int ram, int battery, String modelName, String color, int storage) {
		super();
		this.price = price;
		this.ram = ram;
		this.battery = battery;
		this.modelName = modelName;
		this.color = color;
		Storage = storage;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the ram
	 */
	public int getRam() {
		return ram;
	}
	/**
	 * @param ram the ram to set
	 */
	public void setRam(int ram) {
		this.ram = ram;
	}
	/**
	 * @return the batteryCapacity
	 */
	public int getBattery() {
		return battery;
	}
	/**
	 * @param batteryCapacity the battery to set
	 */
	public void setBattery(int battery) {
		this.battery = battery;
	}
	/**
	 * @return the brandName
	 */
	public String getmodelName() {
		return modelName;
	}
	/**
	 * @param brandName the brandName to set
	 */
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	@Override
	public String toString() {
		return "\n [price=" + price + ", ram=" + ram + ", battery=" + battery + ", modelName=" + modelName
				+ ", color=" + color + ", Storage=" + Storage + "]";
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the storage
	 */
	public int getStorage() {
		return Storage;
	}
	/**
	 * @param storage the storage to set
	 */
	public void setStorage(int storage) {
		Storage = storage;
	}
	/*
	 * @Override public int compareTo(Object o) { AmazonDemo am= (AmazonDemo)o;
	 * if(this.getPrice()>am.getPrice()) return -9; else if
	 * (this.getPrice()<am.getPrice()) { return 99; } else return 0; }
	 */

}
