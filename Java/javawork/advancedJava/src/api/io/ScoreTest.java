package api.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScoreTest {
	public static void main(String[] args) {
		
		BufferedReader br = null;
		double sum= 0.0;
		int cnt= 0;
		try {
			br = new BufferedReader(new FileReader("src/data/score.txt"));
			
			while(true) {
				String data = br.readLine();
				if(data==null) {
					break;
				}
				String[] dataArr = data.split(",");
				
				sum+=Integer.parseInt(dataArr[1].trim());
				cnt++;
				System.out.println(dataArr[0]+"ÀÇ Á¡¼ö´Â "+dataArr[1]+"Á¡");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(br!=null)
				try {
					br.close();
					System.out.println("ÃÑÁ¡:"+sum);
					System.out.println("Æò±Õ:"+sum/cnt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
}
