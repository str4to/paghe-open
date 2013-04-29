package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.PaGestione;

/**
 * Class _PaGestenam was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PaGestenam extends CayenneDataObject {

    public static final String CONTRIBUTO_PROPERTY = "contributo";
    public static final String IMPONIBILE_PROPERTY = "imponibile";
    public static final String PA_GESTIONE_ARRAY_PROPERTY = "paGestioneArray";

    public static final String IDGESTENAM_PK_COLUMN = "IDGESTENAM";

    public void setContributo(BigDecimal contributo) {
        writeProperty("contributo", contributo);
    }
    public BigDecimal getContributo() {
        return (BigDecimal)readProperty("contributo");
    }

    public void setImponibile(BigDecimal imponibile) {
        writeProperty("imponibile", imponibile);
    }
    public BigDecimal getImponibile() {
        return (BigDecimal)readProperty("imponibile");
    }

    public void addToPaGestioneArray(PaGestione obj) {
        addToManyTarget("paGestioneArray", obj, true);
    }
    public void removeFromPaGestioneArray(PaGestione obj) {
        removeToManyTarget("paGestioneArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<PaGestione> getPaGestioneArray() {
        return (List<PaGestione>)readProperty("paGestioneArray");
    }


}
