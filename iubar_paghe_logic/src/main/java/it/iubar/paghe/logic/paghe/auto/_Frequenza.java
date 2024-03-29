package it.iubar.paghe.logic.paghe.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Contrattoindennita;
import it.iubar.paghe.logic.paghe.Elementoretributivo;
import it.iubar.paghe.logic.paghe.InpsLimiteimponibile;
import it.iubar.paghe.logic.paghe.InpsTipoanf2;
import it.iubar.paghe.logic.paghe.Scadenza;

/**
 * Class _Frequenza was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Frequenza extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDFREQUENZA_PROPERTY = "idfrequenza";
    public static final String CONTRATTOINDENNITA_ARRAY_PROPERTY = "contrattoindennitaArray";
    public static final String ELEMENTORETRIB_ARRAY_PROPERTY = "elementoretribArray";
    public static final String INPS_TIPOANF2ARRAY_PROPERTY = "inpsTipoanf2Array";
    public static final String LIMITEIMPONIBILE_ARRAY_PROPERTY = "limiteimponibileArray";
    public static final String SCADENZA_ARRAY_PROPERTY = "scadenzaArray";

    public static final String IDFREQUENZA_PK_COLUMN = "IDFREQUENZA";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public Short getIdfrequenza() {
        return (Short)readProperty("idfrequenza");
    }

    public void addToContrattoindennitaArray(Contrattoindennita obj) {
        addToManyTarget("contrattoindennitaArray", obj, true);
    }
    public void removeFromContrattoindennitaArray(Contrattoindennita obj) {
        removeToManyTarget("contrattoindennitaArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Contrattoindennita> getContrattoindennitaArray() {
        return (List<Contrattoindennita>)readProperty("contrattoindennitaArray");
    }


    public void addToElementoretribArray(Elementoretributivo obj) {
        addToManyTarget("elementoretribArray", obj, true);
    }
    public void removeFromElementoretribArray(Elementoretributivo obj) {
        removeToManyTarget("elementoretribArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Elementoretributivo> getElementoretribArray() {
        return (List<Elementoretributivo>)readProperty("elementoretribArray");
    }


    public void addToInpsTipoanf2Array(InpsTipoanf2 obj) {
        addToManyTarget("inpsTipoanf2Array", obj, true);
    }
    public void removeFromInpsTipoanf2Array(InpsTipoanf2 obj) {
        removeToManyTarget("inpsTipoanf2Array", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<InpsTipoanf2> getInpsTipoanf2Array() {
        return (List<InpsTipoanf2>)readProperty("inpsTipoanf2Array");
    }


    public void addToLimiteimponibileArray(InpsLimiteimponibile obj) {
        addToManyTarget("limiteimponibileArray", obj, true);
    }
    public void removeFromLimiteimponibileArray(InpsLimiteimponibile obj) {
        removeToManyTarget("limiteimponibileArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<InpsLimiteimponibile> getLimiteimponibileArray() {
        return (List<InpsLimiteimponibile>)readProperty("limiteimponibileArray");
    }


    public void addToScadenzaArray(Scadenza obj) {
        addToManyTarget("scadenzaArray", obj, true);
    }
    public void removeFromScadenzaArray(Scadenza obj) {
        removeToManyTarget("scadenzaArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Scadenza> getScadenzaArray() {
        return (List<Scadenza>)readProperty("scadenzaArray");
    }


}
