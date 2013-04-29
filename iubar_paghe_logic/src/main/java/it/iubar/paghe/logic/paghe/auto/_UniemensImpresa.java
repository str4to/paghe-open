package it.iubar.paghe.logic.paghe.auto;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Uniemens;

/**
 * Class _UniemensImpresa was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _UniemensImpresa extends CayenneDataObject {

    public static final String IDDICHIARAZIONE_PROPERTY = "iddichiarazione";
    public static final String IDIMPRESA_PROPERTY = "idimpresa";
    public static final String TO_UNIEMENS_PROPERTY = "toUniemens";

    public static final String IDDICHIARAZIONE_PK_COLUMN = "IDDICHIARAZIONE";
    public static final String IDIMPRESA_PK_COLUMN = "IDIMPRESA";

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

    public void setToUniemens(Uniemens toUniemens) {
        setToOneTarget("toUniemens", toUniemens, true);
    }

    public Uniemens getToUniemens() {
        return (Uniemens)readProperty("toUniemens");
    }


}
