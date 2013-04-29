package it.iubar.paghe.logic.paghe.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.PaPosizionesubordinato;
import it.iubar.paghe.logic.paghe.Posizionesubordinato;

/**
 * Class _PaTipoutilizzo was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PaTipoutilizzo extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDTIPOUTILIZZO_PROPERTY = "idtipoutilizzo";
    public static final String PA_POSIZIONESUB_ARRAY_PROPERTY = "paPosizionesubArray";
    public static final String POSIZIONESUBORDINATO_ARRAY_PROPERTY = "posizionesubordinatoArray";

    public static final String IDTIPOUTILIZZO_PK_COLUMN = "IDTIPOUTILIZZO";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public Short getIdtipoutilizzo() {
        return (Short)readProperty("idtipoutilizzo");
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


    public void addToPosizionesubordinatoArray(Posizionesubordinato obj) {
        addToManyTarget("posizionesubordinatoArray", obj, true);
    }
    public void removeFromPosizionesubordinatoArray(Posizionesubordinato obj) {
        removeToManyTarget("posizionesubordinatoArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Posizionesubordinato> getPosizionesubordinatoArray() {
        return (List<Posizionesubordinato>)readProperty("posizionesubordinatoArray");
    }


}
