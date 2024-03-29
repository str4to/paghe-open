package it.iubar.paghe.logic.paghe.auto;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Contrattoindennita;
import it.iubar.paghe.logic.paghe.Posizionesubordinato;

/**
 * Class _Posizioneindennita was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Posizioneindennita extends CayenneDataObject {

    public static final String IDCONTRATTODETTAGLIO_PROPERTY = "idcontrattodettaglio";
    public static final String IDINDENNITA_PROPERTY = "idindennita";
    public static final String IDPOSIZIONE_PROPERTY = "idposizione";
    public static final String NORECAL_PROPERTY = "norecal";
    public static final String TO_CONTRATTOINDENNITA_PROPERTY = "toContrattoindennita";
    public static final String TO_POSIZIONESUBORDINATO_PROPERTY = "toPosizionesubordinato";

    public static final String IDCONTRATTODETTAGLIO_PK_COLUMN = "IDCONTRATTODETTAGLIO";
    public static final String IDINDENNITA_PK_COLUMN = "IDINDENNITA";
    public static final String IDPOSIZIONE_PK_COLUMN = "IDPOSIZIONE";

    public void setIdcontrattodettaglio(Integer idcontrattodettaglio) {
        writeProperty("idcontrattodettaglio", idcontrattodettaglio);
    }
    public Integer getIdcontrattodettaglio() {
        return (Integer)readProperty("idcontrattodettaglio");
    }

    public void setIdindennita(Short idindennita) {
        writeProperty("idindennita", idindennita);
    }
    public Short getIdindennita() {
        return (Short)readProperty("idindennita");
    }

    public void setIdposizione(Integer idposizione) {
        writeProperty("idposizione", idposizione);
    }
    public Integer getIdposizione() {
        return (Integer)readProperty("idposizione");
    }

    public void setNorecal(Short norecal) {
        writeProperty("norecal", norecal);
    }
    public Short getNorecal() {
        return (Short)readProperty("norecal");
    }

    public void setToContrattoindennita(Contrattoindennita toContrattoindennita) {
        setToOneTarget("toContrattoindennita", toContrattoindennita, true);
    }

    public Contrattoindennita getToContrattoindennita() {
        return (Contrattoindennita)readProperty("toContrattoindennita");
    }


    public void setToPosizionesubordinato(Posizionesubordinato toPosizionesubordinato) {
        setToOneTarget("toPosizionesubordinato", toPosizionesubordinato, true);
    }

    public Posizionesubordinato getToPosizionesubordinato() {
        return (Posizionesubordinato)readProperty("toPosizionesubordinato");
    }


}
