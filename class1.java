package project1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;



 


public class class1 {
	
	
	public static void main(String[] args) throws ParserConfigurationException, TransformerException {
		
		String fileName0 = "라면.html";
		String fileName1 = "초밥.html";
		String fileName2 = "떡.html";
		String fileName3 = "파스타.html";
		String fileName4 = "아이스크림.html";
        File file0 = new File(fileName0);
        File file1 = new File(fileName1);
        File file2 = new File(fileName2);
        File file3 = new File(fileName3);
        File file4 = new File(fileName4);
        Document document = null;
        try {
            document = Jsoup.parse(file0, "UTF-8");
            Elements links0 = document.select("title");
            for (Element link0 : links0) {
                System.out.println(link0.text());
            }
            // getElementById로 태그 읽기
            // 리턴값이 Element타입이다.
            Element box0 = document.getElementById("content");
            System.out.println(box0.text());  
            
            document = Jsoup.parse(file1, "UTF-8");
            Elements links1 = document.select("title");
            for (Element link1 : links1) {
                System.out.println(link1.text());
            }
            // getElementById로 태그 읽기
            // 리턴값이 Element타입이다.
            Element box1 = document.getElementById("content");
            System.out.println(box1.text());  
            
            document = Jsoup.parse(file2, "UTF-8");
            Elements links2 = document.select("title");
            for (Element link2 : links2) {
                System.out.println(link2.text());
            }
            // getElementById로 태그 읽기
            // 리턴값이 Element타입이다.
            Element box2 = document.getElementById("content");
            System.out.println(box2.text());  
            
            document = Jsoup.parse(file3, "UTF-8");
            Elements links3 = document.select("title");
            for (Element link3 : links3) {
                System.out.println(link3.text());
            }
            // getElementById로 태그 읽기
            // 리턴값이 Element타입이다.
            Element box3 = document.getElementById("content");
            System.out.println(box3.text());  
            
            document = Jsoup.parse(file4, "UTF-8");
            Elements links4 = document.select("title");
            for (Element link4 : links4) {
                System.out.println(link4.text());
            }
            // getElementById로 태그 읽기
            // 리턴값이 Element타입이다.
            Element box4 = document.getElementById("content");
            System.out.println(box4.text());  
            
            
            DocumentBuilderFactory docFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder=docFactory.newDocumentBuilder();
            
            org.w3c.dom.Document doc= docBuilder.newDocument();
            
            org.w3c.dom.Element docs=doc.createElement("docs");
            doc.appendChild(docs);
            org.w3c.dom.Element doc0=doc.createElement("doc");
            docs.appendChild(doc0);
            doc0.setAttribute("id","0");
            org.w3c.dom.Element title0=doc.createElement("title");
            title0.appendChild(doc.createTextNode(links0.text()));
            doc0.appendChild(title0);
            org.w3c.dom.Element body0=doc.createElement("body");
            body0.appendChild(doc.createTextNode(box0.text()));
            doc0.appendChild(body0);
            
            org.w3c.dom.Element doc1=doc.createElement("doc");
            docs.appendChild(doc1);
            doc1.setAttribute("id","1");
            org.w3c.dom.Element title1=doc.createElement("title");
            title1.appendChild(doc.createTextNode(links1.text()));
            doc1.appendChild(title1);
            org.w3c.dom.Element body1=doc.createElement("body");
            body1.appendChild(doc.createTextNode(box1.text()));
            doc1.appendChild(body1);
            
            org.w3c.dom.Element doc2=doc.createElement("doc");
            docs.appendChild(doc2);
            doc2.setAttribute("id","2");
            org.w3c.dom.Element title2=doc.createElement("title");
            title2.appendChild(doc.createTextNode(links2.text()));
            doc2.appendChild(title2);
            org.w3c.dom.Element body2=doc.createElement("body");
            body2.appendChild(doc.createTextNode(box2.text()));
            doc2.appendChild(body2);
            
            org.w3c.dom.Element doc3=doc.createElement("doc");
            docs.appendChild(doc3);
            doc3.setAttribute("id","3");
            org.w3c.dom.Element title3=doc.createElement("title");
            title3.appendChild(doc.createTextNode(links3.text()));
            doc3.appendChild(title3);
            org.w3c.dom.Element body3=doc.createElement("body");
            body3.appendChild(doc.createTextNode(box3.text()));
            doc3.appendChild(body3);
            
            org.w3c.dom.Element doc4=doc.createElement("doc");
            docs.appendChild(doc4);
            doc4.setAttribute("id","4");
            org.w3c.dom.Element title4=doc.createElement("title");
            title4.appendChild(doc.createTextNode(links4.text()));
            doc4.appendChild(title4);
            org.w3c.dom.Element body4=doc.createElement("body");
            body4.appendChild(doc.createTextNode(box4.text()));
            doc4.appendChild(body4);
            
           TransformerFactory transformerfactory=TransformerFactory.newInstance();
           Transformer transformer=transformerfactory.newTransformer();
           transformer.setOutputProperty(OutputKeys.ENCODING,"UTF-8");
           DOMSource source=new DOMSource(doc);
           StreamResult result=new StreamResult(new FileOutputStream(new File("C:\\Users\\82104\\Documents\\SimpleR\\Output.xml")));
           transformer.transform(source, result); 
            
        } catch (IOException e) {
            e.printStackTrace();
        }
       
	}
	}

	





