package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _CncePrevcomp was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CncePrevcomp extends CayenneDataObject {

    public static final String ADESIONEFONDO_PROPERTY = "adesionefondo";
    public static final String CONTRIBDITTA_PROPERTY = "contribditta";
    public static final String CONTRIBLAVORATORE_PROPERTY = "contriblavoratore";
    public static final String IDDATAADESIONE_PROPERTY = "iddataadesione";
    public static final String IDTIPOADESIONE_PROPERTY = "idtipoadesione";
    public static final String IDTIPOADESIONE2_PROPERTY = "idtipoadesione2";
    public static final String QUOTATFR_PROPERTY = "quotatfr";
    public static final String UNTITLED_ATTR_PROPERTY = "untitledAttr";

    public static final String IDPOSIZIONE_PK_COLUMN = "IDPOSIZIONE";

    public void setAdesionefondo(Short adesionefondo) {
        writeProperty("adesionefondo", adesionefondo);
    }
    public Short getAdesionefondo() {
        return (Short)readProperty("adesionefondo");
    }

    public void setContribditta(BigDecimal contribditta) {
        writeProperty("contribditta", contribditta);
    }
    public BigDecimal getContribditta() {
        return (BigDecimal)readProperty("contribditta");
    }

    public void setContriblavoratore(BigDecimal contriblavoratore) {
        writeProperty("contriblavoratore", contriblavoratore);
    }
    public BigDecimal getContriblavoratore() {
        return (BigDecimal)readProperty("contriblavoratore");
    }

    public void setIddataadesione(Short iddataadesione) {
        writeProperty("iddataadesione", iddataadesione);
    }
    public Short getIddataadesione() {
        return (Short)readProperty("iddataadesione");
    }

    public void setIdtipoadesione(String idtipoadesione) {
        writeProperty("idtipoadesione", idtipoadesione);
    }
    public String getIdtipoadesione() {
        return (String)readProperty("idtipoadesione");
    }

    public void setIdtipoadesione2(Short idtipoadesione2) {
        writeProperty("idtipoadesione2", idtipoadesione2);
    }
    public Short getIdtipoadesione2() {
        return (Short)readProperty("idtipoadesione2");
    }

    public void setQuotatfr(BigDecimal quotatfr) {
        writeProperty("quotatfr", quotatfr);
    }
    public BigDecimal getQuotatfr() {
        return (BigDecimal)readProperty("quotatfr");
    }

    public void setUntitledAttr(Integer untitledAttr) {
        writeProperty("untitledAttr", untitledAttr);
    }
    public Integer getUntitledAttr() {
        return (Integer)readProperty("untitledAttr");
    }

}
