package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Congsolacredito;
import it.iubar.paghe.logic.paghe.Congsolaltcaus;

/**
 * Class _Congsolaltro was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Congsolaltro extends CayenneDataObject {

    public static final String IDCAUSALE_PROPERTY = "idcausale";
    public static final String IDCIGAUTORIZZATA_PROPERTY = "idcigautorizzata";
    public static final String IDDENUNCIAAZIENDALE_PROPERTY = "iddenunciaaziendale";
    public static final String IMPORTO_PROPERTY = "importo";
    public static final String TO_CONG_SOL_ACREDITO_PROPERTY = "toCongSolACredito";
    public static final String TO_CONG_SOL_ALT_CAUS_PROPERTY = "toCongSolAltCaus";

    public static final String IDCAUSALE_PK_COLUMN = "IDCAUSALE";
    public static final String IDCIGAUTORIZZATA_PK_COLUMN = "IDCIGAUTORIZZATA";
    public static final String IDDENUNCIAAZIENDALE_PK_COLUMN = "IDDENUNCIAAZIENDALE";

    public void setIdcausale(String idcausale) {
        writeProperty("idcausale", idcausale);
    }
    public String getIdcausale() {
        return (String)readProperty("idcausale");
    }

    public void setIdcigautorizzata(Short idcigautorizzata) {
        writeProperty("idcigautorizzata", idcigautorizzata);
    }
    public Short getIdcigautorizzata() {
        return (Short)readProperty("idcigautorizzata");
    }

    public void setIddenunciaaziendale(Integer iddenunciaaziendale) {
        writeProperty("iddenunciaaziendale", iddenunciaaziendale);
    }
    public Integer getIddenunciaaziendale() {
        return (Integer)readProperty("iddenunciaaziendale");
    }

    public void setImporto(BigDecimal importo) {
        writeProperty("importo", importo);
    }
    public BigDecimal getImporto() {
        return (BigDecimal)readProperty("importo");
    }

    public void setToCongSolACredito(Congsolacredito toCongSolACredito) {
        setToOneTarget("toCongSolACredito", toCongSolACredito, true);
    }

    public Congsolacredito getToCongSolACredito() {
        return (Congsolacredito)readProperty("toCongSolACredito");
    }


    public void setToCongSolAltCaus(Congsolaltcaus toCongSolAltCaus) {
        setToOneTarget("toCongSolAltCaus", toCongSolAltCaus, true);
    }

    public Congsolaltcaus getToCongSolAltCaus() {
        return (Congsolaltcaus)readProperty("toCongSolAltCaus");
    }


}
