package it.iubar.paghe.logic.paghe.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.TfrContribimppreg;

/**
 * Class _TfrTipoimppregcmt was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _TfrTipoimppregcmt extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDTIPOIMPPREGCMT_PROPERTY = "idtipoimppregcmt";
    public static final String TFR_CONTRIBUZ_IMP_PREG_ARRAY_PROPERTY = "tfrContribuzImpPregArray";

    public static final String IDTIPOIMPPREGCMT_PK_COLUMN = "IDTIPOIMPPREGCMT";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public String getIdtipoimppregcmt() {
        return (String)readProperty("idtipoimppregcmt");
    }

    public void addToTfrContribuzImpPregArray(TfrContribimppreg obj) {
        addToManyTarget("tfrContribuzImpPregArray", obj, true);
    }
    public void removeFromTfrContribuzImpPregArray(TfrContribimppreg obj) {
        removeToManyTarget("tfrContribuzImpPregArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<TfrContribimppreg> getTfrContribuzImpPregArray() {
        return (List<TfrContribimppreg>)readProperty("tfrContribuzImpPregArray");
    }


}
