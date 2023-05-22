/* 
Collin      Hargreaves
CIS 35A          00441
Assignment           3
Due         05-21-2023
Submitted   05-21-2023
*/

public class Franchise {
	
	// array of stores
	private Store stores[];
	
	// no default constructor, need to have an array that has elements
	public Franchise(int num) {
			stores = new Store[num];
	}

	// returns specific store object
	public Store getStores(int i) {
		return stores[i];
	}

	// sets specific store object
	public void setStores(Store stores, int i) {
		this.stores[i] = stores;
	}

	// returns how many stores in array
	public int numberofstores()
	{
		return stores.length;
	}

	public void calc() {
		for (int i = 0; i < stores.length; i++) {
			stores[i].analyzeresults();
		}
	}
	
}
