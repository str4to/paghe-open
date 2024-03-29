package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _IrpefScaglione was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _IrpefScaglione extends CayenneDataObject {

    public static final String ALIQUOTA_PROPERTY = "aliquota";
    public static final String ANNO_PROPERTY = "anno";
    public static final String IDSCAGLIONE_PROPERTY = "idscaglione";
    public static final String NOTE_PROPERTY = "note";
    public static final String REDDITOA_PROPERTY = "redditoa";
    public static final String REDDITODA_PROPERTY = "redditoda";
    public static final String ULTIMOAGGIORNAMENTO_PROPERTY = "ultimoaggiornamento";
    public static final String VALIDOAL_PROPERTY = "validoal";
    public static final String VALIDODAL_PROPERTY = "validodal";

    public static final String ANNO_PK_COLUMN = "ANNO";
    public static final String IDSCAGLIONE_PK_COLUMN = "IDSCAGLIONE";
    public static final String REDDITODA_PK_COLUMN = "REDDITODA";

    public BigDecimal getAliquota() {
        return (BigDecimal)readProperty("aliquota");
    }

    public Integer getAnno() {
        return (Integer)readProperty("anno");
    }

    public Short getIdscaglione() {
        return (Short)readProperty("idscaglione");
    }

    public String getNote() {
        return (String)readProperty("note");
    }

    public BigDecimal getRedditoa() {
        return (BigDecimal)readProperty("redditoa");
    }

    public BigDecimal getRedditoda() {
        return (BigDecimal)readProperty("redditoda");
    }

    public Date getUltimoaggiornamento() {
        return (Date)readProperty("ultimoaggiornamento");
    }

    public Date getValidoal() {
        return (Date)readProperty("validoal");
    }

    public Date getValidodal() {
        return (Date)readProperty("validodal");
    }

}
