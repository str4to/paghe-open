package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.anagrafica.Impresa;
import it.iubar.paghe.logic.paghe.CedolinoElemento;
import it.iubar.paghe.logic.paghe.CoEnteprevidenziale;
import it.iubar.paghe.logic.paghe.ContrattodettElemento;
import it.iubar.paghe.logic.paghe.Elementobaseimponibile;
import it.iubar.paghe.logic.paghe.Frequenza;
import it.iubar.paghe.logic.paghe.Profilocontrattindividuale2;
import it.iubar.paghe.logic.paghe.Tipoassenza;
import it.iubar.paghe.logic.paghe.Tipoelementoretributivo;
import it.iubar.paghe.logic.paghe.Tipoelementoretributivo2;

/**
 * Class _Elementoretributivo was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Elementoretributivo extends CayenneDataObject {

    public static final String ALIQUOTAPREVIDENZ_PROPERTY = "aliquotaprevidenz";
    public static final String CONTRATTUALIZZATO_PROPERTY = "contrattualizzato";
    public static final String CUSTOM_PROPERTY = "custom";
    public static final String DATAEROGAZIONE_PROPERTY = "dataerogazione";
    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String DESCRIZIONE2_PROPERTY = "descrizione2";
    public static final String FIGURATIVO_PROPERTY = "figurativo";
    public static final String IDELEMENTO_PROPERTY = "idelemento";
    public static final String IDENTEPREVIDENZIALE_PROPERTY = "identeprevidenziale";
    public static final String IDFREQUENZA_PROPERTY = "idfrequenza";
    public static final String IDTIPOELEMENTO_PROPERTY = "idtipoelemento";
    public static final String IDTIPOELEMENTO2_PROPERTY = "idtipoelemento2";
    public static final String IMPORTO_PROPERTY = "importo";
    public static final String INAIL_PROPERTY = "inail";
    public static final String INAILALIQUOTA_PROPERTY = "inailaliquota";
    public static final String INDIRETTO_PROPERTY = "indiretto";
    public static final String IRPEF_PROPERTY = "irpef";
    public static final String IRPEFALIQUOTA_PROPERTY = "irpefaliquota";
    public static final String IRPEFALIQUOTASOST_PROPERTY = "irpefaliquotasost";
    public static final String LIMITEQUANTITAANNUA_PROPERTY = "limitequantitaannua";
    public static final String NASCOSTO_PROPERTY = "nascosto";
    public static final String NETTO_PROPERTY = "netto";
    public static final String NOTE_PROPERTY = "note";
    public static final String PERCENTUALE_PROPERTY = "percentuale";
    public static final String RECALC_PROPERTY = "recalc";
    public static final String RIFCONTRATTO_PROPERTY = "rifcontratto";
    public static final String RIFTIPOLAVORATORE_PROPERTY = "riftipolavoratore";
    public static final String TFR_PROPERTY = "tfr";
    public static final String CEDOLINO_ELEMENTO_ARRAY_PROPERTY = "cedolinoElementoArray";
    public static final String CONTRATTODETT_ELEMENTO_ARRAY_PROPERTY = "contrattodettElementoArray";
    public static final String PROFILOCONTRATTINDIVIDUALE2ARRAY_PROPERTY = "profilocontrattindividuale2Array";
    public static final String TIPOASSENZA_ARRAY_PROPERTY = "tipoassenzaArray";
    public static final String TO_ELEMENTOBASEIMPONIBILE_PROPERTY = "toElementobaseimponibile";
    public static final String TO_ENTEPREVIDENZIALE_PROPERTY = "toEnteprevidenziale";
    public static final String TO_FREQUENZA_PROPERTY = "toFrequenza";
    public static final String TO_IMPRESA_PROPERTY = "toImpresa";
    public static final String TO_TIPOELEMENTO_PROPERTY = "toTipoelemento";
    public static final String TO_TIPOELEMENTO2_PROPERTY = "toTipoelemento2";

    public static final String IDELEMENTO_PK_COLUMN = "IDELEMENTO";

    public void setAliquotaprevidenz(BigDecimal aliquotaprevidenz) {
        writeProperty("aliquotaprevidenz", aliquotaprevidenz);
    }
    public BigDecimal getAliquotaprevidenz() {
        return (BigDecimal)readProperty("aliquotaprevidenz");
    }

    public void setContrattualizzato(Short contrattualizzato) {
        writeProperty("contrattualizzato", contrattualizzato);
    }
    public Short getContrattualizzato() {
        return (Short)readProperty("contrattualizzato");
    }

    public void setCustom(Short custom) {
        writeProperty("custom", custom);
    }
    public Short getCustom() {
        return (Short)readProperty("custom");
    }

    public void setDataerogazione(Date dataerogazione) {
        writeProperty("dataerogazione", dataerogazione);
    }
    public Date getDataerogazione() {
        return (Date)readProperty("dataerogazione");
    }

    public void setDescrizione(String descrizione) {
        writeProperty("descrizione", descrizione);
    }
    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public void setDescrizione2(String descrizione2) {
        writeProperty("descrizione2", descrizione2);
    }
    public String getDescrizione2() {
        return (String)readProperty("descrizione2");
    }

    public void setFigurativo(Short figurativo) {
        writeProperty("figurativo", figurativo);
    }
    public Short getFigurativo() {
        return (Short)readProperty("figurativo");
    }

    public void setIdelemento(Integer idelemento) {
        writeProperty("idelemento", idelemento);
    }
    public Integer getIdelemento() {
        return (Integer)readProperty("idelemento");
    }

    public void setIdenteprevidenziale(Short identeprevidenziale) {
        writeProperty("identeprevidenziale", identeprevidenziale);
    }
    public Short getIdenteprevidenziale() {
        return (Short)readProperty("identeprevidenziale");
    }

    public void setIdfrequenza(Short idfrequenza) {
        writeProperty("idfrequenza", idfrequenza);
    }
    public Short getIdfrequenza() {
        return (Short)readProperty("idfrequenza");
    }

    public void setIdtipoelemento(Short idtipoelemento) {
        writeProperty("idtipoelemento", idtipoelemento);
    }
    public Short getIdtipoelemento() {
        return (Short)readProperty("idtipoelemento");
    }

    public void setIdtipoelemento2(Short idtipoelemento2) {
        writeProperty("idtipoelemento2", idtipoelemento2);
    }
    public Short getIdtipoelemento2() {
        return (Short)readProperty("idtipoelemento2");
    }

    public void setImporto(BigDecimal importo) {
        writeProperty("importo", importo);
    }
    public BigDecimal getImporto() {
        return (BigDecimal)readProperty("importo");
    }

    public void setInail(Short inail) {
        writeProperty("inail", inail);
    }
    public Short getInail() {
        return (Short)readProperty("inail");
    }

    public void setInailaliquota(BigDecimal inailaliquota) {
        writeProperty("inailaliquota", inailaliquota);
    }
    public BigDecimal getInailaliquota() {
        return (BigDecimal)readProperty("inailaliquota");
    }

    public void setIndiretto(Short indiretto) {
        writeProperty("indiretto", indiretto);
    }
    public Short getIndiretto() {
        return (Short)readProperty("indiretto");
    }

    public void setIrpef(Short irpef) {
        writeProperty("irpef", irpef);
    }
    public Short getIrpef() {
        return (Short)readProperty("irpef");
    }

    public void setIrpefaliquota(BigDecimal irpefaliquota) {
        writeProperty("irpefaliquota", irpefaliquota);
    }
    public BigDecimal getIrpefaliquota() {
        return (BigDecimal)readProperty("irpefaliquota");
    }

    public void setIrpefaliquotasost(BigDecimal irpefaliquotasost) {
        writeProperty("irpefaliquotasost", irpefaliquotasost);
    }
    public BigDecimal getIrpefaliquotasost() {
        return (BigDecimal)readProperty("irpefaliquotasost");
    }

    public void setLimitequantitaannua(Integer limitequantitaannua) {
        writeProperty("limitequantitaannua", limitequantitaannua);
    }
    public Integer getLimitequantitaannua() {
        return (Integer)readProperty("limitequantitaannua");
    }

    public void setNascosto(Short nascosto) {
        writeProperty("nascosto", nascosto);
    }
    public Short getNascosto() {
        return (Short)readProperty("nascosto");
    }

    public void setNetto(Short netto) {
        writeProperty("netto", netto);
    }
    public Short getNetto() {
        return (Short)readProperty("netto");
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

    public void setRecalc(Short recalc) {
        writeProperty("recalc", recalc);
    }
    public Short getRecalc() {
        return (Short)readProperty("recalc");
    }

    public void setRifcontratto(Short rifcontratto) {
        writeProperty("rifcontratto", rifcontratto);
    }
    public Short getRifcontratto() {
        return (Short)readProperty("rifcontratto");
    }

    public void setRiftipolavoratore(Short riftipolavoratore) {
        writeProperty("riftipolavoratore", riftipolavoratore);
    }
    public Short getRiftipolavoratore() {
        return (Short)readProperty("riftipolavoratore");
    }

    public void setTfr(Short tfr) {
        writeProperty("tfr", tfr);
    }
    public Short getTfr() {
        return (Short)readProperty("tfr");
    }

    public void addToCedolinoElementoArray(CedolinoElemento obj) {
        addToManyTarget("cedolinoElementoArray", obj, true);
    }
    public void removeFromCedolinoElementoArray(CedolinoElemento obj) {
        removeToManyTarget("cedolinoElementoArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<CedolinoElemento> getCedolinoElementoArray() {
        return (List<CedolinoElemento>)readProperty("cedolinoElementoArray");
    }


    public void addToContrattodettElementoArray(ContrattodettElemento obj) {
        addToManyTarget("contrattodettElementoArray", obj, true);
    }
    public void removeFromContrattodettElementoArray(ContrattodettElemento obj) {
        removeToManyTarget("contrattodettElementoArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<ContrattodettElemento> getContrattodettElementoArray() {
        return (List<ContrattodettElemento>)readProperty("contrattodettElementoArray");
    }


    public void addToProfilocontrattindividuale2Array(Profilocontrattindividuale2 obj) {
        addToManyTarget("profilocontrattindividuale2Array", obj, true);
    }
    public void removeFromProfilocontrattindividuale2Array(Profilocontrattindividuale2 obj) {
        removeToManyTarget("profilocontrattindividuale2Array", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Profilocontrattindividuale2> getProfilocontrattindividuale2Array() {
        return (List<Profilocontrattindividuale2>)readProperty("profilocontrattindividuale2Array");
    }


    public void addToTipoassenzaArray(Tipoassenza obj) {
        addToManyTarget("tipoassenzaArray", obj, true);
    }
    public void removeFromTipoassenzaArray(Tipoassenza obj) {
        removeToManyTarget("tipoassenzaArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Tipoassenza> getTipoassenzaArray() {
        return (List<Tipoassenza>)readProperty("tipoassenzaArray");
    }


    public void setToElementobaseimponibile(Elementobaseimponibile toElementobaseimponibile) {
        setToOneTarget("toElementobaseimponibile", toElementobaseimponibile, true);
    }

    public Elementobaseimponibile getToElementobaseimponibile() {
        return (Elementobaseimponibile)readProperty("toElementobaseimponibile");
    }


    public void setToEnteprevidenziale(CoEnteprevidenziale toEnteprevidenziale) {
        setToOneTarget("toEnteprevidenziale", toEnteprevidenziale, true);
    }

    public CoEnteprevidenziale getToEnteprevidenziale() {
        return (CoEnteprevidenziale)readProperty("toEnteprevidenziale");
    }


    public void setToFrequenza(Frequenza toFrequenza) {
        setToOneTarget("toFrequenza", toFrequenza, true);
    }

    public Frequenza getToFrequenza() {
        return (Frequenza)readProperty("toFrequenza");
    }


    public void setToImpresa(Impresa toImpresa) {
        setToOneTarget("toImpresa", toImpresa, true);
    }

    public Impresa getToImpresa() {
        return (Impresa)readProperty("toImpresa");
    }


    public void setToTipoelemento(Tipoelementoretributivo toTipoelemento) {
        setToOneTarget("toTipoelemento", toTipoelemento, true);
    }

    public Tipoelementoretributivo getToTipoelemento() {
        return (Tipoelementoretributivo)readProperty("toTipoelemento");
    }


    public void setToTipoelemento2(Tipoelementoretributivo2 toTipoelemento2) {
        setToOneTarget("toTipoelemento2", toTipoelemento2, true);
    }

    public Tipoelementoretributivo2 getToTipoelemento2() {
        return (Tipoelementoretributivo2)readProperty("toTipoelemento2");
    }


}
