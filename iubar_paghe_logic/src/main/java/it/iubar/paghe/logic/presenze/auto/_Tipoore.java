package it.iubar.paghe.logic.presenze.auto;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _Tipoore was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Tipoore extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";

    public static final String IDTIPOORE_PK_COLUMN = "IDTIPOORE";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

}
