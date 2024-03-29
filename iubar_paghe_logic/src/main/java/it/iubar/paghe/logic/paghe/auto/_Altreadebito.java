package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Datoretributivo;
import it.iubar.paghe.logic.paghe.DrCausaleadebito;

/**
 * Class _Altreadebito was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Altreadebito extends CayenneDataObject {

    public static final String ALTROIMPONIBILE_PROPERTY = "altroimponibile";
    public static final String IDALTREADEBITO_PROPERTY = "idaltreadebito";
    public static final String IDCAUSALEADEBITO_PROPERTY = "idcausaleadebito";
    public static final String IDDATORETRIBUTIVO_PROPERTY = "iddatoretributivo";
    public static final String IMPORTOADEBITO_PROPERTY = "importoadebito";
    public static final String NUMGG_PROPERTY = "numgg";
    public static final String NUMORE_PROPERTY = "numore";
    public static final String TO_DATORETRIBUTIVO_PROPERTY = "toDatoretributivo";
    public static final String TO_DR_CAUSALE_ADEBITO_PROPERTY = "toDrCausaleADebito";

    public static final String IDALTREADEBITO_PK_COLUMN = "IDALTREADEBITO";
    public static final String IDDATORETRIBUTIVO_PK_COLUMN = "IDDATORETRIBUTIVO";

    public void setAltroimponibile(BigDecimal altroimponibile) {
        writeProperty("altroimponibile", altroimponibile);
    }
    public BigDecimal getAltroimponibile() {
        return (BigDecimal)readProperty("altroimponibile");
    }

    public void setIdaltreadebito(Short idaltreadebito) {
        writeProperty("idaltreadebito", idaltreadebito);
    }
    public Short getIdaltreadebito() {
        return (Short)readProperty("idaltreadebito");
    }

    public void setIdcausaleadebito(String idcausaleadebito) {
        writeProperty("idcausaleadebito", idcausaleadebito);
    }
    public String getIdcausaleadebito() {
        return (String)readProperty("idcausaleadebito");
    }

    public void setIddatoretributivo(Integer iddatoretributivo) {
        writeProperty("iddatoretributivo", iddatoretributivo);
    }
    public Integer getIddatoretributivo() {
        return (Integer)readProperty("iddatoretributivo");
    }

    public void setImportoadebito(BigDecimal importoadebito) {
        writeProperty("importoadebito", importoadebito);
    }
    public BigDecimal getImportoadebito() {
        return (BigDecimal)readProperty("importoadebito");
    }

    public void setNumgg(BigDecimal numgg) {
        writeProperty("numgg", numgg);
    }
    public BigDecimal getNumgg() {
        return (BigDecimal)readProperty("numgg");
    }

    public void setNumore(BigDecimal numore) {
        writeProperty("numore", numore);
    }
    public BigDecimal getNumore() {
        return (BigDecimal)readProperty("numore");
    }

    public void setToDatoretributivo(Datoretributivo toDatoretributivo) {
        setToOneTarget("toDatoretributivo", toDatoretributivo, true);
    }

    public Datoretributivo getToDatoretributivo() {
        return (Datoretributivo)readProperty("toDatoretributivo");
    }


    public void setToDrCausaleADebito(DrCausaleadebito toDrCausaleADebito) {
        setToOneTarget("toDrCausaleADebito", toDrCausaleADebito, true);
    }

    public DrCausaleadebito getToDrCausaleADebito() {
        return (DrCausaleadebito)readProperty("toDrCausaleADebito");
    }


}
