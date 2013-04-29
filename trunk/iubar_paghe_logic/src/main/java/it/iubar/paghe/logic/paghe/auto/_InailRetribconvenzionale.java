package it.iubar.paghe.logic.paghe.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.InailRetribconvenzionale2;
import it.iubar.paghe.logic.paghe.Posizioneinail;
import it.iubar.paghe.logic.paghe.Profiloinail;

/**
 * Class _InailRetribconvenzionale was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _InailRetribconvenzionale extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDINPSQUALIFICA1_PROPERTY = "idinpsqualifica1";
    public static final String IDRETRIBCONV_PROPERTY = "idretribconv";
    public static final String IDSETTORE_PROPERTY = "idsettore";
    public static final String SETTORE_PROPERTY = "settore";
    public static final String INAIL_RETRIBCONV2ARRAY_PROPERTY = "inailRetribconv2Array";
    public static final String POSIZIONEINAIL_ARRAY_PROPERTY = "posizioneinailArray";
    public static final String PROFILOINAIL_ARRAY_PROPERTY = "profiloinailArray";

    public static final String IDRETRIBCONV_PK_COLUMN = "IDRETRIBCONV";

    public void setDescrizione(String descrizione) {
        writeProperty("descrizione", descrizione);
    }
    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public void setIdinpsqualifica1(String idinpsqualifica1) {
        writeProperty("idinpsqualifica1", idinpsqualifica1);
    }
    public String getIdinpsqualifica1() {
        return (String)readProperty("idinpsqualifica1");
    }

    public void setIdretribconv(Short idretribconv) {
        writeProperty("idretribconv", idretribconv);
    }
    public Short getIdretribconv() {
        return (Short)readProperty("idretribconv");
    }

    public void setIdsettore(Short idsettore) {
        writeProperty("idsettore", idsettore);
    }
    public Short getIdsettore() {
        return (Short)readProperty("idsettore");
    }

    public void setSettore(String settore) {
        writeProperty("settore", settore);
    }
    public String getSettore() {
        return (String)readProperty("settore");
    }

    public void addToInailRetribconv2Array(InailRetribconvenzionale2 obj) {
        addToManyTarget("inailRetribconv2Array", obj, true);
    }
    public void removeFromInailRetribconv2Array(InailRetribconvenzionale2 obj) {
        removeToManyTarget("inailRetribconv2Array", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<InailRetribconvenzionale2> getInailRetribconv2Array() {
        return (List<InailRetribconvenzionale2>)readProperty("inailRetribconv2Array");
    }


    public void addToPosizioneinailArray(Posizioneinail obj) {
        addToManyTarget("posizioneinailArray", obj, true);
    }
    public void removeFromPosizioneinailArray(Posizioneinail obj) {
        removeToManyTarget("posizioneinailArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Posizioneinail> getPosizioneinailArray() {
        return (List<Posizioneinail>)readProperty("posizioneinailArray");
    }


    public void addToProfiloinailArray(Profiloinail obj) {
        addToManyTarget("profiloinailArray", obj, true);
    }
    public void removeFromProfiloinailArray(Profiloinail obj) {
        removeToManyTarget("profiloinailArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Profiloinail> getProfiloinailArray() {
        return (List<Profiloinail>)readProperty("profiloinailArray");
    }


}
