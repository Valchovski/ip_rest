package bg.elsys.ip.rest;

import java.util.ArrayList;
import java.util.List;

/* Singleton Object for the list of CPUs */
public class ItemList {
	private static ItemList singleton = new ItemList();
	private List<CPU> itemList = new ArrayList<>();
	
	/*
	 * Item List Constructor with some testing data
	 */
	private ItemList() {
		itemList.add(new CPU("Intel Pentium G4400", 3.30, 3, 2, 2, 54));
		itemList.add(new CPU("Intel Core i3-580", 3.20, 4, 4, 4, 120));
		itemList.add(new CPU("Intel Core i3-4750HQ", 2.00, 4, 4, 8, 47));
		itemList.add(new CPU("Intel Core i5-6500", 3.20, 6, 4, 4, 65));
		itemList.add(new CPU("Intel Core i7-6700K", 4.00, 8, 4, 8, 91));
		itemList.add(new CPU("Intel Core i7-6700K", 4.00, 8, 4, 8, 91));
		itemList.add(new CPU("Intel Core i7-6950X", 3.00, 25, 10, 20, 140));
		itemList.add(new CPU("Intel Pentium G4400", 3.30, 3, 2, 2, 54));
		itemList.add(new CPU("Intel Core i3-580", 3.20, 4, 4, 4, 120));
		itemList.add(new CPU("Intel Core i3-4750HQ", 2.00, 4, 4, 8, 47));
		itemList.add(new CPU("Intel Core i5-6500", 3.20, 6, 4, 4, 65));
		itemList.add(new CPU("Intel Core i7-6700K", 4.00, 8, 4, 8, 91));
		itemList.add(new CPU("Intel Core i7-6700K", 4.00, 8, 4, 8, 91));
		itemList.add(new CPU("Intel Core i7-6950X", 3.00, 25, 10, 20, 140));
	}

	/*
	 * Returns the instance of the singleton object
	 * @return ItemList
	 */
	public static ItemList getInstance () {
		return singleton;
	}

	/*
	 * Returns the list of CPUs
	 * @return List
	 */
	public List<CPU> getItemList() {
		return itemList;
	}
	
	/*
	 * Sets the list of CPUs to the one passed as a parameter
	 * @param itemList List<CPU>
	 */
	public void setItemList(List<CPU> itemList) {
		this.itemList = itemList;
	}
}
