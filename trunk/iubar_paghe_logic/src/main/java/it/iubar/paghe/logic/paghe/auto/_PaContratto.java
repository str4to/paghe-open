package it.iubar.paghe.logic.paghe.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.PaQualifica;

/**
 * Class _PaContratto was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PaContratto extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDPACONTRATTO_PROPERTY = "idpacontratto";
    public static final String PA_QUALIFICA_ARRAY_PROPERTY = "paQualificaArray";

    public static final String IDPACONTRATTO_PK_COLUMN = "IDPACONTRATTO";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public String getIdpacontratto() {
        return (String)readProperty("idpacontratto");
    }

    public void addToPaQualificaArray(PaQualifica obj) {
        addToManyTarget("paQualificaArray", obj, true);
    }
    public void removeFromPaQualificaArray(PaQualifica obj) {
        removeToManyTarget("paQualificaArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<PaQualifica> getPaQualificaArray() {
        return (List<PaQualifica>)readProperty("paQualificaArray");
    }


}