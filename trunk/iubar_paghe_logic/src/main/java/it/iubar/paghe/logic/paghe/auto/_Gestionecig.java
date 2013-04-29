package it.iubar.paghe.logic.paghe.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Cigoacredito;
import it.iubar.paghe.logic.paghe.Cigoadebito;
import it.iubar.paghe.logic.paghe.Cigsacredito;
import it.iubar.paghe.logic.paghe.Cigsadebito;
import it.iubar.paghe.logic.paghe.Cigsdatistat;
import it.iubar.paghe.logic.paghe.Datoretributivo;

/**
 * Class _Gestionecig was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Gestionecig extends CayenneDataObject {

    public static final String IDDATORETRIBUTIVO_PROPERTY = "iddatoretributivo";
    public static final String CIGO_ACREDITO_ARRAY_PROPERTY = "cigoACreditoArray";
    public static final String CIGO_ADEBITO_ARRAY_PROPERTY = "cigoADebitoArray";
    public static final String CIGS_ACREDITO_ARRAY_PROPERTY = "cigsACreditoArray";
    public static final String CIGS_ADEBITO_ARRAY_PROPERTY = "cigsADebitoArray";
    public static final String CIGS_DATI_STAT_ARRAY_PROPERTY = "cigsDatiStatArray";
    public static final String TO_DATORETRIBUTIVO_PROPERTY = "toDatoretributivo";

    public static final String IDDATORETRIBUTIVO_PK_COLUMN = "IDDATORETRIBUTIVO";

    public void setIddatoretributivo(Integer iddatoretributivo) {
        writeProperty("iddatoretributivo", iddatoretributivo);
    }
    public Integer getIddatoretributivo() {
        return (Integer)readProperty("iddatoretributivo");
    }

    public void addToCigoACreditoArray(Cigoacredito obj) {
        addToManyTarget("cigoACreditoArray", obj, true);
    }
    public void removeFromCigoACreditoArray(Cigoacredito obj) {
        removeToManyTarget("cigoACreditoArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Cigoacredito> getCigoACreditoArray() {
        return (List<Cigoacredito>)readProperty("cigoACreditoArray");
    }


    public void addToCigoADebitoArray(Cigoadebito obj) {
        addToManyTarget("cigoADebitoArray", obj, true);
    }
    public void removeFromCigoADebitoArray(Cigoadebito obj) {
        removeToManyTarget("cigoADebitoArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Cigoadebito> getCigoADebitoArray() {
        return (List<Cigoadebito>)readProperty("cigoADebitoArray");
    }


    public void addToCigsACreditoArray(Cigsacredito obj) {
        addToManyTarget("cigsACreditoArray", obj, true);
    }
    public void removeFromCigsACreditoArray(Cigsacredito obj) {
        removeToManyTarget("cigsACreditoArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Cigsacredito> getCigsACreditoArray() {
        return (List<Cigsacredito>)readProperty("cigsACreditoArray");
    }


    public void addToCigsADebitoArray(Cigsadebito obj) {
        addToManyTarget("cigsADebitoArray", obj, true);
    }
    public void removeFromCigsADebitoArray(Cigsadebito obj) {
        removeToManyTarget("cigsADebitoArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Cigsadebito> getCigsADebitoArray() {
        return (List<Cigsadebito>)readProperty("cigsADebitoArray");
    }


    public void addToCigsDatiStatArray(Cigsdatistat obj) {
        addToManyTarget("cigsDatiStatArray", obj, true);
    }
    public void removeFromCigsDatiStatArray(Cigsdatistat obj) {
        removeToManyTarget("cigsDatiStatArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Cigsdatistat> getCigsDatiStatArray() {
        return (List<Cigsdatistat>)readProperty("cigsDatiStatArray");
    }


    public void setToDatoretributivo(Datoretributivo toDatoretributivo) {
        setToOneTarget("toDatoretributivo", toDatoretributivo, true);
    }

    public Datoretributivo getToDatoretributivo() {
        return (Datoretributivo)readProperty("toDatoretributivo");
    }


}
