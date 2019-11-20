package LambdaDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		processFile();
		String result = processFileF((BufferedReader br) ->br.readLine() + br.readLine());
		System.out.println(result);
		String result2 = processFileF((BufferedReader br) -> br.readLine());
		System.out.println(result2);
	}
	
	public static String processFile() throws IOException{
		File file = new File("F:/MyEclipse/workspace/MyJavaDemo/src/LambdaDemo/data.txt");
		try(BufferedReader br = 
				new BufferedReader(new FileReader(file))){
			br.readLine();
			System.out.println(br.readLine());
		};
		
		return null;
	}
	
	public static String processFileF (BufferedReaderProcessor p) throws IOException{
		File file = new File("F:/MyEclipse/workspace/MyJavaDemo/src/LambdaDemo/data.txt");
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
	        return p.process(br);
	    }
		
	}

}
