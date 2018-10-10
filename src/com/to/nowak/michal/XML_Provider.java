package com.to.nowak.michal;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.net.*;
import java.io.*;

public class XML_Provider implements Provider{

    @Override
    public void get_data() {
        try {

            //File fXmlFile = new File("/Users/mkyong/staff.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            //Document doc = dBuilder.parse(fXmlFile);
            Document doc = dBuilder.parse(new URL("https://www.nbp.pl/kursy/xml/LastA.xml").openStream());

            //optional, but recommended
            //read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
            doc.getDocumentElement().normalize();

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("pozycja");

            System.out.println("----------------------------");

            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);

                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    System.out.println("nazwa_waluty : " + eElement.getElementsByTagName("nazwa_waluty").item(0).getTextContent());
                    System.out.println("przelicznik : " + eElement.getElementsByTagName("przelicznik").item(0).getTextContent());
                    System.out.println("kod_waluty : " + eElement.getElementsByTagName("kod_waluty").item(0).getTextContent());
                    System.out.println("kurs_sredni : " + eElement.getElementsByTagName("kurs_sredni").item(0).getTextContent());

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
