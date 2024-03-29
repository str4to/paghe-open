package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.anagrafica.Tipolavoratore2;
import it.iubar.paghe.logic.paghe.Contrattodettaglio;
import it.iubar.paghe.logic.paghe.Elementobaseimponibile;
import it.iubar.paghe.logic.paghe.InpsEvento;

/**
 * Class _Contrattoassenza was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Contrattoassenza extends CayenneDataObject {

    public static final String ANZIANITAA_PROPERTY = "anzianitaa";
    public static final String ANZIANITADA_PROPERTY = "anzianitada";
    public static final String CONSERVAZIONEPOSTO_PROPERTY = "conservazioneposto";
    public static final String CONTRIBUTIVO_PROPERTY = "contributivo";
    public static final String CUSTOM_PROPERTY = "custom";
    public static final String DATAAGGIORNAMENTO_PROPERTY = "dataaggiornamento";
    public static final String EROGATO_PROPERTY = "erogato";
    public static final String FISCALE_PROPERTY = "fiscale";
    public static final String GIORNIINPS_PROPERTY = "giorniinps";
    public static final String GIORNOAL_PROPERTY = "giornoal";
    public static final String GIORNODAL_PROPERTY = "giornodal";
    public static final String IDASSENZA_PROPERTY = "idassenza";
    public static final String IDBASEIMPONIBILE_PROPERTY = "idbaseimponibile";
    public static final String IDCONTRATTODETTAGLIO_PROPERTY = "idcontrattodettaglio";
    public static final String IDINPSEVENTO_PROPERTY = "idinpsevento";
    public static final String IDTIPOLAVORATORE2_PROPERTY = "idtipolavoratore2";
    public static final String INTEGRAZIONEINAIL_PROPERTY = "integrazioneinail";
    public static final String INTEGRAZIONEINAILPERC_PROPERTY = "integrazioneinailperc";
    public static final String INTEGRAZIONEINPS_PROPERTY = "integrazioneinps";
    public static final String INTEGRAZIONEINPSPERC_PROPERTY = "integrazioneinpsperc";
    public static final String MESEAL_PROPERTY = "meseal";
    public static final String MESEDAL_PROPERTY = "mesedal";
    public static final String NOTE_PROPERTY = "note";
    public static final String PERCENTUALE_PROPERTY = "percentuale";
    public static final String RECUPEROIMPRESA_PROPERTY = "recuperoimpresa";
    public static final String RECUPEROIMPRESAPERC_PROPERTY = "recuperoimpresaperc";
    public static final String VALIDOAL_PROPERTY = "validoal";
    public static final String VALIDODAL_PROPERTY = "validodal";
    public static final String TO_BASEIMPONIBILE_PROPERTY = "toBaseimponibile";
    public static final String TO_CONTRATTODETTAGLIO_PROPERTY = "toContrattodettaglio";
    public static final String TO_INPS_EVENTO_PROPERTY = "toInpsEvento";
    public static final String TO_TIPO_LAVORATORE2_PROPERTY = "toTipoLavoratore2";

    public static final String IDASSENZA_PK_COLUMN = "IDASSENZA";
    public static final String IDCONTRATTODETTAGLIO_PK_COLUMN = "IDCONTRATTODETTAGLIO";

    public void setAnzianitaa(Short anzianitaa) {
        writeProperty("anzianitaa", anzianitaa);
    }
    public Short getAnzianitaa() {
        return (Short)readProperty("anzianitaa");
    }

    public void setAnzianitada(Short anzianitada) {
        writeProperty("anzianitada", anzianitada);
    }
    public Short getAnzianitada() {
        return (Short)readProperty("anzianitada");
    }

    public void setConservazioneposto(Short conservazioneposto) {
        writeProperty("conservazioneposto", conservazioneposto);
    }
    public Short getConservazioneposto() {
        return (Short)readProperty("conservazioneposto");
    }

    public void setContributivo(Short contributivo) {
        writeProperty("contributivo", contributivo);
    }
    public Short getContributivo() {
        return (Short)readProperty("contributivo");
    }

    public void setCustom(Short custom) {
        writeProperty("custom", custom);
    }
    public Short getCustom() {
        return (Short)readProperty("custom");
    }

    public void setDataaggiornamento(Date dataaggiornamento) {
        writeProperty("dataaggiornamento", dataaggiornamento);
    }
    public Date getDataaggiornamento() {
        return (Date)readProperty("dataaggiornamento");
    }

    public void setErogato(BigDecimal erogato) {
        writeProperty("erogato", erogato);
    }
    public BigDecimal getErogato() {
        return (BigDecimal)readProperty("erogato");
    }

    public void setFiscale(Short fiscale) {
        writeProperty("fiscale", fiscale);
    }
    public Short getFiscale() {
        return (Short)readProperty("fiscale");
    }

    public void setGiorniinps(Short giorniinps) {
        writeProperty("giorniinps", giorniinps);
    }
    public Short getGiorniinps() {
        return (Short)readProperty("giorniinps");
    }

    public void setGiornoal(Short giornoal) {
        writeProperty("giornoal", giornoal);
    }
    public Short getGiornoal() {
        return (Short)readProperty("giornoal");
    }

    public void setGiornodal(Short giornodal) {
        writeProperty("giornodal", giornodal);
    }
    public Short getGiornodal() {
        return (Short)readProperty("giornodal");
    }

    public void setIdassenza(Short idassenza) {
        writeProperty("idassenza", idassenza);
    }
    public Short getIdassenza() {
        return (Short)readProperty("idassenza");
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

    public void setIdinpsevento(String idinpsevento) {
        writeProperty("idinpsevento", idinpsevento);
    }
    public String getIdinpsevento() {
        return (String)readProperty("idinpsevento");
    }

    public void setIdtipolavoratore2(Short idtipolavoratore2) {
        writeProperty("idtipolavoratore2", idtipolavoratore2);
    }
    public Short getIdtipolavoratore2() {
        return (Short)readProperty("idtipolavoratore2");
    }

    public void setIntegrazioneinail(BigDecimal integrazioneinail) {
        writeProperty("integrazioneinail", integrazioneinail);
    }
    public BigDecimal getIntegrazioneinail() {
        return (BigDecimal)readProperty("integrazioneinail");
    }

    public void setIntegrazioneinailperc(BigDecimal integrazioneinailperc) {
        writeProperty("integrazioneinailperc", integrazioneinailperc);
    }
    public BigDecimal getIntegrazioneinailperc() {
        return (BigDecimal)readProperty("integrazioneinailperc");
    }

    public void setIntegrazioneinps(BigDecimal integrazioneinps) {
        writeProperty("integrazioneinps", integrazioneinps);
    }
    public BigDecimal getIntegrazioneinps() {
        return (BigDecimal)readProperty("integrazioneinps");
    }

    public void setIntegrazioneinpsperc(BigDecimal integrazioneinpsperc) {
        writeProperty("integrazioneinpsperc", integrazioneinpsperc);
    }
    public BigDecimal getIntegrazioneinpsperc() {
        return (BigDecimal)readProperty("integrazioneinpsperc");
    }

    public void setMeseal(Short meseal) {
        writeProperty("meseal", meseal);
    }
    public Short getMeseal() {
        return (Short)readProperty("meseal");
    }

    public void setMesedal(Short mesedal) {
        writeProperty("mesedal", mesedal);
    }
    public Short getMesedal() {
        return (Short)readProperty("mesedal");
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

    public void setRecuperoimpresa(BigDecimal recuperoimpresa) {
        writeProperty("recuperoimpresa", recuperoimpresa);
    }
    public BigDecimal getRecuperoimpresa() {
        return (BigDecimal)readProperty("recuperoimpresa");
    }

    public void setRecuperoimpresaperc(BigDecimal recuperoimpresaperc) {
        writeProperty("recuperoimpresaperc", recuperoimpresaperc);
    }
    public BigDecimal getRecuperoimpresaperc() {
        return (BigDecimal)readProperty("recuperoimpresaperc");
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


    public void setToInpsEvento(InpsEvento toInpsEvento) {
        setToOneTarget("toInpsEvento", toInpsEvento, true);
    }

    public InpsEvento getToInpsEvento() {
        return (InpsEvento)readProperty("toInpsEvento");
    }


    public void setToTipoLavoratore2(Tipolavoratore2 toTipoLavoratore2) {
        setToOneTarget("toTipoLavoratore2", toTipoLavoratore2, true);
    }

    public Tipolavoratore2 getToTipoLavoratore2() {
        return (Tipolavoratore2)readProperty("toTipoLavoratore2");
    }


}
