package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Aliquotaprevidenziale;
import it.iubar.paghe.logic.paghe.InpsLimiteimponibile;

/**
 * Class _Profiloprevidenziale was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Profiloprevidenziale extends CayenneDataObject {

    public static final String ALIQUOTAAGGIUNTIVA_PROPERTY = "aliquotaaggiuntiva";
    public static final String ALIQUOTATOTCARICODAT_PROPERTY = "aliquotatotcaricodat";
    public static final String ALIQUOTATOTCARICOLAV_PROPERTY = "aliquotatotcaricolav";
    public static final String CONTRIBFISSO_PROPERTY = "contribfisso";
    public static final String CONTRIBHH_PROPERTY = "contribhh";
    public static final String CONTRIBTOTCARICODAT_PROPERTY = "contribtotcaricodat";
    public static final String CONTRIBTOTCARICOLAV_PROPERTY = "contribtotcaricolav";
    public static final String HADIRITTOANF_PROPERTY = "hadirittoanf";
    public static final String IDLIMITEIMPONIBILE_PROPERTY = "idlimiteimponibile";
    public static final String IDPROFILO_PROPERTY = "idprofilo";
    public static final String IDRIDUZIONEINPS_PROPERTY = "idriduzioneinps";
    public static final String NOTE_PROPERTY = "note";
    public static final String RETRIBCONVGG_PROPERTY = "retribconvgg";
    public static final String RETRIBCONVHH_PROPERTY = "retribconvhh";
    public static final String RETRIBMINGG_PROPERTY = "retribmingg";
    public static final String RETRIBMINHH_PROPERTY = "retribminhh";
    public static final String ULTIMAMODIFICA_PROPERTY = "ultimamodifica";
    public static final String ULTIMAMODIFICAUSER_PROPERTY = "ultimamodificauser";
    public static final String TO_ALIQUOTAPREVIDENZIALE_PROPERTY = "toAliquotaprevidenziale";
    public static final String TO_LIMITEIMPONIBILE_PROPERTY = "toLimiteimponibile";

    public static final String IDPROFILO_PK_COLUMN = "IDPROFILO";

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

    public void setIdlimiteimponibile(Integer idlimiteimponibile) {
        writeProperty("idlimiteimponibile", idlimiteimponibile);
    }
    public Integer getIdlimiteimponibile() {
        return (Integer)readProperty("idlimiteimponibile");
    }

    public void setIdprofilo(Integer idprofilo) {
        writeProperty("idprofilo", idprofilo);
    }
    public Integer getIdprofilo() {
        return (Integer)readProperty("idprofilo");
    }

    public void setIdriduzioneinps(Integer idriduzioneinps) {
        writeProperty("idriduzioneinps", idriduzioneinps);
    }
    public Integer getIdriduzioneinps() {
        return (Integer)readProperty("idriduzioneinps");
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
