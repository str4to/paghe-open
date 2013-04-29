package it.iubar.paghe.logic.paghe.auto;

import java.sql.Timestamp;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Aliquotaprevidenziale;
import it.iubar.paghe.logic.paghe.ImpresaContratto;
import it.iubar.paghe.logic.paghe.InpsAliquotaareaLavoratore;
import it.iubar.paghe.logic.paghe.InpsAliquotagruppo;
import it.iubar.paghe.logic.paghe.Riduzioneinps;

/**
 * Class _InpsAliquotaarea was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _InpsAliquotaarea extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDAREA_PROPERTY = "idarea";
    public static final String IDGRUPPO_PROPERTY = "idgruppo";
    public static final String INPSTABELLA_PROPERTY = "inpstabella";
    public static final String NOTE_PROPERTY = "note";
    public static final String ULTIMAMODIFICA_PROPERTY = "ultimamodifica";
    public static final String ALIQUOTAAREA_LAVORATORE_ARRAY_PROPERTY = "aliquotaareaLavoratoreArray";
    public static final String ALIQUOTAPREVIDENZIALE_ARRAY_PROPERTY = "aliquotaprevidenzialeArray";
    public static final String IMPRESA_CONTRATTO_ARRAY_PROPERTY = "impresaContrattoArray";
    public static final String RIDUZIONEINPS_ARRAY_PROPERTY = "riduzioneinpsArray";
    public static final String TO_ALIQUOTAGRUPPO_PROPERTY = "toAliquotagruppo";

    public static final String IDAREA_PK_COLUMN = "IDAREA";

    public void setDescrizione(String descrizione) {
        writeProperty("descrizione", descrizione);
    }
    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public void setIdarea(Integer idarea) {
        writeProperty("idarea", idarea);
    }
    public Integer getIdarea() {
        return (Integer)readProperty("idarea");
    }

    public void setIdgruppo(Short idgruppo) {
        writeProperty("idgruppo", idgruppo);
    }
    public Short getIdgruppo() {
        return (Short)readProperty("idgruppo");
    }

    public void setInpstabella(String inpstabella) {
        writeProperty("inpstabella", inpstabella);
    }
    public String getInpstabella() {
        return (String)readProperty("inpstabella");
    }

    public void setNote(String note) {
        writeProperty("note", note);
    }
    public String getNote() {
        return (String)readProperty("note");
    }

    public void setUltimamodifica(Timestamp ultimamodifica) {
        writeProperty("ultimamodifica", ultimamodifica);
    }
    public Timestamp getUltimamodifica() {
        return (Timestamp)readProperty("ultimamodifica");
    }

    public void addToAliquotaareaLavoratoreArray(InpsAliquotaareaLavoratore obj) {
        addToManyTarget("aliquotaareaLavoratoreArray", obj, true);
    }
    public void removeFromAliquotaareaLavoratoreArray(InpsAliquotaareaLavoratore obj) {
        removeToManyTarget("aliquotaareaLavoratoreArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<InpsAliquotaareaLavoratore> getAliquotaareaLavoratoreArray() {
        return (List<InpsAliquotaareaLavoratore>)readProperty("aliquotaareaLavoratoreArray");
    }


    public void addToAliquotaprevidenzialeArray(Aliquotaprevidenziale obj) {
        addToManyTarget("aliquotaprevidenzialeArray", obj, true);
    }
    public void removeFromAliquotaprevidenzialeArray(Aliquotaprevidenziale obj) {
        removeToManyTarget("aliquotaprevidenzialeArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Aliquotaprevidenziale> getAliquotaprevidenzialeArray() {
        return (List<Aliquotaprevidenziale>)readProperty("aliquotaprevidenzialeArray");
    }


    public void addToImpresaContrattoArray(ImpresaContratto obj) {
        addToManyTarget("impresaContrattoArray", obj, true);
    }
    public void removeFromImpresaContrattoArray(ImpresaContratto obj) {
        removeToManyTarget("impresaContrattoArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<ImpresaContratto> getImpresaContrattoArray() {
        return (List<ImpresaContratto>)readProperty("impresaContrattoArray");
    }


    public void addToRiduzioneinpsArray(Riduzioneinps obj) {
        addToManyTarget("riduzioneinpsArray", obj, true);
    }
    public void removeFromRiduzioneinpsArray(Riduzioneinps obj) {
        removeToManyTarget("riduzioneinpsArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Riduzioneinps> getRiduzioneinpsArray() {
        return (List<Riduzioneinps>)readProperty("riduzioneinpsArray");
    }


    public void setToAliquotagruppo(InpsAliquotagruppo toAliquotagruppo) {
        setToOneTarget("toAliquotagruppo", toAliquotagruppo, true);
    }

    public InpsAliquotagruppo getToAliquotagruppo() {
        return (InpsAliquotagruppo)readProperty("toAliquotagruppo");
    }


}
