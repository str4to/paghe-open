package it.iubar.paghe.logic.anagrafica.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.anagrafica.InpsAutorizzazione;
import it.iubar.paghe.logic.anagrafica.Sedeimpresa;

/**
 * Class _SedeimpresaAutorizzazione was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _SedeimpresaAutorizzazione extends CayenneDataObject {

    public static final String IDIMPRESA_PROPERTY = "idimpresa";
    public static final String IDSEDEIMPRESA_PROPERTY = "idsedeimpresa";
    public static final String INPSCA_PROPERTY = "inpsca";
    public static final String ULTIMAMODIFICA_PROPERTY = "ultimamodifica";
    public static final String VALIDODAL_PROPERTY = "validodal";
    public static final String TO_INPSAUTORIZZAZIONE_PROPERTY = "toInpsautorizzazione";
    public static final String TO_SEDEIMPRESA_PROPERTY = "toSedeimpresa";

    public static final String IDIMPRESA_PK_COLUMN = "IDIMPRESA";
    public static final String IDSEDEIMPRESA_PK_COLUMN = "IDSEDEIMPRESA";
    public static final String INPSCA_PK_COLUMN = "INPSCA";
    public static final String VALIDODAL_PK_COLUMN = "VALIDODAL";

    public void setIdimpresa(Integer idimpresa) {
        writeProperty("idimpresa", idimpresa);
    }
    public Integer getIdimpresa() {
        return (Integer)readProperty("idimpresa");
    }

    public void setIdsedeimpresa(Short idsedeimpresa) {
        writeProperty("idsedeimpresa", idsedeimpresa);
    }
    public Short getIdsedeimpresa() {
        return (Short)readProperty("idsedeimpresa");
    }

    public void setInpsca(String inpsca) {
        writeProperty("inpsca", inpsca);
    }
    public String getInpsca() {
        return (String)readProperty("inpsca");
    }

    public void setUltimamodifica(Date ultimamodifica) {
        writeProperty("ultimamodifica", ultimamodifica);
    }
    public Date getUltimamodifica() {
        return (Date)readProperty("ultimamodifica");
    }

    public void setValidodal(Date validodal) {
        writeProperty("validodal", validodal);
    }
    public Date getValidodal() {
        return (Date)readProperty("validodal");
    }

    public void setToInpsautorizzazione(InpsAutorizzazione toInpsautorizzazione) {
        setToOneTarget("toInpsautorizzazione", toInpsautorizzazione, true);
    }

    public InpsAutorizzazione getToInpsautorizzazione() {
        return (InpsAutorizzazione)readProperty("toInpsautorizzazione");
    }


    public void setToSedeimpresa(Sedeimpresa toSedeimpresa) {
        setToOneTarget("toSedeimpresa", toSedeimpresa, true);
    }

    public Sedeimpresa getToSedeimpresa() {
        return (Sedeimpresa)readProperty("toSedeimpresa");
    }


}