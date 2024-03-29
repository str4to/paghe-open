package it.iubar.paghe.logic.anagrafica.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.anagrafica.Lavoratore;

/**
 * Class _Statolavoratore was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Statolavoratore extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDSTATOLAVORATORE_PROPERTY = "idstatolavoratore";
    public static final String LAVORATORE_ARRAY_PROPERTY = "lavoratoreArray";

    public static final String IDSTATOLAVORATORE_PK_COLUMN = "IDSTATOLAVORATORE";

    public void setDescrizione(String descrizione) {
        writeProperty("descrizione", descrizione);
    }
    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public void setIdstatolavoratore(Integer idstatolavoratore) {
        writeProperty("idstatolavoratore", idstatolavoratore);
    }
    public Integer getIdstatolavoratore() {
        return (Integer)readProperty("idstatolavoratore");
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
