package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Posizionelavoratore;

/**
 * Class _MutPosizionelav was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _MutPosizionelav extends CayenneDataObject {

    public static final String ACCANTONAMENTO_PROPERTY = "accantonamento";
    public static final String TO_POSIZIONE_LAV_PROPERTY = "toPosizioneLav";

    public static final String IDPOSIZIONE_PK_COLUMN = "IDPOSIZIONE";

    public void setAccantonamento(BigDecimal accantonamento) {
        writeProperty("accantonamento", accantonamento);
    }
    public BigDecimal getAccantonamento() {
        return (BigDecimal)readProperty("accantonamento");
    }

    public void setToPosizioneLav(Posizionelavoratore toPosizioneLav) {
        setToOneTarget("toPosizioneLav", toPosizioneLav, true);
    }

    public Posizionelavoratore getToPosizioneLav() {
        return (Posizionelavoratore)readProperty("toPosizioneLav");
    }


}
