package it.iubar.paghe.logic.paghe.auto;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.InpsContratto;
import it.iubar.paghe.logic.paghe.InpsSettore;

/**
 * Class _InpsSettoreContratto was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _InpsSettoreContratto extends CayenneDataObject {

    public static final String IDINPSCONTRATTO_PROPERTY = "idinpscontratto";
    public static final String IDINPSSETTORE_PROPERTY = "idinpssettore";
    public static final String TO_INPS_CONTRATTO_PROPERTY = "toInpsContratto";
    public static final String TO_INPS_SETTORE_PROPERTY = "toInpsSettore";

    public static final String IDINPSCONTRATTO_PK_COLUMN = "IDINPSCONTRATTO";
    public static final String IDINPSSETTORE_PK_COLUMN = "IDINPSSETTORE";

    public String getIdinpscontratto() {
        return (String)readProperty("idinpscontratto");
    }

    public Integer getIdinpssettore() {
        return (Integer)readProperty("idinpssettore");
    }


    public InpsContratto getToInpsContratto() {
        return (InpsContratto)readProperty("toInpsContratto");
    }



    public InpsSettore getToInpsSettore() {
        return (InpsSettore)readProperty("toInpsSettore");
    }


}
