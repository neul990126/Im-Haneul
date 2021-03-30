package project1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;




public class indexer {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fileStream=new FileOutputStream("C:\\Users\\82104\\Documents\\SimpleR\\index.post");
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileStream);
		HashMap map=new HashMap();
		String fileName = "index.xml";
		File file = new File(fileName);
		Document document = null;
		try {
			document = Jsoup.parse(file, "UTF-8");
            Element links0 = document.getElementById("0");
            String str0=links0.text();
			String[] arr0=str0.split("#");
			
			Element links1 = document.getElementById("1");
	        String str1=links1.text();
		    String[] arr1=str1.split("#");
			
			Element links2 = document.getElementById("2");
	        String str2=links2.text();
			String[] arr2=str2.split("#");
			
			Element links3 = document.getElementById("3");
	        String str3=links3.text();
			String[] arr3=str3.split("#");
			
			Element links4 = document.getElementById("4");
	        String str4=links4.text();
			String[] arr4=str4.split("#");
			
			
			List<String> doc0 = Arrays.asList(arr0);
			List<String> doc1 = Arrays.asList(arr1);
			List<String> doc2 = Arrays.asList(arr2);
			List<String> doc3 = Arrays.asList(arr3);
			List<String> doc4 = Arrays.asList(arr4);
		    

			List<List<String>> documents = Arrays.asList(doc0, doc1, doc2, doc3, doc4);

	        TFIDFCalculator calculator = new TFIDFCalculator();
	    
	        
	        
	        double tfidf0 = calculator.tfIdf(documents, arr0[0]);
	        String[] arrr10=arr0[0].split(":");
	        String[] arrrr10=arrr10[0].split(" ");
        	String arrrrr10="0, "+tfidf0;
        	map.put(arrrr10[0], arrrrr10);
        	
	        for(int i=1;i<arr0.length;i++) {
	        	double tfidf = calculator.tfIdf(documents, arr0[i]);
	        	String[] arrr0=arr0[i].split(":");
	        	String arrrr0="0, "+tfidf;
	        	if(map.containsKey(arrr0[0]))  { 
	        		String a=map.get(arrr0[0])+", 0, "+tfidf;
	        		map.put(arrr0[0], a);
	        	 }
	        	else
	        		map.put(arrr0[0], arrrr0);
	        }
	        
	        double tfidf1 = calculator.tfIdf(documents, arr1[0]);
	        String[] arrr11=arr1[0].split(":");
	        String[] arrrr11=arrr11[0].split(" ");
        	String arrrrr11="1, "+tfidf1;
        	map.put(arrrr11[0], arrrrr11);
        	
	        for(int i=1;i<arr1.length;i++) {
		        double tfidf = calculator.tfIdf(documents, arr1[i]);
		        String[] arrr1=arr1[i].split(":");
		        String arrrr1="1, "+tfidf;
		        if(map.containsKey(arrr1[0]))  { 
	        		String a=map.get(arrr1[0])+", 1, "+tfidf;
	        		map.put(arrr1[0], a);
	        	 }
	        	else
	        		map.put(arrr1[0], arrrr1);
		        }
	        
	        double tfidf2 = calculator.tfIdf(documents, arr2[0]);
	        String[] arrr12=arr2[0].split(":");
	        String[] arrrr12=arrr12[0].split(" ");
        	String arrrrr12="2, "+tfidf2;
        	map.put(arrrr12[0], arrrrr12);
	        
	        for(int i=1;i<arr2.length;i++) {
		        double tfidf = calculator.tfIdf(documents, arr2[i]);
		        String[] arrr2=arr2[i].split(":");
		        String arrrr2="2, "+tfidf;
		        if(map.containsKey(arrr2[0]))  { 
	        		String a=map.get(arrr2[0])+", 2, "+tfidf;
	        		map.put(arrr2[0], a);
	        	 }
	        	else
	        		map.put(arrr2[0], arrrr2);
		        }
	        
	        double tfidf3 = calculator.tfIdf(documents, arr3[0]);
	        String[] arrr13=arr3[0].split(":");
	        String[] arrrr13=arrr13[0].split(" ");
        	String arrrrr13="3, "+tfidf3;
        	map.put(arrrr13[0], arrrrr13);
        	
	        for(int i=1;i<arr3.length;i++) {
		        double tfidf = calculator.tfIdf(documents, arr3[i]);
		        String[] arrr3=arr3[i].split(":");
		        String arrrr3="3, "+tfidf;
		        if(map.containsKey(arrr3[0]))  { 
	        		String a=map.get(arrr3[0])+", 3, "+tfidf;
	        		map.put(arrr3[0], a);
	        	 }
	        	else
	        		map.put(arrr3[0], arrrr3);
		        }
	        
	        double tfidf4 = calculator.tfIdf(documents, arr4[0]);
	        String[] arrr14=arr4[0].split(":");
	        String[] arrrr14=arrr14[0].split(" ");
        	String arrrrr14="4, "+tfidf4;
        	map.put(arrrr14[1], arrrrr14);
        	
	        for(int i=1;i<arr4.length;i++) {
		        double tfidf = calculator.tfIdf(documents, arr4[i]);
		        String[] arrr4=arr4[i].split(":");
		        String arrrr4="4, "+tfidf;
		        if(map.containsKey(arrr4[0]))  { 
	        		String a= map.get(arrr4[0])+", 4, "+tfidf;
	        		map.put(arrr4[0], a);
	        	 }
	        	else
	        		map.put(arrr4[0], arrrr4);
		        }
	        
	      
	        objectOutputStream.writeObject(map);
	        objectOutputStream.close();

	        FileInputStream fileStream1=new FileInputStream("C:\\Users\\82104\\Documents\\SimpleR\\index.post");
			ObjectInputStream objectInputStream=new ObjectInputStream(fileStream1);

			Object object1=objectInputStream.readObject();
			objectInputStream.close();
			
			HashMap map1=(HashMap)object1;
			Iterator<String> it=map1.keySet().iterator();
			while(it.hasNext()) {
				String key=it.next();
				String value=(String)map1.get(key);
				System.out.println(key+" ¡æ ["+value+"]");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
class TFIDFCalculator {
   
    public double tf(List<String> doc, String term) {
        double result = 0;
        for (String word : doc) {
            if (term.equalsIgnoreCase(word))
                result++;
        }
        return result / doc.size();
    }

 


	public double tfIdf(List<List<String>> documents, String string) {
		 double n = 0;
	        for (List<String> doc : documents) {
	            for (String word : doc) {
	                if (string.equalsIgnoreCase(word)) {
	                    n++;
	                    break;
	                }
	            }
	        }
	        return Math.round(Math.log(documents.size() / n)*100)/100.0;
	}




	public double idf(List<List<String>> docs, String term) {
        double n = 0;
        for (List<String> doc : docs) {
            for (String word : doc) {
                if (term.equalsIgnoreCase(word)) {
                    n++;
                    break;
                }
            }
        }
        return Math.log(docs.size() / n);
    }
    }