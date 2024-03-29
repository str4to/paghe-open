package it.iubar.paghe.logic.anagrafica.auto;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.anagrafica.CnceTipocontratto;

/**
 * Class _CnceImpresa was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CnceImpresa extends CayenneDataObject {

    public static final String CODCASSAEDILE_PROPERTY = "codcassaedile";
    public static final String DESTINAZCE_PROPERTY = "destinazce";
    public static final String IDIMPRESA_PROPERTY = "idimpresa";
    public static final String IDTIPOCONTRATTO_PROPERTY = "idtipocontratto";
    public static final String TO_CNCE_TIPOCONTRATTO_PROPERTY = "toCnceTipocontratto";

    public static final String IDIMPRESA_PK_COLUMN = "IDIMPRESA";

    public void setCodcassaedile(String codcassaedile) {
        writeProperty("codcassaedile", codcassaedile);
    }
    public String getCodcassaedile() {
        return (String)readProperty("codcassaedile");
    }

    public void setDestinazce(String destinazce) {
        writeProperty("destinazce", destinazce);
    }
    public String getDestinazce() {
        return (String)readProperty("destinazce");
    }

    public void setIdimpresa(Integer idimpresa) {
        writeProperty("idimpresa", idimpresa);
    }
    public Integer getIdimpresa() {
        return (Integer)readProperty("idimpresa");
    }

    public void setIdtipocontratto(Short idtipocontratto) {
        writeProperty("idtipocontratto", idtipocontratto);
    }
    public Short getIdtipocontratto() {
        return (Short)readProperty("idtipocontratto");
    }

    public void setToCnceTipocontratto(CnceTipocontratto toCnceTipocontratto) {
        setToOneTarget("toCnceTipocontratto", toCnceTipocontratto, true);
    }

    public CnceTipocontratto getToCnceTipocontratto() {
        return (CnceTipocontratto)readProperty("toCnceTipocontratto");
    }


}
