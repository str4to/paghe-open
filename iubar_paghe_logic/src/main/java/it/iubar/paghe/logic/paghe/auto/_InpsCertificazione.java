package it.iubar.paghe.logic.paghe.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.anagrafica.Parasubordinato;
import it.iubar.paghe.logic.paghe.Posizioneparasubordinato;

/**
 * Class _InpsCertificazione was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _InpsCertificazione extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDINPSCERTIFICAZIONE_PROPERTY = "idinpscertificazione";
    public static final String PARASUBORDINATO_ARRAY_PROPERTY = "parasubordinatoArray";
    public static final String POSIZIONEPARASUBORDINATO_ARRAY_PROPERTY = "posizioneparasubordinatoArray";

    public static final String IDINPSCERTIFICAZIONE_PK_COLUMN = "IDINPSCERTIFICAZIONE";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public String getIdinpscertificazione() {
        return (String)readProperty("idinpscertificazione");
    }

    public void addToParasubordinatoArray(Parasubordinato obj) {
        addToManyTarget("parasubordinatoArray", obj, true);
    }
    public void removeFromParasubordinatoArray(Parasubordinato obj) {
        removeToManyTarget("parasubordinatoArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Parasubordinato> getParasubordinatoArray() {
        return (List<Parasubordinato>)readProperty("parasubordinatoArray");
    }


    public void addToPosizioneparasubordinatoArray(Posizioneparasubordinato obj) {
        addToManyTarget("posizioneparasubordinatoArray", obj, true);
    }
    public void removeFromPosizioneparasubordinatoArray(Posizioneparasubordinato obj) {
        removeToManyTarget("posizioneparasubordinatoArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Posizioneparasubordinato> getPosizioneparasubordinatoArray() {
        return (List<Posizioneparasubordinato>)readProperty("posizioneparasubordinatoArray");
    }


}
