package it.iubar.paghe.logic.paghe.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Posizionesubordinato;

/**
 * Class _InpsTipoapprendistato was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _InpsTipoapprendistato extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDINPSTIPOAPPRENDISTATO_PROPERTY = "idinpstipoapprendistato";
    public static final String POSIZIONESUBORDINATO_ARRAY_PROPERTY = "posizionesubordinatoArray";

    public static final String IDINPSTIPOAPPRENDISTATO_PK_COLUMN = "IDINPSTIPOAPPRENDISTATO";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public String getIdinpstipoapprendistato() {
        return (String)readProperty("idinpstipoapprendistato");
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