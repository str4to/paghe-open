package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Datoretributivo;
import it.iubar.paghe.logic.paghe.DrEntefinanziatore;
import it.iubar.paghe.logic.paghe.DrTipoincentivo;

/**
 * Class _DrIncentivo was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _DrIncentivo extends CayenneDataObject {

    public static final String IDDATORETRIBUTIVO_PROPERTY = "iddatoretributivo";
    public static final String IDENTEFINANZIATORE_PROPERTY = "identefinanziatore";
    public static final String IDTIPOINCENTIVO_PROPERTY = "idtipoincentivo";
    public static final String IMPORTOARR_PROPERTY = "importoarr";
    public static final String IMPORTOCORR_PROPERTY = "importocorr";
    public static final String TO_DATORETRIBUTIVO_PROPERTY = "toDatoretributivo";
    public static final String TO_ENTEFINANZIATORE_PROPERTY = "toEntefinanziatore";
    public static final String TO_TIPOINCENTIVO_PROPERTY = "toTipoincentivo";

    public static final String IDDATORETRIBUTIVO_PK_COLUMN = "IDDATORETRIBUTIVO";
    public static final String IDENTEFINANZIATORE_PK_COLUMN = "IDENTEFINANZIATORE";
    public static final String IDTIPOINCENTIVO_PK_COLUMN = "IDTIPOINCENTIVO";

    public void setIddatoretributivo(Integer iddatoretributivo) {
        writeProperty("iddatoretributivo", iddatoretributivo);
    }
    public Integer getIddatoretributivo() {
        return (Integer)readProperty("iddatoretributivo");
    }

    public void setIdentefinanziatore(String identefinanziatore) {
        writeProperty("identefinanziatore", identefinanziatore);
    }
    public String getIdentefinanziatore() {
        return (String)readProperty("identefinanziatore");
    }

    public void setIdtipoincentivo(String idtipoincentivo) {
        writeProperty("idtipoincentivo", idtipoincentivo);
    }
    public String getIdtipoincentivo() {
        return (String)readProperty("idtipoincentivo");
    }

    public void setImportoarr(BigDecimal importoarr) {
        writeProperty("importoarr", importoarr);
    }
    public BigDecimal getImportoarr() {
        return (BigDecimal)readProperty("importoarr");
    }

    public void setImportocorr(BigDecimal importocorr) {
        writeProperty("importocorr", importocorr);
    }
    public BigDecimal getImportocorr() {
        return (BigDecimal)readProperty("importocorr");
    }

    public void setToDatoretributivo(Datoretributivo toDatoretributivo) {
        setToOneTarget("toDatoretributivo", toDatoretributivo, true);
    }

    public Datoretributivo getToDatoretributivo() {
        return (Datoretributivo)readProperty("toDatoretributivo");
    }


    public void setToEntefinanziatore(DrEntefinanziatore toEntefinanziatore) {
        setToOneTarget("toEntefinanziatore", toEntefinanziatore, true);
    }

    public DrEntefinanziatore getToEntefinanziatore() {
        return (DrEntefinanziatore)readProperty("toEntefinanziatore");
    }


    public void setToTipoincentivo(DrTipoincentivo toTipoincentivo) {
        setToOneTarget("toTipoincentivo", toTipoincentivo, true);
    }

    public DrTipoincentivo getToTipoincentivo() {
        return (DrTipoincentivo)readProperty("toTipoincentivo");
    }


}