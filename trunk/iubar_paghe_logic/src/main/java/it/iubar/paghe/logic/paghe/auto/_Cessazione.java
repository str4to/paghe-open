package it.iubar.paghe.logic.paghe.auto;

import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.anagrafica.Subordinato;
import it.iubar.paghe.logic.paghe.CoTipocessazione;
import it.iubar.paghe.logic.paghe.InpsTipocessazione;
import it.iubar.paghe.logic.paghe.Posizionesubordinato;

/**
 * Class _Cessazione was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Cessazione extends CayenneDataObject {

    public static final String CESSAZIONEDATA_PROPERTY = "cessazionedata";
    public static final String IDCESSAZIONE_PROPERTY = "idcessazione";
    public static final String IDCOTIPOCESSAZIONE_PROPERTY = "idcotipocessazione";
    public static final String IDINPSTIPOCESSAZIONE_PROPERTY = "idinpstipocessazione";
    public static final String SUBORDINATO_ARRAY_PROPERTY = "subordinatoArray";
    public static final String TO_CO_TIPO_CESSAZIONE_PROPERTY = "toCoTipoCessazione";
    public static final String TO_INPS_TIPOCESSAZIONE_PROPERTY = "toInpsTipocessazione";
    public static final String TO_POSIZIONESUBORDINATO_PROPERTY = "toPosizionesubordinato";

    public static final String IDCESSAZIONE_PK_COLUMN = "IDCESSAZIONE";

    public void setCessazionedata(Date cessazionedata) {
        writeProperty("cessazionedata", cessazionedata);
    }
    public Date getCessazionedata() {
        return (Date)readProperty("cessazionedata");
    }

    public void setIdcessazione(Integer idcessazione) {
        writeProperty("idcessazione", idcessazione);
    }
    public Integer getIdcessazione() {
        return (Integer)readProperty("idcessazione");
    }

    public void setIdcotipocessazione(String idcotipocessazione) {
        writeProperty("idcotipocessazione", idcotipocessazione);
    }
    public String getIdcotipocessazione() {
        return (String)readProperty("idcotipocessazione");
    }

    public void setIdinpstipocessazione(String idinpstipocessazione) {
        writeProperty("idinpstipocessazione", idinpstipocessazione);
    }
    public String getIdinpstipocessazione() {
        return (String)readProperty("idinpstipocessazione");
    }

    public void addToSubordinatoArray(Subordinato obj) {
        addToManyTarget("subordinatoArray", obj, true);
    }
    public void removeFromSubordinatoArray(Subordinato obj) {
        removeToManyTarget("subordinatoArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Subordinato> getSubordinatoArray() {
        return (List<Subordinato>)readProperty("subordinatoArray");
    }


    public void setToCoTipoCessazione(CoTipocessazione toCoTipoCessazione) {
        setToOneTarget("toCoTipoCessazione", toCoTipoCessazione, true);
    }

    public CoTipocessazione getToCoTipoCessazione() {
        return (CoTipocessazione)readProperty("toCoTipoCessazione");
    }


    public void setToInpsTipocessazione(InpsTipocessazione toInpsTipocessazione) {
        setToOneTarget("toInpsTipocessazione", toInpsTipocessazione, true);
    }

    public InpsTipocessazione getToInpsTipocessazione() {
        return (InpsTipocessazione)readProperty("toInpsTipocessazione");
    }


    public void addToToPosizionesubordinato(Posizionesubordinato obj) {
        addToManyTarget("toPosizionesubordinato", obj, true);
    }
    public void removeFromToPosizionesubordinato(Posizionesubordinato obj) {
        removeToManyTarget("toPosizionesubordinato", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Posizionesubordinato> getToPosizionesubordinato() {
        return (List<Posizionesubordinato>)readProperty("toPosizionesubordinato");
    }


}