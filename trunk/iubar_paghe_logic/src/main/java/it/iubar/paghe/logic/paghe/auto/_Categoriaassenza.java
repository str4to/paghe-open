package it.iubar.paghe.logic.paghe.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Tipoassenza;

/**
 * Class _Categoriaassenza was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Categoriaassenza extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDCATEGORIA_PROPERTY = "idcategoria";
    public static final String TIPOASSENZA_ARRAY_PROPERTY = "tipoassenzaArray";

    public static final String IDCATEGORIA_PK_COLUMN = "IDCATEGORIA";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public Short getIdcategoria() {
        return (Short)readProperty("idcategoria");
    }

    public void addToTipoassenzaArray(Tipoassenza obj) {
        addToManyTarget("tipoassenzaArray", obj, true);
    }
    public void removeFromTipoassenzaArray(Tipoassenza obj) {
        removeToManyTarget("tipoassenzaArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Tipoassenza> getTipoassenzaArray() {
        return (List<Tipoassenza>)readProperty("tipoassenzaArray");
    }


}
