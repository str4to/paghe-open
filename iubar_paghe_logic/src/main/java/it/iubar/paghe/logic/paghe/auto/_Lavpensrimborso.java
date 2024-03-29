package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Lavpensionato;

/**
 * Class _Lavpensrimborso was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Lavpensrimborso extends CayenneDataObject {

    public static final String IDDATORETRIBUTIVO_PROPERTY = "iddatoretributivo";
    public static final String IMPORTORIMBORSO_PROPERTY = "importorimborso";
    public static final String TO_LAV_PENSIONATO_PROPERTY = "toLavPensionato";

    public static final String IDDATORETRIBUTIVO_PK_COLUMN = "IDDATORETRIBUTIVO";

    public void setIddatoretributivo(Integer iddatoretributivo) {
        writeProperty("iddatoretributivo", iddatoretributivo);
    }
    public Integer getIddatoretributivo() {
        return (Integer)readProperty("iddatoretributivo");
    }

    public void setImportorimborso(BigDecimal importorimborso) {
        writeProperty("importorimborso", importorimborso);
    }
    public BigDecimal getImportorimborso() {
        return (BigDecimal)readProperty("importorimborso");
    }

    public void setToLavPensionato(Lavpensionato toLavPensionato) {
        setToOneTarget("toLavPensionato", toLavPensionato, true);
    }

    public Lavpensionato getToLavPensionato() {
        return (Lavpensionato)readProperty("toLavPensionato");
    }


}
