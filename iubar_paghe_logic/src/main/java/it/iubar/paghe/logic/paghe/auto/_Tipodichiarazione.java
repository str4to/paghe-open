package it.iubar.paghe.logic.paghe.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Dichiarazione;

/**
 * Class _Tipodichiarazione was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Tipodichiarazione extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDTIPODICHIARAZIONE_PROPERTY = "idtipodichiarazione";
    public static final String DICHIARAZIONE_ARRAY_PROPERTY = "dichiarazioneArray";

    public static final String IDTIPODICHIARAZIONE_PK_COLUMN = "IDTIPODICHIARAZIONE";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public Integer getIdtipodichiarazione() {
        return (Integer)readProperty("idtipodichiarazione");
    }

    public void addToDichiarazioneArray(Dichiarazione obj) {
        addToManyTarget("dichiarazioneArray", obj, true);
    }
    public void removeFromDichiarazioneArray(Dichiarazione obj) {
        removeToManyTarget("dichiarazioneArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Dichiarazione> getDichiarazioneArray() {
        return (List<Dichiarazione>)readProperty("dichiarazioneArray");
    }


}
