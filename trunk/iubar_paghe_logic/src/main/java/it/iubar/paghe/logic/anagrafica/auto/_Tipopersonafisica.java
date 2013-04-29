package it.iubar.paghe.logic.anagrafica.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.anagrafica.Personafisica;

/**
 * Class _Tipopersonafisica was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Tipopersonafisica extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String PERSONAFISICA_ARRAY_PROPERTY = "personafisicaArray";

    public static final String IDTIPOPERSONAFISICA_PK_COLUMN = "IDTIPOPERSONAFISICA";

    public void setDescrizione(String descrizione) {
        writeProperty("descrizione", descrizione);
    }
    public String getDescrizione() {
        return (String)readProperty("descrizione");
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