package it.iubar.paghe.logic.anagrafica.auto;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _Rapportoparentela was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Rapportoparentela extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDRAPPORTOPARENTELA_PROPERTY = "idrapportoparentela";

    public static final String IDRAPPORTOPARENTELA_PK_COLUMN = "IDRAPPORTOPARENTELA";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public Short getIdrapportoparentela() {
        return (Short)readProperty("idrapportoparentela");
    }

}
