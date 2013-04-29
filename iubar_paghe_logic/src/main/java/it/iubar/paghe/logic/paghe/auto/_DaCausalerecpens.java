package it.iubar.paghe.logic.paghe.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.DaRecuperopensbancari;

/**
 * Class _DaCausalerecpens was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _DaCausalerecpens extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDCAUSALERECPENS_PROPERTY = "idcausalerecpens";
    public static final String DA_RECUPERO_PENS_BANCARI_ARRAY_PROPERTY = "daRecuperoPensBancariArray";

    public static final String IDCAUSALERECPENS_PK_COLUMN = "IDCAUSALERECPENS";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public String getIdcausalerecpens() {
        return (String)readProperty("idcausalerecpens");
    }

    public void addToDaRecuperoPensBancariArray(DaRecuperopensbancari obj) {
        addToManyTarget("daRecuperoPensBancariArray", obj, true);
    }
    public void removeFromDaRecuperoPensBancariArray(DaRecuperopensbancari obj) {
        removeToManyTarget("daRecuperoPensBancariArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<DaRecuperopensbancari> getDaRecuperoPensBancariArray() {
        return (List<DaRecuperopensbancari>)readProperty("daRecuperoPensBancariArray");
    }


}
