package it.iubar.paghe.logic.paghe.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Congcigsacredito;
import it.iubar.paghe.logic.paghe.Congcigsadebito;
import it.iubar.paghe.logic.paghe.Conguagliocig;

/**
 * Class _Cigstraord was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Cigstraord extends CayenneDataObject {

    public static final String IDCIGAUTORIZZATA_PROPERTY = "idcigautorizzata";
    public static final String IDDENUNCIAAZIENDALE_PROPERTY = "iddenunciaaziendale";
    public static final String CONGCIGSACREDITO_ARRAY_PROPERTY = "congcigsacreditoArray";
    public static final String CONGCIGSADEBITO_ARRAY_PROPERTY = "congcigsadebitoArray";
    public static final String TO_CONGUAGLIOCIG_PROPERTY = "toConguagliocig";

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

    public void addToCongcigsacreditoArray(Congcigsacredito obj) {
        addToManyTarget("congcigsacreditoArray", obj, true);
    }
    public void removeFromCongcigsacreditoArray(Congcigsacredito obj) {
        removeToManyTarget("congcigsacreditoArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Congcigsacredito> getCongcigsacreditoArray() {
        return (List<Congcigsacredito>)readProperty("congcigsacreditoArray");
    }


    public void addToCongcigsadebitoArray(Congcigsadebito obj) {
        addToManyTarget("congcigsadebitoArray", obj, true);
    }
    public void removeFromCongcigsadebitoArray(Congcigsadebito obj) {
        removeToManyTarget("congcigsadebitoArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Congcigsadebito> getCongcigsadebitoArray() {
        return (List<Congcigsadebito>)readProperty("congcigsadebitoArray");
    }


    public void setToConguagliocig(Conguagliocig toConguagliocig) {
        setToOneTarget("toConguagliocig", toConguagliocig, true);
    }

    public Conguagliocig getToConguagliocig() {
        return (Conguagliocig)readProperty("toConguagliocig");
    }


}
