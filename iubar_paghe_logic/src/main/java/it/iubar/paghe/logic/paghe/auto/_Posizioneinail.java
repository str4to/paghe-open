package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.InailGruppo;
import it.iubar.paghe.logic.paghe.InailGruppo2;
import it.iubar.paghe.logic.paghe.InailLimitecontributivo;
import it.iubar.paghe.logic.paghe.InailPat;
import it.iubar.paghe.logic.paghe.InailProfessione;
import it.iubar.paghe.logic.paghe.InailQualifica;
import it.iubar.paghe.logic.paghe.InailRetribconvenzionale;
import it.iubar.paghe.logic.paghe.InailTiporapporto;
import it.iubar.paghe.logic.paghe.Posizionelavoratore;

/**
 * Class _Posizioneinail was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Posizioneinail extends CayenneDataObject {

    public static final String ALTRICOMPENSI_PROPERTY = "altricompensi";
    public static final String CONTRIBTOTCARICODAT_PROPERTY = "contribtotcaricodat";
    public static final String CONTRIBTOTCARICOLAV_PROPERTY = "contribtotcaricolav";
    public static final String DURATARAPPORTOGG_PROPERTY = "duratarapportogg";
    public static final String DURATARAPPORTOMM_PROPERTY = "duratarapportomm";
    public static final String IDINAILPROFESSIONE_PROPERTY = "idinailprofessione";
    public static final String IDINAILQUALIFICA_PROPERTY = "idinailqualifica";
    public static final String IDLIMITECONTRIB_PROPERTY = "idlimitecontrib";
    public static final String IDPAT_PROPERTY = "idpat";
    public static final String IDPOSIZIONE_PROPERTY = "idposizione";
    public static final String IDRETRIBCONV_PROPERTY = "idretribconv";
    public static final String IDTIPOFOGLIO_PROPERTY = "idtipofoglio";
    public static final String IDTIPOIMPONIBILE_PROPERTY = "idtipoimponibile";
    public static final String IMPONIBILE_PROPERTY = "imponibile";
    public static final String IMPONIBILEESPOSTO_PROPERTY = "imponibileesposto";
    public static final String NORECALC_PROPERTY = "norecalc";
    public static final String PATCUSTOM_PROPERTY = "patcustom";
    public static final String PREMIOINAIL_PROPERTY = "premioinail";
    public static final String RIDUZIONETASSO_PROPERTY = "riduzionetasso";
    public static final String TASSOESPOSTO_PROPERTY = "tassoesposto";
    public static final String TASSORISCHIO_PROPERTY = "tassorischio";
    public static final String TO_INAIL_GRUPPO_PROPERTY = "toInailGruppo";
    public static final String TO_INAIL_GRUPPO2_PROPERTY = "toInailGruppo2";
    public static final String TO_INAIL_PAT_PROPERTY = "toInailPat";
    public static final String TO_INAIL_TIPORAPPORTO_PROPERTY = "toInailTiporapporto";
    public static final String TO_INAILPROFESSIONE_PROPERTY = "toInailprofessione";
    public static final String TO_INAILQUALIFICA_PROPERTY = "toInailqualifica";
    public static final String TO_LIMITECONTRIB_PROPERTY = "toLimitecontrib";
    public static final String TO_POSIZIONELAVORATORE_PROPERTY = "toPosizionelavoratore";
    public static final String TO_RETRIBCONV_PROPERTY = "toRetribconv";

    public static final String IDPOSIZIONE_PK_COLUMN = "IDPOSIZIONE";
    public static final String IDTIPOFOGLIO_PK_COLUMN = "IDTIPOFOGLIO";

    public void setAltricompensi(BigDecimal altricompensi) {
        writeProperty("altricompensi", altricompensi);
    }
    public BigDecimal getAltricompensi() {
        return (BigDecimal)readProperty("altricompensi");
    }

    public void setContribtotcaricodat(BigDecimal contribtotcaricodat) {
        writeProperty("contribtotcaricodat", contribtotcaricodat);
    }
    public BigDecimal getContribtotcaricodat() {
        return (BigDecimal)readProperty("contribtotcaricodat");
    }

    public void setContribtotcaricolav(BigDecimal contribtotcaricolav) {
        writeProperty("contribtotcaricolav", contribtotcaricolav);
    }
    public BigDecimal getContribtotcaricolav() {
        return (BigDecimal)readProperty("contribtotcaricolav");
    }

    public void setDuratarapportogg(BigDecimal duratarapportogg) {
        writeProperty("duratarapportogg", duratarapportogg);
    }
    public BigDecimal getDuratarapportogg() {
        return (BigDecimal)readProperty("duratarapportogg");
    }

    public void setDuratarapportomm(BigDecimal duratarapportomm) {
        writeProperty("duratarapportomm", duratarapportomm);
    }
    public BigDecimal getDuratarapportomm() {
        return (BigDecimal)readProperty("duratarapportomm");
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

    public void setIdlimitecontrib(Short idlimitecontrib) {
        writeProperty("idlimitecontrib", idlimitecontrib);
    }
    public Short getIdlimitecontrib() {
        return (Short)readProperty("idlimitecontrib");
    }

    public void setIdpat(String idpat) {
        writeProperty("idpat", idpat);
    }
    public String getIdpat() {
        return (String)readProperty("idpat");
    }

    public void setIdposizione(Integer idposizione) {
        writeProperty("idposizione", idposizione);
    }
    public Integer getIdposizione() {
        return (Integer)readProperty("idposizione");
    }

    public void setIdretribconv(Short idretribconv) {
        writeProperty("idretribconv", idretribconv);
    }
    public Short getIdretribconv() {
        return (Short)readProperty("idretribconv");
    }

    public void setIdtipofoglio(Short idtipofoglio) {
        writeProperty("idtipofoglio", idtipofoglio);
    }
    public Short getIdtipofoglio() {
        return (Short)readProperty("idtipofoglio");
    }

    public void setIdtipoimponibile(Short idtipoimponibile) {
        writeProperty("idtipoimponibile", idtipoimponibile);
    }
    public Short getIdtipoimponibile() {
        return (Short)readProperty("idtipoimponibile");
    }

    public void setImponibile(BigDecimal imponibile) {
        writeProperty("imponibile", imponibile);
    }
    public BigDecimal getImponibile() {
        return (BigDecimal)readProperty("imponibile");
    }

    public void setImponibileesposto(BigDecimal imponibileesposto) {
        writeProperty("imponibileesposto", imponibileesposto);
    }
    public BigDecimal getImponibileesposto() {
        return (BigDecimal)readProperty("imponibileesposto");
    }

    public void setNorecalc(Short norecalc) {
        writeProperty("norecalc", norecalc);
    }
    public Short getNorecalc() {
        return (Short)readProperty("norecalc");
    }

    public void setPatcustom(String patcustom) {
        writeProperty("patcustom", patcustom);
    }
    public String getPatcustom() {
        return (String)readProperty("patcustom");
    }

    public void setPremioinail(BigDecimal premioinail) {
        writeProperty("premioinail", premioinail);
    }
    public BigDecimal getPremioinail() {
        return (BigDecimal)readProperty("premioinail");
    }

    public void setRiduzionetasso(BigDecimal riduzionetasso) {
        writeProperty("riduzionetasso", riduzionetasso);
    }
    public BigDecimal getRiduzionetasso() {
        return (BigDecimal)readProperty("riduzionetasso");
    }

    public void setTassoesposto(BigDecimal tassoesposto) {
        writeProperty("tassoesposto", tassoesposto);
    }
    public BigDecimal getTassoesposto() {
        return (BigDecimal)readProperty("tassoesposto");
    }

    public void setTassorischio(BigDecimal tassorischio) {
        writeProperty("tassorischio", tassorischio);
    }
    public BigDecimal getTassorischio() {
        return (BigDecimal)readProperty("tassorischio");
    }

    public void setToInailGruppo(InailGruppo toInailGruppo) {
        setToOneTarget("toInailGruppo", toInailGruppo, true);
    }

    public InailGruppo getToInailGruppo() {
        return (InailGruppo)readProperty("toInailGruppo");
    }


    public void setToInailGruppo2(InailGruppo2 toInailGruppo2) {
        setToOneTarget("toInailGruppo2", toInailGruppo2, true);
    }

    public InailGruppo2 getToInailGruppo2() {
        return (InailGruppo2)readProperty("toInailGruppo2");
    }


    public void setToInailPat(InailPat toInailPat) {
        setToOneTarget("toInailPat", toInailPat, true);
    }

    public InailPat getToInailPat() {
        return (InailPat)readProperty("toInailPat");
    }


    public void setToInailTiporapporto(InailTiporapporto toInailTiporapporto) {
        setToOneTarget("toInailTiporapporto", toInailTiporapporto, true);
    }

    public InailTiporapporto getToInailTiporapporto() {
        return (InailTiporapporto)readProperty("toInailTiporapporto");
    }


    public void setToInailprofessione(InailProfessione toInailprofessione) {
        setToOneTarget("toInailprofessione", toInailprofessione, true);
    }

    public InailProfessione getToInailprofessione() {
        return (InailProfessione)readProperty("toInailprofessione");
    }


    public void setToInailqualifica(InailQualifica toInailqualifica) {
        setToOneTarget("toInailqualifica", toInailqualifica, true);
    }

    public InailQualifica getToInailqualifica() {
        return (InailQualifica)readProperty("toInailqualifica");
    }


    public void setToLimitecontrib(InailLimitecontributivo toLimitecontrib) {
        setToOneTarget("toLimitecontrib", toLimitecontrib, true);
    }

    public InailLimitecontributivo getToLimitecontrib() {
        return (InailLimitecontributivo)readProperty("toLimitecontrib");
    }


    public void setToPosizionelavoratore(Posizionelavoratore toPosizionelavoratore) {
        setToOneTarget("toPosizionelavoratore", toPosizionelavoratore, true);
    }

    public Posizionelavoratore getToPosizionelavoratore() {
        return (Posizionelavoratore)readProperty("toPosizionelavoratore");
    }


    public void setToRetribconv(InailRetribconvenzionale toRetribconv) {
        setToOneTarget("toRetribconv", toRetribconv, true);
    }

    public InailRetribconvenzionale getToRetribconv() {
        return (InailRetribconvenzionale)readProperty("toRetribconv");
    }


}
