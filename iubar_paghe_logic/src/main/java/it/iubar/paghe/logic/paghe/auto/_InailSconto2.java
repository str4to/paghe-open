package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.InailSconto;

/**
 * Class _InailSconto2 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _InailSconto2 extends CayenneDataObject {

    public static final String ANNO_PROPERTY = "anno";
    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDSCONTO_PROPERTY = "idsconto";
    public static final String PERCENTUALE_PROPERTY = "percentuale";
    public static final String INAIL_SCONTO_RATA_ARRAY_PROPERTY = "inailScontoRataArray";
    public static final String INAIL_SCONTO_REG_ARRAY_PROPERTY = "inailScontoRegArray";

    public static final String IDSCONTO_PK_COLUMN = "IDSCONTO";

    public Integer getAnno() {
        return (Integer)readProperty("anno");
    }

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public Integer getIdsconto() {
        return (Integer)readProperty("idsconto");
    }

    public BigDecimal getPercentuale() {
        return (BigDecimal)readProperty("percentuale");
    }

    public void addToInailScontoRataArray(InailSconto obj) {
        addToManyTarget("inailScontoRataArray", obj, true);
    }
    public void removeFromInailScontoRataArray(InailSconto obj) {
        removeToManyTarget("inailScontoRataArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<InailSconto> getInailScontoRataArray() {
        return (List<InailSconto>)readProperty("inailScontoRataArray");
    }


    public void addToInailScontoRegArray(InailSconto obj) {
        addToManyTarget("inailScontoRegArray", obj, true);
    }
    public void removeFromInailScontoRegArray(InailSconto obj) {
        removeToManyTarget("inailScontoRegArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<InailSconto> getInailScontoRegArray() {
        return (List<InailSconto>)readProperty("inailScontoRegArray");
    }


}
