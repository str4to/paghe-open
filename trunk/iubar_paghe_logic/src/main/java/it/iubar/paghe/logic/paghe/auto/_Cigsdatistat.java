package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.DrCausalestatcigs;
import it.iubar.paghe.logic.paghe.Gestionecig;

/**
 * Class _Cigsdatistat was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Cigsdatistat extends CayenneDataObject {

    public static final String IDCAUSALESTATCIGS_PROPERTY = "idcausalestatcigs";
    public static final String IDDATORETRIBUTIVO_PROPERTY = "iddatoretributivo";
    public static final String IMPONIBILESTATCIGS_PROPERTY = "imponibilestatcigs";
    public static final String NUMORESTATCIGS_PROPERTY = "numorestatcigs";
    public static final String TO_DR_CAUSALE_STAT_CIGS_PROPERTY = "toDrCausaleStatCigs";
    public static final String TO_GESTIONE_CIG_PROPERTY = "toGestioneCig";

    public static final String IDDATORETRIBUTIVO_PK_COLUMN = "IDDATORETRIBUTIVO";

    public void setIdcausalestatcigs(String idcausalestatcigs) {
        writeProperty("idcausalestatcigs", idcausalestatcigs);
    }
    public String getIdcausalestatcigs() {
        return (String)readProperty("idcausalestatcigs");
    }

    public void setIddatoretributivo(Integer iddatoretributivo) {
        writeProperty("iddatoretributivo", iddatoretributivo);
    }
    public Integer getIddatoretributivo() {
        return (Integer)readProperty("iddatoretributivo");
    }

    public void setImponibilestatcigs(BigDecimal imponibilestatcigs) {
        writeProperty("imponibilestatcigs", imponibilestatcigs);
    }
    public BigDecimal getImponibilestatcigs() {
        return (BigDecimal)readProperty("imponibilestatcigs");
    }

    public void setNumorestatcigs(BigDecimal numorestatcigs) {
        writeProperty("numorestatcigs", numorestatcigs);
    }
    public BigDecimal getNumorestatcigs() {
        return (BigDecimal)readProperty("numorestatcigs");
    }

    public void setToDrCausaleStatCigs(DrCausalestatcigs toDrCausaleStatCigs) {
        setToOneTarget("toDrCausaleStatCigs", toDrCausaleStatCigs, true);
    }

    public DrCausalestatcigs getToDrCausaleStatCigs() {
        return (DrCausalestatcigs)readProperty("toDrCausaleStatCigs");
    }


    public void setToGestioneCig(Gestionecig toGestioneCig) {
        setToOneTarget("toGestioneCig", toGestioneCig, true);
    }

    public Gestionecig getToGestioneCig() {
        return (Gestionecig)readProperty("toGestioneCig");
    }


}
