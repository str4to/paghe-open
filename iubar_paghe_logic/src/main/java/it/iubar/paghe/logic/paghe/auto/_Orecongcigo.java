package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Cigoacredito;

/**
 * Class _Orecongcigo was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Orecongcigo extends CayenneDataObject {

    public static final String IDDATORETRIBUTIVO_PROPERTY = "iddatoretributivo";
    public static final String IDORECONGCIGO_PROPERTY = "idorecongcigo";
    public static final String NUMAUTORIZZCIGO_PROPERTY = "numautorizzcigo";
    public static final String NUMORECIGO_PROPERTY = "numorecigo";
    public static final String TO_CIGO_ACREDITO_PROPERTY = "toCigoACredito";

    public static final String IDDATORETRIBUTIVO_PK_COLUMN = "IDDATORETRIBUTIVO";
    public static final String IDORECONGCIGO_PK_COLUMN = "IDORECONGCIGO";

    public void setIddatoretributivo(Integer iddatoretributivo) {
        writeProperty("iddatoretributivo", iddatoretributivo);
    }
    public Integer getIddatoretributivo() {
        return (Integer)readProperty("iddatoretributivo");
    }

    public void setIdorecongcigo(Short idorecongcigo) {
        writeProperty("idorecongcigo", idorecongcigo);
    }
    public Short getIdorecongcigo() {
        return (Short)readProperty("idorecongcigo");
    }

    public void setNumautorizzcigo(String numautorizzcigo) {
        writeProperty("numautorizzcigo", numautorizzcigo);
    }
    public String getNumautorizzcigo() {
        return (String)readProperty("numautorizzcigo");
    }

    public void setNumorecigo(BigDecimal numorecigo) {
        writeProperty("numorecigo", numorecigo);
    }
    public BigDecimal getNumorecigo() {
        return (BigDecimal)readProperty("numorecigo");
    }

    public void setToCigoACredito(Cigoacredito toCigoACredito) {
        setToOneTarget("toCigoACredito", toCigoACredito, true);
    }

    public Cigoacredito getToCigoACredito() {
        return (Cigoacredito)readProperty("toCigoACredito");
    }


}
