package it.iubar.paghe.logic.paghe.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.PaAltroenteversante;

/**
 * Class _PaTipocontributoaltroente was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PaTipocontributoaltroente extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDTIPOCONTRIBUTOALTROENTE_PROPERTY = "idtipocontributoaltroente";
    public static final String PA_ALTRO_ENTE_VERSANTE_ARRAY_PROPERTY = "paAltroEnteVersanteArray";

    public static final String IDTIPOCONTRIBUTOALTROENTE_PK_COLUMN = "IDTIPOCONTRIBUTOALTROENTE";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public Short getIdtipocontributoaltroente() {
        return (Short)readProperty("idtipocontributoaltroente");
    }

    public void addToPaAltroEnteVersanteArray(PaAltroenteversante obj) {
        addToManyTarget("paAltroEnteVersanteArray", obj, true);
    }
    public void removeFromPaAltroEnteVersanteArray(PaAltroenteversante obj) {
        removeToManyTarget("paAltroEnteVersanteArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<PaAltroenteversante> getPaAltroEnteVersanteArray() {
        return (List<PaAltroenteversante>)readProperty("paAltroEnteVersanteArray");
    }


}
