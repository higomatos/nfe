package br.inf.portalfiscal.nfe.wsdl.nfeautorizacao4.svan.hom;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.inf.portalfiscal.nfe.wsdl.nfeautorizacao4 package. 
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

    private final static QName _NfeDadosMsgZip_QNAME = new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NFeAutorizacao4", "nfeDadosMsgZip");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.inf.portalfiscal.nfe.wsdl.nfeautorizacao4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NfeAutorizacaoLoteZipResult }
     * 
     */
    public NfeAutorizacaoLoteZipResult createNfeAutorizacaoLoteZipResult() {
        return new NfeAutorizacaoLoteZipResult();
    }

    /**
     * Create an instance of {@link NfeDadosMsg }
     * 
     */
    public NfeDadosMsg createNfeDadosMsg() {
        return new NfeDadosMsg();
    }

    /**
     * Create an instance of {@link NfeAutorizacaoLoteResult }
     * 
     */
    public NfeAutorizacaoLoteResult createNfeAutorizacaoLoteResult() {
        return new NfeAutorizacaoLoteResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/nfe/wsdl/NFeAutorizacao4", name = "nfeDadosMsgZip")
    public JAXBElement<String> createNfeDadosMsgZip(String value) {
        return new JAXBElement<String>(_NfeDadosMsgZip_QNAME, String.class, null, value);
    }

}