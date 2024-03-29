package it.iubar.paghe.logic.anagrafica.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.anagrafica.Lavoratore;

/**
 * Class _Tipolavoratorestat was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Tipolavoratorestat extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDTIPOLAVORATORESTAT_PROPERTY = "idtipolavoratorestat";
    public static final String LAVORATORE_ARRAY_PROPERTY = "lavoratoreArray";

    public static final String IDTIPOLAVORATORESTAT_PK_COLUMN = "IDTIPOLAVORATORESTAT";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public String getIdtipolavoratorestat() {
        return (String)readProperty("idtipolavoratorestat");
    }

    public void addToLavoratoreArray(Lavoratore obj) {
        addToManyTarget("lavoratoreArray", obj, true);
    }
    public void removeFromLavoratoreArray(Lavoratore obj) {
        removeToManyTarget("lavoratoreArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Lavoratore> getLavoratoreArray() {
        return (List<Lavoratore>)readProperty("lavoratoreArray");
    }


}
