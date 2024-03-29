package it.iubar.paghe.logic.paghe.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.TfrIscrizioneprevcompl;
import it.iubar.paghe.logic.paghe.TfrIscrizioneprevobbl;
import it.iubar.paghe.logic.paghe.TfrTiposcelta;

/**
 * Class _TfrDestinazione was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _TfrDestinazione extends CayenneDataObject {

    public static final String DATARICHIESTACANCELLAZIONE_PROPERTY = "datarichiestacancellazione";
    public static final String DATASCELTA_PROPERTY = "datascelta";
    public static final String IDPROFILO_PROPERTY = "idprofilo";
    public static final String RETTIFICA_PROPERTY = "rettifica";
    public static final String ULTIMAMODIFICA_PROPERTY = "ultimamodifica";
    public static final String ULTIMAMODIFICAUSER_PROPERTY = "ultimamodificauser";
    public static final String TO_TFR_ISCRIZIONE_COMPL_PROPERTY = "toTfrIscrizioneCompl";
    public static final String TO_TFR_ISCRIZIONE_OBBL_PROPERTY = "toTfrIscrizioneObbl";
    public static final String TO_TFR_TIPOSCELTA_PROPERTY = "toTfrTiposcelta";

    public static final String DATASCELTA_PK_COLUMN = "DATASCELTA";
    public static final String IDPROFILO_PK_COLUMN = "IDPROFILO";

    public void setDatarichiestacancellazione(Date datarichiestacancellazione) {
        writeProperty("datarichiestacancellazione", datarichiestacancellazione);
    }
    public Date getDatarichiestacancellazione() {
        return (Date)readProperty("datarichiestacancellazione");
    }

    public void setDatascelta(Date datascelta) {
        writeProperty("datascelta", datascelta);
    }
    public Date getDatascelta() {
        return (Date)readProperty("datascelta");
    }

    public void setIdprofilo(Integer idprofilo) {
        writeProperty("idprofilo", idprofilo);
    }
    public Integer getIdprofilo() {
        return (Integer)readProperty("idprofilo");
    }

    public void setRettifica(Short rettifica) {
        writeProperty("rettifica", rettifica);
    }
    public Short getRettifica() {
        return (Short)readProperty("rettifica");
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

    public void setToTfrIscrizioneCompl(TfrIscrizioneprevcompl toTfrIscrizioneCompl) {
        setToOneTarget("toTfrIscrizioneCompl", toTfrIscrizioneCompl, true);
    }

    public TfrIscrizioneprevcompl getToTfrIscrizioneCompl() {
        return (TfrIscrizioneprevcompl)readProperty("toTfrIscrizioneCompl");
    }


    public void setToTfrIscrizioneObbl(TfrIscrizioneprevobbl toTfrIscrizioneObbl) {
        setToOneTarget("toTfrIscrizioneObbl", toTfrIscrizioneObbl, true);
    }

    public TfrIscrizioneprevobbl getToTfrIscrizioneObbl() {
        return (TfrIscrizioneprevobbl)readProperty("toTfrIscrizioneObbl");
    }


    public void setToTfrTiposcelta(TfrTiposcelta toTfrTiposcelta) {
        setToOneTarget("toTfrTiposcelta", toTfrTiposcelta, true);
    }

    public TfrTiposcelta getToTfrTiposcelta() {
        return (TfrTiposcelta)readProperty("toTfrTiposcelta");
    }


}
