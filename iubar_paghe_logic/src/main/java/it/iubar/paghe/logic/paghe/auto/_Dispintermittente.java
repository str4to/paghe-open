package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Datoparticolare;

/**
 * Class _Dispintermittente was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Dispintermittente extends CayenneDataObject {

    public static final String IDDATORETRIBUTIVO_PROPERTY = "iddatoretributivo";
    public static final String IMPORTO_PROPERTY = "importo";
    public static final String NUMSETTIMANE_PROPERTY = "numsettimane";
    public static final String SETTIMANEINPS_PROPERTY = "settimaneinps";
    public static final String TO_DATOPARTICOLARE_PROPERTY = "toDatoparticolare";

    public static final String IDDATORETRIBUTIVO_PK_COLUMN = "IDDATORETRIBUTIVO";

    public void setIddatoretributivo(Integer iddatoretributivo) {
        writeProperty("iddatoretributivo", iddatoretributivo);
    }
    public Integer getIddatoretributivo() {
        return (Integer)readProperty("iddatoretributivo");
    }

    public void setImporto(BigDecimal importo) {
        writeProperty("importo", importo);
    }
    public BigDecimal getImporto() {
        return (BigDecimal)readProperty("importo");
    }

    public void setNumsettimane(Short numsettimane) {
        writeProperty("numsettimane", numsettimane);
    }
    public Short getNumsettimane() {
        return (Short)readProperty("numsettimane");
    }

    public void setSettimaneinps(BigDecimal settimaneinps) {
        writeProperty("settimaneinps", settimaneinps);
    }
    public BigDecimal getSettimaneinps() {
        return (BigDecimal)readProperty("settimaneinps");
    }

    public void setToDatoparticolare(Datoparticolare toDatoparticolare) {
        setToOneTarget("toDatoparticolare", toDatoparticolare, true);
    }

    public Datoparticolare getToDatoparticolare() {
        return (Datoparticolare)readProperty("toDatoparticolare");
    }


}
