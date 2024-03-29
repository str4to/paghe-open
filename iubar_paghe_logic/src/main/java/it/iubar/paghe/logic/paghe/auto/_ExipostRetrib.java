package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Exipost;
import it.iubar.paghe.logic.paghe.ExipostAnno;

/**
 * Class _ExipostRetrib was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ExipostRetrib extends CayenneDataObject {

    public static final String COMPETENZEACCESSORIE_PROPERTY = "competenzeaccessorie";
    public static final String GIORNIRETRIBUITI_PROPERTY = "giorniretribuiti";
    public static final String GIORNIUTILI_PROPERTY = "giorniutili";
    public static final String IDDATORETRIBUTIVO_PROPERTY = "iddatoretributivo";
    public static final String IDTIPO_PROPERTY = "idtipo";
    public static final String INDENNITAINTEGRSPEC_PROPERTY = "indennitaintegrspec";
    public static final String RETRIBUZIONE177_PROPERTY = "retribuzione177";
    public static final String TREDICESIMA_PROPERTY = "tredicesima";
    public static final String ULTIMOGGBENEFICI336_PROPERTY = "ultimoggbenefici336";
    public static final String EX_IPOST_ANNO_ARRAY_PROPERTY = "exIpostAnnoArray";
    public static final String TO_EX_IPOST_PROPERTY = "toExIpost";

    public static final String IDDATORETRIBUTIVO_PK_COLUMN = "IDDATORETRIBUTIVO";
    public static final String IDTIPO_PK_COLUMN = "IDTIPO";

    public void setCompetenzeaccessorie(BigDecimal competenzeaccessorie) {
        writeProperty("competenzeaccessorie", competenzeaccessorie);
    }
    public BigDecimal getCompetenzeaccessorie() {
        return (BigDecimal)readProperty("competenzeaccessorie");
    }

    public void setGiorniretribuiti(Short giorniretribuiti) {
        writeProperty("giorniretribuiti", giorniretribuiti);
    }
    public Short getGiorniretribuiti() {
        return (Short)readProperty("giorniretribuiti");
    }

    public void setGiorniutili(Short giorniutili) {
        writeProperty("giorniutili", giorniutili);
    }
    public Short getGiorniutili() {
        return (Short)readProperty("giorniutili");
    }

    public void setIddatoretributivo(Integer iddatoretributivo) {
        writeProperty("iddatoretributivo", iddatoretributivo);
    }
    public Integer getIddatoretributivo() {
        return (Integer)readProperty("iddatoretributivo");
    }

    public void setIdtipo(Short idtipo) {
        writeProperty("idtipo", idtipo);
    }
    public Short getIdtipo() {
        return (Short)readProperty("idtipo");
    }

    public void setIndennitaintegrspec(BigDecimal indennitaintegrspec) {
        writeProperty("indennitaintegrspec", indennitaintegrspec);
    }
    public BigDecimal getIndennitaintegrspec() {
        return (BigDecimal)readProperty("indennitaintegrspec");
    }

    public void setRetribuzione177(BigDecimal retribuzione177) {
        writeProperty("retribuzione177", retribuzione177);
    }
    public BigDecimal getRetribuzione177() {
        return (BigDecimal)readProperty("retribuzione177");
    }

    public void setTredicesima(BigDecimal tredicesima) {
        writeProperty("tredicesima", tredicesima);
    }
    public BigDecimal getTredicesima() {
        return (BigDecimal)readProperty("tredicesima");
    }

    public void setUltimoggbenefici336(BigDecimal ultimoggbenefici336) {
        writeProperty("ultimoggbenefici336", ultimoggbenefici336);
    }
    public BigDecimal getUltimoggbenefici336() {
        return (BigDecimal)readProperty("ultimoggbenefici336");
    }

    public void addToExIpostAnnoArray(ExipostAnno obj) {
        addToManyTarget("exIpostAnnoArray", obj, true);
    }
    public void removeFromExIpostAnnoArray(ExipostAnno obj) {
        removeToManyTarget("exIpostAnnoArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<ExipostAnno> getExIpostAnnoArray() {
        return (List<ExipostAnno>)readProperty("exIpostAnnoArray");
    }


    public void setToExIpost(Exipost toExIpost) {
        setToOneTarget("toExIpost", toExIpost, true);
    }

    public Exipost getToExIpost() {
        return (Exipost)readProperty("toExIpost");
    }


}
