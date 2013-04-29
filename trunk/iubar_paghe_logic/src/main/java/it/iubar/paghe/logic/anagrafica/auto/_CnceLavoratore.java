package it.iubar.paghe.logic.anagrafica.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _CnceLavoratore was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CnceLavoratore extends CayenneDataObject {

    public static final String ALTRACASSA_PROPERTY = "altracassa";
    public static final String CODCE_PROPERTY = "codce";
    public static final String IDLAVORATORE_PROPERTY = "idlavoratore";
    public static final String IMPORTORIMBORSOCIG_PROPERTY = "importorimborsocig";
    public static final String NOTE_PROPERTY = "note";
    public static final String ORETRIMPRECEDENTE_PROPERTY = "oretrimprecedente";

    public static final String IDLAVORATORE_PK_COLUMN = "IDLAVORATORE";

    public void setAltracassa(String altracassa) {
        writeProperty("altracassa", altracassa);
    }
    public String getAltracassa() {
        return (String)readProperty("altracassa");
    }

    public void setCodce(String codce) {
        writeProperty("codce", codce);
    }
    public String getCodce() {
        return (String)readProperty("codce");
    }

    public void setIdlavoratore(Integer idlavoratore) {
        writeProperty("idlavoratore", idlavoratore);
    }
    public Integer getIdlavoratore() {
        return (Integer)readProperty("idlavoratore");
    }

    public void setImportorimborsocig(BigDecimal importorimborsocig) {
        writeProperty("importorimborsocig", importorimborsocig);
    }
    public BigDecimal getImportorimborsocig() {
        return (BigDecimal)readProperty("importorimborsocig");
    }

    public void setNote(String note) {
        writeProperty("note", note);
    }
    public String getNote() {
        return (String)readProperty("note");
    }

    public void setOretrimprecedente(Short oretrimprecedente) {
        writeProperty("oretrimprecedente", oretrimprecedente);
    }
    public Short getOretrimprecedente() {
        return (Short)readProperty("oretrimprecedente");
    }

}
