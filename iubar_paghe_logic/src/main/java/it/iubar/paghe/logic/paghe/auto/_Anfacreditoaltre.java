package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Anfacredito;
import it.iubar.paghe.logic.paghe.DrCausalerecanf;

/**
 * Class _Anfacreditoaltre was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Anfacreditoaltre extends CayenneDataObject {

    public static final String IDANFACREDITOALTRE_PROPERTY = "idanfacreditoaltre";
    public static final String IDCAUSALERECANF_PROPERTY = "idcausalerecanf";
    public static final String IDDATORETRIBUTIVO_PROPERTY = "iddatoretributivo";
    public static final String IMPORTORECANF_PROPERTY = "importorecanf";
    public static final String TO_ANF_ACREDITO_PROPERTY = "toAnfACredito";
    public static final String TO_DR_CAUSALE_REC_ANF_PROPERTY = "toDrCausaleRecAnf";

    public static final String IDANFACREDITOALTRE_PK_COLUMN = "IDANFACREDITOALTRE";
    public static final String IDDATORETRIBUTIVO_PK_COLUMN = "IDDATORETRIBUTIVO";

    public void setIdanfacreditoaltre(Short idanfacreditoaltre) {
        writeProperty("idanfacreditoaltre", idanfacreditoaltre);
    }
    public Short getIdanfacreditoaltre() {
        return (Short)readProperty("idanfacreditoaltre");
    }

    public void setIdcausalerecanf(String idcausalerecanf) {
        writeProperty("idcausalerecanf", idcausalerecanf);
    }
    public String getIdcausalerecanf() {
        return (String)readProperty("idcausalerecanf");
    }

    public void setIddatoretributivo(Integer iddatoretributivo) {
        writeProperty("iddatoretributivo", iddatoretributivo);
    }
    public Integer getIddatoretributivo() {
        return (Integer)readProperty("iddatoretributivo");
    }

    public void setImportorecanf(BigDecimal importorecanf) {
        writeProperty("importorecanf", importorecanf);
    }
    public BigDecimal getImportorecanf() {
        return (BigDecimal)readProperty("importorecanf");
    }

    public void setToAnfACredito(Anfacredito toAnfACredito) {
        setToOneTarget("toAnfACredito", toAnfACredito, true);
    }

    public Anfacredito getToAnfACredito() {
        return (Anfacredito)readProperty("toAnfACredito");
    }


    public void setToDrCausaleRecAnf(DrCausalerecanf toDrCausaleRecAnf) {
        setToOneTarget("toDrCausaleRecAnf", toDrCausaleRecAnf, true);
    }

    public DrCausalerecanf getToDrCausaleRecAnf() {
        return (DrCausalerecanf)readProperty("toDrCausaleRecAnf");
    }


}
