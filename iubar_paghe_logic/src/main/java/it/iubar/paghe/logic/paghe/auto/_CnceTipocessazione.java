package it.iubar.paghe.logic.paghe.auto;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _CnceTipocessazione was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CnceTipocessazione extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDTIPOCESSAZIONE_PROPERTY = "idtipocessazione";

    public static final String IDTIPOCESSAZIONE_PK_COLUMN = "IDTIPOCESSAZIONE";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public Short getIdtipocessazione() {
        return (Short)readProperty("idtipocessazione");
    }

}
