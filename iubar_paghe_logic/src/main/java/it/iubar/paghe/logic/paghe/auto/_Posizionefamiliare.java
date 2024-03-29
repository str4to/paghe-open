package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.anagrafica.Personafisica;
import it.iubar.paghe.logic.paghe.Posizionelavoratore;

/**
 * Class _Posizionefamiliare was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Posizionefamiliare extends CayenneDataObject {

    public static final String CARICODECORRENZA_PROPERTY = "caricodecorrenza";
    public static final String CARICOPERCENTUALE_PROPERTY = "caricopercentuale";
    public static final String CF_PROPERTY = "cf";
    public static final String DETRAZIONE_PROPERTY = "detrazione";
    public static final String IDANAGRAFICA_PROPERTY = "idanagrafica";
    public static final String IDPOSIZIONE_PROPERTY = "idposizione";
    public static final String IDRAPPORTOPARENTELA_PROPERTY = "idrapportoparentela";
    public static final String IDSTATOCIVILE_PROPERTY = "idstatocivile";
    public static final String IDTIPOOCCUPAZIONE_PROPERTY = "idtipooccupazione";
    public static final String NORECALC_PROPERTY = "norecalc";
    public static final String OPZIONE_PROPERTY = "opzione";
    public static final String TO_PERSONAFISICA_PROPERTY = "toPersonafisica";
    public static final String TO_POSIZIONELAVORATORE_PROPERTY = "toPosizionelavoratore";

    public static final String IDANAGRAFICA_PK_COLUMN = "IDANAGRAFICA";
    public static final String IDPOSIZIONE_PK_COLUMN = "IDPOSIZIONE";

    public void setCaricodecorrenza(Date caricodecorrenza) {
        writeProperty("caricodecorrenza", caricodecorrenza);
    }
    public Date getCaricodecorrenza() {
        return (Date)readProperty("caricodecorrenza");
    }

    public void setCaricopercentuale(BigDecimal caricopercentuale) {
        writeProperty("caricopercentuale", caricopercentuale);
    }
    public BigDecimal getCaricopercentuale() {
        return (BigDecimal)readProperty("caricopercentuale");
    }

    public void setCf(String cf) {
        writeProperty("cf", cf);
    }
    public String getCf() {
        return (String)readProperty("cf");
    }

    public void setDetrazione(BigDecimal detrazione) {
        writeProperty("detrazione", detrazione);
    }
    public BigDecimal getDetrazione() {
        return (BigDecimal)readProperty("detrazione");
    }

    public void setIdanagrafica(Integer idanagrafica) {
        writeProperty("idanagrafica", idanagrafica);
    }
    public Integer getIdanagrafica() {
        return (Integer)readProperty("idanagrafica");
    }

    public void setIdposizione(Integer idposizione) {
        writeProperty("idposizione", idposizione);
    }
    public Integer getIdposizione() {
        return (Integer)readProperty("idposizione");
    }

    public void setIdrapportoparentela(Short idrapportoparentela) {
        writeProperty("idrapportoparentela", idrapportoparentela);
    }
    public Short getIdrapportoparentela() {
        return (Short)readProperty("idrapportoparentela");
    }

    public void setIdstatocivile(Short idstatocivile) {
        writeProperty("idstatocivile", idstatocivile);
    }
    public Short getIdstatocivile() {
        return (Short)readProperty("idstatocivile");
    }

    public void setIdtipooccupazione(Short idtipooccupazione) {
        writeProperty("idtipooccupazione", idtipooccupazione);
    }
    public Short getIdtipooccupazione() {
        return (Short)readProperty("idtipooccupazione");
    }

    public void setNorecalc(Short norecalc) {
        writeProperty("norecalc", norecalc);
    }
    public Short getNorecalc() {
        return (Short)readProperty("norecalc");
    }

    public void setOpzione(Short opzione) {
        writeProperty("opzione", opzione);
    }
    public Short getOpzione() {
        return (Short)readProperty("opzione");
    }

    public void setToPersonafisica(Personafisica toPersonafisica) {
        setToOneTarget("toPersonafisica", toPersonafisica, true);
    }

    public Personafisica getToPersonafisica() {
        return (Personafisica)readProperty("toPersonafisica");
    }


    public void setToPosizionelavoratore(Posizionelavoratore toPosizionelavoratore) {
        setToOneTarget("toPosizionelavoratore", toPosizionelavoratore, true);
    }

    public Posizionelavoratore getToPosizionelavoratore() {
        return (Posizionelavoratore)readProperty("toPosizionelavoratore");
    }


}
