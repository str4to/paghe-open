package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.InailPosizioneimpresa;
import it.iubar.paghe.logic.paghe.InailSconto2;

/**
 * Class _InailSconto was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _InailSconto extends CayenneDataObject {

    public static final String ANNO_PROPERTY = "anno";
    public static final String IDIMPRESA_PROPERTY = "idimpresa";
    public static final String IDTIPO_PROPERTY = "idtipo";
    public static final String PAT_PROPERTY = "pat";
    public static final String RATAIMPONIBILE_PROPERTY = "rataimponibile";
    public static final String RATAIMPORTO_PROPERTY = "rataimporto";
    public static final String RATAPREMIOSOGGRIDUZ_PROPERTY = "ratapremiosoggriduz";
    public static final String RATARIDUZIONE_PROPERTY = "ratariduzione";
    public static final String RATATASSO_PROPERTY = "ratatasso";
    public static final String REGIMPONIBILE_PROPERTY = "regimponibile";
    public static final String REGIMPORTO_PROPERTY = "regimporto";
    public static final String REGPREMIOSOGGRIDUZ_PROPERTY = "regpremiosoggriduz";
    public static final String REGRIDUZIONE_PROPERTY = "regriduzione";
    public static final String REGTASSO_PROPERTY = "regtasso";
    public static final String TO_INAIL_POSIZIONEIMPRESA_PROPERTY = "toInailPosizioneimpresa";
    public static final String TO_INAIL_SCONTO2RATA_PROPERTY = "toInailSconto2rata";
    public static final String TO_INAIL_SCONTO2REG_PROPERTY = "toInailSconto2reg";

    public static final String ANNO_PK_COLUMN = "ANNO";
    public static final String IDIMPRESA_PK_COLUMN = "IDIMPRESA";
    public static final String IDTIPO_PK_COLUMN = "IDTIPO";
    public static final String PAT_PK_COLUMN = "PAT";

    public void setAnno(Integer anno) {
        writeProperty("anno", anno);
    }
    public Integer getAnno() {
        return (Integer)readProperty("anno");
    }

    public void setIdimpresa(Integer idimpresa) {
        writeProperty("idimpresa", idimpresa);
    }
    public Integer getIdimpresa() {
        return (Integer)readProperty("idimpresa");
    }

    public void setIdtipo(Short idtipo) {
        writeProperty("idtipo", idtipo);
    }
    public Short getIdtipo() {
        return (Short)readProperty("idtipo");
    }

    public void setPat(String pat) {
        writeProperty("pat", pat);
    }
    public String getPat() {
        return (String)readProperty("pat");
    }

    public void setRataimponibile(BigDecimal rataimponibile) {
        writeProperty("rataimponibile", rataimponibile);
    }
    public BigDecimal getRataimponibile() {
        return (BigDecimal)readProperty("rataimponibile");
    }

    public void setRataimporto(BigDecimal rataimporto) {
        writeProperty("rataimporto", rataimporto);
    }
    public BigDecimal getRataimporto() {
        return (BigDecimal)readProperty("rataimporto");
    }

    public void setRatapremiosoggriduz(BigDecimal ratapremiosoggriduz) {
        writeProperty("ratapremiosoggriduz", ratapremiosoggriduz);
    }
    public BigDecimal getRatapremiosoggriduz() {
        return (BigDecimal)readProperty("ratapremiosoggriduz");
    }

    public void setRatariduzione(BigDecimal ratariduzione) {
        writeProperty("ratariduzione", ratariduzione);
    }
    public BigDecimal getRatariduzione() {
        return (BigDecimal)readProperty("ratariduzione");
    }

    public void setRatatasso(BigDecimal ratatasso) {
        writeProperty("ratatasso", ratatasso);
    }
    public BigDecimal getRatatasso() {
        return (BigDecimal)readProperty("ratatasso");
    }

    public void setRegimponibile(BigDecimal regimponibile) {
        writeProperty("regimponibile", regimponibile);
    }
    public BigDecimal getRegimponibile() {
        return (BigDecimal)readProperty("regimponibile");
    }

    public void setRegimporto(BigDecimal regimporto) {
        writeProperty("regimporto", regimporto);
    }
    public BigDecimal getRegimporto() {
        return (BigDecimal)readProperty("regimporto");
    }

    public void setRegpremiosoggriduz(BigDecimal regpremiosoggriduz) {
        writeProperty("regpremiosoggriduz", regpremiosoggriduz);
    }
    public BigDecimal getRegpremiosoggriduz() {
        return (BigDecimal)readProperty("regpremiosoggriduz");
    }

    public void setRegriduzione(BigDecimal regriduzione) {
        writeProperty("regriduzione", regriduzione);
    }
    public BigDecimal getRegriduzione() {
        return (BigDecimal)readProperty("regriduzione");
    }

    public void setRegtasso(BigDecimal regtasso) {
        writeProperty("regtasso", regtasso);
    }
    public BigDecimal getRegtasso() {
        return (BigDecimal)readProperty("regtasso");
    }

    public void setToInailPosizioneimpresa(InailPosizioneimpresa toInailPosizioneimpresa) {
        setToOneTarget("toInailPosizioneimpresa", toInailPosizioneimpresa, true);
    }

    public InailPosizioneimpresa getToInailPosizioneimpresa() {
        return (InailPosizioneimpresa)readProperty("toInailPosizioneimpresa");
    }


    public void setToInailSconto2rata(InailSconto2 toInailSconto2rata) {
        setToOneTarget("toInailSconto2rata", toInailSconto2rata, true);
    }

    public InailSconto2 getToInailSconto2rata() {
        return (InailSconto2)readProperty("toInailSconto2rata");
    }


    public void setToInailSconto2reg(InailSconto2 toInailSconto2reg) {
        setToOneTarget("toInailSconto2reg", toInailSconto2reg, true);
    }

    public InailSconto2 getToInailSconto2reg() {
        return (InailSconto2)readProperty("toInailSconto2reg");
    }


}