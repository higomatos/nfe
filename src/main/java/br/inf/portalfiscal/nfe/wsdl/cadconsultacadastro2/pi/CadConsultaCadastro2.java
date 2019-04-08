package br.inf.portalfiscal.nfe.wsdl.cadconsultacadastro2.pi;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CadConsultaCadastro2", targetNamespace = "http://www.portalfiscal.inf.br/nfe/wsdl/CadConsultaCadastro2")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    br.inf.portalfiscal.nfe.ObjectFactory.class,
    br.inf.portalfiscal.nfe.wsdl.cadconsultacadastro2.pi.ObjectFactory.class
})
public interface CadConsultaCadastro2 {


    /**
     * 
     * @param nfeCabecMsg
     * @param nfeDadosMsg
     * @return
     *     returns br.inf.portalfiscal.nfe.wsdl.cadconsultacadastro2.ConsultaCadastro2Result
     */
    @WebMethod(action = "http://www.portalfiscal.inf.br/nfe/wsdl/CadConsultaCadastro2/consultaCadastro2")
    @WebResult(name = "consultaCadastro2Result", targetNamespace = "http://www.portalfiscal.inf.br/nfe/wsdl/CadConsultaCadastro2", partName = "consultaCadastro2Result")
    @Action(input = "http://www.portalfiscal.inf.br/nfe/wsdl/CadConsultaCadastro2/consultaCadastro2", output = "http://www.portalfiscal.inf.br/nfe/wsdl/CadConsultaCadastro2/CadConsultaCadastro2/consultaCadastro2Response")
    public ConsultaCadastro2Result consultaCadastro2(
        @WebParam(name = "nfeDadosMsg", targetNamespace = "http://www.portalfiscal.inf.br/nfe/wsdl/CadConsultaCadastro2", partName = "nfeDadosMsg")
        NfeDadosMsg nfeDadosMsg,
        @WebParam(name = "nfeCabecMsg", targetNamespace = "http://www.portalfiscal.inf.br/nfe/wsdl/CadConsultaCadastro2", header = true, partName = "nfeCabecMsg")
        NfeCabecMsg nfeCabecMsg);

}