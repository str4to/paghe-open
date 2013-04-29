package it.iubar.paghe.logic.paghe.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.PaInquadramento;

/**
 * Class _PaRegimefineservizio was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PaRegimefineservizio extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDREGIMEFINESERV_PROPERTY = "idregimefineserv";
    public static final String PA_INQUADRAMENTO_ARRAY_PROPERTY = "paInquadramentoArray";

    public static final String IDREGIMEFINESERV_PK_COLUMN = "IDREGIMEFINESERV";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public Short getIdregimefineserv() {
        return (Short)readProperty("idregimefineserv");
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


}
