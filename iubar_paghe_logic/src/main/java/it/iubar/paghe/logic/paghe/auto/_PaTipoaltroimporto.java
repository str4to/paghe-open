package it.iubar.paghe.logic.paghe.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.PaAltroimporto;

/**
 * Class _PaTipoaltroimporto was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PaTipoaltroimporto extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDTIPOALTROIMPORTO_PROPERTY = "idtipoaltroimporto";
    public static final String PA_ALTRO_IMPORTO_ARRAY_PROPERTY = "paAltroImportoArray";

    public static final String IDTIPOALTROIMPORTO_PK_COLUMN = "IDTIPOALTROIMPORTO";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public Short getIdtipoaltroimporto() {
        return (Short)readProperty("idtipoaltroimporto");
    }

    public void addToPaAltroImportoArray(PaAltroimporto obj) {
        addToManyTarget("paAltroImportoArray", obj, true);
    }
    public void removeFromPaAltroImportoArray(PaAltroimporto obj) {
        removeToManyTarget("paAltroImportoArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<PaAltroimporto> getPaAltroImportoArray() {
        return (List<PaAltroimporto>)readProperty("paAltroImportoArray");
    }


}