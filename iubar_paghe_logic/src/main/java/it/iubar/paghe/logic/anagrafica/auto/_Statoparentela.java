package it.iubar.paghe.logic.anagrafica.auto;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _Statoparentela was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Statoparentela extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";

    public static final String IDSTATOPARENTELA_PK_COLUMN = "IDSTATOPARENTELA";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

}
