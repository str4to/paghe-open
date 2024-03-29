package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.DrCausalerecmat;
import it.iubar.paghe.logic.paghe.DrMaternitaacredito;

/**
 * Class _DrMaternitaacreditoaltre was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _DrMaternitaacreditoaltre extends CayenneDataObject {

    public static final String IDCAUSALERECMAT_PROPERTY = "idcausalerecmat";
    public static final String IDDATORETRIBUTIVO_PROPERTY = "iddatoretributivo";
    public static final String IDMATERNITAACREDITOALTRE_PROPERTY = "idmaternitaacreditoaltre";
    public static final String IMPORTORECMAT_PROPERTY = "importorecmat";
    public static final String DR_MATERNITA_ACREDITO_PROPERTY = "drMaternitaACredito";
    public static final String TO_DR_CAUSALE_REC_MAT_PROPERTY = "toDrCausaleRecMat";

    public static final String IDDATORETRIBUTIVO_PK_COLUMN = "IDDATORETRIBUTIVO";
    public static final String IDMATERNITAACREDITOALTRE_PK_COLUMN = "IDMATERNITAACREDITOALTRE";

    public void setIdcausalerecmat(String idcausalerecmat) {
        writeProperty("idcausalerecmat", idcausalerecmat);
    }
    public String getIdcausalerecmat() {
        return (String)readProperty("idcausalerecmat");
    }

    public void setIddatoretributivo(Integer iddatoretributivo) {
        writeProperty("iddatoretributivo", iddatoretributivo);
    }
    public Integer getIddatoretributivo() {
        return (Integer)readProperty("iddatoretributivo");
    }

    public void setIdmaternitaacreditoaltre(Short idmaternitaacreditoaltre) {
        writeProperty("idmaternitaacreditoaltre", idmaternitaacreditoaltre);
    }
    public Short getIdmaternitaacreditoaltre() {
        return (Short)readProperty("idmaternitaacreditoaltre");
    }

    public void setImportorecmat(BigDecimal importorecmat) {
        writeProperty("importorecmat", importorecmat);
    }
    public BigDecimal getImportorecmat() {
        return (BigDecimal)readProperty("importorecmat");
    }

    public void setDrMaternitaACredito(DrMaternitaacredito drMaternitaACredito) {
        setToOneTarget("drMaternitaACredito", drMaternitaACredito, true);
    }

    public DrMaternitaacredito getDrMaternitaACredito() {
        return (DrMaternitaacredito)readProperty("drMaternitaACredito");
    }


    public void setToDrCausaleRecMat(DrCausalerecmat toDrCausaleRecMat) {
        setToOneTarget("toDrCausaleRecMat", toDrCausaleRecMat, true);
    }

    public DrCausalerecmat getToDrCausaleRecMat() {
        return (DrCausalerecmat)readProperty("toDrCausaleRecMat");
    }


}
