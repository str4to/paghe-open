package it.iubar.paghe.logic.paghe.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.PaInquadramento;

/**
 * Class _PaTiposervizioaltro was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PaTiposervizioaltro extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDTIPOSERVIZIOALTRO_PROPERTY = "idtiposervizioaltro";
    public static final String PA_INQUADRAMENTO_ARRAY1_PROPERTY = "paInquadramentoArray1";
    public static final String PA_INQUADRAMENTO_ARRAY2_PROPERTY = "paInquadramentoArray2";

    public static final String IDTIPOSERVIZIOALTRO_PK_COLUMN = "IDTIPOSERVIZIOALTRO";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public Short getIdtiposervizioaltro() {
        return (Short)readProperty("idtiposervizioaltro");
    }

    public void addToPaInquadramentoArray1(PaInquadramento obj) {
        addToManyTarget("paInquadramentoArray1", obj, true);
    }
    public void removeFromPaInquadramentoArray1(PaInquadramento obj) {
        removeToManyTarget("paInquadramentoArray1", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<PaInquadramento> getPaInquadramentoArray1() {
        return (List<PaInquadramento>)readProperty("paInquadramentoArray1");
    }


    public void addToPaInquadramentoArray2(PaInquadramento obj) {
        addToManyTarget("paInquadramentoArray2", obj, true);
    }
    public void removeFromPaInquadramentoArray2(PaInquadramento obj) {
        removeToManyTarget("paInquadramentoArray2", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<PaInquadramento> getPaInquadramentoArray2() {
        return (List<PaInquadramento>)readProperty("paInquadramentoArray2");
    }


}