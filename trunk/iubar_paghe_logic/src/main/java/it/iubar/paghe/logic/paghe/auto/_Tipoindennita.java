package it.iubar.paghe.logic.paghe.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Contrattoindennita;

/**
 * Class _Tipoindennita was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Tipoindennita extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDTIPOINDENNITA_PROPERTY = "idtipoindennita";
    public static final String CONTRATTOINDENNITA_ARRAY_PROPERTY = "contrattoindennitaArray";

    public static final String IDTIPOINDENNITA_PK_COLUMN = "IDTIPOINDENNITA";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public Short getIdtipoindennita() {
        return (Short)readProperty("idtipoindennita");
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


}