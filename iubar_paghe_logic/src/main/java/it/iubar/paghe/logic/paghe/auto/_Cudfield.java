package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Cud;

/**
 * Class _Cudfield was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Cudfield extends CayenneDataObject {

    public static final String FIELD_PROPERTY = "field";
    public static final String IDDICHIARAZIONE_PROPERTY = "iddichiarazione";
    public static final String VALUE1_PROPERTY = "value1";
    public static final String VALUE2_PROPERTY = "value2";
    public static final String VALUE3_PROPERTY = "value3";
    public static final String TO_CUD_PROPERTY = "toCud";

    public static final String FIELD_PK_COLUMN = "FIELD";
    public static final String IDDICHIARAZIONE_PK_COLUMN = "IDDICHIARAZIONE";

    public void setField(Integer field) {
        writeProperty("field", field);
    }
    public Integer getField() {
        return (Integer)readProperty("field");
    }

    public void setIddichiarazione(Integer iddichiarazione) {
        writeProperty("iddichiarazione", iddichiarazione);
    }
    public Integer getIddichiarazione() {
        return (Integer)readProperty("iddichiarazione");
    }

    public void setValue1(String value1) {
        writeProperty("value1", value1);
    }
    public String getValue1() {
        return (String)readProperty("value1");
    }

    public void setValue2(BigDecimal value2) {
        writeProperty("value2", value2);
    }
    public BigDecimal getValue2() {
        return (BigDecimal)readProperty("value2");
    }

    public void setValue3(Integer value3) {
        writeProperty("value3", value3);
    }
    public Integer getValue3() {
        return (Integer)readProperty("value3");
    }

    public void setToCud(Cud toCud) {
        setToOneTarget("toCud", toCud, true);
    }

    public Cud getToCud() {
        return (Cud)readProperty("toCud");
    }


}
