package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.DaCausaleadebito;
import it.iubar.paghe.logic.paghe.Denunciaaziendale;

/**
 * Class _DaAltrepartiteadebito was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _DaAltrepartiteadebito extends CayenneDataObject {

    public static final String IDALTREPARTITEADEBITO_PROPERTY = "idaltrepartiteadebito";
    public static final String IDCAUSALEADEBITO_PROPERTY = "idcausaleadebito";
    public static final String IDDENUNCIAAZIENDALE_PROPERTY = "iddenunciaaziendale";
    public static final String NUMDIP_PROPERTY = "numdip";
    public static final String NUMGG_PROPERTY = "numgg";
    public static final String NUMORE_PROPERTY = "numore";
    public static final String RETRIBUZIONE_PROPERTY = "retribuzione";
    public static final String SOMMAADEBITO_PROPERTY = "sommaadebito";
    public static final String TO_DA_CAUSALE_ADEBITO_PROPERTY = "toDaCausaleADebito";
    public static final String TO_DENUNCIA_AZIENDALE_PROPERTY = "toDenunciaAziendale";

    public static final String IDALTREPARTITEADEBITO_PK_COLUMN = "IDALTREPARTITEADEBITO";
    public static final String IDDENUNCIAAZIENDALE_PK_COLUMN = "IDDENUNCIAAZIENDALE";

    public void setIdaltrepartiteadebito(Short idaltrepartiteadebito) {
        writeProperty("idaltrepartiteadebito", idaltrepartiteadebito);
    }
    public Short getIdaltrepartiteadebito() {
        return (Short)readProperty("idaltrepartiteadebito");
    }

    public void setIdcausaleadebito(String idcausaleadebito) {
        writeProperty("idcausaleadebito", idcausaleadebito);
    }
    public String getIdcausaleadebito() {
        return (String)readProperty("idcausaleadebito");
    }

    public void setIddenunciaaziendale(Integer iddenunciaaziendale) {
        writeProperty("iddenunciaaziendale", iddenunciaaziendale);
    }
    public Integer getIddenunciaaziendale() {
        return (Integer)readProperty("iddenunciaaziendale");
    }

    public void setNumdip(Short numdip) {
        writeProperty("numdip", numdip);
    }
    public Short getNumdip() {
        return (Short)readProperty("numdip");
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

    public void setRetribuzione(BigDecimal retribuzione) {
        writeProperty("retribuzione", retribuzione);
    }
    public BigDecimal getRetribuzione() {
        return (BigDecimal)readProperty("retribuzione");
    }

    public void setSommaadebito(BigDecimal sommaadebito) {
        writeProperty("sommaadebito", sommaadebito);
    }
    public BigDecimal getSommaadebito() {
        return (BigDecimal)readProperty("sommaadebito");
    }

    public void setToDaCausaleADebito(DaCausaleadebito toDaCausaleADebito) {
        setToOneTarget("toDaCausaleADebito", toDaCausaleADebito, true);
    }

    public DaCausaleadebito getToDaCausaleADebito() {
        return (DaCausaleadebito)readProperty("toDaCausaleADebito");
    }


    public void setToDenunciaAziendale(Denunciaaziendale toDenunciaAziendale) {
        setToOneTarget("toDenunciaAziendale", toDenunciaAziendale, true);
    }

    public Denunciaaziendale getToDenunciaAziendale() {
        return (Denunciaaziendale)readProperty("toDenunciaAziendale");
    }


}
