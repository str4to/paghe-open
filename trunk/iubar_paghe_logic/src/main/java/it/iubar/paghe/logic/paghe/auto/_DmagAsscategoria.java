package it.iubar.paghe.logic.paghe.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.DmagImpresa;

/**
 * Class _DmagAsscategoria was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _DmagAsscategoria extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDASSCATEGORIA_PROPERTY = "idasscategoria";
    public static final String SIGLA_PROPERTY = "sigla";
    public static final String DMAG_IMPRESA_ARRAY_PROPERTY = "dmagImpresaArray";

    public static final String IDASSCATEGORIA_PK_COLUMN = "IDASSCATEGORIA";

    public void setDescrizione(String descrizione) {
        writeProperty("descrizione", descrizione);
    }
    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public void setIdasscategoria(Short idasscategoria) {
        writeProperty("idasscategoria", idasscategoria);
    }
    public Short getIdasscategoria() {
        return (Short)readProperty("idasscategoria");
    }

    public void setSigla(String sigla) {
        writeProperty("sigla", sigla);
    }
    public String getSigla() {
        return (String)readProperty("sigla");
    }

    public void addToDmagImpresaArray(DmagImpresa obj) {
        addToManyTarget("dmagImpresaArray", obj, true);
    }
    public void removeFromDmagImpresaArray(DmagImpresa obj) {
        removeToManyTarget("dmagImpresaArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<DmagImpresa> getDmagImpresaArray() {
        return (List<DmagImpresa>)readProperty("dmagImpresaArray");
    }


}