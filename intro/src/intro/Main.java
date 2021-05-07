package intro;

import java.awt.SystemColor;

public class Main {

	public static void main(String[] args) {

		String internetSubeButonu = "Ýnternet Þubesi";
		System.out.println(internetSubeButonu);
		
		
		String[] krediler = {
				"Taþýt kredisi",
				"Konut kredisi",
				"Ýhtiyaç kredisi"
				// ekleme yapacaksan kolay kolay yap.
		};
		// foreach
		for(String kredi : krediler) {
			System.out.println(kredi);
		} ;
				
		
		
		
		
	}

}
