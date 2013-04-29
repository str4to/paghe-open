package it.iubar.paghe.logic.paghe.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Variabileretributiva;

/**
 * Class _Tipovarretr was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Tipovarretr extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDTIPOVARRETR_PROPERTY = "idtipovarretr";
    public static final String VARIABILERETRIBUTIVA_ARRAY_PROPERTY = "variabileretributivaArray";

    public static final String IDTIPOVARRETR_PK_COLUMN = "IDTIPOVARRETR";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public String getIdtipovarretr() {
        return (String)readProperty("idtipovarretr");
    }

    public void addToVariabileretributivaArray(Variabileretributiva obj) {
        addToManyTarget("variabileretributivaArray", obj, true);
    }
    public void removeFromVariabileretributivaArray(Variabileretributiva obj) {
        removeToManyTarget("variabileretributivaArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Variabileretributiva> getVariabileretributivaArray() {
        return (List<Variabileretributiva>)readProperty("variabileretributivaArray");
    }


}