package it.iubar.paghe.logic.anagrafica.auto;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _CnceTipoattivita was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CnceTipoattivita extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDTIPOATTIVITA_PROPERTY = "idtipoattivita";

    public static final String IDTIPOATTIVITA_PK_COLUMN = "IDTIPOATTIVITA";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public Short getIdtipoattivita() {
        return (Short)readProperty("idtipoattivita");
    }

}
