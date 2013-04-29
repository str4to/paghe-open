package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Fondospeciale;

/**
 * Class _Fondodaziere was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Fondodaziere extends CayenneDataObject {

    public static final String GIORNIRETRIBUITI_PROPERTY = "giorniretribuiti";
    public static final String GIORNIUTILI_PROPERTY = "giorniutili";
    public static final String IDDATORETRIBUTIVO_PROPERTY = "iddatoretributivo";
    public static final String RETRIBPENSIONABILE_PROPERTY = "retribpensionabile";
    public static final String RETRIBTFR_PROPERTY = "retribtfr";
    public static final String TO_FONDOSPECIALE_PROPERTY = "toFondospeciale";

    public static final String IDDATORETRIBUTIVO_PK_COLUMN = "IDDATORETRIBUTIVO";

    public void setGiorniretribuiti(Short giorniretribuiti) {
        writeProperty("giorniretribuiti", giorniretribuiti);
    }
    public Short getGiorniretribuiti() {
        return (Short)readProperty("giorniretribuiti");
    }

    public void setGiorniutili(Short giorniutili) {
        writeProperty("giorniutili", giorniutili);
    }
    public Short getGiorniutili() {
        return (Short)readProperty("giorniutili");
    }

    public void setIddatoretributivo(Integer iddatoretributivo) {
        writeProperty("iddatoretributivo", iddatoretributivo);
    }
    public Integer getIddatoretributivo() {
        return (Integer)readProperty("iddatoretributivo");
    }

    public void setRetribpensionabile(BigDecimal retribpensionabile) {
        writeProperty("retribpensionabile", retribpensionabile);
    }
    public BigDecimal getRetribpensionabile() {
        return (BigDecimal)readProperty("retribpensionabile");
    }

    public void setRetribtfr(BigDecimal retribtfr) {
        writeProperty("retribtfr", retribtfr);
    }
    public BigDecimal getRetribtfr() {
        return (BigDecimal)readProperty("retribtfr");
    }

    public void setToFondospeciale(Fondospeciale toFondospeciale) {
        setToOneTarget("toFondospeciale", toFondospeciale, true);
    }

    public Fondospeciale getToFondospeciale() {
        return (Fondospeciale)readProperty("toFondospeciale");
    }


}