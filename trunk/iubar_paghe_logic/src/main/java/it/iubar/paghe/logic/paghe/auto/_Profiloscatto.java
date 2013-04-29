package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.Contrattoscatto;

/**
 * Class _Profiloscatto was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Profiloscatto extends CayenneDataObject {

    public static final String DATAPRECLIV_PROPERTY = "dataprecliv";
    public static final String DATAULTIMOSCATTO_PROPERTY = "dataultimoscatto";
    public static final String IDFREQUENZA_PROPERTY = "idfrequenza";
    public static final String IDPROFILO_PROPERTY = "idprofilo";
    public static final String IDSCATTO_PROPERTY = "idscatto";
    public static final String IDSCATTO2_PROPERTY = "idscatto2";
    public static final String IDUNITAMISURA_PROPERTY = "idunitamisura";
    public static final String NOTE_PROPERTY = "note";
    public static final String NUMERO_PROPERTY = "numero";
    public static final String PROSSIMOSCATTO_PROPERTY = "prossimoscatto";
    public static final String ULTIMAMODIFICA_PROPERTY = "ultimamodifica";
    public static final String ULTIMAMODIFICAUSER_PROPERTY = "ultimamodificauser";
    public static final String VALORE_PROPERTY = "valore";
    public static final String VALORETOTPRECLIV_PROPERTY = "valoretotprecliv";
    public static final String TO_CONTRATTOSCATTO_PROPERTY = "toContrattoscatto";

    public static final String IDPROFILO_PK_COLUMN = "IDPROFILO";

    public void setDataprecliv(Date dataprecliv) {
        writeProperty("dataprecliv", dataprecliv);
    }
    public Date getDataprecliv() {
        return (Date)readProperty("dataprecliv");
    }

    public void setDataultimoscatto(Date dataultimoscatto) {
        writeProperty("dataultimoscatto", dataultimoscatto);
    }
    public Date getDataultimoscatto() {
        return (Date)readProperty("dataultimoscatto");
    }

    public void setIdfrequenza(Short idfrequenza) {
        writeProperty("idfrequenza", idfrequenza);
    }
    public Short getIdfrequenza() {
        return (Short)readProperty("idfrequenza");
    }

    public void setIdprofilo(Integer idprofilo) {
        writeProperty("idprofilo", idprofilo);
    }
    public Integer getIdprofilo() {
        return (Integer)readProperty("idprofilo");
    }

    public void setIdscatto(Short idscatto) {
        writeProperty("idscatto", idscatto);
    }
    public Short getIdscatto() {
        return (Short)readProperty("idscatto");
    }

    public void setIdscatto2(Short idscatto2) {
        writeProperty("idscatto2", idscatto2);
    }
    public Short getIdscatto2() {
        return (Short)readProperty("idscatto2");
    }

    public void setIdunitamisura(Short idunitamisura) {
        writeProperty("idunitamisura", idunitamisura);
    }
    public Short getIdunitamisura() {
        return (Short)readProperty("idunitamisura");
    }

    public void setNote(String note) {
        writeProperty("note", note);
    }
    public String getNote() {
        return (String)readProperty("note");
    }

    public void setNumero(Short numero) {
        writeProperty("numero", numero);
    }
    public Short getNumero() {
        return (Short)readProperty("numero");
    }

    public void setProssimoscatto(Date prossimoscatto) {
        writeProperty("prossimoscatto", prossimoscatto);
    }
    public Date getProssimoscatto() {
        return (Date)readProperty("prossimoscatto");
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

    public void setValore(BigDecimal valore) {
        writeProperty("valore", valore);
    }
    public BigDecimal getValore() {
        return (BigDecimal)readProperty("valore");
    }

    public void setValoretotprecliv(BigDecimal valoretotprecliv) {
        writeProperty("valoretotprecliv", valoretotprecliv);
    }
    public BigDecimal getValoretotprecliv() {
        return (BigDecimal)readProperty("valoretotprecliv");
    }

    public void setToContrattoscatto(Contrattoscatto toContrattoscatto) {
        setToOneTarget("toContrattoscatto", toContrattoscatto, true);
    }

    public Contrattoscatto getToContrattoscatto() {
        return (Contrattoscatto)readProperty("toContrattoscatto");
    }


}
