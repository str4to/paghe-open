package it.iubar.paghe.logic.paghe.auto;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _CnceTipocommittente was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CnceTipocommittente extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDTIPO_PROPERTY = "idtipo";

    public static final String IDTIPO_PK_COLUMN = "IDTIPO";

    public void setDescrizione(String descrizione) {
        writeProperty("descrizione", descrizione);
    }
    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public void setIdtipo(Short idtipo) {
        writeProperty("idtipo", idtipo);
    }
    public Short getIdtipo() {
        return (Short)readProperty("idtipo");
    }

}
