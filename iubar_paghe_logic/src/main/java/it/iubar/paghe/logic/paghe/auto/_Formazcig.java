package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Datoparticolare;

/**
 * Class _Formazcig was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Formazcig extends CayenneDataObject {

    public static final String CONTRIBUTOFCA_PROPERTY = "contributofca";
    public static final String CONTRIBUTOFCC_PROPERTY = "contributofcc";
    public static final String IDDATORETRIBUTIVO_PROPERTY = "iddatoretributivo";
    public static final String IMPONIBILEFCA_PROPERTY = "imponibilefca";
    public static final String IMPONIBILEFCC_PROPERTY = "imponibilefcc";
    public static final String DATOPARTICOLARE_ARRAY_PROPERTY = "datoparticolareArray";

    public static final String IDDATORETRIBUTIVO_PK_COLUMN = "IDDATORETRIBUTIVO";

    public void setContributofca(BigDecimal contributofca) {
        writeProperty("contributofca", contributofca);
    }
    public BigDecimal getContributofca() {
        return (BigDecimal)readProperty("contributofca");
    }

    public void setContributofcc(BigDecimal contributofcc) {
        writeProperty("contributofcc", contributofcc);
    }
    public BigDecimal getContributofcc() {
        return (BigDecimal)readProperty("contributofcc");
    }

    public void setIddatoretributivo(Integer iddatoretributivo) {
        writeProperty("iddatoretributivo", iddatoretributivo);
    }
    public Integer getIddatoretributivo() {
        return (Integer)readProperty("iddatoretributivo");
    }

    public void setImponibilefca(BigDecimal imponibilefca) {
        writeProperty("imponibilefca", imponibilefca);
    }
    public BigDecimal getImponibilefca() {
        return (BigDecimal)readProperty("imponibilefca");
    }

    public void setImponibilefcc(BigDecimal imponibilefcc) {
        writeProperty("imponibilefcc", imponibilefcc);
    }
    public BigDecimal getImponibilefcc() {
        return (BigDecimal)readProperty("imponibilefcc");
    }

    public void addToDatoparticolareArray(Datoparticolare obj) {
        addToManyTarget("datoparticolareArray", obj, true);
    }
    public void removeFromDatoparticolareArray(Datoparticolare obj) {
        removeToManyTarget("datoparticolareArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Datoparticolare> getDatoparticolareArray() {
        return (List<Datoparticolare>)readProperty("datoparticolareArray");
    }


}
