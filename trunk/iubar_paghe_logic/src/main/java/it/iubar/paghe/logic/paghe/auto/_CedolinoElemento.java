package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Cedolino;
import it.iubar.paghe.logic.paghe.Datoretributivo;
import it.iubar.paghe.logic.paghe.Elementoretributivo;
import it.iubar.paghe.logic.paghe.Tipofoglio;
import it.iubar.paghe.logic.paghe.Unitamisura;

/**
 * Class _CedolinoElemento was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CedolinoElemento extends CayenneDataObject {

    public static final String CALCOLATO_PROPERTY = "calcolato";
    public static final String IDDATORETRIBUTIVO_PROPERTY = "iddatoretributivo";
    public static final String IDELEMENTO_PROPERTY = "idelemento";
    public static final String IDPOSIZIONE_PROPERTY = "idposizione";
    public static final String IDPROGRESSIVO_PROPERTY = "idprogressivo";
    public static final String IDTIPOFOGLIO_PROPERTY = "idtipofoglio";
    public static final String IDUNITAMISURA_PROPERTY = "idunitamisura";
    public static final String IMPORTO_PROPERTY = "importo";
    public static final String NASCOSTO_PROPERTY = "nascosto";
    public static final String NOTE_PROPERTY = "note";
    public static final String NOTE2_PROPERTY = "note2";
    public static final String PERCENTUALE_PROPERTY = "percentuale";
    public static final String QUANTITA_PROPERTY = "quantita";
    public static final String RICORRENTE_PROPERTY = "ricorrente";
    public static final String TO_CEDOLINO_PROPERTY = "toCedolino";
    public static final String TO_DATORETRIBUTIVO_PROPERTY = "toDatoretributivo";
    public static final String TO_ELEMENTORETRIBUTIVO_PROPERTY = "toElementoretributivo";
    public static final String TO_TIPOFOGLIO_PROPERTY = "toTipofoglio";
    public static final String TO_UNITAMISURA_PROPERTY = "toUnitamisura";

    public static final String IDDATORETRIBUTIVO_PK_COLUMN = "IDDATORETRIBUTIVO";
    public static final String IDELEMENTO_PK_COLUMN = "IDELEMENTO";
    public static final String IDPOSIZIONE_PK_COLUMN = "IDPOSIZIONE";
    public static final String IDPROGRESSIVO_PK_COLUMN = "IDPROGRESSIVO";
    public static final String IDTIPOFOGLIO_PK_COLUMN = "IDTIPOFOGLIO";

    public void setCalcolato(Short calcolato) {
        writeProperty("calcolato", calcolato);
    }
    public Short getCalcolato() {
        return (Short)readProperty("calcolato");
    }

    public void setIddatoretributivo(Integer iddatoretributivo) {
        writeProperty("iddatoretributivo", iddatoretributivo);
    }
    public Integer getIddatoretributivo() {
        return (Integer)readProperty("iddatoretributivo");
    }

    public void setIdelemento(Integer idelemento) {
        writeProperty("idelemento", idelemento);
    }
    public Integer getIdelemento() {
        return (Integer)readProperty("idelemento");
    }

    public void setIdposizione(Integer idposizione) {
        writeProperty("idposizione", idposizione);
    }
    public Integer getIdposizione() {
        return (Integer)readProperty("idposizione");
    }

    public void setIdprogressivo(Short idprogressivo) {
        writeProperty("idprogressivo", idprogressivo);
    }
    public Short getIdprogressivo() {
        return (Short)readProperty("idprogressivo");
    }

    public void setIdtipofoglio(Short idtipofoglio) {
        writeProperty("idtipofoglio", idtipofoglio);
    }
    public Short getIdtipofoglio() {
        return (Short)readProperty("idtipofoglio");
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

    public void setNascosto(Short nascosto) {
        writeProperty("nascosto", nascosto);
    }
    public Short getNascosto() {
        return (Short)readProperty("nascosto");
    }

    public void setNote(String note) {
        writeProperty("note", note);
    }
    public String getNote() {
        return (String)readProperty("note");
    }

    public void setNote2(String note2) {
        writeProperty("note2", note2);
    }
    public String getNote2() {
        return (String)readProperty("note2");
    }

    public void setPercentuale(BigDecimal percentuale) {
        writeProperty("percentuale", percentuale);
    }
    public BigDecimal getPercentuale() {
        return (BigDecimal)readProperty("percentuale");
    }

    public void setQuantita(BigDecimal quantita) {
        writeProperty("quantita", quantita);
    }
    public BigDecimal getQuantita() {
        return (BigDecimal)readProperty("quantita");
    }

    public void setRicorrente(Short ricorrente) {
        writeProperty("ricorrente", ricorrente);
    }
    public Short getRicorrente() {
        return (Short)readProperty("ricorrente");
    }

    public void setToCedolino(Cedolino toCedolino) {
        setToOneTarget("toCedolino", toCedolino, true);
    }

    public Cedolino getToCedolino() {
        return (Cedolino)readProperty("toCedolino");
    }


    public void setToDatoretributivo(Datoretributivo toDatoretributivo) {
        setToOneTarget("toDatoretributivo", toDatoretributivo, true);
    }

    public Datoretributivo getToDatoretributivo() {
        return (Datoretributivo)readProperty("toDatoretributivo");
    }


    public void setToElementoretributivo(Elementoretributivo toElementoretributivo) {
        setToOneTarget("toElementoretributivo", toElementoretributivo, true);
    }

    public Elementoretributivo getToElementoretributivo() {
        return (Elementoretributivo)readProperty("toElementoretributivo");
    }


    public void setToTipofoglio(Tipofoglio toTipofoglio) {
        setToOneTarget("toTipofoglio", toTipofoglio, true);
    }

    public Tipofoglio getToTipofoglio() {
        return (Tipofoglio)readProperty("toTipofoglio");
    }


    public void setToUnitamisura(Unitamisura toUnitamisura) {
        setToOneTarget("toUnitamisura", toUnitamisura, true);
    }

    public Unitamisura getToUnitamisura() {
        return (Unitamisura)readProperty("toUnitamisura");
    }


}
