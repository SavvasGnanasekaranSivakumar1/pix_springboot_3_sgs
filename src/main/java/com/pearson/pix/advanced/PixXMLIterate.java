package com.pearson.pix.advanced;

import com.google.common.io.Resources;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.InputStream;
import java.net.URL;

public class PixXMLIterate
{
    public static void main(String ar[])throws Exception
    {
        String xmlFileName="classpath:/PIX.xml";
        //readyXML(xmlFileName);
        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory
                .newInstance();
        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
        /*URL resource = Resources.getResource("PIX.xml");
        String file = resource.getFile();*/
        InputStream is = Resources.getResource("PIX.xml").openStream();
        //Document document = docBuilder.parse(new File("PIX.xml"));
        Document document = docBuilder.parse(is);
        doSomething(document.getDocumentElement());
        System.out.println("total Tables :"+totalTables);
    }
    static int totalTables=0;
    public static void doSomething(Node node) {
        // do something with the current node instead of System.out
       // System.out.println(node.getNodeName());
        if(node.getNodeName().equals("opm:class"))
        {
            System.out.println("class : "+node.getChildNodes().item(0).getNodeValue());
        }
        else if(node.getNodeName().equals("opm:alias"))
        {
            System.out.println("Alais name: "+node.getChildNodes().item(0).getNodeValue());
        }
        else if(node.getNodeName().equals("opm:attribute-name"))
        {
            System.out.println("Java Field : "+node.getChildNodes().item(0).getNodeValue());
        }
        else if(node.getNodeName().equals("opm:primary-key"))
        {
            System.out.println("primary Key : "+node.getChildNodes().item(0).getAttributes());
                    //getAttributes().getNamedItem(""));
        }
        else if(node.getNodeName().equals("opm:class-mapping-descriptor"))
        {
            System.out.println("Alais name: "+node.getChildNodes().item(0).getNodeValue());
            totalTables++;
        }
        else if(node.getNodeName().equals("opm:field"))
        {
            System.out.print("table : "+node.getAttributes().getNamedItem("table").getNodeValue()+"\t");
            System.out.print("field : "+node.getAttributes().getNamedItem("name").getNodeValue()+"\n");
        }

        NodeList nodeList = node.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node currentNode = nodeList.item(i);
            if (currentNode.getNodeType() == Node.ELEMENT_NODE) {
                //calls this method for all the children which is Element
                doSomething(currentNode);
            }
        }
    }
}
