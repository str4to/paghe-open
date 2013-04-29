package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.InailLimitecontributivo;

/**
 * Class _InailLimitecontributivo2 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _InailLimitecontributivo2 extends CayenneDataObject {

    public static final String ANNO_PROPERTY = "anno";
    public static final String IDLIMITECONTRIB_PROPERTY = "idlimitecontrib";
    public static final String IDUNITAMISURA_PROPERTY = "idunitamisura";
    public static final String MASSIMALE_PROPERTY = "massimale";
    public static final String MINIMALE_PROPERTY = "minimale";
    public static final String TO_LIMITECONTRIB_PROPERTY = "toLimitecontrib";

    public static final String ANNO_PK_COLUMN = "ANNO";
    public static final String IDLIMITECONTRIB_PK_COLUMN = "IDLIMITECONTRIB";

    public void setAnno(Integer anno) {
        writeProperty("anno", anno);
    }
    public Integer getAnno() {
        return (Integer)readProperty("anno");
    }

    public void setIdlimitecontrib(Short idlimitecontrib) {
        writeProperty("idlimitecontrib", idlimitecontrib);
    }
    public Short getIdlimitecontrib() {
        return (Short)readProperty("idlimitecontrib");
    }

    public void setIdunitamisura(Short idunitamisura) {
        writeProperty("idunitamisura", idunitamisura);
    }
    public Short getIdunitamisura() {
        return (Short)readProperty("idunitamisura");
    }

    public void setMassimale(BigDecimal massimale) {
        writeProperty("massimale", massimale);
    }
    public BigDecimal getMassimale() {
        return (BigDecimal)readProperty("massimale");
    }

    public void setMinimale(BigDecimal minimale) {
        writeProperty("minimale", minimale);
    }
    public BigDecimal getMinimale() {
        return (BigDecimal)readProperty("minimale");
    }

    public void setToLimitecontrib(InailLimitecontributivo toLimitecontrib) {
        setToOneTarget("toLimitecontrib", toLimitecontrib, true);
    }

    public InailLimitecontributivo getToLimitecontrib() {
        return (InailLimitecontributivo)readProperty("toLimitecontrib");
    }


}
