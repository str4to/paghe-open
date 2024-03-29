package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.anagrafica.Tipolavoratore2;
import it.iubar.paghe.logic.paghe.Contrattodettaglio;
import it.iubar.paghe.logic.paghe.ContrattoindennitaLivello;
import it.iubar.paghe.logic.paghe.Elementobaseimponibile;
import it.iubar.paghe.logic.paghe.Frequenza;
import it.iubar.paghe.logic.paghe.Posizioneindennita;
import it.iubar.paghe.logic.paghe.Profiloindennita;
import it.iubar.paghe.logic.paghe.Tipoindennita;
import it.iubar.paghe.logic.paghe.Unitamisura;

/**
 * Class _Contrattoindennita was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Contrattoindennita extends CayenneDataObject {

    public static final String CUSTOM_PROPERTY = "custom";
    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDBASEIMPONIBILE_PROPERTY = "idbaseimponibile";
    public static final String IDCONTRATTODETTAGLIO_PROPERTY = "idcontrattodettaglio";
    public static final String IDFREQUENZA_PROPERTY = "idfrequenza";
    public static final String IDINDENNITA_PROPERTY = "idindennita";
    public static final String IDTIPOINDENNITA_PROPERTY = "idtipoindennita";
    public static final String IDTIPOLAVORATORE2_PROPERTY = "idtipolavoratore2";
    public static final String IDUNITAMISURA_PROPERTY = "idunitamisura";
    public static final String IMPORTO_PROPERTY = "importo";
    public static final String NOTE_PROPERTY = "note";
    public static final String PERCENTUALE_PROPERTY = "percentuale";
    public static final String ULTIMAMODIFICA_PROPERTY = "ultimamodifica";
    public static final String ULTIMAMODIFICAUSER_PROPERTY = "ultimamodificauser";
    public static final String VALIDOAL_PROPERTY = "validoal";
    public static final String VALIDODAL_PROPERTY = "validodal";
    public static final String CONTRATTOINDENNITA_LIVELLO_ARRAY_PROPERTY = "contrattoindennitaLivelloArray";
    public static final String POSIZIONEINDENNITA_ARRAY_PROPERTY = "posizioneindennitaArray";
    public static final String PROFILOINDENNITA_ARRAY_PROPERTY = "profiloindennitaArray";
    public static final String TO_BASEIMPONIBILE_PROPERTY = "toBaseimponibile";
    public static final String TO_CONTRATTODETTAGLIO_PROPERTY = "toContrattodettaglio";
    public static final String TO_FREQUENZA_PROPERTY = "toFrequenza";
    public static final String TO_TIPOINDENNITA_PROPERTY = "toTipoindennita";
    public static final String TO_TIPOLAVORATORE2_PROPERTY = "toTipolavoratore2";
    public static final String TO_UNITAMISURA_PROPERTY = "toUnitamisura";

    public static final String IDCONTRATTODETTAGLIO_PK_COLUMN = "IDCONTRATTODETTAGLIO";
    public static final String IDINDENNITA_PK_COLUMN = "IDINDENNITA";

    public void setCustom(Short custom) {
        writeProperty("custom", custom);
    }
    public Short getCustom() {
        return (Short)readProperty("custom");
    }

    public void setDescrizione(String descrizione) {
        writeProperty("descrizione", descrizione);
    }
    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public void setIdbaseimponibile(Integer idbaseimponibile) {
        writeProperty("idbaseimponibile", idbaseimponibile);
    }
    public Integer getIdbaseimponibile() {
        return (Integer)readProperty("idbaseimponibile");
    }

    public void setIdcontrattodettaglio(Integer idcontrattodettaglio) {
        writeProperty("idcontrattodettaglio", idcontrattodettaglio);
    }
    public Integer getIdcontrattodettaglio() {
        return (Integer)readProperty("idcontrattodettaglio");
    }

    public void setIdfrequenza(Short idfrequenza) {
        writeProperty("idfrequenza", idfrequenza);
    }
    public Short getIdfrequenza() {
        return (Short)readProperty("idfrequenza");
    }

    public void setIdindennita(Short idindennita) {
        writeProperty("idindennita", idindennita);
    }
    public Short getIdindennita() {
        return (Short)readProperty("idindennita");
    }

    public void setIdtipoindennita(Short idtipoindennita) {
        writeProperty("idtipoindennita", idtipoindennita);
    }
    public Short getIdtipoindennita() {
        return (Short)readProperty("idtipoindennita");
    }

    public void setIdtipolavoratore2(Short idtipolavoratore2) {
        writeProperty("idtipolavoratore2", idtipolavoratore2);
    }
    public Short getIdtipolavoratore2() {
        return (Short)readProperty("idtipolavoratore2");
    }

    public void setIdunitamisura(Short idunitamisura) {
        writeProperty("idunitamisura", idunitamisura);
    }
    public Short getIdunitamisura() {
        return (Short)readProperty("idunitamisura");
    }

    public void setImporto(BigDecimal importo) {
        writeProperty("importo", importo);
    }
    public BigDecimal getImporto() {
        return (BigDecimal)readProperty("importo");
    }

    public void setNote(String note) {
        writeProperty("note", note);
    }
    public String getNote() {
        return (String)readProperty("note");
    }

    public void setPercentuale(BigDecimal percentuale) {
        writeProperty("percentuale", percentuale);
    }
    public BigDecimal getPercentuale() {
        return (BigDecimal)readProperty("percentuale");
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

    public void setValidoal(Date validoal) {
        writeProperty("validoal", validoal);
    }
    public Date getValidoal() {
        return (Date)readProperty("validoal");
    }

    public void setValidodal(Date validodal) {
        writeProperty("validodal", validodal);
    }
    public Date getValidodal() {
        return (Date)readProperty("validodal");
    }

    public void addToContrattoindennitaLivelloArray(ContrattoindennitaLivello obj) {
        addToManyTarget("contrattoindennitaLivelloArray", obj, true);
    }
    public void removeFromContrattoindennitaLivelloArray(ContrattoindennitaLivello obj) {
        removeToManyTarget("contrattoindennitaLivelloArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<ContrattoindennitaLivello> getContrattoindennitaLivelloArray() {
        return (List<ContrattoindennitaLivello>)readProperty("contrattoindennitaLivelloArray");
    }


    public void addToPosizioneindennitaArray(Posizioneindennita obj) {
        addToManyTarget("posizioneindennitaArray", obj, true);
    }
    public void removeFromPosizioneindennitaArray(Posizioneindennita obj) {
        removeToManyTarget("posizioneindennitaArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Posizioneindennita> getPosizioneindennitaArray() {
        return (List<Posizioneindennita>)readProperty("posizioneindennitaArray");
    }


    public void addToProfiloindennitaArray(Profiloindennita obj) {
        addToManyTarget("profiloindennitaArray", obj, true);
    }
    public void removeFromProfiloindennitaArray(Profiloindennita obj) {
        removeToManyTarget("profiloindennitaArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Profiloindennita> getProfiloindennitaArray() {
        return (List<Profiloindennita>)readProperty("profiloindennitaArray");
    }


    public void setToBaseimponibile(Elementobaseimponibile toBaseimponibile) {
        setToOneTarget("toBaseimponibile", toBaseimponibile, true);
    }

    public Elementobaseimponibile getToBaseimponibile() {
        return (Elementobaseimponibile)readProperty("toBaseimponibile");
    }


    public void setToContrattodettaglio(Contrattodettaglio toContrattodettaglio) {
        setToOneTarget("toContrattodettaglio", toContrattodettaglio, true);
    }

    public Contrattodettaglio getToContrattodettaglio() {
        return (Contrattodettaglio)readProperty("toContrattodettaglio");
    }


    public void setToFrequenza(Frequenza toFrequenza) {
        setToOneTarget("toFrequenza", toFrequenza, true);
    }

    public Frequenza getToFrequenza() {
        return (Frequenza)readProperty("toFrequenza");
    }


    public void setToTipoindennita(Tipoindennita toTipoindennita) {
        setToOneTarget("toTipoindennita", toTipoindennita, true);
    }

    public Tipoindennita getToTipoindennita() {
        return (Tipoindennita)readProperty("toTipoindennita");
    }


    public void setToTipolavoratore2(Tipolavoratore2 toTipolavoratore2) {
        setToOneTarget("toTipolavoratore2", toTipolavoratore2, true);
    }

    public Tipolavoratore2 getToTipolavoratore2() {
        return (Tipolavoratore2)readProperty("toTipolavoratore2");
    }


    public void setToUnitamisura(Unitamisura toUnitamisura) {
        setToOneTarget("toUnitamisura", toUnitamisura, true);
    }

    public Unitamisura getToUnitamisura() {
        return (Unitamisura)readProperty("toUnitamisura");
    }


}
