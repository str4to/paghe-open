package it.iubar.paghe.logic.paghe.auto;

import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.anagrafica.Subordinato;
import it.iubar.paghe.logic.anagrafica.Tipolavoratore2;
import it.iubar.paghe.logic.paghe.InpsTipocontribuzione;
import it.iubar.paghe.logic.paghe.Posizionesubordinato;
import it.iubar.paghe.logic.presenze.Orario;
import it.iubar.paghe.logic.presenze.Presenza;

/**
 * Class _InpsQualifica1 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _InpsQualifica1 extends CayenneDataObject {

    public static final String DATASCADENZA_PROPERTY = "datascadenza";
    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String DESCRIZIONE2_PROPERTY = "descrizione2";
    public static final String IDINPSQUALIFICA1_PROPERTY = "idinpsqualifica1";
    public static final String IDTIPOLAVORATORE2_PROPERTY = "idtipolavoratore2";
    public static final String ORARIO_ARRAY_PROPERTY = "orarioArray";
    public static final String POSIZIONESUBORDINATO_ARRAY_PROPERTY = "posizionesubordinatoArray";
    public static final String PRESENZA_ARRAY_PROPERTY = "presenzaArray";
    public static final String SUBORDINATO_ATTUALE_ARRAY_PROPERTY = "subordinatoAttualeArray";
    public static final String TIPOCONTRIBUZIONE_ARRAY_PROPERTY = "tipocontribuzioneArray";
    public static final String TO_TIPOLAVORATORE2_PROPERTY = "toTipolavoratore2";

    public static final String IDINPSQUALIFICA1_PK_COLUMN = "IDINPSQUALIFICA1";

    public Date getDatascadenza() {
        return (Date)readProperty("datascadenza");
    }

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public String getDescrizione2() {
        return (String)readProperty("descrizione2");
    }

    public String getIdinpsqualifica1() {
        return (String)readProperty("idinpsqualifica1");
    }

    public Short getIdtipolavoratore2() {
        return (Short)readProperty("idtipolavoratore2");
    }

    public void addToOrarioArray(Orario obj) {
        addToManyTarget("orarioArray", obj, true);
    }
    public void removeFromOrarioArray(Orario obj) {
        removeToManyTarget("orarioArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Orario> getOrarioArray() {
        return (List<Orario>)readProperty("orarioArray");
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


    public void addToPresenzaArray(Presenza obj) {
        addToManyTarget("presenzaArray", obj, true);
    }
    public void removeFromPresenzaArray(Presenza obj) {
        removeToManyTarget("presenzaArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Presenza> getPresenzaArray() {
        return (List<Presenza>)readProperty("presenzaArray");
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


    public void addToTipocontribuzioneArray(InpsTipocontribuzione obj) {
        addToManyTarget("tipocontribuzioneArray", obj, true);
    }
    public void removeFromTipocontribuzioneArray(InpsTipocontribuzione obj) {
        removeToManyTarget("tipocontribuzioneArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<InpsTipocontribuzione> getTipocontribuzioneArray() {
        return (List<InpsTipocontribuzione>)readProperty("tipocontribuzioneArray");
    }



    public Tipolavoratore2 getToTipolavoratore2() {
        return (Tipolavoratore2)readProperty("toTipolavoratore2");
    }


}
