package failai;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class newRead{
	public static void main(String[]args)throws IOException{
		File failas=new File("src/failas.txt");
		readFile1(failas);
		
		}
	public static String apversk(String var) {
		
		StringBuilder vardas = new StringBuilder();
		vardas.append(var);    
		vardas.reverse();
		String vardas2 = vardas.toString();
		return vardas2;
		
	}
	private static String readFile1()throws IOException{
			FileReader failas = new
			BufferedReader br = new BufferedReader(failas);
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(apversk(line));
				return line;
				}
			return "";
	}
	public static void newFile(String[]args){
		try{
			FileWriter fw=new FileWriter("src/failasNew.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		PrintWriter out=new PrintWriter(bw);
		out.println(apversk(readFile1()));
		out.close();
		}catch
		(IOException e){// ...}}}
		}
		
	}

}
																																																																										// BufferedReader
																																																																										// from
																																																																										// InputStreamReaderBufferedReader
																																																																										// br
																																																																										// =
																																																																										// new
																																																																										// BufferedReader(new
																																																																										// InputStreamReader(fis));String
																																																																										// line
																																																																										// =
																																																																										// null;while
																																																																										// ((line
																																																																										// =
																																																																										// br.readLine())
																																																																										// !=
																																																																										// null)
																																																																										// {System.out.println(line);}br.close();}}
