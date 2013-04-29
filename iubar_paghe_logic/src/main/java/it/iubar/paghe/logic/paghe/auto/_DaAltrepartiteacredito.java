package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.DaCausaleacredito;
import it.iubar.paghe.logic.paghe.Denunciaaziendale;

/**
 * Class _DaAltrepartiteacredito was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _DaAltrepartiteacredito extends CayenneDataObject {

    public static final String IDALTREPARTITEACREDITO_PROPERTY = "idaltrepartiteacredito";
    public static final String IDCAUSALEACREDITO_PROPERTY = "idcausaleacredito";
    public static final String IDDENUNCIAAZIENDALE_PROPERTY = "iddenunciaaziendale";
    public static final String SOMMAACREDITO_PROPERTY = "sommaacredito";
    public static final String TO_DA_CAUSALE_ACREDITO_PROPERTY = "toDaCausaleACredito";
    public static final String TO_DENUNCIA_AZIENDALE_PROPERTY = "toDenunciaAziendale";

    public static final String IDALTREPARTITEACREDITO_PK_COLUMN = "IDALTREPARTITEACREDITO";
    public static final String IDDENUNCIAAZIENDALE_PK_COLUMN = "IDDENUNCIAAZIENDALE";

    public void setIdaltrepartiteacredito(Short idaltrepartiteacredito) {
        writeProperty("idaltrepartiteacredito", idaltrepartiteacredito);
    }
    public Short getIdaltrepartiteacredito() {
        return (Short)readProperty("idaltrepartiteacredito");
    }

    public void setIdcausaleacredito(String idcausaleacredito) {
        writeProperty("idcausaleacredito", idcausaleacredito);
    }
    public String getIdcausaleacredito() {
        return (String)readProperty("idcausaleacredito");
    }

    public void setIddenunciaaziendale(Integer iddenunciaaziendale) {
        writeProperty("iddenunciaaziendale", iddenunciaaziendale);
    }
    public Integer getIddenunciaaziendale() {
        return (Integer)readProperty("iddenunciaaziendale");
    }

    public void setSommaacredito(BigDecimal sommaacredito) {
        writeProperty("sommaacredito", sommaacredito);
    }
    public BigDecimal getSommaacredito() {
        return (BigDecimal)readProperty("sommaacredito");
    }

    public void setToDaCausaleACredito(DaCausaleacredito toDaCausaleACredito) {
        setToOneTarget("toDaCausaleACredito", toDaCausaleACredito, true);
    }

    public DaCausaleacredito getToDaCausaleACredito() {
        return (DaCausaleacredito)readProperty("toDaCausaleACredito");
    }


    public void setToDenunciaAziendale(Denunciaaziendale toDenunciaAziendale) {
        setToOneTarget("toDenunciaAziendale", toDenunciaAziendale, true);
    }

    public Denunciaaziendale getToDenunciaAziendale() {
        return (Denunciaaziendale)readProperty("toDenunciaAziendale");
    }


}
