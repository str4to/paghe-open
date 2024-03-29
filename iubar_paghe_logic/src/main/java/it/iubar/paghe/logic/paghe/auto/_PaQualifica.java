package it.iubar.paghe.logic.paghe.auto;

import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.PaContratto;
import it.iubar.paghe.logic.paghe.PaInquadramento;

/**
 * Class _PaQualifica was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PaQualifica extends CayenneDataObject {

    public static final String AL_PROPERTY = "al";
    public static final String DAL_PROPERTY = "dal";
    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDPACONTRATTO_PROPERTY = "idpacontratto";
    public static final String IDPAQUALIFICA_PROPERTY = "idpaqualifica";
    public static final String PA_INQUADRAMENTO_ARRAY_PROPERTY = "paInquadramentoArray";
    public static final String TO_PA_CONTRATTO_PROPERTY = "toPaContratto";

    public static final String IDPACONTRATTO_PK_COLUMN = "IDPACONTRATTO";
    public static final String IDPAQUALIFICA_PK_COLUMN = "IDPAQUALIFICA";

    public Date getAl() {
        return (Date)readProperty("al");
    }

    public Date getDal() {
        return (Date)readProperty("dal");
    }

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public String getIdpacontratto() {
        return (String)readProperty("idpacontratto");
    }

    public String getIdpaqualifica() {
        return (String)readProperty("idpaqualifica");
    }

    public void addToPaInquadramentoArray(PaInquadramento obj) {
        addToManyTarget("paInquadramentoArray", obj, true);
    }
    public void removeFromPaInquadramentoArray(PaInquadramento obj) {
        removeToManyTarget("paInquadramentoArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<PaInquadramento> getPaInquadramentoArray() {
        return (List<PaInquadramento>)readProperty("paInquadramentoArray");
    }



    public PaContratto getToPaContratto() {
        return (PaContratto)readProperty("toPaContratto");
    }


}
