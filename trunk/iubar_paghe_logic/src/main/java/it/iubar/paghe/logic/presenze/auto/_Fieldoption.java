package it.iubar.paghe.logic.presenze.auto;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _Fieldoption was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Fieldoption extends CayenneDataObject {

    public static final String IDIMPRESA_PROPERTY = "idimpresa";
    public static final String OPZIONE_PROPERTY = "opzione";
    public static final String VALORE_PROPERTY = "valore";

    public static final String IDIMPRESA_PK_COLUMN = "IDIMPRESA";
    public static final String OPZIONE_PK_COLUMN = "OPZIONE";

    public void setIdimpresa(Integer idimpresa) {
        writeProperty("idimpresa", idimpresa);
    }
    public Integer getIdimpresa() {
        return (Integer)readProperty("idimpresa");
    }

    public void setOpzione(Short opzione) {
        writeProperty("opzione", opzione);
    }
    public Short getOpzione() {
        return (Short)readProperty("opzione");
    }

    public void setValore(String valore) {
        writeProperty("valore", valore);
    }
    public String getValore() {
        return (String)readProperty("valore");
    }

}
