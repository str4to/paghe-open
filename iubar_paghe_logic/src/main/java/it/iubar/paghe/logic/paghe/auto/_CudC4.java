package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _CudC4 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CudC4 extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String PERCENTUALE_PROPERTY = "percentuale";

    public static final String CODICE_PK_COLUMN = "CODICE";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public BigDecimal getPercentuale() {
        return (BigDecimal)readProperty("percentuale");
    }

}
