package br.inf.portalfiscal.nfe.wsdl.nfeconsultaprotocolo4.nfce.svrs.hom;

import java.net.MalformedURLException;
import java.net.URL;
import javax.jws.HandlerChain;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "NFeConsultaProtocolo4", targetNamespace = "http://www.portalfiscal.inf.br/nfe/wsdl/NFeConsultaProtocolo4", wsdlLocation = "https://nfce-homologacao.svrs.rs.gov.br/ws/NfeConsulta/NfeConsulta4.asmx?WSDL")
@HandlerChain(file="handler.xml")
public class NFeConsultaProtocolo4
    extends Service
{

    private final static URL NFECONSULTAPROTOCOLO4_WSDL_LOCATION;
    private final static WebServiceException NFECONSULTAPROTOCOLO4_EXCEPTION;
    private final static QName NFECONSULTAPROTOCOLO4_QNAME = new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NFeConsultaProtocolo4", "NFeConsultaProtocolo4");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://nfce-homologacao.svrs.rs.gov.br/ws/NfeConsulta/NfeConsulta4.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        NFECONSULTAPROTOCOLO4_WSDL_LOCATION = url;
        NFECONSULTAPROTOCOLO4_EXCEPTION = e;
    }

    public NFeConsultaProtocolo4() {
        super(__getWsdlLocation(), NFECONSULTAPROTOCOLO4_QNAME);
    }

    public NFeConsultaProtocolo4(WebServiceFeature... features) {
        super(__getWsdlLocation(), NFECONSULTAPROTOCOLO4_QNAME, features);
    }

    public NFeConsultaProtocolo4(URL wsdlLocation) {
        super(wsdlLocation, NFECONSULTAPROTOCOLO4_QNAME);
    }

    public NFeConsultaProtocolo4(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, NFECONSULTAPROTOCOLO4_QNAME, features);
    }

    public NFeConsultaProtocolo4(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NFeConsultaProtocolo4(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns NFeConsultaProtocolo4Soap
     */
    @WebEndpoint(name = "NFeConsultaProtocolo4Soap")
    public NFeConsultaProtocolo4Soap getNFeConsultaProtocolo4Soap() {
        return super.getPort(new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NFeConsultaProtocolo4", "NFeConsultaProtocolo4Soap"), NFeConsultaProtocolo4Soap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NFeConsultaProtocolo4Soap
     */
    @WebEndpoint(name = "NFeConsultaProtocolo4Soap")
    public NFeConsultaProtocolo4Soap getNFeConsultaProtocolo4Soap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NFeConsultaProtocolo4", "NFeConsultaProtocolo4Soap"), NFeConsultaProtocolo4Soap.class, features);
    }

    /**
     * 
     * @return
     *     returns NFeConsultaProtocolo4Soap
     */
    @WebEndpoint(name = "NFeConsultaProtocolo4Soap12")
    public NFeConsultaProtocolo4Soap getNFeConsultaProtocolo4Soap12() {
        return super.getPort(new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NFeConsultaProtocolo4", "NFeConsultaProtocolo4Soap12"), NFeConsultaProtocolo4Soap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NFeConsultaProtocolo4Soap
     */
    @WebEndpoint(name = "NFeConsultaProtocolo4Soap12")
    public NFeConsultaProtocolo4Soap getNFeConsultaProtocolo4Soap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NFeConsultaProtocolo4", "NFeConsultaProtocolo4Soap12"), NFeConsultaProtocolo4Soap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (NFECONSULTAPROTOCOLO4_EXCEPTION!= null) {
            throw NFECONSULTAPROTOCOLO4_EXCEPTION;
        }
        return NFECONSULTAPROTOCOLO4_WSDL_LOCATION;
    }

}
