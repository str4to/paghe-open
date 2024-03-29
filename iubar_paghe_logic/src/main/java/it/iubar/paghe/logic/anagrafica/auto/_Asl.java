package it.iubar.paghe.logic.anagrafica.auto;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _Asl was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Asl extends CayenneDataObject {

    public static final String COMUNE_PROPERTY = "comune";
    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDASL_PROPERTY = "idasl";
    public static final String PROVINCIASIGLA_PROPERTY = "provinciasigla";

    public static final String IDASL_PK_COLUMN = "IDASL";

    public String getComune() {
        return (String)readProperty("comune");
    }

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public String getIdasl() {
        return (String)readProperty("idasl");
    }

    public String getProvinciasigla() {
        return (String)readProperty("provinciasigla");
    }

}
