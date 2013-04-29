package it.iubar.paghe.logic.paghe.auto;

import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.InpsAliquotacolldettaglio;
import it.iubar.paghe.logic.paghe.Posizioneparasubordinato;

/**
 * Class _InpsAliquotacollaboratore was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _InpsAliquotacollaboratore extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDINPSALIQUOTA_PROPERTY = "idinpsaliquota";
    public static final String INPSALIQUOTAANNO_PROPERTY = "inpsaliquotaanno";
    public static final String VALIDOAL_PROPERTY = "validoal";
    public static final String VALIDODAL_PROPERTY = "validodal";
    public static final String POSIZIONEPARASUBORDINATO_ARRAY_PROPERTY = "posizioneparasubordinatoArray";
    public static final String TO_DETTAGLIO_PROPERTY = "toDettaglio";

    public static final String IDINPSALIQUOTA_PK_COLUMN = "IDINPSALIQUOTA";
    public static final String INPSALIQUOTAANNO_PK_COLUMN = "INPSALIQUOTAANNO";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public String getIdinpsaliquota() {
        return (String)readProperty("idinpsaliquota");
    }

    public Integer getInpsaliquotaanno() {
        return (Integer)readProperty("inpsaliquotaanno");
    }

    public Date getValidoal() {
        return (Date)readProperty("validoal");
    }

    public Date getValidodal() {
        return (Date)readProperty("validodal");
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



    public InpsAliquotacolldettaglio getToDettaglio() {
        return (InpsAliquotacolldettaglio)readProperty("toDettaglio");
    }


}