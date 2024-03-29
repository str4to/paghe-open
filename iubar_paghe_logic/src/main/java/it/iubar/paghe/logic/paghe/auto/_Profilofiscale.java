package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _Profilofiscale was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Profilofiscale extends CayenneDataObject {

    public static final String ALTROFAMILIARE_PROPERTY = "altrofamiliare";
    public static final String FIGLIDISABILIMAGGIORI3ANNI_PROPERTY = "figlidisabilimaggiori3anni";
    public static final String FIGLIDISABILIMINORI3ANNI_PROPERTY = "figlidisabiliminori3anni";
    public static final String FIGLIMAGGIORI3ANNI_PROPERTY = "figlimaggiori3anni";
    public static final String FIGLIMINORI3ANNI_PROPERTY = "figliminori3anni";
    public static final String GGLAVORO_PROPERTY = "gglavoro";
    public static final String GGPENSIONE_PROPERTY = "ggpensione";
    public static final String IDPROFILO_PROPERTY = "idprofilo";
    public static final String IMPONIBILEIRPEFPRESUNTO_PROPERTY = "imponibileirpefpresunto";
    public static final String NOTE_PROPERTY = "note";
    public static final String OPZIONEALTRO_PROPERTY = "opzionealtro";
    public static final String OPZIONEDETRAZF_PROPERTY = "opzionedetrazf";
    public static final String OPZIONEDETRAZIONE_PROPERTY = "opzionedetrazione";
    public static final String OPZIONEDETRAZL_PROPERTY = "opzionedetrazl";
    public static final String OPZIONEREDDITOPRESUNTO_PROPERTY = "opzioneredditopresunto";
    public static final String RIPARTIZALTROFAMILIARE_PROPERTY = "ripartizaltrofamiliare";
    public static final String RIPARTIZFIGLI_PROPERTY = "ripartizfigli";
    public static final String RIPARTIZFIGLIDISABILI_PROPERTY = "ripartizfiglidisabili";
    public static final String ULTIMAMODIFICA_PROPERTY = "ultimamodifica";
    public static final String ULTIMAMODIFICAUSER_PROPERTY = "ultimamodificauser";

    public static final String IDPROFILO_PK_COLUMN = "IDPROFILO";

    public void setAltrofamiliare(Short altrofamiliare) {
        writeProperty("altrofamiliare", altrofamiliare);
    }
    public Short getAltrofamiliare() {
        return (Short)readProperty("altrofamiliare");
    }

    public void setFiglidisabilimaggiori3anni(Short figlidisabilimaggiori3anni) {
        writeProperty("figlidisabilimaggiori3anni", figlidisabilimaggiori3anni);
    }
    public Short getFiglidisabilimaggiori3anni() {
        return (Short)readProperty("figlidisabilimaggiori3anni");
    }

    public void setFiglidisabiliminori3anni(Short figlidisabiliminori3anni) {
        writeProperty("figlidisabiliminori3anni", figlidisabiliminori3anni);
    }
    public Short getFiglidisabiliminori3anni() {
        return (Short)readProperty("figlidisabiliminori3anni");
    }

    public void setFiglimaggiori3anni(Short figlimaggiori3anni) {
        writeProperty("figlimaggiori3anni", figlimaggiori3anni);
    }
    public Short getFiglimaggiori3anni() {
        return (Short)readProperty("figlimaggiori3anni");
    }

    public void setFigliminori3anni(Short figliminori3anni) {
        writeProperty("figliminori3anni", figliminori3anni);
    }
    public Short getFigliminori3anni() {
        return (Short)readProperty("figliminori3anni");
    }

    public void setGglavoro(Short gglavoro) {  // TODO: RIMUOVERE
        writeProperty("gglavoro", gglavoro);
    }
    public Short getGglavoro() {  // TODO: RIMUOVERE
        return (Short)readProperty("gglavoro");
    }

    public void setGgpensione(Short ggpensione) {
        writeProperty("ggpensione", ggpensione);
    }
    public Short getGgpensione() {
        return (Short)readProperty("ggpensione");
    }

    public void setIdprofilo(Integer idprofilo) {
        writeProperty("idprofilo", idprofilo);
    }
    public Integer getIdprofilo() {
        return (Integer)readProperty("idprofilo");
    }

    public void setImponibileirpefpresunto(BigDecimal imponibileirpefpresunto) {
        writeProperty("imponibileirpefpresunto", imponibileirpefpresunto);
    }
    public BigDecimal getImponibileirpefpresunto() {
        return (BigDecimal)readProperty("imponibileirpefpresunto");
    }

    public void setNote(String note) {
        writeProperty("note", note);
    }
    public String getNote() {
        return (String)readProperty("note");
    }

    protected void setOpzionealtro(Short opzionealtro) {
        writeProperty("opzionealtro", opzionealtro);
    }
    protected Short getOpzionealtro() {
        return (Short)readProperty("opzionealtro");
    }

    protected void setOpzionedetrazf(Short opzionedetrazf) {
        writeProperty("opzionedetrazf", opzionedetrazf);
    }
    protected Short getOpzionedetrazf() {
        return (Short)readProperty("opzionedetrazf");
    }

    protected void setOpzionedetrazione(Short opzionedetrazione) {
        writeProperty("opzionedetrazione", opzionedetrazione);
    }
    protected Short getOpzionedetrazione() {
        return (Short)readProperty("opzionedetrazione");
    }

    protected void setOpzionedetrazl(Short opzionedetrazl) {
        writeProperty("opzionedetrazl", opzionedetrazl);
    }
    protected Short getOpzionedetrazl() {
        return (Short)readProperty("opzionedetrazl");
    }

    public void setOpzioneredditopresunto(Short opzioneredditopresunto) {
        writeProperty("opzioneredditopresunto", opzioneredditopresunto);
    }
    public Short _getOpzioneredditopresunto() {
        return (Short)readProperty("opzioneredditopresunto");
    }

    public void setRipartizaltrofamiliare(BigDecimal ripartizaltrofamiliare) {
        writeProperty("ripartizaltrofamiliare", ripartizaltrofamiliare);
    }
    public BigDecimal getRipartizaltrofamiliare() {
        return (BigDecimal)readProperty("ripartizaltrofamiliare");
    }

    public void setRipartizfigli(BigDecimal ripartizfigli) {
        writeProperty("ripartizfigli", ripartizfigli);
    }
    public BigDecimal getRipartizfigli() {
        return (BigDecimal)readProperty("ripartizfigli");
    }

    public void setRipartizfiglidisabili(BigDecimal ripartizfiglidisabili) {
        writeProperty("ripartizfiglidisabili", ripartizfiglidisabili);
    }
    public BigDecimal getRipartizfiglidisabili() {
        return (BigDecimal)readProperty("ripartizfiglidisabili");
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

}
