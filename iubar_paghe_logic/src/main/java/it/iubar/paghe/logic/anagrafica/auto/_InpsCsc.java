package it.iubar.paghe.logic.anagrafica.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.anagrafica.InpsClasse;
import it.iubar.paghe.logic.anagrafica.InpsRamo;
import it.iubar.paghe.logic.anagrafica.Sedeimpresa;

/**
 * Class _InpsCsc was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _InpsCsc extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDINPSATTIVITA_PROPERTY = "idinpsattivita";
    public static final String IDINPSCLASSE_PROPERTY = "idinpsclasse";
    public static final String IDINPSRAMO_PROPERTY = "idinpsramo";
    public static final String SEDEIMPRESA_ARRAY_PROPERTY = "sedeimpresaArray";
    public static final String TO_CLASSE_PROPERTY = "toClasse";
    public static final String TO_RAMO_PROPERTY = "toRamo";

    public static final String INPSCSC_PK_COLUMN = "INPSCSC";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public String getIdinpsattivita() {
        return (String)readProperty("idinpsattivita");
    }

    public String getIdinpsclasse() {
        return (String)readProperty("idinpsclasse");
    }

    public Short getIdinpsramo() {
        return (Short)readProperty("idinpsramo");
    }

    public void addToSedeimpresaArray(Sedeimpresa obj) {
        addToManyTarget("sedeimpresaArray", obj, true);
    }
    public void removeFromSedeimpresaArray(Sedeimpresa obj) {
        removeToManyTarget("sedeimpresaArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Sedeimpresa> getSedeimpresaArray() {
        return (List<Sedeimpresa>)readProperty("sedeimpresaArray");
    }



    public InpsClasse getToClasse() {
        return (InpsClasse)readProperty("toClasse");
    }



    public InpsRamo getToRamo() {
        return (InpsRamo)readProperty("toRamo");
    }


}
