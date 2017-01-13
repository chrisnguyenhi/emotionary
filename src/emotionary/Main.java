package emotionary;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		Emotionary textDoc = new Emotionary("test.txt");
		textDoc.findEmotion();
		
	}

}
