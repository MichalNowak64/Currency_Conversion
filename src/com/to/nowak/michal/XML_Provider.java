package com.to.nowak.michal;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class XML_Provider implements Provider{

    @Override
    public List<Currency> get_data() {
        List <Currency> lista= new ArrayList<Currency>();
        try {

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(new URL("https://www.nbp.pl/kursy/xml/LastA.xml").openStream());

            //optional, but recommended
            //read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
            doc.getDocumentElement().normalize();

            //System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("pozycja");

            //System.out.println("----------------------------");



            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;
                    lista.add(new Currency(eElement.getElementsByTagName("nazwa_waluty").item(0).getTextContent(),
                                    Integer.parseInt(eElement.getElementsByTagName("przelicznik").item(0).getTextContent()),
                                    eElement.getElementsByTagName("kod_waluty").item(0).getTextContent(),
                                    Double.parseDouble(eElement.getElementsByTagName("kurs_sredni").item(0).getTextContent().replaceAll(",","."))));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    return lista;
    }

}
