package midterm;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class genSnippet {
	public static void main(String[] args) throws IOException {
		String fileName = "input.txt";
		File file = new File(fileName);
		Document document = null;
		document = Jsoup.parse(file, "UTF-8");
        String str=document.text();
        String[] arr=str.split(" ");
        for(int i=0;i<arr.length;i++){
       System.out.println(arr[i]);
        }
		
	}
}
