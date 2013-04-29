package it.iubar.paghe.logic.paghe.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Datoretributivo;
import it.iubar.paghe.logic.paghe.InpsTipocopertura;
import it.iubar.paghe.logic.paghe.SettimanaEvento;

/**
 * Class _Settimana was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Settimana extends CayenneDataObject {

    public static final String IDDATORETRIBUTIVO_PROPERTY = "iddatoretributivo";
    public static final String IDINPSTIPOCOPERTURA_PROPERTY = "idinpstipocopertura";
    public static final String IDSETTIMANA_PROPERTY = "idsettimana";
    public static final String SETTIMANA_EVENTO_ARRAY_PROPERTY = "settimanaEventoArray";
    public static final String TO_DATORETRIBUTIVO_PROPERTY = "toDatoretributivo";
    public static final String TO_INPS_TIPOCOPERTURA_PROPERTY = "toInpsTipocopertura";

    public static final String IDDATORETRIBUTIVO_PK_COLUMN = "IDDATORETRIBUTIVO";
    public static final String IDSETTIMANA_PK_COLUMN = "IDSETTIMANA";

    public void setIddatoretributivo(Integer iddatoretributivo) {
        writeProperty("iddatoretributivo", iddatoretributivo);
    }
    public Integer getIddatoretributivo() {
        return (Integer)readProperty("iddatoretributivo");
    }

    public void setIdinpstipocopertura(String idinpstipocopertura) {
        writeProperty("idinpstipocopertura", idinpstipocopertura);
    }
    public String getIdinpstipocopertura() {
        return (String)readProperty("idinpstipocopertura");
    }

    public void setIdsettimana(Short idsettimana) {
        writeProperty("idsettimana", idsettimana);
    }
    public Short getIdsettimana() {
        return (Short)readProperty("idsettimana");
    }

    public void addToSettimanaEventoArray(SettimanaEvento obj) {
        addToManyTarget("settimanaEventoArray", obj, true);
    }
    public void removeFromSettimanaEventoArray(SettimanaEvento obj) {
        removeToManyTarget("settimanaEventoArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<SettimanaEvento> getSettimanaEventoArray() {
        return (List<SettimanaEvento>)readProperty("settimanaEventoArray");
    }


    public void setToDatoretributivo(Datoretributivo toDatoretributivo) {
        setToOneTarget("toDatoretributivo", toDatoretributivo, true);
    }

    public Datoretributivo getToDatoretributivo() {
        return (Datoretributivo)readProperty("toDatoretributivo");
    }


    public void setToInpsTipocopertura(InpsTipocopertura toInpsTipocopertura) {
        setToOneTarget("toInpsTipocopertura", toInpsTipocopertura, true);
    }

    public InpsTipocopertura getToInpsTipocopertura() {
        return (InpsTipocopertura)readProperty("toInpsTipocopertura");
    }


}
