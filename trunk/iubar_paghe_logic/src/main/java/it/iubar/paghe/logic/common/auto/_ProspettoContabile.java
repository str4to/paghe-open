package it.iubar.paghe.logic.common.auto;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _ProspettoContabile was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ProspettoContabile extends CayenneDataObject {

    public static final String CODICE_PROPERTY = "codice";
    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String TIPO_PROPERTY = "tipo";

    public static final String CODICE_PK_COLUMN = "CODICE";

    public String getCodice() {
        return (String)readProperty("codice");
    }

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public String getTipo() {
        return (String)readProperty("tipo");
    }

}