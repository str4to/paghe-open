package it.iubar.paghe.logic.anagrafica.auto;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.anagrafica.Comune;
import it.iubar.paghe.logic.anagrafica.Tiposindacato;

/**
 * Class _Sindacato was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Sindacato extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String EMAIL_PROPERTY = "email";
    public static final String FAX_PROPERTY = "fax";
    public static final String IDSINDACATO_PROPERTY = "idsindacato";
    public static final String SEDECAP_PROPERTY = "sedecap";
    public static final String SEDEINDIRIZZO_PROPERTY = "sedeindirizzo";
    public static final String SEDELOCALITA_PROPERTY = "sedelocalita";
    public static final String TEL_PROPERTY = "tel";
    public static final String TO_SEDE_COMUNE_PROPERTY = "toSedeComune";
    public static final String TO_TIPO_SINDACATO_PROPERTY = "toTipoSindacato";

    public static final String IDSINDACATO_PK_COLUMN = "IDSINDACATO";

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

    public void setIdsindacato(Integer idsindacato) {
        writeProperty("idsindacato", idsindacato);
    }
    public Integer getIdsindacato() {
        return (Integer)readProperty("idsindacato");
    }

    public void setSedecap(String sedecap) {
        writeProperty("sedecap", sedecap);
    }
    public String getSedecap() {
        return (String)readProperty("sedecap");
    }

    public void setSedeindirizzo(String sedeindirizzo) {
        writeProperty("sedeindirizzo", sedeindirizzo);
    }
    public String getSedeindirizzo() {
        return (String)readProperty("sedeindirizzo");
    }

    public void setSedelocalita(String sedelocalita) {
        writeProperty("sedelocalita", sedelocalita);
    }
    public String getSedelocalita() {
        return (String)readProperty("sedelocalita");
    }

    public void setTel(String tel) {
        writeProperty("tel", tel);
    }
    public String getTel() {
        return (String)readProperty("tel");
    }

    public void setToSedeComune(Comune toSedeComune) {
        setToOneTarget("toSedeComune", toSedeComune, true);
    }

    public Comune getToSedeComune() {
        return (Comune)readProperty("toSedeComune");
    }


    public void setToTipoSindacato(Tiposindacato toTipoSindacato) {
        setToOneTarget("toTipoSindacato", toTipoSindacato, true);
    }

    public Tiposindacato getToTipoSindacato() {
        return (Tiposindacato)readProperty("toTipoSindacato");
    }


}
