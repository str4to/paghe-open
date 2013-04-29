package it.iubar.paghe.logic.paghe.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Contrattodettaglio;
import it.iubar.paghe.logic.paghe.Contrattotiponota;

/**
 * Class _Contrattonota was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Contrattonota extends CayenneDataObject {

    public static final String IDCONTRATTODETTAGLIO_PROPERTY = "idcontrattodettaglio";
    public static final String IDTIPONOTA_PROPERTY = "idtiponota";
    public static final String NOTA_PROPERTY = "nota";
    public static final String ULTIMAMODIFICA_PROPERTY = "ultimamodifica";
    public static final String ULTIMAMODIFICAUSER_PROPERTY = "ultimamodificauser";
    public static final String TO_CONTRATTODETTAGLIO_PROPERTY = "toContrattodettaglio";
    public static final String TO_TIPONOTA_PROPERTY = "toTiponota";

    public static final String IDCONTRATTODETTAGLIO_PK_COLUMN = "IDCONTRATTODETTAGLIO";
    public static final String IDTIPONOTA_PK_COLUMN = "IDTIPONOTA";

    public void setIdcontrattodettaglio(Integer idcontrattodettaglio) {
        writeProperty("idcontrattodettaglio", idcontrattodettaglio);
    }
    public Integer getIdcontrattodettaglio() {
        return (Integer)readProperty("idcontrattodettaglio");
    }

    public void setIdtiponota(Short idtiponota) {
        writeProperty("idtiponota", idtiponota);
    }
    public Short getIdtiponota() {
        return (Short)readProperty("idtiponota");
    }

    public void setNota(String nota) {
        writeProperty("nota", nota);
    }
    public String getNota() {
        return (String)readProperty("nota");
    }

    public void setUltimamodifica(Date ultimamodifica) {
        writeProperty("ultimamodifica", ultimamodifica);
    }
    public Date getUltimamodifica() {
        return (Date)readProperty("ultimamodifica");
    }

    public void setUltimamodificauser(String ultimamodificauser) {
        writeProperty("ultimamodificauser", ultimamodificauser);
    }
    public String getUltimamodificauser() {
        return (String)readProperty("ultimamodificauser");
    }

    public void setToContrattodettaglio(Contrattodettaglio toContrattodettaglio) {
        setToOneTarget("toContrattodettaglio", toContrattodettaglio, true);
    }

    public Contrattodettaglio getToContrattodettaglio() {
        return (Contrattodettaglio)readProperty("toContrattodettaglio");
    }


    public void setToTiponota(Contrattotiponota toTiponota) {
        setToOneTarget("toTiponota", toTiponota, true);
    }

    public Contrattotiponota getToTiponota() {
        return (Contrattotiponota)readProperty("toTiponota");
    }


}