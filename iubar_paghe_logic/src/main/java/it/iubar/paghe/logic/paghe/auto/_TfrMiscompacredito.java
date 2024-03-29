package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.TfrCausalemcacred;
import it.iubar.paghe.logic.paghe.TfrMisurecompensative;

/**
 * Class _TfrMiscompacredito was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _TfrMiscompacredito extends CayenneDataObject {

    public static final String IDCAUSALEMCACRED_PROPERTY = "idcausalemcacred";
    public static final String IDPOSIZIONE_PROPERTY = "idposizione";
    public static final String IMPORTO_PROPERTY = "importo";
    public static final String TO_TFR_CAUSALE_MC_ACRED_PROPERTY = "toTfrCausaleMcACred";
    public static final String TO_TFR_MISURE_COMPENSATIVE_PROPERTY = "toTfrMisureCompensative";

    public static final String IDPOSIZIONE_PK_COLUMN = "IDPOSIZIONE";

    public void setIdcausalemcacred(String idcausalemcacred) {
        writeProperty("idcausalemcacred", idcausalemcacred);
    }
    public String getIdcausalemcacred() {
        return (String)readProperty("idcausalemcacred");
    }

    public void setIdposizione(Integer idposizione) {
        writeProperty("idposizione", idposizione);
    }
    public Integer getIdposizione() {
        return (Integer)readProperty("idposizione");
    }

    public void setImporto(BigDecimal importo) {
        writeProperty("importo", importo);
    }
    public BigDecimal getImporto() {
        return (BigDecimal)readProperty("importo");
    }

    public void setToTfrCausaleMcACred(TfrCausalemcacred toTfrCausaleMcACred) {
        setToOneTarget("toTfrCausaleMcACred", toTfrCausaleMcACred, true);
    }

    public TfrCausalemcacred getToTfrCausaleMcACred() {
        return (TfrCausalemcacred)readProperty("toTfrCausaleMcACred");
    }


    public void setToTfrMisureCompensative(TfrMisurecompensative toTfrMisureCompensative) {
        setToOneTarget("toTfrMisureCompensative", toTfrMisureCompensative, true);
    }

    public TfrMisurecompensative getToTfrMisureCompensative() {
        return (TfrMisurecompensative)readProperty("toTfrMisureCompensative");
    }


}
