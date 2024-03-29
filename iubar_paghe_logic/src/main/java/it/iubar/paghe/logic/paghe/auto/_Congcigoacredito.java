package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Cigord;
import it.iubar.paghe.logic.paghe.Congcigoaltro;

/**
 * Class _Congcigoacredito was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Congcigoacredito extends CayenneDataObject {

    public static final String IDCIGAUTORIZZATA_PROPERTY = "idcigautorizzata";
    public static final String IDDENUNCIAAZIENDALE_PROPERTY = "iddenunciaaziendale";
    public static final String IMPORTO_PROPERTY = "importo";
    public static final String CONGCIGOALTRE_ARRAY_PROPERTY = "congcigoaltreArray";
    public static final String TO_CIG_ORD_PROPERTY = "toCigOrd";

    public static final String IDCIGAUTORIZZATA_PK_COLUMN = "IDCIGAUTORIZZATA";
    public static final String IDDENUNCIAAZIENDALE_PK_COLUMN = "IDDENUNCIAAZIENDALE";

    public void setIdcigautorizzata(Short idcigautorizzata) {
        writeProperty("idcigautorizzata", idcigautorizzata);
    }
    public Short getIdcigautorizzata() {
        return (Short)readProperty("idcigautorizzata");
    }

    public void setIddenunciaaziendale(Integer iddenunciaaziendale) {
        writeProperty("iddenunciaaziendale", iddenunciaaziendale);
    }
    public Integer getIddenunciaaziendale() {
        return (Integer)readProperty("iddenunciaaziendale");
    }

    public void setImporto(BigDecimal importo) {
        writeProperty("importo", importo);
    }
    public BigDecimal getImporto() {
        return (BigDecimal)readProperty("importo");
    }

    public void addToCongcigoaltreArray(Congcigoaltro obj) {
        addToManyTarget("congcigoaltreArray", obj, true);
    }
    public void removeFromCongcigoaltreArray(Congcigoaltro obj) {
        removeToManyTarget("congcigoaltreArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Congcigoaltro> getCongcigoaltreArray() {
        return (List<Congcigoaltro>)readProperty("congcigoaltreArray");
    }


    public void setToCigOrd(Cigord toCigOrd) {
        setToOneTarget("toCigOrd", toCigOrd, true);
    }

    public Cigord getToCigOrd() {
        return (Cigord)readProperty("toCigOrd");
    }


}
