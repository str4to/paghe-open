package it.iubar.paghe.logic.paghe.auto;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _CudC6 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CudC6 extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";

    public static final String CODICE_PK_COLUMN = "CODICE";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

}
