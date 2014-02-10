package ArduinoCard;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		ToArduinoCode d = new ToArduinoCode();
		// d.transform("bnrb.xmi");
		String code = d.transform("bnrb.xmi");
	
		try {
			File file = new File("sketch.ino");

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(code);
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
