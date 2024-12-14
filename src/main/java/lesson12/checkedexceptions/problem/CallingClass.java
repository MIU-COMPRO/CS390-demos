package lesson12.checkedexceptions.problem;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class CallingClass {
	void writeInfo()   {
		//need to handle possible exception
	//	FileWriter fw = new FileWriter("MyFile");  //compiler error
		BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
		try {
			String inp = ob.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
