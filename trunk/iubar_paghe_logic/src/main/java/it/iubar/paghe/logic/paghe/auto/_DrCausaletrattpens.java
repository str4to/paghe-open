package it.iubar.paghe.logic.paghe.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Fondidiversi;

/**
 * Class _DrCausaletrattpens was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _DrCausaletrattpens extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDCAUSALETRATTPENS_PROPERTY = "idcausaletrattpens";
    public static final String FONDI_DIVERSI_ARRAY_PROPERTY = "fondiDiversiArray";

    public static final String IDCAUSALETRATTPENS_PK_COLUMN = "IDCAUSALETRATTPENS";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public String getIdcausaletrattpens() {
        return (String)readProperty("idcausaletrattpens");
    }

    public void addToFondiDiversiArray(Fondidiversi obj) {
        addToManyTarget("fondiDiversiArray", obj, true);
    }
    public void removeFromFondiDiversiArray(Fondidiversi obj) {
        removeToManyTarget("fondiDiversiArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Fondidiversi> getFondiDiversiArray() {
        return (List<Fondidiversi>)readProperty("fondiDiversiArray");
    }


}
