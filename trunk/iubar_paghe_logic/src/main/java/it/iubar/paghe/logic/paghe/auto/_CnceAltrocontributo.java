package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _CnceAltrocontributo was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CnceAltrocontributo extends CayenneDataObject {

    public static final String IDALTROCONTRIBUTO_PROPERTY = "idaltrocontributo";
    public static final String IDDICHIARAZIONE_PROPERTY = "iddichiarazione";
    public static final String IMPORTO_PROPERTY = "importo";
    public static final String PERCENTUALE_PROPERTY = "percentuale";

    public static final String IDALTROCONTRIBUTO_PK_COLUMN = "IDALTROCONTRIBUTO";
    public static final String IDDICHIARAZIONE_PK_COLUMN = "IDDICHIARAZIONE";

    public void setIdaltrocontributo(String idaltrocontributo) {
        writeProperty("idaltrocontributo", idaltrocontributo);
    }
    public String getIdaltrocontributo() {
        return (String)readProperty("idaltrocontributo");
    }

    public void setIddichiarazione(Integer iddichiarazione) {
        writeProperty("iddichiarazione", iddichiarazione);
    }
    public Integer getIddichiarazione() {
        return (Integer)readProperty("iddichiarazione");
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

}
