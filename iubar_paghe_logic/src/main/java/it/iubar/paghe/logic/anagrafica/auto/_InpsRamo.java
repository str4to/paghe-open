package it.iubar.paghe.logic.anagrafica.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.anagrafica.InpsClasse;
import it.iubar.paghe.logic.anagrafica.InpsCsc;

/**
 * Class _InpsRamo was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _InpsRamo extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDINPSRAMO_PROPERTY = "idinpsramo";
    public static final String CLASSE_ARRAY_PROPERTY = "classeArray";
    public static final String CSC_ARRAY_PROPERTY = "cscArray";

    public static final String IDINPSRAMO_PK_COLUMN = "IDINPSRAMO";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public Short getIdinpsramo() {
        return (Short)readProperty("idinpsramo");
    }

    public void addToClasseArray(InpsClasse obj) {
        addToManyTarget("classeArray", obj, true);
    }
    public void removeFromClasseArray(InpsClasse obj) {
        removeToManyTarget("classeArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<InpsClasse> getClasseArray() {
        return (List<InpsClasse>)readProperty("classeArray");
    }


    public void addToCscArray(InpsCsc obj) {
        addToManyTarget("cscArray", obj, true);
    }
    public void removeFromCscArray(InpsCsc obj) {
        removeToManyTarget("cscArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<InpsCsc> getCscArray() {
        return (List<InpsCsc>)readProperty("cscArray");
    }


}
