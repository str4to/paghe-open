package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.anagrafica.Tipolavoratore2;
import it.iubar.paghe.logic.paghe.Contrattocoefficiente;
import it.iubar.paghe.logic.paghe.Contrattodettaglio;
import it.iubar.paghe.logic.paghe.Contrattoferie;
import it.iubar.paghe.logic.paghe.Contrattofestivitaretrib;
import it.iubar.paghe.logic.paghe.Contrattorateo;
import it.iubar.paghe.logic.paghe.Contrattoscatto;
import it.iubar.paghe.logic.paghe.InpsSettore;
import it.iubar.paghe.logic.paghe.Posizionelavoratore;
import it.iubar.paghe.logic.paghe.Profilocontrattindividuale;
import it.iubar.paghe.logic.paghe.Profilocontrattindividuale2;
import it.iubar.paghe.logic.paghe.Tipocalcolo;
import it.iubar.paghe.logic.paghe.Tipocalcolomalattia1;
import it.iubar.paghe.logic.paghe.Tipocalcolomalattia2;
import it.iubar.paghe.logic.presenze.Orario;

/**
 * Class _Profilolavoratore was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Profilolavoratore extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String FESTESOPPRATEO_PROPERTY = "festesopprateo";
    public static final String IDCOEFFICIENTE_PROPERTY = "idcoefficiente";
    public static final String IDCONTRATTODETTAGLIO_PROPERTY = "idcontrattodettaglio";
    public static final String IDFERIE_PROPERTY = "idferie";
    public static final String IDFESTIVITARETRIB_PROPERTY = "idfestivitaretrib";
    public static final String IDINFORTUNIO_PROPERTY = "idinfortunio";
    public static final String IDINPSSETTORE_PROPERTY = "idinpssettore";
    public static final String IDPROFILO_PROPERTY = "idprofilo";
    public static final String IDRATEO_PROPERTY = "idrateo";
    public static final String IDTIPOLAVORATORE2_PROPERTY = "idtipolavoratore2";
    public static final String IDTIPOMALATTIA1_PROPERTY = "idtipomalattia1";
    public static final String IDTIPOMALATTIA2_PROPERTY = "idtipomalattia2";
    public static final String NOOREPRESENZE_PROPERTY = "noorepresenze";
    public static final String NOTE_PROPERTY = "note";
    public static final String OREANNO_PROPERTY = "oreanno";
    public static final String OREMESE_PROPERTY = "oremese";
    public static final String RATEOPERMESSIOREMESE_PROPERTY = "rateopermessioremese";
    public static final String RATEOROLOREMESE_PROPERTY = "rateoroloremese";
    public static final String SOGGETTOINAIL_PROPERTY = "soggettoinail";
    public static final String SOGGETTOINPS_PROPERTY = "soggettoinps";
    public static final String TIPOCALCOLOFISSO_PROPERTY = "tipocalcolofisso";
    public static final String ULTIMAMODIFICA_PROPERTY = "ultimamodifica";
    public static final String ULTIMAMODIFICAUSER_PROPERTY = "ultimamodificauser";
    public static final String POSIZIONELAVORATORE_ARRAY_PROPERTY = "posizionelavoratoreArray";
    public static final String PROFILOCONTRATTINDIVIDUALE2ARRAY_PROPERTY = "profilocontrattindividuale2Array";
    public static final String PROFILOCONTRATTINDIVIDUALE_ARRAY_PROPERTY = "profilocontrattindividualeArray";
    public static final String TO_CONTRATTOCOEFFICIENTE_PROPERTY = "toContrattocoefficiente";
    public static final String TO_CONTRATTODETTAGLIO_PROPERTY = "toContrattodettaglio";
    public static final String TO_CONTRATTOFERIE_PROPERTY = "toContrattoferie";
    public static final String TO_CONTRATTOFESTIVITARETRIB_PROPERTY = "toContrattofestivitaretrib";
    public static final String TO_CONTRATTORATEO_PROPERTY = "toContrattorateo";
    public static final String TO_CONTRATTOSCATTO_PROPERTY = "toContrattoscatto";
    public static final String TO_INPS_SETTORE_PROPERTY = "toInpsSettore";
    public static final String TO_ORARIO_PROPERTY = "toOrario";
    public static final String TO_TIPO_CALC_MALATTIA1_PROPERTY = "toTipoCalcMalattia1";
    public static final String TO_TIPO_CALC_MALATTIA2_PROPERTY = "toTipoCalcMalattia2";
    public static final String TO_TIPOCALCOLO_PROPERTY = "toTipocalcolo";
    public static final String TO_TIPOLAVORATORE2_PROPERTY = "toTipolavoratore2";

    public static final String IDPROFILO_PK_COLUMN = "IDPROFILO";

    public void setDescrizione(String descrizione) {
        writeProperty("descrizione", descrizione);
    }
    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public void setFestesopprateo(Short festesopprateo) {
        writeProperty("festesopprateo", festesopprateo);
    }
    public Short getFestesopprateo() {
        return (Short)readProperty("festesopprateo");
    }

    public void setIdcoefficiente(Short idcoefficiente) {
        writeProperty("idcoefficiente", idcoefficiente);
    }
    public Short getIdcoefficiente() {
        return (Short)readProperty("idcoefficiente");
    }

    public void setIdcontrattodettaglio(Integer idcontrattodettaglio) {
        writeProperty("idcontrattodettaglio", idcontrattodettaglio);
    }
    public Integer getIdcontrattodettaglio() {
        return (Integer)readProperty("idcontrattodettaglio");
    }

    public void setIdferie(Short idferie) {
        writeProperty("idferie", idferie);
    }
    public Short getIdferie() {
        return (Short)readProperty("idferie");
    }

    public void setIdfestivitaretrib(Short idfestivitaretrib) {
        writeProperty("idfestivitaretrib", idfestivitaretrib);
    }
    public Short getIdfestivitaretrib() {
        return (Short)readProperty("idfestivitaretrib");
    }

    public void setIdinfortunio(Short idinfortunio) {
        writeProperty("idinfortunio", idinfortunio);
    }
    public Short getIdinfortunio() {
        return (Short)readProperty("idinfortunio");
    }

    public void setIdinpssettore(Integer idinpssettore) {
        writeProperty("idinpssettore", idinpssettore);
    }
    public Integer getIdinpssettore() {
        return (Integer)readProperty("idinpssettore");
    }

    public void setIdprofilo(Integer idprofilo) {
        writeProperty("idprofilo", idprofilo);
    }
    public Integer getIdprofilo() {
        return (Integer)readProperty("idprofilo");
    }

    public void setIdrateo(Short idrateo) {
        writeProperty("idrateo", idrateo);
    }
    public Short getIdrateo() {
        return (Short)readProperty("idrateo");
    }

    public void setIdtipolavoratore2(Short idtipolavoratore2) {
        writeProperty("idtipolavoratore2", idtipolavoratore2);
    }
    public Short getIdtipolavoratore2() {
        return (Short)readProperty("idtipolavoratore2");
    }

    public void setIdtipomalattia1(Short idtipomalattia1) {
        writeProperty("idtipomalattia1", idtipomalattia1);
    }
    public Short getIdtipomalattia1() {
        return (Short)readProperty("idtipomalattia1");
    }

    public void setIdtipomalattia2(Short idtipomalattia2) {
        writeProperty("idtipomalattia2", idtipomalattia2);
    }
    public Short getIdtipomalattia2() {
        return (Short)readProperty("idtipomalattia2");
    }

    public void setNoorepresenze(Short noorepresenze) {
        writeProperty("noorepresenze", noorepresenze);
    }
    public Short getNoorepresenze() {
        return (Short)readProperty("noorepresenze");
    }

    public void setNote(String note) {
        writeProperty("note", note);
    }
    public String getNote() {
        return (String)readProperty("note");
    }

    public void setOreanno(BigDecimal oreanno) {
        writeProperty("oreanno", oreanno);
    }
    public BigDecimal getOreanno() {
        return (BigDecimal)readProperty("oreanno");
    }

    public void setOremese(BigDecimal oremese) {
        writeProperty("oremese", oremese);
    }
    public BigDecimal getOremese() {
        return (BigDecimal)readProperty("oremese");
    }

    public void setRateopermessioremese(BigDecimal rateopermessioremese) {
        writeProperty("rateopermessioremese", rateopermessioremese);
    }
    public BigDecimal getRateopermessioremese() {
        return (BigDecimal)readProperty("rateopermessioremese");
    }

    public void setRateoroloremese(BigDecimal rateoroloremese) {
        writeProperty("rateoroloremese", rateoroloremese);
    }
    public BigDecimal getRateoroloremese() {
        return (BigDecimal)readProperty("rateoroloremese");
    }

    public void setSoggettoinail(Short soggettoinail) {
        writeProperty("soggettoinail", soggettoinail);
    }
    public Short getSoggettoinail() {
        return (Short)readProperty("soggettoinail");
    }

    public void setSoggettoinps(Short soggettoinps) {
        writeProperty("soggettoinps", soggettoinps);
    }
    public Short getSoggettoinps() {
        return (Short)readProperty("soggettoinps");
    }

    public void setTipocalcolofisso(Short tipocalcolofisso) {
        writeProperty("tipocalcolofisso", tipocalcolofisso);
    }
    public Short getTipocalcolofisso() {
        return (Short)readProperty("tipocalcolofisso");
    }

    public void setUltimamodifica(Timestamp ultimamodifica) {
        writeProperty("ultimamodifica", ultimamodifica);
    }
    public Timestamp getUltimamodifica() {
        return (Timestamp)readProperty("ultimamodifica");
    }

    public void setUltimamodificauser(String ultimamodificauser) {
        writeProperty("ultimamodificauser", ultimamodificauser);
    }
    public String getUltimamodificauser() {
        return (String)readProperty("ultimamodificauser");
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


    public void addToProfilocontrattindividuale2Array(Profilocontrattindividuale2 obj) {
        addToManyTarget("profilocontrattindividuale2Array", obj, true);
    }
    public void removeFromProfilocontrattindividuale2Array(Profilocontrattindividuale2 obj) {
        removeToManyTarget("profilocontrattindividuale2Array", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Profilocontrattindividuale2> getProfilocontrattindividuale2Array() {
        return (List<Profilocontrattindividuale2>)readProperty("profilocontrattindividuale2Array");
    }


    public void addToProfilocontrattindividualeArray(Profilocontrattindividuale obj) {
        addToManyTarget("profilocontrattindividualeArray", obj, true);
    }
    public void removeFromProfilocontrattindividualeArray(Profilocontrattindividuale obj) {
        removeToManyTarget("profilocontrattindividualeArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Profilocontrattindividuale> getProfilocontrattindividualeArray() {
        return (List<Profilocontrattindividuale>)readProperty("profilocontrattindividualeArray");
    }


    public void setToContrattocoefficiente(Contrattocoefficiente toContrattocoefficiente) {
        setToOneTarget("toContrattocoefficiente", toContrattocoefficiente, true);
    }

    public Contrattocoefficiente getToContrattocoefficiente() {
        return (Contrattocoefficiente)readProperty("toContrattocoefficiente");
    }


    public void setToContrattodettaglio(Contrattodettaglio toContrattodettaglio) {
        setToOneTarget("toContrattodettaglio", toContrattodettaglio, true);
    }

    public Contrattodettaglio getToContrattodettaglio() {
        return (Contrattodettaglio)readProperty("toContrattodettaglio");
    }


    public void setToContrattoferie(Contrattoferie toContrattoferie) {
        setToOneTarget("toContrattoferie", toContrattoferie, true);
    }

    public Contrattoferie getToContrattoferie() {
        return (Contrattoferie)readProperty("toContrattoferie");
    }


    public void setToContrattofestivitaretrib(Contrattofestivitaretrib toContrattofestivitaretrib) {
        setToOneTarget("toContrattofestivitaretrib", toContrattofestivitaretrib, true);
    }

    public Contrattofestivitaretrib getToContrattofestivitaretrib() {
        return (Contrattofestivitaretrib)readProperty("toContrattofestivitaretrib");
    }


    public void setToContrattorateo(Contrattorateo toContrattorateo) {
        setToOneTarget("toContrattorateo", toContrattorateo, true);
    }

    public Contrattorateo getToContrattorateo() {
        return (Contrattorateo)readProperty("toContrattorateo");
    }


    public void setToContrattoscatto(Contrattoscatto toContrattoscatto) {
        setToOneTarget("toContrattoscatto", toContrattoscatto, true);
    }

    public Contrattoscatto getToContrattoscatto() {
        return (Contrattoscatto)readProperty("toContrattoscatto");
    }


    public void setToInpsSettore(InpsSettore toInpsSettore) {
        setToOneTarget("toInpsSettore", toInpsSettore, true);
    }

    public InpsSettore getToInpsSettore() {
        return (InpsSettore)readProperty("toInpsSettore");
    }


    public void setToOrario(Orario toOrario) {
        setToOneTarget("toOrario", toOrario, true);
    }

    public Orario getToOrario() {
        return (Orario)readProperty("toOrario");
    }


    public void setToTipoCalcMalattia1(Tipocalcolomalattia1 toTipoCalcMalattia1) {
        setToOneTarget("toTipoCalcMalattia1", toTipoCalcMalattia1, true);
    }

    public Tipocalcolomalattia1 getToTipoCalcMalattia1() {
        return (Tipocalcolomalattia1)readProperty("toTipoCalcMalattia1");
    }


    public void setToTipoCalcMalattia2(Tipocalcolomalattia2 toTipoCalcMalattia2) {
        setToOneTarget("toTipoCalcMalattia2", toTipoCalcMalattia2, true);
    }

    public Tipocalcolomalattia2 getToTipoCalcMalattia2() {
        return (Tipocalcolomalattia2)readProperty("toTipoCalcMalattia2");
    }


    public void setToTipocalcolo(Tipocalcolo toTipocalcolo) {
        setToOneTarget("toTipocalcolo", toTipocalcolo, true);
    }

    public Tipocalcolo getToTipocalcolo() {
        return (Tipocalcolo)readProperty("toTipocalcolo");
    }


    public void setToTipolavoratore2(Tipolavoratore2 toTipolavoratore2) {
        setToOneTarget("toTipolavoratore2", toTipolavoratore2, true);
    }

    public Tipolavoratore2 getToTipolavoratore2() {
        return (Tipolavoratore2)readProperty("toTipolavoratore2");
    }


}