package it.iubar.paghe.logic.paghe.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.InpsAliquotaarea;
import it.iubar.paghe.logic.paghe.InpsContrattoGruppo;

/**
 * Class _InpsAliquotagruppo was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _InpsAliquotagruppo extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDGRUPPO_PROPERTY = "idgruppo";
    public static final String NOTE_PROPERTY = "note";
    public static final String ALIQUOTAAREA_ARRAY_PROPERTY = "aliquotaareaArray";
    public static final String INPSCONTRATTOGRUPPO_ARRAY_PROPERTY = "inpscontrattogruppoArray";

    public static final String IDGRUPPO_PK_COLUMN = "IDGRUPPO";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public Short getIdgruppo() {
        return (Short)readProperty("idgruppo");
    }

    public String getNote() {
        return (String)readProperty("note");
    }

    public void addToAliquotaareaArray(InpsAliquotaarea obj) {
        addToManyTarget("aliquotaareaArray", obj, true);
    }
    public void removeFromAliquotaareaArray(InpsAliquotaarea obj) {
        removeToManyTarget("aliquotaareaArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<InpsAliquotaarea> getAliquotaareaArray() {
        return (List<InpsAliquotaarea>)readProperty("aliquotaareaArray");
    }


    public void addToInpscontrattogruppoArray(InpsContrattoGruppo obj) {
        addToManyTarget("inpscontrattogruppoArray", obj, true);
    }
    public void removeFromInpscontrattogruppoArray(InpsContrattoGruppo obj) {
        removeToManyTarget("inpscontrattogruppoArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<InpsContrattoGruppo> getInpscontrattogruppoArray() {
        return (List<InpsContrattoGruppo>)readProperty("inpscontrattogruppoArray");
    }


}