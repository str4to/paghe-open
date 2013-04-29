package it.iubar.paghe.logic.presenze.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.presenze.Badge;

/**
 * Class _Timbratura was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Timbratura extends CayenneDataObject {

    public static final String CF_PROPERTY = "cf";
    public static final String DATA_PROPERTY = "data";
    public static final String DATAORA_PROPERTY = "dataora";
    public static final String ENTRATA_PROPERTY = "entrata";
    public static final String IDBADGE_PROPERTY = "idbadge";
    public static final String IDRILEVATORE_PROPERTY = "idrilevatore";
    public static final String IDTIMBRATURA_PROPERTY = "idtimbratura";
    public static final String ORARIO_PROPERTY = "orario";
    public static final String USCITA_PROPERTY = "uscita";
    public static final String TO_BADGE_PROPERTY = "toBadge";

    public static final String IDTIMBRATURA_PK_COLUMN = "IDTIMBRATURA";

    public void setCf(String cf) {
        writeProperty("cf", cf);
    }
    public String getCf() {
        return (String)readProperty("cf");
    }

    public void setData(Date data) {
        writeProperty("data", data);
    }
    public Date getData() {
        return (Date)readProperty("data");
    }

    public void setDataora(Date dataora) {
        writeProperty("dataora", dataora);
    }
    public Date getDataora() {
        return (Date)readProperty("dataora");
    }

    public void setEntrata(Short entrata) {
        writeProperty("entrata", entrata);
    }
    public Short getEntrata() {
        return (Short)readProperty("entrata");
    }

    public void setIdbadge(Integer idbadge) {
        writeProperty("idbadge", idbadge);
    }
    public Integer getIdbadge() {
        return (Integer)readProperty("idbadge");
    }

    public void setIdrilevatore(Integer idrilevatore) {
        writeProperty("idrilevatore", idrilevatore);
    }
    public Integer getIdrilevatore() {
        return (Integer)readProperty("idrilevatore");
    }

    public void setIdtimbratura(Integer idtimbratura) {
        writeProperty("idtimbratura", idtimbratura);
    }
    public Integer getIdtimbratura() {
        return (Integer)readProperty("idtimbratura");
    }

    public void setOrario(Date orario) {
        writeProperty("orario", orario);
    }
    public Date getOrario() {
        return (Date)readProperty("orario");
    }

    public void setUscita(Short uscita) {
        writeProperty("uscita", uscita);
    }
    public Short getUscita() {
        return (Short)readProperty("uscita");
    }

    public void setToBadge(Badge toBadge) {
        setToOneTarget("toBadge", toBadge, true);
    }

    public Badge getToBadge() {
        return (Badge)readProperty("toBadge");
    }


}