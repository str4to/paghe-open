package it.iubar.paghe.logic.paghe.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.DaAziendatfr;

/**
 * Class _TfrCausalevers was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _TfrCausalevers extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDCAUSALEVERS_PROPERTY = "idcausalevers";
    public static final String DA_AZIENDA_TFR_ARRAY1_PROPERTY = "daAziendaTfrArray1";
    public static final String DA_AZIENDA_TFR_ARRAY2_PROPERTY = "daAziendaTfrArray2";

    public static final String IDCAUSALEVERS_PK_COLUMN = "IDCAUSALEVERS";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public String getIdcausalevers() {
        return (String)readProperty("idcausalevers");
    }

    public void addToDaAziendaTfrArray1(DaAziendatfr obj) {
        addToManyTarget("daAziendaTfrArray1", obj, true);
    }
    public void removeFromDaAziendaTfrArray1(DaAziendatfr obj) {
        removeToManyTarget("daAziendaTfrArray1", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<DaAziendatfr> getDaAziendaTfrArray1() {
        return (List<DaAziendatfr>)readProperty("daAziendaTfrArray1");
    }


    public void addToDaAziendaTfrArray2(DaAziendatfr obj) {
        addToManyTarget("daAziendaTfrArray2", obj, true);
    }
    public void removeFromDaAziendaTfrArray2(DaAziendatfr obj) {
        removeToManyTarget("daAziendaTfrArray2", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<DaAziendatfr> getDaAziendaTfrArray2() {
        return (List<DaAziendatfr>)readProperty("daAziendaTfrArray2");
    }


}
