package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.InpsEvento;
import it.iubar.paghe.logic.paghe.Settimana;

/**
 * Class _SettimanaEvento was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _SettimanaEvento extends CayenneDataObject {

    public static final String DIFFACCREDITO_PROPERTY = "diffaccredito";
    public static final String GIORNIINTERESSATI_PROPERTY = "giorniinteressati";
    public static final String IDDATORETRIBUTIVO_PROPERTY = "iddatoretributivo";
    public static final String IDINPSEVENTO_PROPERTY = "idinpsevento";
    public static final String IDSETTIMANA_PROPERTY = "idsettimana";
    public static final String OREINTERESSATE_PROPERTY = "oreinteressate";
    public static final String SETTIMANEINPS_PROPERTY = "settimaneinps";
    public static final String TO_INPS_CODEVENTO_PROPERTY = "toInpsCodevento";
    public static final String TO_SETTIMANA_PROPERTY = "toSettimana";

    public static final String IDDATORETRIBUTIVO_PK_COLUMN = "IDDATORETRIBUTIVO";
    public static final String IDINPSEVENTO_PK_COLUMN = "IDINPSEVENTO";
    public static final String IDSETTIMANA_PK_COLUMN = "IDSETTIMANA";

    public void setDiffaccredito(BigDecimal diffaccredito) {
        writeProperty("diffaccredito", diffaccredito);
    }
    public BigDecimal getDiffaccredito() {
        return (BigDecimal)readProperty("diffaccredito");
    }

    public void setGiorniinteressati(BigDecimal giorniinteressati) {
        writeProperty("giorniinteressati", giorniinteressati);
    }
    public BigDecimal getGiorniinteressati() {
        return (BigDecimal)readProperty("giorniinteressati");
    }

    public void setIddatoretributivo(Integer iddatoretributivo) {
        writeProperty("iddatoretributivo", iddatoretributivo);
    }
    public Integer getIddatoretributivo() {
        return (Integer)readProperty("iddatoretributivo");
    }

    public void setIdinpsevento(String idinpsevento) {
        writeProperty("idinpsevento", idinpsevento);
    }
    public String getIdinpsevento() {
        return (String)readProperty("idinpsevento");
    }

    public void setIdsettimana(Short idsettimana) {
        writeProperty("idsettimana", idsettimana);
    }
    public Short getIdsettimana() {
        return (Short)readProperty("idsettimana");
    }

    public void setOreinteressate(BigDecimal oreinteressate) {
        writeProperty("oreinteressate", oreinteressate);
    }
    public BigDecimal getOreinteressate() {
        return (BigDecimal)readProperty("oreinteressate");
    }

    public void setSettimaneinps(BigDecimal settimaneinps) {
        writeProperty("settimaneinps", settimaneinps);
    }
    public BigDecimal getSettimaneinps() {
        return (BigDecimal)readProperty("settimaneinps");
    }

    public void setToInpsCodevento(InpsEvento toInpsCodevento) {
        setToOneTarget("toInpsCodevento", toInpsCodevento, true);
    }

    public InpsEvento getToInpsCodevento() {
        return (InpsEvento)readProperty("toInpsCodevento");
    }


    public void setToSettimana(Settimana toSettimana) {
        setToOneTarget("toSettimana", toSettimana, true);
    }

    public Settimana getToSettimana() {
        return (Settimana)readProperty("toSettimana");
    }


}