package br.inf.portalfiscal.nfe.wsdl.nfeautorizacao4;

import com.fincatto.documentofiscal.S3;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.StringWriter;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SOAPHandlerNFeAutorizacaoLog implements SOAPHandler<SOAPMessageContext> {

    @Override
    public Set<QName> getHeaders() {
        return null;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        if ((boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY)) {
            try {
                SOAPEnvelope msg = context.getMessage().getSOAPPart().getEnvelope();
                SOAPBody body = msg.getBody();
                DOMSource source = new DOMSource(body.getFirstChild().getFirstChild());
                StringWriter stringResult = new StringWriter();
                TransformerFactory.newInstance().newTransformer().transform(source, new StreamResult(stringResult));
                System.out.println("envio");
                new S3().sendEnviNFe(stringResult.toString());
            } catch (Exception ex) {
                Logger.getLogger(SOAPHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        return true;
    }

    @Override
    public void close(MessageContext context) {

    }

}
