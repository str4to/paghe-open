package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.DrCausalerecmal;
import it.iubar.paghe.logic.paghe.DrMaternitaacredito;

/**
 * Class _DrMalattiaacreditoaltre was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _DrMalattiaacreditoaltre extends CayenneDataObject {

    public static final String IDCAUSALERECMAL_PROPERTY = "idcausalerecmal";
    public static final String IDDATORETRIBUTIVO_PROPERTY = "iddatoretributivo";
    public static final String IDMALATTIAACREDITOALTRE_PROPERTY = "idmalattiaacreditoaltre";
    public static final String IMPORTORECMAL_PROPERTY = "importorecmal";
    public static final String TO_DR_CAUSALE_REC_MAL_PROPERTY = "toDrCausaleRecMal";
    public static final String TO_DR_MALATTIA_ACREDITO_PROPERTY = "toDrMalattiaACredito";

    public static final String IDDATORETRIBUTIVO_PK_COLUMN = "IDDATORETRIBUTIVO";
    public static final String IDMALATTIAACREDITOALTRE_PK_COLUMN = "IDMALATTIAACREDITOALTRE";

    public void setIdcausalerecmal(String idcausalerecmal) {
        writeProperty("idcausalerecmal", idcausalerecmal);
    }
    public String getIdcausalerecmal() {
        return (String)readProperty("idcausalerecmal");
    }

    public void setIddatoretributivo(Integer iddatoretributivo) {
        writeProperty("iddatoretributivo", iddatoretributivo);
    }
    public Integer getIddatoretributivo() {
        return (Integer)readProperty("iddatoretributivo");
    }

    public void setIdmalattiaacreditoaltre(Short idmalattiaacreditoaltre) {
        writeProperty("idmalattiaacreditoaltre", idmalattiaacreditoaltre);
    }
    public Short getIdmalattiaacreditoaltre() {
        return (Short)readProperty("idmalattiaacreditoaltre");
    }

    public void setImportorecmal(BigDecimal importorecmal) {
        writeProperty("importorecmal", importorecmal);
    }
    public BigDecimal getImportorecmal() {
        return (BigDecimal)readProperty("importorecmal");
    }

    public void setToDrCausaleRecMal(DrCausalerecmal toDrCausaleRecMal) {
        setToOneTarget("toDrCausaleRecMal", toDrCausaleRecMal, true);
    }

    public DrCausalerecmal getToDrCausaleRecMal() {
        return (DrCausalerecmal)readProperty("toDrCausaleRecMal");
    }


    public void setToDrMalattiaACredito(DrMaternitaacredito toDrMalattiaACredito) {
        setToOneTarget("toDrMalattiaACredito", toDrMalattiaACredito, true);
    }

    public DrMaternitaacredito getToDrMalattiaACredito() {
        return (DrMaternitaacredito)readProperty("toDrMalattiaACredito");
    }


}
