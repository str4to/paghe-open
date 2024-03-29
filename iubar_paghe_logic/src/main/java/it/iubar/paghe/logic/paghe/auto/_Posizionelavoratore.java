package it.iubar.paghe.logic.paghe.auto;

import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.anagrafica.Comune;
import it.iubar.paghe.logic.anagrafica.Impresa;
import it.iubar.paghe.logic.anagrafica.Lavoratore;
import it.iubar.paghe.logic.anagrafica.Statoestero;
import it.iubar.paghe.logic.anagrafica.Titolaredati;
import it.iubar.paghe.logic.anagrafica.Utente;
import it.iubar.paghe.logic.paghe.Cedolino;
import it.iubar.paghe.logic.paghe.Datoretributivo;
import it.iubar.paghe.logic.paghe.MutPosizionelav;
import it.iubar.paghe.logic.paghe.Nucleofamiliare;
import it.iubar.paghe.logic.paghe.Numerazioneunica;
import it.iubar.paghe.logic.paghe.PosizioneRiduzioneinps;
import it.iubar.paghe.logic.paghe.Posizionefamiliare;
import it.iubar.paghe.logic.paghe.Posizionefiscale;
import it.iubar.paghe.logic.paghe.Posizioneinail;
import it.iubar.paghe.logic.paghe.Posizioneparasubordinato;
import it.iubar.paghe.logic.paghe.Posizionerateo;
import it.iubar.paghe.logic.paghe.Posizionescatto;
import it.iubar.paghe.logic.paghe.Posizionesubordinato;
import it.iubar.paghe.logic.paghe.Profilolavoratore;
import it.iubar.paghe.logic.paghe.Progressivoanno;
import it.iubar.paghe.logic.paghe.Statoposizione;
import it.iubar.paghe.logic.paghe.Tipocalcolomalattia1;
import it.iubar.paghe.logic.paghe.UniemensPosizione;
import it.iubar.paghe.logic.presenze.Orario;

