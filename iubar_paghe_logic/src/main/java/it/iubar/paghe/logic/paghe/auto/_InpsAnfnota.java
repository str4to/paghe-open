package it.iubar.paghe.logic.paghe.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.InpsTipoanf;

/**
 * Class _InpsAnfnota was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _InpsAnfnota extends CayenneDataObject {

    public static final String DATAAGGIORNAMENTO_PROPERTY = "dataaggiornamento";
    public static final String IDINPSTIPOANF_PROPERTY = "idinpstipoanf";
    public static final String IDNOTA_PROPERTY = "idnota";
    public static final String NOTA_PROPERTY = "nota";
    public static final String VALIDOAL_PROPERTY = "validoal";
    public static final String VALIDODAL_PROPERTY = "validodal";
    public static final String TO_INPS_TIPOANF_PROPERTY = "toInpsTipoanf";

    public static final String IDINPSTIPOANF_PK_COLUMN = "IDINPSTIPOANF";
    public static final String IDNOTA_PK_COLUMN = "IDNOTA";
    public static final String VALIDODAL_PK_COLUMN = "VALIDODAL";

    public void setDataaggiornamento(Date dataaggiornamento) {
        writeProperty("dataaggiornamento", dataaggiornamento);
    }
    public Date getDataaggiornamento() {
        return (Date)readProperty("dataaggiornamento");
    }

    public void setIdinpstipoanf(String idinpstipoanf) {
        writeProperty("idinpstipoanf", idinpstipoanf);
    }
    public String getIdinpstipoanf() {
        return (String)readProperty("idinpstipoanf");
    }

    public void setIdnota(Short idnota) {
        writeProperty("idnota", idnota);
    }
    public Short getIdnota() {
        return (Short)readProperty("idnota");
    }

    public void setNota(String nota) {
        writeProperty("nota", nota);
    }
    public String getNota() {
        return (String)readProperty("nota");
    }

    public void setValidoal(Date validoal) {
        writeProperty("validoal", validoal);
    }
    public Date getValidoal() {
        return (Date)readProperty("validoal");
    }

    public void setValidodal(Date validodal) {
        writeProperty("validodal", validodal);
    }
    public Date getValidodal() {
        return (Date)readProperty("validodal");
    }

    public void setToInpsTipoanf(InpsTipoanf toInpsTipoanf) {
        setToOneTarget("toInpsTipoanf", toInpsTipoanf, true);
    }

    public InpsTipoanf getToInpsTipoanf() {
        return (InpsTipoanf)readProperty("toInpsTipoanf");
    }


}
