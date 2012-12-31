package designpattern.decorator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PushbackReader;

public class Decorator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//FileOutputStream fos = new FileOutputStream("afile.txt");
			FileWriter fw = new FileWriter("afile.txt");
			fw.write("This is a file.");
			fw.close();
			
			//DESIGN PATTERN : Now we see a series of "decorations".
			//All the subclasses of FilterInputStream are decorators
			//which provide new functionalities to others InputStreams
			FileReader fr = new FileReader("afile.txt");
			BufferedReader br = new BufferedReader(fr);
			PushbackReader pbr = new PushbackReader(br);
			char c = (char) pbr.read();
			System.out.println("The character readed is "+c);
			c = (char) pbr.read();
			System.out.println("The character readed is "+c);
			System.out.println("Now we unread 'w'");
			pbr.unread('w');
			c = (char) pbr.read();
			System.out.println("The character readed is "+c);
			pbr.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
