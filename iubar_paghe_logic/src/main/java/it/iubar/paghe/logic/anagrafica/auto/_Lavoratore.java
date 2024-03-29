package it.iubar.paghe.logic.anagrafica.auto;

import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.anagrafica.AeDestinazione5m;
import it.iubar.paghe.logic.anagrafica.CentrodicostoLavoratore;
import it.iubar.paghe.logic.anagrafica.Comune;
import it.iubar.paghe.logic.anagrafica.Impresa;
import it.iubar.paghe.logic.anagrafica.Indirizzo;
import it.iubar.paghe.logic.anagrafica.IstatProfessione;
import it.iubar.paghe.logic.anagrafica.Parasubordinato;
import it.iubar.paghe.logic.anagrafica.Personafisica;
import it.iubar.paghe.logic.anagrafica.Sedeimpresa;
import it.iubar.paghe.logic.anagrafica.Statoestero;
import it.iubar.paghe.logic.anagrafica.Statolavoratore;
import it.iubar.paghe.logic.anagrafica.Subordinato;
import it.iubar.paghe.logic.anagrafica.Tipolavoratore;
import it.iubar.paghe.logic.anagrafica.Tipolavoratore2;
import it.iubar.paghe.logic.anagrafica.Tipolavoratorestat;
import it.iubar.paghe.logic.anagrafica.Tiposindacato;
import it.iubar.paghe.logic.paghe.Posizionelavoratore;
import it.iubar.paghe.logic.paghe.TfrAnno;
import it.iubar.paghe.logic.presenze.Presenza;

