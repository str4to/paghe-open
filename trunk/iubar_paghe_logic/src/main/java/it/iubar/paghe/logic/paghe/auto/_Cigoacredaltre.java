package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Cigoacredito;
import it.iubar.paghe.logic.paghe.DrCausalecongcigo;

/**
 * Class _Cigoacredaltre was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Cigoacredaltre extends CayenneDataObject {

    public static final String IDCAUSALECONGCIGO_PROPERTY = "idcausalecongcigo";
    public static final String IDCIGOACREDALTRE_PROPERTY = "idcigoacredaltre";
    public static final String IDDATORETRIBUTIVO_PROPERTY = "iddatoretributivo";
    public static final String IMPORTOCONGCIGO_PROPERTY = "importocongcigo";
    public static final String TO_CIGO_ACREDITO_PROPERTY = "toCigoACredito";
    public static final String TO_DR_CAUSALE_CONG_CIGO_PROPERTY = "toDrCausaleCongCigo";

    public static final String IDCIGOACREDALTRE_PK_COLUMN = "IDCIGOACREDALTRE";
    public static final String IDDATORETRIBUTIVO_PK_COLUMN = "IDDATORETRIBUTIVO";

    public void setIdcausalecongcigo(String idcausalecongcigo) {
        writeProperty("idcausalecongcigo", idcausalecongcigo);
    }
    public String getIdcausalecongcigo() {
        return (String)readProperty("idcausalecongcigo");
    }

    public void setIdcigoacredaltre(Short idcigoacredaltre) {
        writeProperty("idcigoacredaltre", idcigoacredaltre);
    }
    public Short getIdcigoacredaltre() {
        return (Short)readProperty("idcigoacredaltre");
    }

    public void setIddatoretributivo(Integer iddatoretributivo) {
        writeProperty("iddatoretributivo", iddatoretributivo);
    }
    public Integer getIddatoretributivo() {
        return (Integer)readProperty("iddatoretributivo");
    }

    public void setImportocongcigo(BigDecimal importocongcigo) {
        writeProperty("importocongcigo", importocongcigo);
    }
    public BigDecimal getImportocongcigo() {
        return (BigDecimal)readProperty("importocongcigo");
    }

    public void setToCigoACredito(Cigoacredito toCigoACredito) {
        setToOneTarget("toCigoACredito", toCigoACredito, true);
    }

    public Cigoacredito getToCigoACredito() {
        return (Cigoacredito)readProperty("toCigoACredito");
    }


    public void setToDrCausaleCongCigo(DrCausalecongcigo toDrCausaleCongCigo) {
        setToOneTarget("toDrCausaleCongCigo", toDrCausaleCongCigo, true);
    }

    public DrCausalecongcigo getToDrCausaleCongCigo() {
        return (DrCausalecongcigo)readProperty("toDrCausaleCongCigo");
    }


}
