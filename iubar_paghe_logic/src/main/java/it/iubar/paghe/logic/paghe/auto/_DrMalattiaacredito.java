package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.DrMalattia;

/**
 * Class _DrMalattiaacredito was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _DrMalattiaacredito extends CayenneDataObject {

    public static final String IDDATORETRIBUTIVO_PROPERTY = "iddatoretributivo";
    public static final String INDENNITAMALATTIA_PROPERTY = "indennitamalattia";
    public static final String INDENNITAMALATTIA8788_PROPERTY = "indennitamalattia8788";
    public static final String TO_DR_MALATTIA_PROPERTY = "toDrMalattia";

    public static final String IDDATORETRIBUTIVO_PK_COLUMN = "IDDATORETRIBUTIVO";

    public void setIddatoretributivo(Integer iddatoretributivo) {
        writeProperty("iddatoretributivo", iddatoretributivo);
    }
    public Integer getIddatoretributivo() {
        return (Integer)readProperty("iddatoretributivo");
    }

    public void setIndennitamalattia(BigDecimal indennitamalattia) {
        writeProperty("indennitamalattia", indennitamalattia);
    }
    public BigDecimal getIndennitamalattia() {
        return (BigDecimal)readProperty("indennitamalattia");
    }

    public void setIndennitamalattia8788(BigDecimal indennitamalattia8788) {
        writeProperty("indennitamalattia8788", indennitamalattia8788);
    }
    public BigDecimal getIndennitamalattia8788() {
        return (BigDecimal)readProperty("indennitamalattia8788");
    }

    public void setToDrMalattia(DrMalattia toDrMalattia) {
        setToOneTarget("toDrMalattia", toDrMalattia, true);
    }

    public DrMalattia getToDrMalattia() {
        return (DrMalattia)readProperty("toDrMalattia");
    }


}
