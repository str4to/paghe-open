package it.iubar.paghe.logic.anagrafica.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.anagrafica.Personafisica;

/**
 * Class _Tipooccupazione was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Tipooccupazione extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDTIPOOCCUPAZIONE_PROPERTY = "idtipooccupazione";
    public static final String PERSONAFISICA_ARRAY_PROPERTY = "personafisicaArray";

    public static final String IDTIPOOCCUPAZIONE_PK_COLUMN = "IDTIPOOCCUPAZIONE";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public Short getIdtipooccupazione() {
        return (Short)readProperty("idtipooccupazione");
    }

    public void addToPersonafisicaArray(Personafisica obj) {
        addToManyTarget("personafisicaArray", obj, true);
    }
    public void removeFromPersonafisicaArray(Personafisica obj) {
        removeToManyTarget("personafisicaArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Personafisica> getPersonafisicaArray() {
        return (List<Personafisica>)readProperty("personafisicaArray");
    }


}
