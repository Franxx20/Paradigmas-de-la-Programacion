import java.util.HashMap;
import java.util.Map;

import org.omg.Messaging.SyncScopeHelper;

public class Main {

	public static void main(String[] args) {
		
		HashMap<String, Integer> mapa = new HashMap<String, Integer>();
		
		mapa.put("Messi", 10);
		mapa.put("Di Maria", 11);
		mapa.put("De Paul", 7);
		mapa.put("Cuti Romero", 6);
		mapa.put("Dibu", 23);
		
		int dorsal = mapa.getOrDefault("Lautaro Martinez", -1);
		///dorsal = mapa.getOrDefault("Di Maria", -1);
		
		System.out.println(dorsal);
		
		for(Map.Entry<String, Integer> entrada: mapa.entrySet()){
			System.out.println(entrada);
		}

	}

}
