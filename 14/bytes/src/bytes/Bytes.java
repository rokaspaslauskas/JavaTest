package bytes;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Bytes {

	public static void main(String[] args) throws IOException {
		InputStream in = null;
		try {
			in = new FileInputStream("src/failas.txt");
			int raidesKodas;
			while ((raidesKodas = in.read()) > 0) {
				char raide = (char) raidesKodas;
				System.out.print(raide);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (in != null)
				in.close();
		}

	}

}