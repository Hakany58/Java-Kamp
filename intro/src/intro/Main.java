package intro;

import java.awt.SystemColor;

public class Main {

	public static void main(String[] args) {

		String internetSubeButonu = "�nternet �ubesi";
		System.out.println(internetSubeButonu);
		
		
		String[] krediler = {
				"Ta��t kredisi",
				"Konut kredisi",
				"�htiya� kredisi"
				// ekleme yapacaksan kolay kolay yap.
		};
		// foreach
		for(String kredi : krediler) {
			System.out.println(kredi);
		} ;
				
		
		
		
		
	}

}
