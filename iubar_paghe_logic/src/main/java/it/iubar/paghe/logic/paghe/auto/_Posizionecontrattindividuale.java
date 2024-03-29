package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Contrattovoce;
import it.iubar.paghe.logic.paghe.Posizionesubordinato;

/**
 * Class _Posizionecontrattindividuale was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Posizionecontrattindividuale extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDPOSIZIONE_PROPERTY = "idposizione";
    public static final String IDVOCE_PROPERTY = "idvoce";
    public static final String IMPORTO_PROPERTY = "importo";
    public static final String PERCSUCOMPETENZE_PROPERTY = "percsucompetenze";
    public static final String PERCSURETRIBGLOBALE_PROPERTY = "percsuretribglobale";
    public static final String TO_CONTRATTOVOCE_PROPERTY = "toContrattovoce";
    public static final String TO_POSIZIONESUBORDINATO_PROPERTY = "toPosizionesubordinato";

    public static final String IDPOSIZIONE_PK_COLUMN = "IDPOSIZIONE";
    public static final String IDVOCE_PK_COLUMN = "IDVOCE";

    public void setDescrizione(String descrizione) {
        writeProperty("descrizione", descrizione);
    }
    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public void setIdposizione(Integer idposizione) {
        writeProperty("idposizione", idposizione);
    }
    public Integer getIdposizione() {
        return (Integer)readProperty("idposizione");
    }

    public void setIdvoce(Short idvoce) {
        writeProperty("idvoce", idvoce);
    }
    public Short getIdvoce() {
        return (Short)readProperty("idvoce");
    }

    public void setImporto(BigDecimal importo) {
        writeProperty("importo", importo);
    }
    public BigDecimal getImporto() {
        return (BigDecimal)readProperty("importo");
    }

    public void setPercsucompetenze(BigDecimal percsucompetenze) {
        writeProperty("percsucompetenze", percsucompetenze);
    }
    public BigDecimal getPercsucompetenze() {
        return (BigDecimal)readProperty("percsucompetenze");
    }

    public void setPercsuretribglobale(BigDecimal percsuretribglobale) {
        writeProperty("percsuretribglobale", percsuretribglobale);
    }
    public BigDecimal getPercsuretribglobale() {
        return (BigDecimal)readProperty("percsuretribglobale");
    }

    public void setToContrattovoce(Contrattovoce toContrattovoce) {
        setToOneTarget("toContrattovoce", toContrattovoce, true);
    }

    public Contrattovoce getToContrattovoce() {
        return (Contrattovoce)readProperty("toContrattovoce");
    }


    public void setToPosizionesubordinato(Posizionesubordinato toPosizionesubordinato) {
        setToOneTarget("toPosizionesubordinato", toPosizionesubordinato, true);
    }

    public Posizionesubordinato getToPosizionesubordinato() {
        return (Posizionesubordinato)readProperty("toPosizionesubordinato");
    }


}
