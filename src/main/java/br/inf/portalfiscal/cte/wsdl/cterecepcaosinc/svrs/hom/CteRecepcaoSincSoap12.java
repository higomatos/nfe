package br.inf.portalfiscal.cte.wsdl.cterecepcaosinc.svrs.hom;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CteRecepcaoSincSoap12", targetNamespace = "http://www.portalfiscal.inf.br/cte/wsdl/CteRecepcaoSinc")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CteRecepcaoSincSoap12 {


    /**
     * 
     * @param cteDadosMsg
     * @return
     *     returns br.inf.portalfiscal.cte.wsdl.cterecepcaosinc.CteRecepcaoSincResult
     */
    @WebMethod(action = "http://www.portalfiscal.inf.br/cte/wsdl/CteRecepcaoSinc/cteRecepcaoSinc")
    @WebResult(name = "cteRecepcaoSincResult", targetNamespace = "http://www.portalfiscal.inf.br/cte/wsdl/CteRecepcaoSinc", partName = "cteRecepcaoSincResult")
    public CteRecepcaoSincResult cteRecepcaoSinc(
        @WebParam(name = "cteDadosMsg", targetNamespace = "http://www.portalfiscal.inf.br/cte/wsdl/CteRecepcaoSinc", partName = "cteDadosMsg")
        String cteDadosMsg);

}