/**
 * Class _Lavoratore was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Lavoratore extends CayenneDataObject {

    public static final String ASSUNZIONEDATA_PROPERTY = "assunzionedata";
    public static final String ASSUNZIONEIDPOSIZIONE_PROPERTY = "assunzioneidposizione";
    public static final String CESSAZIONEDATA_PROPERTY = "cessazionedata";
    public static final String CESSAZIONEIDPOSIZIONE_PROPERTY = "cessazioneidposizione";
    public static final String IDANAGRAFICA_PROPERTY = "idanagrafica";
    public static final String IDCOMUNEDILAVORO_PROPERTY = "idcomunedilavoro";
    public static final String IDDESTINAZIONE5M_PROPERTY = "iddestinazione5m";
    public static final String IDENTEPREVIDENZIALE_PROPERTY = "identeprevidenziale";
    public static final String IDIMPRESA_PROPERTY = "idimpresa";
    public static final String IDINAILPROFESSIONE_PROPERTY = "idinailprofessione";
    public static final String IDINAILQUALIFICA_PROPERTY = "idinailqualifica";
    public static final String IDINAILTIPORAPPORTO_PROPERTY = "idinailtiporapporto";
    public static final String IDLAVORATORE_PROPERTY = "idlavoratore";
    public static final String IDPROFESSIONE_PROPERTY = "idprofessione";
    public static final String IDPROFILO_PROPERTY = "idprofilo";
    public static final String IDSEDEIMPRESA_PROPERTY = "idsedeimpresa";
    public static final String IDSTATODILAVORO_PROPERTY = "idstatodilavoro";
    public static final String IDTIPOLAVORATORE_PROPERTY = "idtipolavoratore";
    public static final String IDTIPOLAVORATORE2_PROPERTY = "idtipolavoratore2";
    public static final String IDTIPOLAVORATORESTAT_PROPERTY = "idtipolavoratorestat";
    public static final String IDTIPOSINDACATO_PROPERTY = "idtiposindacato";
    public static final String INAILCOD_PROPERTY = "inailcod";
    public static final String MATRICOLAINPS_PROPERTY = "matricolainps";
    public static final String SOCIOLAVORATORE_PROPERTY = "sociolavoratore";
    public static final String LAVORATORE_CENTRODICOSTO_ARRAY_PROPERTY = "lavoratoreCentrodicostoArray";
    public static final String POSIZIONELAVORATORE_ARRAY_PROPERTY = "posizionelavoratoreArray";
    public static final String PRESENZA_ARRAY_PROPERTY = "presenzaArray";
    public static final String TFRANNO_ARRAY_PROPERTY = "tfrannoArray";
    public static final String TO_AE_DESTINAZIONE5M_PROPERTY = "toAeDestinazione5M";
    public static final String TO_ASSUNZIONE_POSIZIONE_PROPERTY = "toAssunzionePosizione";
    public static final String TO_CESSAZIONE_POSIZIONE_PROPERTY = "toCessazionePosizione";
    public static final String TO_COMUNEDILAVORO_PROPERTY = "toComunedilavoro";
    public static final String TO_IMPRESA_PROPERTY = "toImpresa";
    public static final String TO_INDIRIZZODOMICILIO_PROPERTY = "toIndirizzodomicilio";
    public static final String TO_INDIRIZZODOMICILIO2_PROPERTY = "toIndirizzodomicilio2";
    public static final String TO_ISTAT_PROFESSIONE_PROPERTY = "toIstatProfessione";
    public static final String TO_PARASUBORDINATO_PROPERTY = "toParasubordinato";
    public static final String TO_PERSONAFISICA_PROPERTY = "toPersonafisica";
    public static final String TO_SEDEIMPRESA_PROPERTY = "toSedeimpresa";
    public static final String TO_STATODILAVORO_PROPERTY = "toStatodilavoro";
    public static final String TO_STATOLAVORATORE_PROPERTY = "toStatolavoratore";
    public static final String TO_SUBORDINATO_PROPERTY = "toSubordinato";
    public static final String TO_TIPO_LAVORATORE_PROPERTY = "toTipoLavoratore";
    public static final String TO_TIPO_LAVORATORE2_PROPERTY = "toTipoLavoratore2";
    public static final String TO_TIPO_LAVORATORE_STAT_PROPERTY = "toTipoLavoratoreStat";
    public static final String TO_TIPO_SINDACATO_PROPERTY = "toTipoSindacato";

    public static final String IDLAVORATORE_PK_COLUMN = "IDLAVORATORE";

    public void setAssunzionedata(Date assunzionedata) {
        writeProperty("assunzionedata", assunzionedata);
    }
    public Date getAssunzionedata() {
        return (Date)readProperty("assunzionedata");
    }

    public void setAssunzioneidposizione(Integer assunzioneidposizione) {
        writeProperty("assunzioneidposizione", assunzioneidposizione);
    }
    public Integer getAssunzioneidposizione() {
        return (Integer)readProperty("assunzioneidposizione");
    }

    public void setCessazionedata(Date cessazionedata) {
        writeProperty("cessazionedata", cessazionedata);
    }
    public Date getCessazionedata() {
        return (Date)readProperty("cessazionedata");
    }

    public void setCessazioneidposizione(Integer cessazioneidposizione) {
        writeProperty("cessazioneidposizione", cessazioneidposizione);
    }
    public Integer getCessazioneidposizione() {
        return (Integer)readProperty("cessazioneidposizione");
    }

    public void setIdanagrafica(Integer idanagrafica) {
        writeProperty("idanagrafica", idanagrafica);
    }
    public Integer getIdanagrafica() {
        return (Integer)readProperty("idanagrafica");
    }

    public void setIdcomunedilavoro(String idcomunedilavoro) {
        writeProperty("idcomunedilavoro", idcomunedilavoro);
    }
    public String getIdcomunedilavoro() {
        return (String)readProperty("idcomunedilavoro");
    }

    public void setIddestinazione5m(String iddestinazione5m) {
        writeProperty("iddestinazione5m", iddestinazione5m);
    }
    public String getIddestinazione5m() {
        return (String)readProperty("iddestinazione5m");
    }

    public void setIdenteprevidenziale(Short identeprevidenziale) {
        writeProperty("identeprevidenziale", identeprevidenziale);
    }
    public Short getIdenteprevidenziale() {
        return (Short)readProperty("identeprevidenziale");
    }

    public void setIdimpresa(Integer idimpresa) {
        writeProperty("idimpresa", idimpresa);
    }
    public Integer getIdimpresa() {
        return (Integer)readProperty("idimpresa");
    }

    public void setIdinailprofessione(Short idinailprofessione) {
        writeProperty("idinailprofessione", idinailprofessione);
    }
    public Short getIdinailprofessione() {
        return (Short)readProperty("idinailprofessione");
    }

    public void setIdinailqualifica(String idinailqualifica) {
        writeProperty("idinailqualifica", idinailqualifica);
    }
    public String getIdinailqualifica() {
        return (String)readProperty("idinailqualifica");
    }

    public void setIdinailtiporapporto(Short idinailtiporapporto) {
        writeProperty("idinailtiporapporto", idinailtiporapporto);
    }
    public Short getIdinailtiporapporto() {
        return (Short)readProperty("idinailtiporapporto");
    }

    public void setIdlavoratore(Integer idlavoratore) {
        writeProperty("idlavoratore", idlavoratore);
    }
    public Integer getIdlavoratore() {
        return (Integer)readProperty("idlavoratore");
    }

    public void setIdprofessione(String idprofessione) {
        writeProperty("idprofessione", idprofessione);
    }
    public String getIdprofessione() {
        return (String)readProperty("idprofessione");
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

    public void setIdstatodilavoro(Integer idstatodilavoro) {
        writeProperty("idstatodilavoro", idstatodilavoro);
    }
    public Integer getIdstatodilavoro() {
        return (Integer)readProperty("idstatodilavoro");
    }

    public void setIdtipolavoratore(Integer idtipolavoratore) {
        writeProperty("idtipolavoratore", idtipolavoratore);
    }
    public Integer getIdtipolavoratore() {
        return (Integer)readProperty("idtipolavoratore");
    }

    public void setIdtipolavoratore2(Integer idtipolavoratore2) {
        writeProperty("idtipolavoratore2", idtipolavoratore2);
    }
    public Integer getIdtipolavoratore2() {
        return (Integer)readProperty("idtipolavoratore2");
    }

    public void setIdtipolavoratorestat(String idtipolavoratorestat) {
        writeProperty("idtipolavoratorestat", idtipolavoratorestat);
    }
    public String getIdtipolavoratorestat() {
        return (String)readProperty("idtipolavoratorestat");
    }

    public void setIdtiposindacato(String idtiposindacato) {
        writeProperty("idtiposindacato", idtiposindacato);
    }
    public String getIdtiposindacato() {
        return (String)readProperty("idtiposindacato");
    }

    public void setInailcod(String inailcod) {
        writeProperty("inailcod", inailcod);
    }
    public String getInailcod() {
        return (String)readProperty("inailcod");
    }

    public void setMatricolainps(String matricolainps) {
        writeProperty("matricolainps", matricolainps);
    }
    public String getMatricolainps() {
        return (String)readProperty("matricolainps");
    }

    public void setSociolavoratore(Short sociolavoratore) {
        writeProperty("sociolavoratore", sociolavoratore);
    }
    public Short getSociolavoratore() {
        return (Short)readProperty("sociolavoratore");
    }

    public void addToLavoratoreCentrodicostoArray(CentrodicostoLavoratore obj) {
        addToManyTarget("lavoratoreCentrodicostoArray", obj, true);
    }
    public void removeFromLavoratoreCentrodicostoArray(CentrodicostoLavoratore obj) {
        removeToManyTarget("lavoratoreCentrodicostoArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<CentrodicostoLavoratore> getLavoratoreCentrodicostoArray() {
        return (List<CentrodicostoLavoratore>)readProperty("lavoratoreCentrodicostoArray");
    }


    public void addToPosizionelavoratoreArray(Posizionelavoratore obj) {
        addToManyTarget("posizionelavoratoreArray", obj, true);
    }
    public void removeFromPosizionelavoratoreArray(Posizionelavoratore obj) {
        removeToManyTarget("posizionelavoratoreArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Posizionelavoratore> getPosizionelavoratoreArray() {
        return (List<Posizionelavoratore>)readProperty("posizionelavoratoreArray");
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


    public void addToTfrannoArray(TfrAnno obj) {
        addToManyTarget("tfrannoArray", obj, true);
    }
    public void removeFromTfrannoArray(TfrAnno obj) {
        removeToManyTarget("tfrannoArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<TfrAnno> getTfrannoArray() {
        return (List<TfrAnno>)readProperty("tfrannoArray");
    }


    public void setToAeDestinazione5M(AeDestinazione5m toAeDestinazione5M) {
        setToOneTarget("toAeDestinazione5M", toAeDestinazione5M, true);
    }

    public AeDestinazione5m getToAeDestinazione5M() {
        return (AeDestinazione5m)readProperty("toAeDestinazione5M");
    }


    public void setToAssunzionePosizione(Posizionelavoratore toAssunzionePosizione) {
        setToOneTarget("toAssunzionePosizione", toAssunzionePosizione, true);
    }

    public Posizionelavoratore getToAssunzionePosizione() {
        return (Posizionelavoratore)readProperty("toAssunzionePosizione");
    }


    public void setToCessazionePosizione(Posizionelavoratore toCessazionePosizione) {
        setToOneTarget("toCessazionePosizione", toCessazionePosizione, true);
    }

    public Posizionelavoratore getToCessazionePosizione() {
        return (Posizionelavoratore)readProperty("toCessazionePosizione");
    }


    public void setToComunedilavoro(Comune toComunedilavoro) {
        setToOneTarget("toComunedilavoro", toComunedilavoro, true);
    }

    public Comune getToComunedilavoro() {
        return (Comune)readProperty("toComunedilavoro");
    }


    public void setToImpresa(Impresa toImpresa) {
        setToOneTarget("toImpresa", toImpresa, true);
    }

    public Impresa getToImpresa() {
        return (Impresa)readProperty("toImpresa");
    }


    public void setToIndirizzodomicilio(Indirizzo toIndirizzodomicilio) {
        setToOneTarget("toIndirizzodomicilio", toIndirizzodomicilio, true);
    }

    public Indirizzo getToIndirizzodomicilio() {
        return (Indirizzo)readProperty("toIndirizzodomicilio");
    }


    public void setToIndirizzodomicilio2(Indirizzo toIndirizzodomicilio2) {
        setToOneTarget("toIndirizzodomicilio2", toIndirizzodomicilio2, true);
    }

    public Indirizzo getToIndirizzodomicilio2() {
        return (Indirizzo)readProperty("toIndirizzodomicilio2");
    }


    public void setToIstatProfessione(IstatProfessione toIstatProfessione) {
        setToOneTarget("toIstatProfessione", toIstatProfessione, true);
    }

    public IstatProfessione getToIstatProfessione() {
        return (IstatProfessione)readProperty("toIstatProfessione");
    }


    public void setToParasubordinato(Parasubordinato toParasubordinato) {
        setToOneTarget("toParasubordinato", toParasubordinato, true);
    }

    public Parasubordinato getToParasubordinato() {
        return (Parasubordinato)readProperty("toParasubordinato");
    }


    public void setToPersonafisica(Personafisica toPersonafisica) {
        setToOneTarget("toPersonafisica", toPersonafisica, true);
    }

    public Personafisica getToPersonafisica() {
        return (Personafisica)readProperty("toPersonafisica");
    }


    public void setToSedeimpresa(Sedeimpresa toSedeimpresa) {
        setToOneTarget("toSedeimpresa", toSedeimpresa, true);
    }

    public Sedeimpresa getToSedeimpresa() {
        return (Sedeimpresa)readProperty("toSedeimpresa");
    }


    public void setToStatodilavoro(Statoestero toStatodilavoro) {
        setToOneTarget("toStatodilavoro", toStatodilavoro, true);
    }

    public Statoestero getToStatodilavoro() {
        return (Statoestero)readProperty("toStatodilavoro");
    }


    public void addToToStatolavoratore(Statolavoratore obj) {
        addToManyTarget("toStatolavoratore", obj, true);
    }
    public void removeFromToStatolavoratore(Statolavoratore obj) {
        removeToManyTarget("toStatolavoratore", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Statolavoratore> getToStatolavoratore() {
        return (List<Statolavoratore>)readProperty("toStatolavoratore");
    }


    public void setToSubordinato(Subordinato toSubordinato) {
        setToOneTarget("toSubordinato", toSubordinato, true);
    }

    public Subordinato getToSubordinato() {
        return (Subordinato)readProperty("toSubordinato");
    }


    public void setToTipoLavoratore(Tipolavoratore toTipoLavoratore) {
        setToOneTarget("toTipoLavoratore", toTipoLavoratore, true);
    }

    public Tipolavoratore getToTipoLavoratore() {
        return (Tipolavoratore)readProperty("toTipoLavoratore");
    }


    public void setToTipoLavoratore2(Tipolavoratore2 toTipoLavoratore2) {
        setToOneTarget("toTipoLavoratore2", toTipoLavoratore2, true);
    }

    public Tipolavoratore2 getToTipoLavoratore2() {
        return (Tipolavoratore2)readProperty("toTipoLavoratore2");
    }


    public void setToTipoLavoratoreStat(Tipolavoratorestat toTipoLavoratoreStat) {
        setToOneTarget("toTipoLavoratoreStat", toTipoLavoratoreStat, true);
    }

    public Tipolavoratorestat getToTipoLavoratoreStat() {
        return (Tipolavoratorestat)readProperty("toTipoLavoratoreStat");
    }


    public void setToTipoSindacato(Tiposindacato toTipoSindacato) {
        setToOneTarget("toTipoSindacato", toTipoSindacato, true);
    }

    public Tiposindacato getToTipoSindacato() {
        return (Tiposindacato)readProperty("toTipoSindacato");
    }


}
