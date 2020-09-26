package com.study.amdoc;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.w3c.dom.Document;

public class XMLToCSV {

		 public static void main(String args[]) throws Exception {
			  File stylesheet = new File("C:/Users/m.bm.kumar/eclipse-workspace/Project_ISP/inputData2.xsl");
			  File xmlSource = new File("C:/Users/m.bm.kumar/eclipse-workspace/Project_ISP/InputData2.xml");

			  DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			  DocumentBuilder builder = factory.newDocumentBuilder();
			  Document document = builder.parse(xmlSource);

			  StreamSource stylesource = new StreamSource(stylesheet);
			  Transformer transformer = TransformerFactory.newInstance().newTransformer(stylesource);
			  Source source = new DOMSource(document);
			  Result outputTarget = new StreamResult(new File("C:/Users/m.bm.kumar/Desktop/out.csv"));
			  transformer.transform(source, outputTarget);
			 }
}
