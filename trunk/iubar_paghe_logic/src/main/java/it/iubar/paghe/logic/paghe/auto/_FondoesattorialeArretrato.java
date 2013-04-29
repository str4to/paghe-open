package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Fondoesattoriale;

/**
 * Class _FondoesattorialeArretrato was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _FondoesattorialeArretrato extends CayenneDataObject {

    public static final String IDARRETRATO_PROPERTY = "idarretrato";
    public static final String IDDATORETRIBUTIVO_PROPERTY = "iddatoretributivo";
    public static final String MESE_PROPERTY = "mese";
    public static final String RETRIBPENSIONABILE_PROPERTY = "retribpensionabile";
    public static final String TO_ESATTORIALE_PROPERTY = "toEsattoriale";

    public static final String IDARRETRATO_PK_COLUMN = "IDARRETRATO";

    public void setIdarretrato(Integer idarretrato) {
        writeProperty("idarretrato", idarretrato);
    }
    public Integer getIdarretrato() {
        return (Integer)readProperty("idarretrato");
    }

    public void setIddatoretributivo(Float iddatoretributivo) {
        writeProperty("iddatoretributivo", iddatoretributivo);
    }
    public Float getIddatoretributivo() {
        return (Float)readProperty("iddatoretributivo");
    }

    public void setMese(Short mese) {
        writeProperty("mese", mese);
    }
    public Short getMese() {
        return (Short)readProperty("mese");
    }

    public void setRetribpensionabile(BigDecimal retribpensionabile) {
        writeProperty("retribpensionabile", retribpensionabile);
    }
    public BigDecimal getRetribpensionabile() {
        return (BigDecimal)readProperty("retribpensionabile");
    }

    public void setToEsattoriale(Fondoesattoriale toEsattoriale) {
        setToOneTarget("toEsattoriale", toEsattoriale, true);
    }

    public Fondoesattoriale getToEsattoriale() {
        return (Fondoesattoriale)readProperty("toEsattoriale");
    }


}