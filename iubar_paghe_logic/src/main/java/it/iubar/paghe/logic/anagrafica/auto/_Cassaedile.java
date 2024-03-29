package it.iubar.paghe.logic.anagrafica.auto;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _Cassaedile was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Cassaedile extends CayenneDataObject {

    public static final String DENOMINAZIONE_PROPERTY = "denominazione";
    public static final String IDCASSAEDILE_PROPERTY = "idcassaedile";
    public static final String IDPROVINCIA_PROPERTY = "idprovincia";
    public static final String IDTIPO_PROPERTY = "idtipo";

    public static final String IDCASSAEDILE_PK_COLUMN = "IDCASSAEDILE";

    public String getDenominazione() {
        return (String)readProperty("denominazione");
    }

    public String getIdcassaedile() {
        return (String)readProperty("idcassaedile");
    }

    public String getIdprovincia() {
        return (String)readProperty("idprovincia");
    }

    public Short getIdtipo() {
        return (Short)readProperty("idtipo");
    }

}
