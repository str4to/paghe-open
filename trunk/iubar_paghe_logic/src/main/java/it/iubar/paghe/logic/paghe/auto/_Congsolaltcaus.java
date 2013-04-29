package it.iubar.paghe.logic.paghe.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Congsolaltro;

/**
 * Class _Congsolaltcaus was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Congsolaltcaus extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String CONGSOLALTRO_ARRAY_PROPERTY = "congsolaltroArray";

    public static final String IDCAUSALE_PK_COLUMN = "IDCAUSALE";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public void addToCongsolaltroArray(Congsolaltro obj) {
        addToManyTarget("congsolaltroArray", obj, true);
    }
    public void removeFromCongsolaltroArray(Congsolaltro obj) {
        removeToManyTarget("congsolaltroArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Congsolaltro> getCongsolaltroArray() {
        return (List<Congsolaltro>)readProperty("congsolaltroArray");
    }


}