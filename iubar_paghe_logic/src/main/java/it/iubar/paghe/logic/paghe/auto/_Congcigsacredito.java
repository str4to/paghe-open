package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Cigstraord;
import it.iubar.paghe.logic.paghe.Congcigsaltro;

/**
 * Class _Congcigsacredito was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Congcigsacredito extends CayenneDataObject {

    public static final String IDCIGAUTORIZZATA_PROPERTY = "idcigautorizzata";
    public static final String IDDENUNCIAAZIENDALE_PROPERTY = "iddenunciaaziendale";
    public static final String IMPORTO_PROPERTY = "importo";
    public static final String CONGCIGSALTRE_ARRAY_PROPERTY = "congcigsaltreArray";
    public static final String TO_CIG_STRAORD_PROPERTY = "toCigStraord";

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

    public void addToCongcigsaltreArray(Congcigsaltro obj) {
        addToManyTarget("congcigsaltreArray", obj, true);
    }
    public void removeFromCongcigsaltreArray(Congcigsaltro obj) {
        removeToManyTarget("congcigsaltreArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Congcigsaltro> getCongcigsaltreArray() {
        return (List<Congcigsaltro>)readProperty("congcigsaltreArray");
    }


    public void setToCigStraord(Cigstraord toCigStraord) {
        setToOneTarget("toCigStraord", toCigStraord, true);
    }

    public Cigstraord getToCigStraord() {
        return (Cigstraord)readProperty("toCigStraord");
    }


}