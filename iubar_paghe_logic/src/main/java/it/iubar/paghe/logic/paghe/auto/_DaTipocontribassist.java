package it.iubar.paghe.logic.paghe.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.DaContribassistcontrat;

/**
 * Class _DaTipocontribassist was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _DaTipocontribassist extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDTIPOCONTRIBASSIST_PROPERTY = "idtipocontribassist";
    public static final String DA_CONTRIB_ASSIST_CONTRAT_ARRAY_PROPERTY = "daContribAssistContratArray";

    public static final String IDTIPOCONTRIBASSIST_PK_COLUMN = "IDTIPOCONTRIBASSIST";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public String getIdtipocontribassist() {
        return (String)readProperty("idtipocontribassist");
    }

    public void addToDaContribAssistContratArray(DaContribassistcontrat obj) {
        addToManyTarget("daContribAssistContratArray", obj, true);
    }
    public void removeFromDaContribAssistContratArray(DaContribassistcontrat obj) {
        removeToManyTarget("daContribAssistContratArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<DaContribassistcontrat> getDaContribAssistContratArray() {
        return (List<DaContribassistcontrat>)readProperty("daContribAssistContratArray");
    }


}
