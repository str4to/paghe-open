package it.iubar.paghe.logic.paghe.auto;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Contrattoindennita;

/**
 * Class _Profiloindennita was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Profiloindennita extends CayenneDataObject {

    public static final String IDCONTRATTODETTAGLIO_PROPERTY = "idcontrattodettaglio";
    public static final String IDINDENNITA_PROPERTY = "idindennita";
    public static final String IDPROFILO_PROPERTY = "idprofilo";
    public static final String TO_CONTRATTOINDENNITA_PROPERTY = "toContrattoindennita";

    public static final String IDCONTRATTODETTAGLIO_PK_COLUMN = "IDCONTRATTODETTAGLIO";
    public static final String IDINDENNITA_PK_COLUMN = "IDINDENNITA";
    public static final String IDPROFILO_PK_COLUMN = "IDPROFILO";

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

    public void setIdprofilo(Integer idprofilo) {
        writeProperty("idprofilo", idprofilo);
    }
    public Integer getIdprofilo() {
        return (Integer)readProperty("idprofilo");
    }

    public void setToContrattoindennita(Contrattoindennita toContrattoindennita) {
        setToOneTarget("toContrattoindennita", toContrattoindennita, true);
    }

    public Contrattoindennita getToContrattoindennita() {
        return (Contrattoindennita)readProperty("toContrattoindennita");
    }


}
