package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.TfrContribimppreg;
import it.iubar.paghe.logic.paghe.TfrMesetesoreria;

/**
 * Class _TfrContribuzione was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _TfrContribuzione extends CayenneDataObject {

    public static final String IDPOSIZIONE_PROPERTY = "idposizione";
    public static final String IMPORTOCORRENTE_PROPERTY = "importocorrente";
    public static final String RESTITUZIONEIMPOSTASOST_PROPERTY = "restituzioneimpostasost";
    public static final String RIVALUTAZIONE_PROPERTY = "rivalutazione";
    public static final String TFR_CONTRIB_IMP_PREG_ARRAY_PROPERTY = "tfrContribImpPregArray";
    public static final String TO_TFR_MESETESORERIA_PROPERTY = "toTfrMesetesoreria";

    public static final String IDPOSIZIONE_PK_COLUMN = "IDPOSIZIONE";

    public void setIdposizione(Integer idposizione) {
        writeProperty("idposizione", idposizione);
    }
    public Integer getIdposizione() {
        return (Integer)readProperty("idposizione");
    }

    public void setImportocorrente(BigDecimal importocorrente) {
        writeProperty("importocorrente", importocorrente);
    }
    public BigDecimal getImportocorrente() {
        return (BigDecimal)readProperty("importocorrente");
    }

    public void setRestituzioneimpostasost(BigDecimal restituzioneimpostasost) {
        writeProperty("restituzioneimpostasost", restituzioneimpostasost);
    }
    public BigDecimal getRestituzioneimpostasost() {
        return (BigDecimal)readProperty("restituzioneimpostasost");
    }

    public void setRivalutazione(BigDecimal rivalutazione) {
        writeProperty("rivalutazione", rivalutazione);
    }
    public BigDecimal getRivalutazione() {
        return (BigDecimal)readProperty("rivalutazione");
    }

    public void addToTfrContribImpPregArray(TfrContribimppreg obj) {
        addToManyTarget("tfrContribImpPregArray", obj, true);
    }
    public void removeFromTfrContribImpPregArray(TfrContribimppreg obj) {
        removeToManyTarget("tfrContribImpPregArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<TfrContribimppreg> getTfrContribImpPregArray() {
        return (List<TfrContribimppreg>)readProperty("tfrContribImpPregArray");
    }


    public void setToTfrMesetesoreria(TfrMesetesoreria toTfrMesetesoreria) {
        setToOneTarget("toTfrMesetesoreria", toTfrMesetesoreria, true);
    }

    public TfrMesetesoreria getToTfrMesetesoreria() {
        return (TfrMesetesoreria)readProperty("toTfrMesetesoreria");
    }


}
