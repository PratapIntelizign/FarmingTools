package HandUse_Tools;

public class HandTools {
	public static void main(String[] args) {
		SalesData SD = new SalesData();
		HandTools HT = new HandTools();
		SD.displayData();
		HT.Spade();
		Shovel();
	}

	public void Spade() {
		System.out.println("turn the soil over with a spade");
	}

	public static void Shovel() {
		System.out.println("moving the soil");
	}

}
