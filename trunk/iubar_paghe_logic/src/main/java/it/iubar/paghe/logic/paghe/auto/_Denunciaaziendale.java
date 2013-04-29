package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Conguaglioasocred;
import it.iubar.paghe.logic.paghe.Conguagliocig;
import it.iubar.paghe.logic.paghe.DaAltrepartiteacredito;
import it.iubar.paghe.logic.paghe.DaAltrepartiteadebito;
import it.iubar.paghe.logic.paghe.DaAziendatfr;
import it.iubar.paghe.logic.paghe.DaContribassistcontrat;
import it.iubar.paghe.logic.paghe.DaDatiquadraturaretrcontr;
import it.iubar.paghe.logic.paghe.DaFondointerprof;
import it.iubar.paghe.logic.paghe.DaInfostat;
import it.iubar.paghe.logic.paghe.DaPrestazbancari;
import it.iubar.paghe.logic.paghe.DaRecuperoprestfondisol;
import it.iubar.paghe.logic.paghe.DaTrattquotalav;
import it.iubar.paghe.logic.paghe.Uniemens;

/**
 * Class _Denunciaaziendale was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Denunciaaziendale extends CayenneDataObject {

    public static final String ANNO_PROPERTY = "anno";
    public static final String DATAESECUTIVITA_PROPERTY = "dataesecutivita";
    public static final String FORZAAZIENDALE_PROPERTY = "forzaaziendale";
    public static final String IDDENUNCIAAZIENDALE_PROPERTY = "iddenunciaaziendale";
    public static final String IDDICHIARAZIONE_PROPERTY = "iddichiarazione";
    public static final String IDIMPRESA_PROPERTY = "idimpresa";
    public static final String IDSEDEIMPRESA_PROPERTY = "idsedeimpresa";
    public static final String IDTRATTQUOTALAV_PROPERTY = "idtrattquotalav";
    public static final String INFOSTATNUM_PROPERTY = "infostatnum";
    public static final String INPSCODDITTA_PROPERTY = "inpscodditta";
    public static final String MESE_PROPERTY = "mese";
    public static final String NUMLAVORATORI_PROPERTY = "numlavoratori";
    public static final String RICHIESTACANC_PROPERTY = "richiestacanc";
    public static final String RICHIESTACANCDATA_PROPERTY = "richiestacancdata";
    public static final String CONGUAGLIOASOCRED_ARRAY_PROPERTY = "conguaglioasocredArray";
    public static final String CONGUAGLIOCIG_ARRAY_PROPERTY = "conguagliocigArray";
    public static final String DA_ALTRE_PARTITE_ACREDITO_ARRAY_PROPERTY = "daAltrePartiteACreditoArray";
    public static final String DA_ALTRE_PARTITE_ADEBITO_ARRAY_PROPERTY = "daAltrePartiteADebitoArray";
    public static final String DA_AZIENDA_TFR_ARRAY_PROPERTY = "daAziendaTfrArray";
    public static final String DA_CONTRIB_ASSIST_CONTRAT_ARRAY_PROPERTY = "daContribAssistContratArray";
    public static final String DA_DATI_QUADRATURA_RETR_CONTR_ARRAY_PROPERTY = "daDatiQuadraturaRetrContrArray";
    public static final String DA_FONDO_INTERPROF_ARRAY_PROPERTY = "daFondoInterprofArray";
    public static final String DA_INFO_STAT_ARRAY_PROPERTY = "daInfoStatArray";
    public static final String DA_PRESTAZ_BANCARI_ARRAY_PROPERTY = "daPrestazBancariArray";
    public static final String DA_RECUPERO_PREST_FONDI_SOL_ARRAY_PROPERTY = "daRecuperoPrestFondiSolArray";
    public static final String TO_DA_TRATT_QUOTA_LAV_PROPERTY = "toDaTrattQuotaLav";
    public static final String TO_UNIEMENS_PROPERTY = "toUniemens";

    public static final String IDDENUNCIAAZIENDALE_PK_COLUMN = "IDDENUNCIAAZIENDALE";

    public void setAnno(Integer anno) {
        writeProperty("anno", anno);
    }
    public Integer getAnno() {
        return (Integer)readProperty("anno");
    }

    public void setDataesecutivita(Date dataesecutivita) {
        writeProperty("dataesecutivita", dataesecutivita);
    }
    public Date getDataesecutivita() {
        return (Date)readProperty("dataesecutivita");
    }

    public void setForzaaziendale(BigDecimal forzaaziendale) {
        writeProperty("forzaaziendale", forzaaziendale);
    }
    public BigDecimal getForzaaziendale() {
        return (BigDecimal)readProperty("forzaaziendale");
    }

    public void setIddenunciaaziendale(Integer iddenunciaaziendale) {
        writeProperty("iddenunciaaziendale", iddenunciaaziendale);
    }
    public Integer getIddenunciaaziendale() {
        return (Integer)readProperty("iddenunciaaziendale");
    }

    public void setIddichiarazione(Integer iddichiarazione) {
        writeProperty("iddichiarazione", iddichiarazione);
    }
    public Integer getIddichiarazione() {
        return (Integer)readProperty("iddichiarazione");
    }

    public void setIdimpresa(Integer idimpresa) {
        writeProperty("idimpresa", idimpresa);
    }
    public Integer getIdimpresa() {
        return (Integer)readProperty("idimpresa");
    }

    public void setIdsedeimpresa(Short idsedeimpresa) {
        writeProperty("idsedeimpresa", idsedeimpresa);
    }
    public Short getIdsedeimpresa() {
        return (Short)readProperty("idsedeimpresa");
    }

    public void setIdtrattquotalav(String idtrattquotalav) {
        writeProperty("idtrattquotalav", idtrattquotalav);
    }
    public String getIdtrattquotalav() {
        return (String)readProperty("idtrattquotalav");
    }

    public void setInfostatnum(Short infostatnum) {
        writeProperty("infostatnum", infostatnum);
    }
    public Short getInfostatnum() {
        return (Short)readProperty("infostatnum");
    }

    public void setInpscodditta(String inpscodditta) {
        writeProperty("inpscodditta", inpscodditta);
    }
    public String getInpscodditta() {
        return (String)readProperty("inpscodditta");
    }

    public void setMese(Short mese) {
        writeProperty("mese", mese);
    }
    public Short getMese() {
        return (Short)readProperty("mese");
    }

    public void setNumlavoratori(Short numlavoratori) {
        writeProperty("numlavoratori", numlavoratori);
    }
    public Short getNumlavoratori() {
        return (Short)readProperty("numlavoratori");
    }

    public void setRichiestacanc(Short richiestacanc) {
        writeProperty("richiestacanc", richiestacanc);
    }
    public Short getRichiestacanc() {
        return (Short)readProperty("richiestacanc");
    }

    public void setRichiestacancdata(Date richiestacancdata) {
        writeProperty("richiestacancdata", richiestacancdata);
    }
    public Date getRichiestacancdata() {
        return (Date)readProperty("richiestacancdata");
    }

    public void addToConguaglioasocredArray(Conguaglioasocred obj) {
        addToManyTarget("conguaglioasocredArray", obj, true);
    }
    public void removeFromConguaglioasocredArray(Conguaglioasocred obj) {
        removeToManyTarget("conguaglioasocredArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Conguaglioasocred> getConguaglioasocredArray() {
        return (List<Conguaglioasocred>)readProperty("conguaglioasocredArray");
    }


    public void addToConguagliocigArray(Conguagliocig obj) {
        addToManyTarget("conguagliocigArray", obj, true);
    }
    public void removeFromConguagliocigArray(Conguagliocig obj) {
        removeToManyTarget("conguagliocigArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Conguagliocig> getConguagliocigArray() {
        return (List<Conguagliocig>)readProperty("conguagliocigArray");
    }


    public void addToDaAltrePartiteACreditoArray(DaAltrepartiteacredito obj) {
        addToManyTarget("daAltrePartiteACreditoArray", obj, true);
    }
    public void removeFromDaAltrePartiteACreditoArray(DaAltrepartiteacredito obj) {
        removeToManyTarget("daAltrePartiteACreditoArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<DaAltrepartiteacredito> getDaAltrePartiteACreditoArray() {
        return (List<DaAltrepartiteacredito>)readProperty("daAltrePartiteACreditoArray");
    }


    public void addToDaAltrePartiteADebitoArray(DaAltrepartiteadebito obj) {
        addToManyTarget("daAltrePartiteADebitoArray", obj, true);
    }
    public void removeFromDaAltrePartiteADebitoArray(DaAltrepartiteadebito obj) {
        removeToManyTarget("daAltrePartiteADebitoArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<DaAltrepartiteadebito> getDaAltrePartiteADebitoArray() {
        return (List<DaAltrepartiteadebito>)readProperty("daAltrePartiteADebitoArray");
    }


    public void addToDaAziendaTfrArray(DaAziendatfr obj) {
        addToManyTarget("daAziendaTfrArray", obj, true);
    }
    public void removeFromDaAziendaTfrArray(DaAziendatfr obj) {
        removeToManyTarget("daAziendaTfrArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<DaAziendatfr> getDaAziendaTfrArray() {
        return (List<DaAziendatfr>)readProperty("daAziendaTfrArray");
    }


    public void addToDaContribAssistContratArray(DaContribassistcontrat obj) {
        addToManyTarget("daContribAssistContratArray", obj, true);
    }
    public void removeFromDaContribAssistContratArray(DaContribassistcontrat obj) {
        removeToManyTarget("daContribAssistContratArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<DaContribassistcontrat> getDaContribAssistContratArray() {
        return (List<DaContribassistcontrat>)readProperty("daContribAssistContratArray");
    }


    public void addToDaDatiQuadraturaRetrContrArray(DaDatiquadraturaretrcontr obj) {
        addToManyTarget("daDatiQuadraturaRetrContrArray", obj, true);
    }
    public void removeFromDaDatiQuadraturaRetrContrArray(DaDatiquadraturaretrcontr obj) {
        removeToManyTarget("daDatiQuadraturaRetrContrArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<DaDatiquadraturaretrcontr> getDaDatiQuadraturaRetrContrArray() {
        return (List<DaDatiquadraturaretrcontr>)readProperty("daDatiQuadraturaRetrContrArray");
    }


    public void addToDaFondoInterprofArray(DaFondointerprof obj) {
        addToManyTarget("daFondoInterprofArray", obj, true);
    }
    public void removeFromDaFondoInterprofArray(DaFondointerprof obj) {
        removeToManyTarget("daFondoInterprofArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<DaFondointerprof> getDaFondoInterprofArray() {
        return (List<DaFondointerprof>)readProperty("daFondoInterprofArray");
    }


    public void addToDaInfoStatArray(DaInfostat obj) {
        addToManyTarget("daInfoStatArray", obj, true);
    }
    public void removeFromDaInfoStatArray(DaInfostat obj) {
        removeToManyTarget("daInfoStatArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<DaInfostat> getDaInfoStatArray() {
        return (List<DaInfostat>)readProperty("daInfoStatArray");
    }


    public void addToDaPrestazBancariArray(DaPrestazbancari obj) {
        addToManyTarget("daPrestazBancariArray", obj, true);
    }
    public void removeFromDaPrestazBancariArray(DaPrestazbancari obj) {
        removeToManyTarget("daPrestazBancariArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<DaPrestazbancari> getDaPrestazBancariArray() {
        return (List<DaPrestazbancari>)readProperty("daPrestazBancariArray");
    }


    public void addToDaRecuperoPrestFondiSolArray(DaRecuperoprestfondisol obj) {
        addToManyTarget("daRecuperoPrestFondiSolArray", obj, true);
    }
    public void removeFromDaRecuperoPrestFondiSolArray(DaRecuperoprestfondisol obj) {
        removeToManyTarget("daRecuperoPrestFondiSolArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<DaRecuperoprestfondisol> getDaRecuperoPrestFondiSolArray() {
        return (List<DaRecuperoprestfondisol>)readProperty("daRecuperoPrestFondiSolArray");
    }


    public void setToDaTrattQuotaLav(DaTrattquotalav toDaTrattQuotaLav) {
        setToOneTarget("toDaTrattQuotaLav", toDaTrattQuotaLav, true);
    }

    public DaTrattquotalav getToDaTrattQuotaLav() {
        return (DaTrattquotalav)readProperty("toDaTrattQuotaLav");
    }


    public void setToUniemens(Uniemens toUniemens) {
        setToOneTarget("toUniemens", toUniemens, true);
    }

    public Uniemens getToUniemens() {
        return (Uniemens)readProperty("toUniemens");
    }


}
