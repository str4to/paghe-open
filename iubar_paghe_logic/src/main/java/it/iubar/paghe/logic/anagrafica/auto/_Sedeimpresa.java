package it.iubar.paghe.logic.anagrafica.auto;

import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.anagrafica.CentrodicostoSedeimpresa;
import it.iubar.paghe.logic.anagrafica.Contatto;
import it.iubar.paghe.logic.anagrafica.Impresa;
import it.iubar.paghe.logic.anagrafica.ImpresaBanca;
import it.iubar.paghe.logic.anagrafica.Indirizzo;
import it.iubar.paghe.logic.anagrafica.InpsCsc;
import it.iubar.paghe.logic.anagrafica.IstatAteco;
import it.iubar.paghe.logic.anagrafica.Lavoratore;
import it.iubar.paghe.logic.anagrafica.SedeimpresaAutorizzazione;
import it.iubar.paghe.logic.anagrafica.SedeimpresaCodinpslav;
import it.iubar.paghe.logic.anagrafica.SedeimpresaPat;
import it.iubar.paghe.logic.anagrafica.Sedeinail;
import it.iubar.paghe.logic.anagrafica.Sedeinps;
import it.iubar.paghe.logic.presenze.Rilevatore;

/**
 * Class _Sedeimpresa was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Sedeimpresa extends CayenneDataObject {

    public static final String ACCENTRAMENTO_PROPERTY = "accentramento";
    public static final String ATECOVERSIONE_PROPERTY = "atecoversione";
    public static final String DATAPATRONO_PROPERTY = "datapatrono";
    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String EMAIL_PROPERTY = "email";
    public static final String FAX_PROPERTY = "fax";
    public static final String IDATECO_PROPERTY = "idateco";
    public static final String IDIMPRESA_PROPERTY = "idimpresa";
    public static final String IDINDIRIZZO_PROPERTY = "idindirizzo";
    public static final String IDSEDEIMPRESA_PROPERTY = "idsedeimpresa";
    public static final String IDTIPOSEDE_PROPERTY = "idtiposede";
    public static final String INPSCSC_PROPERTY = "inpscsc";
    public static final String INPSUNITAOPERATIVA_PROPERTY = "inpsunitaoperativa";
    public static final String TEL_PROPERTY = "tel";
    public static final String CENTRODICOSTOSEDEIMPRESA_ARRAY_PROPERTY = "centrodicostosedeimpresaArray";
    public static final String IMPRESABANCA_ARRAY_PROPERTY = "impresabancaArray";
    public static final String IMPRESAPAT_ARRAY_PROPERTY = "impresapatArray";
    public static final String LAVORATORE_ARRAY_PROPERTY = "lavoratoreArray";
    public static final String RILEVATORE_ARRAY_PROPERTY = "rilevatoreArray";
    public static final String SEDE_AUTORIZZAZIONE_ARRAY_PROPERTY = "sedeAutorizzazioneArray";
    public static final String SEDEINPRESA_CODINPSLAV_ARRAY_PROPERTY = "sedeinpresaCodinpslavArray";
    public static final String TO_ATECO_PROPERTY = "toAteco";
    public static final String TO_CONTATTO_PROPERTY = "toContatto";
    public static final String TO_IMPRESA_PROPERTY = "toImpresa";
    public static final String TO_INDIRIZZO_PROPERTY = "toIndirizzo";
    public static final String TO_INPSCSC_PROPERTY = "toInpscsc";
    public static final String TO_SEDE_INAIL_PROPERTY = "toSedeInail";
    public static final String TO_SEDE_INPS_PROPERTY = "toSedeInps";

    public static final String IDIMPRESA_PK_COLUMN = "IDIMPRESA";
    public static final String IDSEDEIMPRESA_PK_COLUMN = "IDSEDEIMPRESA";

    public void setAccentramento(Short accentramento) {
        writeProperty("accentramento", accentramento);
    }
    public Short getAccentramento() {
        return (Short)readProperty("accentramento");
    }

    public void setAtecoversione(Short atecoversione) {
        writeProperty("atecoversione", atecoversione);
    }
    public Short getAtecoversione() {
        return (Short)readProperty("atecoversione");
    }

    public void setDatapatrono(Date datapatrono) {
        writeProperty("datapatrono", datapatrono);
    }
    public Date getDatapatrono() {
        return (Date)readProperty("datapatrono");
    }

    public void setDescrizione(String descrizione) {
        writeProperty("descrizione", descrizione);
    }
    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public void setEmail(String email) {
        writeProperty("email", email);
    }
    public String getEmail() {
        return (String)readProperty("email");
    }

    public void setFax(String fax) {
        writeProperty("fax", fax);
    }
    public String getFax() {
        return (String)readProperty("fax");
    }

    public void setIdateco(String idateco) {
        writeProperty("idateco", idateco);
    }
    public String getIdateco() {
        return (String)readProperty("idateco");
    }

    public void setIdimpresa(Integer idimpresa) {
        writeProperty("idimpresa", idimpresa);
    }
    public Integer getIdimpresa() {
        return (Integer)readProperty("idimpresa");
    }

    public void setIdindirizzo(Integer idindirizzo) {
        writeProperty("idindirizzo", idindirizzo);
    }
    public Integer getIdindirizzo() {
        return (Integer)readProperty("idindirizzo");
    }

    public void setIdsedeimpresa(Short idsedeimpresa) {
        writeProperty("idsedeimpresa", idsedeimpresa);
    }
    public Short getIdsedeimpresa() {
        return (Short)readProperty("idsedeimpresa");
    }

    public void setIdtiposede(Short idtiposede) {
        writeProperty("idtiposede", idtiposede);
    }
    public Short getIdtiposede() {
        return (Short)readProperty("idtiposede");
    }

    public void setInpscsc(String inpscsc) {
        writeProperty("inpscsc", inpscsc);
    }
    public String getInpscsc() {
        return (String)readProperty("inpscsc");
    }

    public void setInpsunitaoperativa(Short inpsunitaoperativa) {
        writeProperty("inpsunitaoperativa", inpsunitaoperativa);
    }
    public Short getInpsunitaoperativa() {
        return (Short)readProperty("inpsunitaoperativa");
    }

    public void setTel(String tel) {
        writeProperty("tel", tel);
    }
    public String getTel() {
        return (String)readProperty("tel");
    }

    public void addToCentrodicostosedeimpresaArray(CentrodicostoSedeimpresa obj) {
        addToManyTarget("centrodicostosedeimpresaArray", obj, true);
    }
    public void removeFromCentrodicostosedeimpresaArray(CentrodicostoSedeimpresa obj) {
        removeToManyTarget("centrodicostosedeimpresaArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<CentrodicostoSedeimpresa> getCentrodicostosedeimpresaArray() {
        return (List<CentrodicostoSedeimpresa>)readProperty("centrodicostosedeimpresaArray");
    }


    public void addToImpresabancaArray(ImpresaBanca obj) {
        addToManyTarget("impresabancaArray", obj, true);
    }
    public void removeFromImpresabancaArray(ImpresaBanca obj) {
        removeToManyTarget("impresabancaArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<ImpresaBanca> getImpresabancaArray() {
        return (List<ImpresaBanca>)readProperty("impresabancaArray");
    }


    public void addToImpresapatArray(SedeimpresaPat obj) {
        addToManyTarget("impresapatArray", obj, true);
    }
    public void removeFromImpresapatArray(SedeimpresaPat obj) {
        removeToManyTarget("impresapatArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<SedeimpresaPat> getImpresapatArray() {
        return (List<SedeimpresaPat>)readProperty("impresapatArray");
    }


    public void addToLavoratoreArray(Lavoratore obj) {
        addToManyTarget("lavoratoreArray", obj, true);
    }
    public void removeFromLavoratoreArray(Lavoratore obj) {
        removeToManyTarget("lavoratoreArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Lavoratore> getLavoratoreArray() {
        return (List<Lavoratore>)readProperty("lavoratoreArray");
    }


    public void addToRilevatoreArray(Rilevatore obj) {
        addToManyTarget("rilevatoreArray", obj, true);
    }
    public void removeFromRilevatoreArray(Rilevatore obj) {
        removeToManyTarget("rilevatoreArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Rilevatore> getRilevatoreArray() {
        return (List<Rilevatore>)readProperty("rilevatoreArray");
    }


    public void addToSedeAutorizzazioneArray(SedeimpresaAutorizzazione obj) {
        addToManyTarget("sedeAutorizzazioneArray", obj, true);
    }
    public void removeFromSedeAutorizzazioneArray(SedeimpresaAutorizzazione obj) {
        removeToManyTarget("sedeAutorizzazioneArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<SedeimpresaAutorizzazione> getSedeAutorizzazioneArray() {
        return (List<SedeimpresaAutorizzazione>)readProperty("sedeAutorizzazioneArray");
    }


    public void addToSedeinpresaCodinpslavArray(SedeimpresaCodinpslav obj) {
        addToManyTarget("sedeinpresaCodinpslavArray", obj, true);
    }
    public void removeFromSedeinpresaCodinpslavArray(SedeimpresaCodinpslav obj) {
        removeToManyTarget("sedeinpresaCodinpslavArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<SedeimpresaCodinpslav> getSedeinpresaCodinpslavArray() {
        return (List<SedeimpresaCodinpslav>)readProperty("sedeinpresaCodinpslavArray");
    }


    public void setToAteco(IstatAteco toAteco) {
        setToOneTarget("toAteco", toAteco, true);
    }

    public IstatAteco getToAteco() {
        return (IstatAteco)readProperty("toAteco");
    }


    public void setToContatto(Contatto toContatto) {
        setToOneTarget("toContatto", toContatto, true);
    }

    public Contatto getToContatto() {
        return (Contatto)readProperty("toContatto");
    }


    public void setToImpresa(Impresa toImpresa) {
        setToOneTarget("toImpresa", toImpresa, true);
    }

    public Impresa getToImpresa() {
        return (Impresa)readProperty("toImpresa");
    }


    public void setToIndirizzo(Indirizzo toIndirizzo) {
        setToOneTarget("toIndirizzo", toIndirizzo, true);
    }

    public Indirizzo getToIndirizzo() {
        return (Indirizzo)readProperty("toIndirizzo");
    }


    public void setToInpscsc(InpsCsc toInpscsc) {
        setToOneTarget("toInpscsc", toInpscsc, true);
    }

    public InpsCsc getToInpscsc() {
        return (InpsCsc)readProperty("toInpscsc");
    }


    public void setToSedeInail(Sedeinail toSedeInail) {
        setToOneTarget("toSedeInail", toSedeInail, true);
    }

    public Sedeinail getToSedeInail() {
        return (Sedeinail)readProperty("toSedeInail");
    }


    public void setToSedeInps(Sedeinps toSedeInps) {
        setToOneTarget("toSedeInps", toSedeInps, true);
    }

    public Sedeinps getToSedeInps() {
        return (Sedeinps)readProperty("toSedeInps");
    }


}
