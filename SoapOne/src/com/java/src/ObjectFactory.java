
package com.java.src;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the src.com package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IllegalInputException_QNAME = new QName("http://com.src/", "IllegalInputException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: src.com
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IllegalInputException }
     * 
     */
    public IllegalInputException createIllegalInputException() {
        return new IllegalInputException();
    }

    /**
     * Create an instance of {@link ArrayList }
     * 
     */
    public ArrayList createArrayList() {
        return new ArrayList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IllegalInputException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.src/", name = "IllegalInputException")
    public JAXBElement<IllegalInputException> createIllegalInputException(IllegalInputException value) {
        return new JAXBElement<IllegalInputException>(_IllegalInputException_QNAME, IllegalInputException.class, null, value);
    }

}
