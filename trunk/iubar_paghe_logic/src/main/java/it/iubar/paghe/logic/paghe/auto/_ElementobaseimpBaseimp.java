package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Elementobaseimponibile;

/**
 * Class _ElementobaseimpBaseimp was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ElementobaseimpBaseimp extends CayenneDataObject {

    public static final String CUSTOM_PROPERTY = "custom";
    public static final String IDBASEIMPONIBILE1_PROPERTY = "idbaseimponibile1";
    public static final String IDBASEIMPONIBILE2_PROPERTY = "idbaseimponibile2";
    public static final String IMPORTO_PROPERTY = "importo";
    public static final String PERCENTUALE_PROPERTY = "percentuale";
    public static final String TO_BASE_IMP1_PROPERTY = "toBaseImp1";
    public static final String TO_BASE_IMP2_PROPERTY = "toBaseImp2";

    public static final String IDBASEIMPONIBILE1_PK_COLUMN = "IDBASEIMPONIBILE1";
    public static final String IDBASEIMPONIBILE2_PK_COLUMN = "IDBASEIMPONIBILE2";

    public void setCustom(Short custom) {
        writeProperty("custom", custom);
    }
    public Short getCustom() {
        return (Short)readProperty("custom");
    }

    public void setIdbaseimponibile1(Integer idbaseimponibile1) {
        writeProperty("idbaseimponibile1", idbaseimponibile1);
    }
    public Integer getIdbaseimponibile1() {
        return (Integer)readProperty("idbaseimponibile1");
    }

    public void setIdbaseimponibile2(Integer idbaseimponibile2) {
        writeProperty("idbaseimponibile2", idbaseimponibile2);
    }
    public Integer getIdbaseimponibile2() {
        return (Integer)readProperty("idbaseimponibile2");
    }

    public void setImporto(BigDecimal importo) {
        writeProperty("importo", importo);
    }
    public BigDecimal getImporto() {
        return (BigDecimal)readProperty("importo");
    }

    public void setPercentuale(BigDecimal percentuale) {
        writeProperty("percentuale", percentuale);
    }
    public BigDecimal getPercentuale() {
        return (BigDecimal)readProperty("percentuale");
    }

    public void setToBaseImp1(Elementobaseimponibile toBaseImp1) {
        setToOneTarget("toBaseImp1", toBaseImp1, true);
    }

    public Elementobaseimponibile getToBaseImp1() {
        return (Elementobaseimponibile)readProperty("toBaseImp1");
    }


    public void setToBaseImp2(Elementobaseimponibile toBaseImp2) {
        setToOneTarget("toBaseImp2", toBaseImp2, true);
    }

    public Elementobaseimponibile getToBaseImp2() {
        return (Elementobaseimponibile)readProperty("toBaseImp2");
    }


}
