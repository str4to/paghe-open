package it.iubar.paghe.logic.paghe.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Co;

/**
 * Class _CoTipocomunicazione was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CoTipocomunicazione extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDTIPOCOMUNICAZIONE_PROPERTY = "idtipocomunicazione";
    public static final String CO_ARRAY_PROPERTY = "coArray";

    public static final String IDTIPOCOMUNICAZIONE_PK_COLUMN = "IDTIPOCOMUNICAZIONE";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public Short getIdtipocomunicazione() {
        return (Short)readProperty("idtipocomunicazione");
    }

    public void addToCoArray(Co obj) {
        addToManyTarget("coArray", obj, true);
    }
    public void removeFromCoArray(Co obj) {
        removeToManyTarget("coArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Co> getCoArray() {
        return (List<Co>)readProperty("coArray");
    }


}
