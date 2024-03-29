package it.iubar.paghe.logic.paghe.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.InailGruppo2;
import it.iubar.paghe.logic.paghe.Posizioneinail;
import it.iubar.paghe.logic.paghe.Profiloinail;

/**
 * Class _InailGruppo was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _InailGruppo extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDGRUPPO_PROPERTY = "idgruppo";
    public static final String INAIL_GRUPPO2ARRAY_PROPERTY = "inailGruppo2Array";
    public static final String POSIZIONE_INAIL_ARRAY_PROPERTY = "posizioneInailArray";
    public static final String PROFILO_INAIL_ARRAY_PROPERTY = "profiloInailArray";

    public static final String IDGRUPPO_PK_COLUMN = "IDGRUPPO";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public Short getIdgruppo() {
        return (Short)readProperty("idgruppo");
    }

    public void addToInailGruppo2Array(InailGruppo2 obj) {
        addToManyTarget("inailGruppo2Array", obj, true);
    }
    public void removeFromInailGruppo2Array(InailGruppo2 obj) {
        removeToManyTarget("inailGruppo2Array", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<InailGruppo2> getInailGruppo2Array() {
        return (List<InailGruppo2>)readProperty("inailGruppo2Array");
    }


    public void addToPosizioneInailArray(Posizioneinail obj) {
        addToManyTarget("posizioneInailArray", obj, true);
    }
    public void removeFromPosizioneInailArray(Posizioneinail obj) {
        removeToManyTarget("posizioneInailArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Posizioneinail> getPosizioneInailArray() {
        return (List<Posizioneinail>)readProperty("posizioneInailArray");
    }


    public void addToProfiloInailArray(Profiloinail obj) {
        addToManyTarget("profiloInailArray", obj, true);
    }
    public void removeFromProfiloInailArray(Profiloinail obj) {
        removeToManyTarget("profiloInailArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Profiloinail> getProfiloInailArray() {
        return (List<Profiloinail>)readProperty("profiloInailArray");
    }


}
