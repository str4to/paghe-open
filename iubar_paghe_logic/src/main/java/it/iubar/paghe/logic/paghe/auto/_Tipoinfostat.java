package it.iubar.paghe.logic.paghe.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.DaInfostat;

/**
 * Class _Tipoinfostat was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Tipoinfostat extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDTIPOINFOSTAT_PROPERTY = "idtipoinfostat";
    public static final String DA_INFO_STAT_ARRAY_PROPERTY = "daInfoStatArray";

    public static final String IDTIPOINFOSTAT_PK_COLUMN = "IDTIPOINFOSTAT";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public String getIdtipoinfostat() {
        return (String)readProperty("idtipoinfostat");
    }

    public void addToDaInfoStatArray(DaInfostat obj) {
        addToManyTarget("daInfoStatArray", obj, true);
    }
    public void removeFromDaInfoStatArray(DaInfostat obj) {
        removeToManyTarget("daInfoStatArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<DaInfostat> getDaInfoStatArray() {
        return (List<DaInfostat>)readProperty("daInfoStatArray");
    }


}
