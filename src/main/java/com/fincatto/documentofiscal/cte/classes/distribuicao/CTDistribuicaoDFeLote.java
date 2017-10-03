package com.fincatto.documentofiscal.cte.classes.distribuicao;

import java.util.List;

import org.simpleframework.xml.ElementList;

import com.fincatto.documentofiscal.DFBase;

public class CTDistribuicaoDFeLote extends DFBase {

    @ElementList(name = "docZip", inline = true, required = false)
    private List<CTDistribuicaoDocumentoZip> docZip;

    public List<CTDistribuicaoDocumentoZip> getDocZip() {
        return this.docZip;
    }

    public CTDistribuicaoDFeLote setDocZip(final List<CTDistribuicaoDocumentoZip> docZip) {
        this.docZip = docZip;
        return this;
    }
}