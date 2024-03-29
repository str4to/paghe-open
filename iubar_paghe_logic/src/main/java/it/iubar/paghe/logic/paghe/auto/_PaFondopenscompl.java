package it.iubar.paghe.logic.paghe.auto;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.paghe.PaCompartopensione;
import it.iubar.paghe.logic.paghe.PaTipocessazfondo;
import it.iubar.paghe.logic.paghe.PaTiposospensfondo;

/**
 * Class _PaFondopenscompl was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _PaFondopenscompl extends CayenneDataObject {

    public static final String AL_PROPERTY = "al";
    public static final String ALIQUOTADL_PROPERTY = "aliquotadl";
    public static final String ALIQUOTALAV_PROPERTY = "aliquotalav";
    public static final String CESSAZDATA_PROPERTY = "cessazdata";
    public static final String CONGUAGLIOFISCALE_PROPERTY = "conguagliofiscale";
    public static final String CONTRIBAG_PROPERTY = "contribag";
    public static final String CONTRIBDL_PROPERTY = "contribdl";
    public static final String CONTRIBLAV_PROPERTY = "contriblav";
    public static final String CONTRIBVERSNONDICH_PROPERTY = "contribversnondich";
    public static final String DAL_PROPERTY = "dal";
    public static final String IDALTROENTEVERSANTE_PROPERTY = "idaltroenteversante";
    public static final String IDCOMPARTO_PROPERTY = "idcomparto";
    public static final String IDFONDO_PROPERTY = "idfondo";
    public static final String IDFONDOPENSCOMP_PROPERTY = "idfondopenscomp";
    public static final String IDPOSIZIONE_PROPERTY = "idposizione";
    public static final String IDTIPOCESSAZFONDO_PROPERTY = "idtipocessazfondo";
    public static final String IDTIPOSOSPENSFONDO_PROPERTY = "idtiposospensfondo";
    public static final String PERCTFR_PROPERTY = "perctfr";
    public static final String QUOTAISCRIZDL_PROPERTY = "quotaiscrizdl";
    public static final String QUOTAISCRIZLAV_PROPERTY = "quotaiscrizlav";
    public static final String QUOTAREINTEGRAZIONE_PROPERTY = "quotareintegrazione";
    public static final String RETRIBSOGGACONTRIB_PROPERTY = "retribsoggacontrib";
    public static final String SOTTOSCRIZIONE_PROPERTY = "sottoscrizione";
    public static final String VERSTFRAPREVCOMPL_PROPERTY = "verstfraprevcompl";
    public static final String TO_PA_COMPARTO_PENSIONE_PROPERTY = "toPaCompartoPensione";
    public static final String TO_PA_TIPO_CESSAZ_FONDO_PROPERTY = "toPaTipoCessazFondo";
    public static final String TO_PA_TIPO_SOSPENS_FONDO_PROPERTY = "toPaTipoSospensFondo";

    public static final String IDFONDOPENSCOMP_PK_COLUMN = "IDFONDOPENSCOMP";
    public static final String IDPOSIZIONE_PK_COLUMN = "IDPOSIZIONE";

    public void setAl(Date al) {
        writeProperty("al", al);
    }
    public Date getAl() {
        return (Date)readProperty("al");
    }

    public void setAliquotadl(BigDecimal aliquotadl) {
        writeProperty("aliquotadl", aliquotadl);
    }
    public BigDecimal getAliquotadl() {
        return (BigDecimal)readProperty("aliquotadl");
    }

    public void setAliquotalav(BigDecimal aliquotalav) {
        writeProperty("aliquotalav", aliquotalav);
    }
    public BigDecimal getAliquotalav() {
        return (BigDecimal)readProperty("aliquotalav");
    }

    public void setCessazdata(Date cessazdata) {
        writeProperty("cessazdata", cessazdata);
    }
    public Date getCessazdata() {
        return (Date)readProperty("cessazdata");
    }

    public void setConguagliofiscale(BigDecimal conguagliofiscale) {
        writeProperty("conguagliofiscale", conguagliofiscale);
    }
    public BigDecimal getConguagliofiscale() {
        return (BigDecimal)readProperty("conguagliofiscale");
    }

    public void setContribag(BigDecimal contribag) {
        writeProperty("contribag", contribag);
    }
    public BigDecimal getContribag() {
        return (BigDecimal)readProperty("contribag");
    }

    public void setContribdl(BigDecimal contribdl) {
        writeProperty("contribdl", contribdl);
    }
    public BigDecimal getContribdl() {
        return (BigDecimal)readProperty("contribdl");
    }

    public void setContriblav(BigDecimal contriblav) {
        writeProperty("contriblav", contriblav);
    }
    public BigDecimal getContriblav() {
        return (BigDecimal)readProperty("contriblav");
    }

    public void setContribversnondich(Short contribversnondich) {
        writeProperty("contribversnondich", contribversnondich);
    }
    public Short getContribversnondich() {
        return (Short)readProperty("contribversnondich");
    }

    public void setDal(Date dal) {
        writeProperty("dal", dal);
    }
    public Date getDal() {
        return (Date)readProperty("dal");
    }

    public void setIdaltroenteversante(Integer idaltroenteversante) {
        writeProperty("idaltroenteversante", idaltroenteversante);
    }
    public Integer getIdaltroenteversante() {
        return (Integer)readProperty("idaltroenteversante");
    }

    public void setIdcomparto(Short idcomparto) {
        writeProperty("idcomparto", idcomparto);
    }
    public Short getIdcomparto() {
        return (Short)readProperty("idcomparto");
    }

    public void setIdfondo(Short idfondo) {
        writeProperty("idfondo", idfondo);
    }
    public Short getIdfondo() {
        return (Short)readProperty("idfondo");
    }

    public void setIdfondopenscomp(Short idfondopenscomp) {
        writeProperty("idfondopenscomp", idfondopenscomp);
    }
    public Short getIdfondopenscomp() {
        return (Short)readProperty("idfondopenscomp");
    }

    public void setIdposizione(Integer idposizione) {
        writeProperty("idposizione", idposizione);
    }
    public Integer getIdposizione() {
        return (Integer)readProperty("idposizione");
    }

    public void setIdtipocessazfondo(Short idtipocessazfondo) {
        writeProperty("idtipocessazfondo", idtipocessazfondo);
    }
    public Short getIdtipocessazfondo() {
        return (Short)readProperty("idtipocessazfondo");
    }

    public void setIdtiposospensfondo(Short idtiposospensfondo) {
        writeProperty("idtiposospensfondo", idtiposospensfondo);
    }
    public Short getIdtiposospensfondo() {
        return (Short)readProperty("idtiposospensfondo");
    }

    public void setPerctfr(BigDecimal perctfr) {
        writeProperty("perctfr", perctfr);
    }
    public BigDecimal getPerctfr() {
        return (BigDecimal)readProperty("perctfr");
    }

    public void setQuotaiscrizdl(BigDecimal quotaiscrizdl) {
        writeProperty("quotaiscrizdl", quotaiscrizdl);
    }
    public BigDecimal getQuotaiscrizdl() {
        return (BigDecimal)readProperty("quotaiscrizdl");
    }

    public void setQuotaiscrizlav(BigDecimal quotaiscrizlav) {
        writeProperty("quotaiscrizlav", quotaiscrizlav);
    }
    public BigDecimal getQuotaiscrizlav() {
        return (BigDecimal)readProperty("quotaiscrizlav");
    }

    public void setQuotareintegrazione(BigDecimal quotareintegrazione) {
        writeProperty("quotareintegrazione", quotareintegrazione);
    }
    public BigDecimal getQuotareintegrazione() {
        return (BigDecimal)readProperty("quotareintegrazione");
    }

    public void setRetribsoggacontrib(BigDecimal retribsoggacontrib) {
        writeProperty("retribsoggacontrib", retribsoggacontrib);
    }
    public BigDecimal getRetribsoggacontrib() {
        return (BigDecimal)readProperty("retribsoggacontrib");
    }

    public void setSottoscrizione(Date sottoscrizione) {
        writeProperty("sottoscrizione", sottoscrizione);
    }
    public Date getSottoscrizione() {
        return (Date)readProperty("sottoscrizione");
    }

    public void setVerstfraprevcompl(BigDecimal verstfraprevcompl) {
        writeProperty("verstfraprevcompl", verstfraprevcompl);
    }
    public BigDecimal getVerstfraprevcompl() {
        return (BigDecimal)readProperty("verstfraprevcompl");
    }

    public void setToPaCompartoPensione(PaCompartopensione toPaCompartoPensione) {
        setToOneTarget("toPaCompartoPensione", toPaCompartoPensione, true);
    }

    public PaCompartopensione getToPaCompartoPensione() {
        return (PaCompartopensione)readProperty("toPaCompartoPensione");
    }


    public void setToPaTipoCessazFondo(PaTipocessazfondo toPaTipoCessazFondo) {
        setToOneTarget("toPaTipoCessazFondo", toPaTipoCessazFondo, true);
    }

    public PaTipocessazfondo getToPaTipoCessazFondo() {
        return (PaTipocessazfondo)readProperty("toPaTipoCessazFondo");
    }


    public void setToPaTipoSospensFondo(PaTiposospensfondo toPaTipoSospensFondo) {
        setToOneTarget("toPaTipoSospensFondo", toPaTipoSospensFondo, true);
    }

    public PaTiposospensfondo getToPaTipoSospensFondo() {
        return (PaTiposospensfondo)readProperty("toPaTipoSospensFondo");
    }


}
