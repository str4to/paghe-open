package it.iubar.paghe.logic.paghe.auto;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _CnceCantieresituazione was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CnceCantieresituazione extends CayenneDataObject {

    public static final String GIORNOSITUAZIONE_PROPERTY = "giornosituazione";
    public static final String IDCANTIERE_PROPERTY = "idcantiere";
    public static final String IDDICHIARAZIONE_PROPERTY = "iddichiarazione";
    public static final String IDIMPRESA_PROPERTY = "idimpresa";
    public static final String IDSITUAZIONE_PROPERTY = "idsituazione";
    public static final String INTERINALI_PROPERTY = "interinali";
    public static final String SUBAPPALTI_PROPERTY = "subappalti";
    public static final String TRASFERTISTI_PROPERTY = "trasfertisti";

    public static final String IDCANTIERE_PK_COLUMN = "IDCANTIERE";
    public static final String IDDICHIARAZIONE_PK_COLUMN = "IDDICHIARAZIONE";
    public static final String IDIMPRESA_PK_COLUMN = "IDIMPRESA";

    public void setGiornosituazione(Short giornosituazione) {
        writeProperty("giornosituazione", giornosituazione);
    }
    public Short getGiornosituazione() {
        return (Short)readProperty("giornosituazione");
    }

    public void setIdcantiere(Short idcantiere) {
        writeProperty("idcantiere", idcantiere);
    }
    public Short getIdcantiere() {
        return (Short)readProperty("idcantiere");
    }

    public void setIddichiarazione(Integer iddichiarazione) {
        writeProperty("iddichiarazione", iddichiarazione);
    }
    public Integer getIddichiarazione() {
        return (Integer)readProperty("iddichiarazione");
    }

    public void setIdimpresa(Integer idimpresa) {
        writeProperty("idimpresa", idimpresa);
    }
    public Integer getIdimpresa() {
        return (Integer)readProperty("idimpresa");
    }

    public void setIdsituazione(Short idsituazione) {
        writeProperty("idsituazione", idsituazione);
    }
    public Short getIdsituazione() {
        return (Short)readProperty("idsituazione");
    }

    public void setInterinali(Short interinali) {
        writeProperty("interinali", interinali);
    }
    public Short getInterinali() {
        return (Short)readProperty("interinali");
    }

    public void setSubappalti(Short subappalti) {
        writeProperty("subappalti", subappalti);
    }
    public Short getSubappalti() {
        return (Short)readProperty("subappalti");
    }

    public void setTrasfertisti(Short trasfertisti) {
        writeProperty("trasfertisti", trasfertisti);
    }
    public Short getTrasfertisti() {
        return (Short)readProperty("trasfertisti");
    }

}
