package it.iubar.paghe.logic.paghe.auto;

import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.anagrafica.Subordinato;
import it.iubar.paghe.logic.paghe.InpsQualifica1;
import it.iubar.paghe.logic.paghe.Posizionesubordinato;

/**
 * Class _InpsTipocontribuzione was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _InpsTipocontribuzione extends CayenneDataObject {

    public static final String CODIFICATO_PROPERTY = "codificato";
    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDINPSTIPOCONTRIBUZIONE_PROPERTY = "idinpstipocontribuzione";
    public static final String NOCIG_PROPERTY = "nocig";
    public static final String NOCUAF_PROPERTY = "nocuaf";
    public static final String NODS_PROPERTY = "nods";
    public static final String VALIDOAL_PROPERTY = "validoal";
    public static final String VALIDODAL_PROPERTY = "validodal";
    public static final String POSIZIONESUBORDINATO_ARRAY_PROPERTY = "posizionesubordinatoArray";
    public static final String SUBORDINATO_ATTUALE_ARRAY_PROPERTY = "subordinatoAttualeArray";
    public static final String TO_QUALIFICA1_PROPERTY = "toQualifica1";

    public static final String IDINPSTIPOCONTRIBUZIONE_PK_COLUMN = "IDINPSTIPOCONTRIBUZIONE";

    public Short getCodificato() {
        return (Short)readProperty("codificato");
    }

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public String getIdinpstipocontribuzione() {
        return (String)readProperty("idinpstipocontribuzione");
    }

    public Short getNocig() {
        return (Short)readProperty("nocig");
    }

    public Short getNocuaf() {
        return (Short)readProperty("nocuaf");
    }

    public Short getNods() {
        return (Short)readProperty("nods");
    }

    public Date getValidoal() {
        return (Date)readProperty("validoal");
    }

    public Date getValidodal() {
        return (Date)readProperty("validodal");
    }

    public void addToPosizionesubordinatoArray(Posizionesubordinato obj) {
        addToManyTarget("posizionesubordinatoArray", obj, true);
    }
    public void removeFromPosizionesubordinatoArray(Posizionesubordinato obj) {
        removeToManyTarget("posizionesubordinatoArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Posizionesubordinato> getPosizionesubordinatoArray() {
        return (List<Posizionesubordinato>)readProperty("posizionesubordinatoArray");
    }


    public void addToSubordinatoAttualeArray(Subordinato obj) {
        addToManyTarget("subordinatoAttualeArray", obj, true);
    }
    public void removeFromSubordinatoAttualeArray(Subordinato obj) {
        removeToManyTarget("subordinatoAttualeArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Subordinato> getSubordinatoAttualeArray() {
        return (List<Subordinato>)readProperty("subordinatoAttualeArray");
    }



    public InpsQualifica1 getToQualifica1() {
        return (InpsQualifica1)readProperty("toQualifica1");
    }


}