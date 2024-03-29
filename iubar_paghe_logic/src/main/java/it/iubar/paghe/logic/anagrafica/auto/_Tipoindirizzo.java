package it.iubar.paghe.logic.anagrafica.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.anagrafica.Indirizzo;

/**
 * Class _Tipoindirizzo was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Tipoindirizzo extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDTIPOINDIRIZZO_PROPERTY = "idtipoindirizzo";
    public static final String INDIRIZZO_ARRAY_PROPERTY = "indirizzoArray";

    public static final String IDTIPOINDIRIZZO_PK_COLUMN = "IDTIPOINDIRIZZO";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public Short getIdtipoindirizzo() {
        return (Short)readProperty("idtipoindirizzo");
    }

    public void addToIndirizzoArray(Indirizzo obj) {
        addToManyTarget("indirizzoArray", obj, true);
    }
    public void removeFromIndirizzoArray(Indirizzo obj) {
        removeToManyTarget("indirizzoArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Indirizzo> getIndirizzoArray() {
        return (List<Indirizzo>)readProperty("indirizzoArray");
    }


}
