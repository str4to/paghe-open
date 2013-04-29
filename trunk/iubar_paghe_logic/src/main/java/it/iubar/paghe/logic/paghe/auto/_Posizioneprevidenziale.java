package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Aliquotaprevidenziale;
import it.iubar.paghe.logic.paghe.InpsLimiteimponibile;

/**
 * Class _Posizioneprevidenziale was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Posizioneprevidenziale extends CayenneDataObject {

    public static final String ALIQUOTAAGGIUNTIVA_PROPERTY = "aliquotaaggiuntiva";
    public static final String ALIQUOTATOTCARICODAT_PROPERTY = "aliquotatotcaricodat";
    public static final String ALIQUOTATOTCARICOLAV_PROPERTY = "aliquotatotcaricolav";
    public static final String ALTRICONTRIBNONREDDITO_PROPERTY = "altricontribnonreddito";
    public static final String APPLICATOMINIMALE_PROPERTY = "applicatominimale";
    public static final String CONTRIBAGGIUNTIVA_PROPERTY = "contribaggiuntiva";
    public static final String CONTRIBFISSO_PROPERTY = "contribfisso";
    public static final String CONTRIBHH_PROPERTY = "contribhh";
    public static final String CONTRIBTOTCARICODAT_PROPERTY = "contribtotcaricodat";
    public static final String CONTRIBTOTCARICOLAV_PROPERTY = "contribtotcaricolav";
    public static final String HADIRITTOANF_PROPERTY = "hadirittoanf";
    public static final String IDALIQUOTAPREVIDENZIALE_PROPERTY = "idaliquotaprevidenziale";
    public static final String IDLIMITEIMPONIBILE_PROPERTY = "idlimiteimponibile";
    public static final String IDPOSIZIONE_PROPERTY = "idposizione";
    public static final String IDRIDUZIONEINPS_PROPERTY = "idriduzioneinps";
    public static final String IDTIPOFOGLIO_PROPERTY = "idtipofoglio";
    public static final String IMPONIBILE_PROPERTY = "imponibile";
    public static final String NORECALC_PROPERTY = "norecalc";
    public static final String NOTE_PROPERTY = "note";
    public static final String RETRIBCONVGG_PROPERTY = "retribconvgg";
    public static final String RETRIBCONVHH_PROPERTY = "retribconvhh";
    public static final String RETRIBMINGG_PROPERTY = "retribmingg";
    public static final String RETRIBMINHH_PROPERTY = "retribminhh";
    public static final String TO_ALIQUOTAPREVIDENZIALE_PROPERTY = "toAliquotaprevidenziale";
    public static final String TO_LIMITEIMPONIBILE_PROPERTY = "toLimiteimponibile";

    public static final String IDPOSIZIONE_PK_COLUMN = "IDPOSIZIONE";
    public static final String IDTIPOFOGLIO_PK_COLUMN = "IDTIPOFOGLIO";

    public void setAliquotaaggiuntiva(BigDecimal aliquotaaggiuntiva) {
        writeProperty("aliquotaaggiuntiva", aliquotaaggiuntiva);
    }
    public BigDecimal getAliquotaaggiuntiva() {
        return (BigDecimal)readProperty("aliquotaaggiuntiva");
    }

    public void setAliquotatotcaricodat(BigDecimal aliquotatotcaricodat) {
        writeProperty("aliquotatotcaricodat", aliquotatotcaricodat);
    }
    public BigDecimal getAliquotatotcaricodat() {
        return (BigDecimal)readProperty("aliquotatotcaricodat");
    }

    public void setAliquotatotcaricolav(BigDecimal aliquotatotcaricolav) {
        writeProperty("aliquotatotcaricolav", aliquotatotcaricolav);
    }
    public BigDecimal getAliquotatotcaricolav() {
        return (BigDecimal)readProperty("aliquotatotcaricolav");
    }

    public void setAltricontribnonreddito(BigDecimal altricontribnonreddito) {
        writeProperty("altricontribnonreddito", altricontribnonreddito);
    }
    public BigDecimal getAltricontribnonreddito() {
        return (BigDecimal)readProperty("altricontribnonreddito");
    }

    public void setApplicatominimale(Short applicatominimale) {
        writeProperty("applicatominimale", applicatominimale);
    }
    public Short getApplicatominimale() {
        return (Short)readProperty("applicatominimale");
    }

    public void setContribaggiuntiva(BigDecimal contribaggiuntiva) {
        writeProperty("contribaggiuntiva", contribaggiuntiva);
    }
    public BigDecimal getContribaggiuntiva() {
        return (BigDecimal)readProperty("contribaggiuntiva");
    }

    public void setContribfisso(Short contribfisso) {
        writeProperty("contribfisso", contribfisso);
    }
    public Short getContribfisso() {
        return (Short)readProperty("contribfisso");
    }

    public void setContribhh(BigDecimal contribhh) {
        writeProperty("contribhh", contribhh);
    }
    public BigDecimal getContribhh() {
        return (BigDecimal)readProperty("contribhh");
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

    public void setHadirittoanf(Short hadirittoanf) {
        writeProperty("hadirittoanf", hadirittoanf);
    }
    public Short getHadirittoanf() {
        return (Short)readProperty("hadirittoanf");
    }

    public void setIdaliquotaprevidenziale(Integer idaliquotaprevidenziale) {
        writeProperty("idaliquotaprevidenziale", idaliquotaprevidenziale);
    }
    public Integer getIdaliquotaprevidenziale() {
        return (Integer)readProperty("idaliquotaprevidenziale");
    }

    public void setIdlimiteimponibile(Integer idlimiteimponibile) {
        writeProperty("idlimiteimponibile", idlimiteimponibile);
    }
    public Integer getIdlimiteimponibile() {
        return (Integer)readProperty("idlimiteimponibile");
    }

    public void setIdposizione(Integer idposizione) {
        writeProperty("idposizione", idposizione);
    }
    public Integer getIdposizione() {
        return (Integer)readProperty("idposizione");
    }

    public void setIdriduzioneinps(Integer idriduzioneinps) {
        writeProperty("idriduzioneinps", idriduzioneinps);
    }
    public Integer getIdriduzioneinps() {
        return (Integer)readProperty("idriduzioneinps");
    }

    public void setIdtipofoglio(Short idtipofoglio) {
        writeProperty("idtipofoglio", idtipofoglio);
    }
    public Short getIdtipofoglio() {
        return (Short)readProperty("idtipofoglio");
    }

    protected void setImponibile(BigDecimal imponibile) {
        writeProperty("imponibile", imponibile);
    }
    protected BigDecimal getImponibile() {
        return (BigDecimal)readProperty("imponibile");
    }

    public void setNorecalc(Short norecalc) {
        writeProperty("norecalc", norecalc);
    }
    public Short getNorecalc() {
        return (Short)readProperty("norecalc");
    }

    public void setNote(String note) {
        writeProperty("note", note);
    }
    public String getNote() {
        return (String)readProperty("note");
    }

    public void setRetribconvgg(BigDecimal retribconvgg) {
        writeProperty("retribconvgg", retribconvgg);
    }
    public BigDecimal getRetribconvgg() {
        return (BigDecimal)readProperty("retribconvgg");
    }

    public void setRetribconvhh(BigDecimal retribconvhh) {
        writeProperty("retribconvhh", retribconvhh);
    }
    public BigDecimal getRetribconvhh() {
        return (BigDecimal)readProperty("retribconvhh");
    }

    public void setRetribmingg(BigDecimal retribmingg) {
        writeProperty("retribmingg", retribmingg);
    }
    public BigDecimal getRetribmingg() {
        return (BigDecimal)readProperty("retribmingg");
    }

    public void setRetribminhh(BigDecimal retribminhh) {
        writeProperty("retribminhh", retribminhh);
    }
    public BigDecimal getRetribminhh() {
        return (BigDecimal)readProperty("retribminhh");
    }

    public void setToAliquotaprevidenziale(Aliquotaprevidenziale toAliquotaprevidenziale) {
        setToOneTarget("toAliquotaprevidenziale", toAliquotaprevidenziale, true);
    }

    public Aliquotaprevidenziale getToAliquotaprevidenziale() {
        return (Aliquotaprevidenziale)readProperty("toAliquotaprevidenziale");
    }


    public void setToLimiteimponibile(InpsLimiteimponibile toLimiteimponibile) {
        setToOneTarget("toLimiteimponibile", toLimiteimponibile, true);
    }

    public InpsLimiteimponibile getToLimiteimponibile() {
        return (InpsLimiteimponibile)readProperty("toLimiteimponibile");
    }


}