/**
 * Class _Posizionelavoratore was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Posizionelavoratore extends CayenneDataObject {

    public static final String ANNORIFERIMENTO_PROPERTY = "annoriferimento";
    public static final String DATAEROGAZIONE_PROPERTY = "dataerogazione";
    public static final String DATARICHIESTACANCELLAZIONE_PROPERTY = "datarichiestacancellazione";
    public static final String IDCOMUNEPRESTAZIONE_PROPERTY = "idcomuneprestazione";
    public static final String IDIMPRESA_PROPERTY = "idimpresa";
    public static final String IDLAVORATORE_PROPERTY = "idlavoratore";
    public static final String IDORARIO_PROPERTY = "idorario";
    public static final String IDPOSIZIONE_PROPERTY = "idposizione";
    public static final String IDPROFILO_PROPERTY = "idprofilo";
    public static final String IDSEDEIMPRESA_PROPERTY = "idsedeimpresa";
    public static final String IDSTATOCIVILE_PROPERTY = "idstatocivile";
    public static final String IDSTATOPOSIZIONE_PROPERTY = "idstatoposizione";
    public static final String IDSTATOPRESTAZIONE_PROPERTY = "idstatoprestazione";
    public static final String IDTIPOMALATTIA1_PROPERTY = "idtipomalattia1";
    public static final String IDTITOLAREDATI_PROPERTY = "idtitolaredati";
    public static final String MATRICOLAINPS_PROPERTY = "matricolainps";
    public static final String MESERIFERIMENTO_PROPERTY = "meseriferimento";
    public static final String NORECALC_PROPERTY = "norecalc";
    public static final String RICHIESTACANCELLAZIONE_PROPERTY = "richiestacancellazione";
    public static final String ULTIMACOMUNICAZIONE_PROPERTY = "ultimacomunicazione";
    public static final String ULTIMAMODIFICA_PROPERTY = "ultimamodifica";
    public static final String ULTIMAMODIFICAUSER_PROPERTY = "ultimamodificauser";
    public static final String CEDOLINO_ARRAY_PROPERTY = "cedolinoArray";
    public static final String DATORETRIBUTIVO_ARRAY_PROPERTY = "datoretributivoArray";
    public static final String LAVORATORE_ASSUNZIONE_ARRAY_PROPERTY = "lavoratoreAssunzioneArray";
    public static final String LAVORATORE_CESSAZIONE_ARRAY_PROPERTY = "lavoratoreCessazioneArray";
    public static final String MUT_POSIZIONELAV_ARRAY_PROPERTY = "mutPosizionelavArray";
    public static final String NUMERAZIONEUNICA_ARRAY_PROPERTY = "numerazioneunicaArray";
    public static final String POSIZIONE_RIDUZIONEINPS_ARRAY_PROPERTY = "posizioneRiduzioneinpsArray";
    public static final String POSIZIONEFAMILIARE_ARRAY_PROPERTY = "posizionefamiliareArray";
    public static final String POSIZIONEFISCALE_ARRAY_PROPERTY = "posizionefiscaleArray";
    public static final String POSIZIONEINAIL_ARRAY_PROPERTY = "posizioneinailArray";
    public static final String POSIZIONEPARASUBORDINATO_ARRAY_PROPERTY = "posizioneparasubordinatoArray";
    public static final String POSIZIONESCATTO_ARRAY_PROPERTY = "posizionescattoArray";
    public static final String POSIZIONESUBORDINATO_ARRAY_PROPERTY = "posizionesubordinatoArray";
    public static final String RATEO_ARRAY_PROPERTY = "rateoArray";
    public static final String TO_COMUNE_PRESTAZIONE_PROPERTY = "toComunePrestazione";
    public static final String TO_IMPRESA_PROPERTY = "toImpresa";
    public static final String TO_LAVORATORE_PROPERTY = "toLavoratore";
    public static final String TO_NUCLEOFAMILIARE_PROPERTY = "toNucleofamiliare";
    public static final String TO_ORARIO_PROPERTY = "toOrario";
    public static final String TO_PROFILOLAVORATORE_PROPERTY = "toProfilolavoratore";
    public static final String TO_PROGRESSIVOANNO_PROPERTY = "toProgressivoanno";
    public static final String TO_STATO_PRESTAZIONE_PROPERTY = "toStatoPrestazione";
    public static final String TO_STATOPOSIZIONE_PROPERTY = "toStatoposizione";
    public static final String TO_TIPO_CALC_MALATTIA1_PROPERTY = "toTipoCalcMalattia1";
    public static final String TO_TITOLAREDATI_PROPERTY = "toTitolaredati";
    public static final String TO_UTENTE_ULTIMAMODIFICA_PROPERTY = "toUtenteUltimamodifica";
    public static final String UNIEMENS_POSIZIONE_ARRAY_PROPERTY = "uniemensPosizioneArray";

    public static final String IDPOSIZIONE_PK_COLUMN = "IDPOSIZIONE";

    public void setAnnoriferimento(Integer annoriferimento) {
        writeProperty("annoriferimento", annoriferimento);
    }
    public Integer getAnnoriferimento() {
        return (Integer)readProperty("annoriferimento");
    }

    public void setDataerogazione(Date dataerogazione) {
        writeProperty("dataerogazione", dataerogazione);
    }
    public Date getDataerogazione() {
        return (Date)readProperty("dataerogazione");
    }

    public void setDatarichiestacancellazione(Date datarichiestacancellazione) {
        writeProperty("datarichiestacancellazione", datarichiestacancellazione);
    }
    public Date getDatarichiestacancellazione() {
        return (Date)readProperty("datarichiestacancellazione");
    }

    public void setIdcomuneprestazione(String idcomuneprestazione) {
        writeProperty("idcomuneprestazione", idcomuneprestazione);
    }
    public String getIdcomuneprestazione() {
        return (String)readProperty("idcomuneprestazione");
    }

    public void setIdimpresa(Integer idimpresa) {
        writeProperty("idimpresa", idimpresa);
    }
    public Integer getIdimpresa() {
        return (Integer)readProperty("idimpresa");
    }

    public void setIdlavoratore(Integer idlavoratore) {
        writeProperty("idlavoratore", idlavoratore);
    }
    public Integer getIdlavoratore() {
        return (Integer)readProperty("idlavoratore");
    }

    public void setIdorario(Integer idorario) {
        writeProperty("idorario", idorario);
    }
    public Integer getIdorario() {
        return (Integer)readProperty("idorario");
    }

    public void setIdposizione(Integer idposizione) {
        writeProperty("idposizione", idposizione);
    }
    public Integer getIdposizione() {
        return (Integer)readProperty("idposizione");
    }

    public void setIdprofilo(Integer idprofilo) {
        writeProperty("idprofilo", idprofilo);
    }
    public Integer getIdprofilo() {
        return (Integer)readProperty("idprofilo");
    }

    public void setIdsedeimpresa(Short idsedeimpresa) {
        writeProperty("idsedeimpresa", idsedeimpresa);
    }
    public Short getIdsedeimpresa() {
        return (Short)readProperty("idsedeimpresa");
    }

    public void setIdstatocivile(Short idstatocivile) {
        writeProperty("idstatocivile", idstatocivile);
    }
    public Short getIdstatocivile() {
        return (Short)readProperty("idstatocivile");
    }

    public void setIdstatoposizione(Short idstatoposizione) {
        writeProperty("idstatoposizione", idstatoposizione);
    }
    public Short getIdstatoposizione() {
        return (Short)readProperty("idstatoposizione");
    }

    public void setIdstatoprestazione(Integer idstatoprestazione) {
        writeProperty("idstatoprestazione", idstatoprestazione);
    }
    public Integer getIdstatoprestazione() {
        return (Integer)readProperty("idstatoprestazione");
    }

    public void setIdtipomalattia1(Short idtipomalattia1) {
        writeProperty("idtipomalattia1", idtipomalattia1);
    }
    public Short getIdtipomalattia1() {
        return (Short)readProperty("idtipomalattia1");
    }

    public void setIdtitolaredati(Integer idtitolaredati) {
        writeProperty("idtitolaredati", idtitolaredati);
    }
    public Integer getIdtitolaredati() {
        return (Integer)readProperty("idtitolaredati");
    }

    public void setMatricolainps(String matricolainps) {
        writeProperty("matricolainps", matricolainps);
    }
    public String getMatricolainps() {
        return (String)readProperty("matricolainps");
    }

    public void setMeseriferimento(Short meseriferimento) {
        writeProperty("meseriferimento", meseriferimento);
    }
    public Short getMeseriferimento() {
        return (Short)readProperty("meseriferimento");
    }

    public void setNorecalc(Short norecalc) {
        writeProperty("norecalc", norecalc);
    }
    public Short getNorecalc() {
        return (Short)readProperty("norecalc");
    }

    public void setRichiestacancellazione(Short richiestacancellazione) {
        writeProperty("richiestacancellazione", richiestacancellazione);
    }
    public Short getRichiestacancellazione() {
        return (Short)readProperty("richiestacancellazione");
    }

    public void setUltimacomunicazione(Date ultimacomunicazione) {
        writeProperty("ultimacomunicazione", ultimacomunicazione);
    }
    public Date getUltimacomunicazione() {
        return (Date)readProperty("ultimacomunicazione");
    }

    public void setUltimamodifica(Date ultimamodifica) {
        writeProperty("ultimamodifica", ultimamodifica);
    }
    public Date getUltimamodifica() {
        return (Date)readProperty("ultimamodifica");
    }

    public void setUltimamodificauser(String ultimamodificauser) {
        writeProperty("ultimamodificauser", ultimamodificauser);
    }
    public String getUltimamodificauser() {
        return (String)readProperty("ultimamodificauser");
    }

    public void addToCedolinoArray(Cedolino obj) {
        addToManyTarget("cedolinoArray", obj, true);
    }
    public void removeFromCedolinoArray(Cedolino obj) {
        removeToManyTarget("cedolinoArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Cedolino> getCedolinoArray() {
        return (List<Cedolino>)readProperty("cedolinoArray");
    }


    public void addToDatoretributivoArray(Datoretributivo obj) {
        addToManyTarget("datoretributivoArray", obj, true);
    }
    public void removeFromDatoretributivoArray(Datoretributivo obj) {
        removeToManyTarget("datoretributivoArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Datoretributivo> getDatoretributivoArray() {
        return (List<Datoretributivo>)readProperty("datoretributivoArray");
    }


    public void addToLavoratoreAssunzioneArray(Lavoratore obj) {
        addToManyTarget("lavoratoreAssunzioneArray", obj, true);
    }
    public void removeFromLavoratoreAssunzioneArray(Lavoratore obj) {
        removeToManyTarget("lavoratoreAssunzioneArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Lavoratore> getLavoratoreAssunzioneArray() {
        return (List<Lavoratore>)readProperty("lavoratoreAssunzioneArray");
    }


    public void addToLavoratoreCessazioneArray(Lavoratore obj) {
        addToManyTarget("lavoratoreCessazioneArray", obj, true);
    }
    public void removeFromLavoratoreCessazioneArray(Lavoratore obj) {
        removeToManyTarget("lavoratoreCessazioneArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Lavoratore> getLavoratoreCessazioneArray() {
        return (List<Lavoratore>)readProperty("lavoratoreCessazioneArray");
    }


    public void addToMutPosizionelavArray(MutPosizionelav obj) {
        addToManyTarget("mutPosizionelavArray", obj, true);
    }
    public void removeFromMutPosizionelavArray(MutPosizionelav obj) {
        removeToManyTarget("mutPosizionelavArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<MutPosizionelav> getMutPosizionelavArray() {
        return (List<MutPosizionelav>)readProperty("mutPosizionelavArray");
    }


    public void addToNumerazioneunicaArray(Numerazioneunica obj) {
        addToManyTarget("numerazioneunicaArray", obj, true);
    }
    public void removeFromNumerazioneunicaArray(Numerazioneunica obj) {
        removeToManyTarget("numerazioneunicaArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Numerazioneunica> getNumerazioneunicaArray() {
        return (List<Numerazioneunica>)readProperty("numerazioneunicaArray");
    }


    public void addToPosizioneRiduzioneinpsArray(PosizioneRiduzioneinps obj) {
        addToManyTarget("posizioneRiduzioneinpsArray", obj, true);
    }
    public void removeFromPosizioneRiduzioneinpsArray(PosizioneRiduzioneinps obj) {
        removeToManyTarget("posizioneRiduzioneinpsArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<PosizioneRiduzioneinps> getPosizioneRiduzioneinpsArray() {
        return (List<PosizioneRiduzioneinps>)readProperty("posizioneRiduzioneinpsArray");
    }


    public void addToPosizionefamiliareArray(Posizionefamiliare obj) {
        addToManyTarget("posizionefamiliareArray", obj, true);
    }
    public void removeFromPosizionefamiliareArray(Posizionefamiliare obj) {
        removeToManyTarget("posizionefamiliareArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Posizionefamiliare> getPosizionefamiliareArray() {
        return (List<Posizionefamiliare>)readProperty("posizionefamiliareArray");
    }


    public void addToPosizionefiscaleArray(Posizionefiscale obj) {
        addToManyTarget("posizionefiscaleArray", obj, true);
    }
    public void removeFromPosizionefiscaleArray(Posizionefiscale obj) {
        removeToManyTarget("posizionefiscaleArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Posizionefiscale> getPosizionefiscaleArray() {
        return (List<Posizionefiscale>)readProperty("posizionefiscaleArray");
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


    public void addToPosizionescattoArray(Posizionescatto obj) {
        addToManyTarget("posizionescattoArray", obj, true);
    }
    public void removeFromPosizionescattoArray(Posizionescatto obj) {
        removeToManyTarget("posizionescattoArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Posizionescatto> getPosizionescattoArray() {
        return (List<Posizionescatto>)readProperty("posizionescattoArray");
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


    public void addToRateoArray(Posizionerateo obj) {
        addToManyTarget("rateoArray", obj, true);
    }
    public void removeFromRateoArray(Posizionerateo obj) {
        removeToManyTarget("rateoArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Posizionerateo> getRateoArray() {
        return (List<Posizionerateo>)readProperty("rateoArray");
    }


    public void setToComunePrestazione(Comune toComunePrestazione) {
        setToOneTarget("toComunePrestazione", toComunePrestazione, true);
    }

    public Comune getToComunePrestazione() {
        return (Comune)readProperty("toComunePrestazione");
    }


    public void setToImpresa(Impresa toImpresa) {
        setToOneTarget("toImpresa", toImpresa, true);
    }

    public Impresa getToImpresa() {
        return (Impresa)readProperty("toImpresa");
    }


    public void setToLavoratore(Lavoratore toLavoratore) {
        setToOneTarget("toLavoratore", toLavoratore, true);
    }

    public Lavoratore getToLavoratore() {
        return (Lavoratore)readProperty("toLavoratore");
    }


    public void setToNucleofamiliare(Nucleofamiliare toNucleofamiliare) {
        setToOneTarget("toNucleofamiliare", toNucleofamiliare, true);
    }

    public Nucleofamiliare getToNucleofamiliare() {
        return (Nucleofamiliare)readProperty("toNucleofamiliare");
    }


    public void setToOrario(Orario toOrario) {
        setToOneTarget("toOrario", toOrario, true);
    }

    public Orario getToOrario() {
        return (Orario)readProperty("toOrario");
    }


    public void setToProfilolavoratore(Profilolavoratore toProfilolavoratore) {
        setToOneTarget("toProfilolavoratore", toProfilolavoratore, true);
    }

    public Profilolavoratore getToProfilolavoratore() {
        return (Profilolavoratore)readProperty("toProfilolavoratore");
    }


    public void setToProgressivoanno(Progressivoanno toProgressivoanno) {
        setToOneTarget("toProgressivoanno", toProgressivoanno, true);
    }

    public Progressivoanno getToProgressivoanno() {
        return (Progressivoanno)readProperty("toProgressivoanno");
    }


    public void setToStatoPrestazione(Statoestero toStatoPrestazione) {
        setToOneTarget("toStatoPrestazione", toStatoPrestazione, true);
    }

    public Statoestero getToStatoPrestazione() {
        return (Statoestero)readProperty("toStatoPrestazione");
    }


    public void setToStatoposizione(Statoposizione toStatoposizione) {
        setToOneTarget("toStatoposizione", toStatoposizione, true);
    }

    public Statoposizione getToStatoposizione() {
        return (Statoposizione)readProperty("toStatoposizione");
    }


    public void setToTipoCalcMalattia1(Tipocalcolomalattia1 toTipoCalcMalattia1) {
        setToOneTarget("toTipoCalcMalattia1", toTipoCalcMalattia1, true);
    }

    public Tipocalcolomalattia1 getToTipoCalcMalattia1() {
        return (Tipocalcolomalattia1)readProperty("toTipoCalcMalattia1");
    }


    public void setToTitolaredati(Titolaredati toTitolaredati) {
        setToOneTarget("toTitolaredati", toTitolaredati, true);
    }

    public Titolaredati getToTitolaredati() {
        return (Titolaredati)readProperty("toTitolaredati");
    }


    public void setToUtenteUltimamodifica(Utente toUtenteUltimamodifica) {
        setToOneTarget("toUtenteUltimamodifica", toUtenteUltimamodifica, true);
    }

    public Utente getToUtenteUltimamodifica() {
        return (Utente)readProperty("toUtenteUltimamodifica");
    }


    public void addToUniemensPosizioneArray(UniemensPosizione obj) {
        addToManyTarget("uniemensPosizioneArray", obj, true);
    }
    public void removeFromUniemensPosizioneArray(UniemensPosizione obj) {
        removeToManyTarget("uniemensPosizioneArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<UniemensPosizione> getUniemensPosizioneArray() {
        return (List<UniemensPosizione>)readProperty("uniemensPosizioneArray");
    }


}
