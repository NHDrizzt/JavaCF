package JOOPUdemy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapType {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> mapVoutes = new HashMap<>();
		System.out.println("Enter full file path: ");
		String path = "c:\\Repositorios\\Source.csv";
		int value = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {

				String[] arr = line.split(",");
				int count = Integer.parseInt(arr[1]);
				if(mapVoutes.containsKey(arr[0])) {
					count = mapVoutes.get(arr[0]);
					mapVoutes.put(arr[0], count + Integer.parseInt(arr[1]));
				}else {
					mapVoutes.put(arr[0], count);
				}

				line = br.readLine();
			}

			for (String key : mapVoutes.keySet()) {
				System.out.println(key + ": " + mapVoutes.get(key));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}
