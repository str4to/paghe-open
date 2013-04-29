package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Contrattofestivitaretrib;
import it.iubar.paghe.logic.presenze.Tipofestivita;

/**
 * Class _Contrattofestivitaretrib2 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Contrattofestivitaretrib2 extends CayenneDataObject {

    public static final String FRAZIONERETRIBMENSILE_PROPERTY = "frazioneretribmensile";
    public static final String FRAZIONERETRIBMINIMA_PROPERTY = "frazioneretribminima";
    public static final String FRAZIONERETRIBSETT_PROPERTY = "frazioneretribsett";
    public static final String IDFESTIVITARETRIB_PROPERTY = "idfestivitaretrib";
    public static final String IDTIPOFESTIVITA_PROPERTY = "idtipofestivita";
    public static final String IMPORTOFISSO_PROPERTY = "importofisso";
    public static final String MAGGIORAZIONEORARIA_PROPERTY = "maggiorazioneoraria";
    public static final String OPZIONE_PROPERTY = "opzione";
    public static final String ORERETRIBUZIONE_PROPERTY = "oreretribuzione";
    public static final String ORERIPOSO_PROPERTY = "oreriposo";
    public static final String TRATTAMENTODOMENICALE_PROPERTY = "trattamentodomenicale";
    public static final String TO_FESTIVITARETRIBUZIONE_PROPERTY = "toFestivitaretribuzione";
    public static final String TO_TIPOFESTIVITA_PROPERTY = "toTipofestivita";

    public static final String IDFESTIVITARETRIB_PK_COLUMN = "IDFESTIVITARETRIB";
    public static final String IDTIPOFESTIVITA_PK_COLUMN = "IDTIPOFESTIVITA";

    public void setFrazioneretribmensile(BigDecimal frazioneretribmensile) {
        writeProperty("frazioneretribmensile", frazioneretribmensile);
    }
    public BigDecimal getFrazioneretribmensile() {
        return (BigDecimal)readProperty("frazioneretribmensile");
    }

    public void setFrazioneretribminima(BigDecimal frazioneretribminima) {
        writeProperty("frazioneretribminima", frazioneretribminima);
    }
    public BigDecimal getFrazioneretribminima() {
        return (BigDecimal)readProperty("frazioneretribminima");
    }

    public void setFrazioneretribsett(BigDecimal frazioneretribsett) {
        writeProperty("frazioneretribsett", frazioneretribsett);
    }
    public BigDecimal getFrazioneretribsett() {
        return (BigDecimal)readProperty("frazioneretribsett");
    }

    public void setIdfestivitaretrib(Short idfestivitaretrib) {
        writeProperty("idfestivitaretrib", idfestivitaretrib);
    }
    public Short getIdfestivitaretrib() {
        return (Short)readProperty("idfestivitaretrib");
    }

    public void setIdtipofestivita(Short idtipofestivita) {
        writeProperty("idtipofestivita", idtipofestivita);
    }
    public Short getIdtipofestivita() {
        return (Short)readProperty("idtipofestivita");
    }

    public void setImportofisso(BigDecimal importofisso) {
        writeProperty("importofisso", importofisso);
    }
    public BigDecimal getImportofisso() {
        return (BigDecimal)readProperty("importofisso");
    }

    public void setMaggiorazioneoraria(BigDecimal maggiorazioneoraria) {
        writeProperty("maggiorazioneoraria", maggiorazioneoraria);
    }
    public BigDecimal getMaggiorazioneoraria() {
        return (BigDecimal)readProperty("maggiorazioneoraria");
    }

    public void setOpzione(Short opzione) {
        writeProperty("opzione", opzione);
    }
    public Short getOpzione() {
        return (Short)readProperty("opzione");
    }

    public void setOreretribuzione(BigDecimal oreretribuzione) {
        writeProperty("oreretribuzione", oreretribuzione);
    }
    public BigDecimal getOreretribuzione() {
        return (BigDecimal)readProperty("oreretribuzione");
    }

    public void setOreriposo(BigDecimal oreriposo) {
        writeProperty("oreriposo", oreriposo);
    }
    public BigDecimal getOreriposo() {
        return (BigDecimal)readProperty("oreriposo");
    }

    public void setTrattamentodomenicale(Short trattamentodomenicale) {
        writeProperty("trattamentodomenicale", trattamentodomenicale);
    }
    public Short getTrattamentodomenicale() {
        return (Short)readProperty("trattamentodomenicale");
    }

    public void setToFestivitaretribuzione(Contrattofestivitaretrib toFestivitaretribuzione) {
        setToOneTarget("toFestivitaretribuzione", toFestivitaretribuzione, true);
    }

    public Contrattofestivitaretrib getToFestivitaretribuzione() {
        return (Contrattofestivitaretrib)readProperty("toFestivitaretribuzione");
    }


    public void setToTipofestivita(Tipofestivita toTipofestivita) {
        setToOneTarget("toTipofestivita", toTipofestivita, true);
    }

    public Tipofestivita getToTipofestivita() {
        return (Tipofestivita)readProperty("toTipofestivita");
    }


}
