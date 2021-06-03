package br.inf.portalfiscal.nfe.wsdl.nfeinutilizacao4.nfce.ms;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.inf.portalfiscal.nfe.wsdl.nfeinutilizacao4 package. 
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

    private final static QName _NfeDadosMsg_QNAME = new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NFeInutilizacao4", "nfeDadosMsg");
    private final static QName _NfeCabecMsg_QNAME = new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NFeInutilizacao4", "nfeCabecMsg");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.inf.portalfiscal.nfe.wsdl.nfeinutilizacao4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NfeCabecMsg }
     * 
     */
    public NfeCabecMsg createNfeCabecMsg() {
        return new NfeCabecMsg();
    }

    /**
     * Create an instance of {@link NfeResultMsg }
     * 
     */
    public NfeResultMsg createNfeResultMsg() {
        return new NfeResultMsg();
    }

    /**
     * Create an instance of {@link NfeResultMsg2 }
     * 
     */
    public NfeResultMsg2 createNfeResultMsg2() {
        return new NfeResultMsg2();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NfeResultMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/nfe/wsdl/NFeInutilizacao4", name = "nfeDadosMsg")
    public JAXBElement<NfeResultMsg> createNfeDadosMsg(NfeResultMsg value) {
        return new JAXBElement<NfeResultMsg>(_NfeDadosMsg_QNAME, NfeResultMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NfeCabecMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/nfe/wsdl/NFeInutilizacao4", name = "nfeCabecMsg")
    public JAXBElement<NfeCabecMsg> createNfeCabecMsg(NfeCabecMsg value) {
        return new JAXBElement<NfeCabecMsg>(_NfeCabecMsg_QNAME, NfeCabecMsg.class, null, value);
    }

}
