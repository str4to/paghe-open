package it.iubar.paghe.logic.paghe.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.PaGestpensionistica;

/**
 * Class _PaTiporecupero was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PaTiporecupero extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDTIPORECUPERO_PROPERTY = "idtiporecupero";
    public static final String PA_GESTIONE_PENSIONISTICA_ARRAY1_PROPERTY = "paGestionePensionisticaArray1";
    public static final String PA_GESTIONE_PENSIONISTICA_ARRAY2_PROPERTY = "paGestionePensionisticaArray2";

    public static final String IDTIPORECUPERO_PK_COLUMN = "IDTIPORECUPERO";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public Short getIdtiporecupero() {
        return (Short)readProperty("idtiporecupero");
    }

    public void addToPaGestionePensionisticaArray1(PaGestpensionistica obj) {
        addToManyTarget("paGestionePensionisticaArray1", obj, true);
    }
    public void removeFromPaGestionePensionisticaArray1(PaGestpensionistica obj) {
        removeToManyTarget("paGestionePensionisticaArray1", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<PaGestpensionistica> getPaGestionePensionisticaArray1() {
        return (List<PaGestpensionistica>)readProperty("paGestionePensionisticaArray1");
    }


    public void addToPaGestionePensionisticaArray2(PaGestpensionistica obj) {
        addToManyTarget("paGestionePensionisticaArray2", obj, true);
    }
    public void removeFromPaGestionePensionisticaArray2(PaGestpensionistica obj) {
        removeToManyTarget("paGestionePensionisticaArray2", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<PaGestpensionistica> getPaGestionePensionisticaArray2() {
        return (List<PaGestpensionistica>)readProperty("paGestionePensionisticaArray2");
    }


}
