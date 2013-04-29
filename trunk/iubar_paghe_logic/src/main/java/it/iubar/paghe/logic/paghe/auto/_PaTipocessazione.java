package it.iubar.paghe.logic.paghe.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.PaPosizioneperiodo;

/**
 * Class _PaTipocessazione was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PaTipocessazione extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDPATIPOCESSAZIONE_PROPERTY = "idpatipocessazione";
    public static final String PA_POSIZIONE_PERIODO_ARRAY_PROPERTY = "paPosizionePeriodoArray";

    public static final String IDPATIPOCESSAZIONE_PK_COLUMN = "IDPATIPOCESSAZIONE";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public Short getIdpatipocessazione() {
        return (Short)readProperty("idpatipocessazione");
    }

    public void addToPaPosizionePeriodoArray(PaPosizioneperiodo obj) {
        addToManyTarget("paPosizionePeriodoArray", obj, true);
    }
    public void removeFromPaPosizionePeriodoArray(PaPosizioneperiodo obj) {
        removeToManyTarget("paPosizionePeriodoArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<PaPosizioneperiodo> getPaPosizionePeriodoArray() {
        return (List<PaPosizioneperiodo>)readProperty("paPosizionePeriodoArray");
    }


}
