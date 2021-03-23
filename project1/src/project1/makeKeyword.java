package project1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

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
import org.snu.ids.kkma.index.Keyword;
import org.snu.ids.kkma.index.KeywordExtractor;
import org.snu.ids.kkma.index.KeywordList;

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

public class class2 {
	public static void main(String[] args) throws ParserConfigurationException, TransformerException {
		
		String fileName = "collection.xml";
		File file = new File(fileName);
		Document document = null;
		try {
			document = Jsoup.parse(file, "UTF-8");
	       
			
			DocumentBuilderFactory docFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder=docFactory.newDocumentBuilder();
            
            org.w3c.dom.Document doc= docBuilder.newDocument();
            org.w3c.dom.Element docs=doc.createElement("docs");
            doc.appendChild(docs);
          
            Element box0 = document.getElementById("0");
            Elements links0 = document.select("#0 title");
           
            org.w3c.dom.Element doc0=doc.createElement("doc");
	        docs.appendChild(doc0);
	        doc0.setAttribute("id","0");
	        org.w3c.dom.Element title0=doc.createElement("title");
	        title0.appendChild(doc.createTextNode(links0.text()));
	        doc0.appendChild(title0);
	        org.w3c.dom.Element body0=doc.createElement("body");
    		
	            
	        KeywordExtractor ke0 =new KeywordExtractor();
	    	KeywordList kl0=ke0.extractKeyword(box0.text(),true);
	        for(int i=0;i<kl0.size();i++) {
	        	Keyword kwrd0=kl0.get(i);
    			body0.appendChild(doc.createTextNode(kwrd0.getString()+":"+kwrd0.getCnt()+"#"));
    			}
	        doc0.appendChild(body0);
	        
	        Element box1 = document.getElementById("1");
            Elements links1 = document.select("#1 title");
           
            org.w3c.dom.Element doc1=doc.createElement("doc");
	        docs.appendChild(doc1);
	        doc1.setAttribute("id","1");
	        org.w3c.dom.Element title1=doc.createElement("title");
	        title1.appendChild(doc.createTextNode(links1.text()));
	        doc1.appendChild(title1);
	        org.w3c.dom.Element body1=doc.createElement("body");
    		
	            
	        KeywordExtractor ke1 =new KeywordExtractor();
	    	KeywordList kl1=ke1.extractKeyword(box1.text(),true);
	        for(int i=0;i<kl1.size();i++) {
	        	Keyword kwrd1=kl1.get(i);
    			body1.appendChild(doc.createTextNode(kwrd1.getString()+":"+kwrd1.getCnt()+"#"));
    			}
	        doc1.appendChild(body1);
	        
	        Element box2 = document.getElementById("2");
            Elements links2 = document.select("#2 title");
           
            org.w3c.dom.Element doc2=doc.createElement("doc");
	        docs.appendChild(doc2);
	        doc2.setAttribute("id","2");
	        org.w3c.dom.Element title2=doc.createElement("title");
	        title2.appendChild(doc.createTextNode(links2.text()));
	        doc2.appendChild(title2);
	        org.w3c.dom.Element body2=doc.createElement("body");
    		
	            
	        KeywordExtractor ke2 =new KeywordExtractor();
	    	KeywordList kl2=ke2.extractKeyword(box2.text(),true);
	        for(int i=0;i<kl2.size();i++) {
	        	Keyword kwrd2=kl2.get(i);
    			body2.appendChild(doc.createTextNode(kwrd2.getString()+":"+kwrd2.getCnt()+"#"));
    			}
	        doc2.appendChild(body2);
	        		
	        Element box3 = document.getElementById("3");
            Elements links3 = document.select("#3 title");
           
            org.w3c.dom.Element doc3=doc.createElement("doc");
	        docs.appendChild(doc3);
	        doc3.setAttribute("id","3");
	        org.w3c.dom.Element title3=doc.createElement("title");
	        title3.appendChild(doc.createTextNode(links3.text()));
	        doc3.appendChild(title3);
	        org.w3c.dom.Element body3=doc.createElement("body");
    		
	            
	        KeywordExtractor ke3 =new KeywordExtractor();
	    	KeywordList kl3=ke3.extractKeyword(box3.text(),true);
	        for(int i=0;i<kl3.size();i++) {
	        	Keyword kwrd3=kl3.get(i);
    			body3.appendChild(doc.createTextNode(kwrd3.getString()+":"+kwrd3.getCnt()+"#"));
    			}
	        doc3.appendChild(body3);	
	        
	        Element box4 = document.getElementById("4");
            Elements links4 = document.select("#4 title");
           
            org.w3c.dom.Element doc4=doc.createElement("doc");
	        docs.appendChild(doc4);
	        doc4.setAttribute("id","4");
	        org.w3c.dom.Element title4=doc.createElement("title");
	        title4.appendChild(doc.createTextNode(links4.text()));
	        doc4.appendChild(title4);
	        org.w3c.dom.Element body4=doc.createElement("body");
    		
	            
	        KeywordExtractor ke4 =new KeywordExtractor();
	    	KeywordList kl4=ke4.extractKeyword(box4.text(),true);
	        for(int i=0;i<kl4.size();i++) {
	        	Keyword kwrd4=kl4.get(i);
    			body4.appendChild(doc.createTextNode(kwrd4.getString()+":"+kwrd4.getCnt()+"#"));
    			}
	        doc4.appendChild(body4);
	            
	            
    		
    		 TransformerFactory transformerfactory=TransformerFactory.newInstance();
             Transformer transformer=transformerfactory.newTransformer();
             transformer.setOutputProperty(OutputKeys.ENCODING,"UTF-8");
             DOMSource source=new DOMSource(doc);
             StreamResult result=new StreamResult(new FileOutputStream(new File("C:\\Users\\82104\\Documents\\SimpleR\\index.xml")));
             transformer.transform(source, result); 
    		
             
    		

            
          
            
        } catch (IOException e) {
            e.printStackTrace();
        }
 


	 

		
		
		
		
	}
}
