package it.iubar.paghe.logic.anagrafica.auto;

import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.anagrafica.Extrace;

/**
 * Class _CoStatusstraniero was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CoStatusstraniero extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDSTATUSSTRANIERO_PROPERTY = "idstatusstraniero";
    public static final String VALIDOAL_PROPERTY = "validoal";
    public static final String VALIDODAL_PROPERTY = "validodal";
    public static final String EXTRA_CE_ARRAY_PROPERTY = "extraCeArray";

    public static final String IDSTATUSSTRANIERO_PK_COLUMN = "IDSTATUSSTRANIERO";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public Short getIdstatusstraniero() {
        return (Short)readProperty("idstatusstraniero");
    }

    public Date getValidoal() {
        return (Date)readProperty("validoal");
    }

    public Date getValidodal() {
        return (Date)readProperty("validodal");
    }

    public void addToExtraCeArray(Extrace obj) {
        addToManyTarget("extraCeArray", obj, true);
    }
    public void removeFromExtraCeArray(Extrace obj) {
        removeToManyTarget("extraCeArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Extrace> getExtraCeArray() {
        return (List<Extrace>)readProperty("extraCeArray");
    }


}