package it.iubar.paghe.logic.paghe.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.PaPosizionesubordinato;

/**
 * Class _PaTipovariazione was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PaTipovariazione extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDTIPOVARIAZIONE_PROPERTY = "idtipovariazione";
    public static final String PA_POSIZIONESUB_ARRAY_PROPERTY = "paPosizionesubArray";

    public static final String IDTIPOVARIAZIONE_PK_COLUMN = "IDTIPOVARIAZIONE";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public Short getIdtipovariazione() {
        return (Short)readProperty("idtipovariazione");
    }

    public void addToPaPosizionesubArray(PaPosizionesubordinato obj) {
        addToManyTarget("paPosizionesubArray", obj, true);
    }
    public void removeFromPaPosizionesubArray(PaPosizionesubordinato obj) {
        removeToManyTarget("paPosizionesubArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<PaPosizionesubordinato> getPaPosizionesubArray() {
        return (List<PaPosizionesubordinato>)readProperty("paPosizionesubArray");
    }


}