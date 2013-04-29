package it.iubar.paghe.logic.paghe.auto;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _InailTipomalattia was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _InailTipomalattia extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDGRUPPO_PROPERTY = "idgruppo";
    public static final String IDTIPOMALATTIA_PROPERTY = "idtipomalattia";

    public static final String IDGRUPPO_PK_COLUMN = "IDGRUPPO";
    public static final String IDTIPOMALATTIA_PK_COLUMN = "IDTIPOMALATTIA";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public Short getIdgruppo() {
        return (Short)readProperty("idgruppo");
    }

    public String getIdtipomalattia() {
        return (String)readProperty("idtipomalattia");
    }

}