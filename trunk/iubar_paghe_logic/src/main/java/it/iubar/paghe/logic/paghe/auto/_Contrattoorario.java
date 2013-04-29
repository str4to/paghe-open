package it.iubar.paghe.logic.paghe.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _Contrattoorario was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Contrattoorario extends CayenneDataObject {

    public static final String CUSTOM_PROPERTY = "custom";
    public static final String FESTIVITA_PROPERTY = "festivita";
    public static final String FLESSIBILITA_PROPERTY = "flessibilita";
    public static final String IDCONTRATTODETTAGLIO_PROPERTY = "idcontrattodettaglio";
    public static final String IDORARIO_PROPERTY = "idorario";
    public static final String IDTIPOLAVORATORE2_PROPERTY = "idtipolavoratore2";
    public static final String PERMESSIRETRIBUITI_PROPERTY = "permessiretribuiti";
    public static final String RIDUZIONEORARIO_PROPERTY = "riduzioneorario";
    public static final String ULTIMAMODIFICA_PROPERTY = "ultimamodifica";
    public static final String ULTIMAMODIFICAUSER_PROPERTY = "ultimamodificauser";

    public static final String IDCONTRATTODETTAGLIO_PK_COLUMN = "IDCONTRATTODETTAGLIO";
    public static final String IDORARIO_PK_COLUMN = "IDORARIO";

    public void setCustom(Short custom) {
        writeProperty("custom", custom);
    }
    public Short getCustom() {
        return (Short)readProperty("custom");
    }

    public void setFestivita(String festivita) {
        writeProperty("festivita", festivita);
    }
    public String getFestivita() {
        return (String)readProperty("festivita");
    }

    public void setFlessibilita(String flessibilita) {
        writeProperty("flessibilita", flessibilita);
    }
    public String getFlessibilita() {
        return (String)readProperty("flessibilita");
    }

    public void setIdcontrattodettaglio(Integer idcontrattodettaglio) {
        writeProperty("idcontrattodettaglio", idcontrattodettaglio);
    }
    public Integer getIdcontrattodettaglio() {
        return (Integer)readProperty("idcontrattodettaglio");
    }

    public void setIdorario(Short idorario) {
        writeProperty("idorario", idorario);
    }
    public Short getIdorario() {
        return (Short)readProperty("idorario");
    }

    public void setIdtipolavoratore2(Short idtipolavoratore2) {
        writeProperty("idtipolavoratore2", idtipolavoratore2);
    }
    public Short getIdtipolavoratore2() {
        return (Short)readProperty("idtipolavoratore2");
    }

    public void setPermessiretribuiti(String permessiretribuiti) {
        writeProperty("permessiretribuiti", permessiretribuiti);
    }
    public String getPermessiretribuiti() {
        return (String)readProperty("permessiretribuiti");
    }

    public void setRiduzioneorario(String riduzioneorario) {
        writeProperty("riduzioneorario", riduzioneorario);
    }
    public String getRiduzioneorario() {
        return (String)readProperty("riduzioneorario");
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

}
