package it.iubar.paghe.logic.anagrafica.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.anagrafica.Personafisica;
import it.iubar.paghe.logic.anagrafica.Personagiuridica;
import it.iubar.paghe.logic.anagrafica.Sedeimpresa;
import it.iubar.paghe.logic.anagrafica.Titolaredati;

/**
 * Class _Contatto was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Contatto extends CayenneDataObject {

    public static final String CELL_PROPERTY = "cell";
    public static final String EMAIL_PROPERTY = "email";
    public static final String FAX_PROPERTY = "fax";
    public static final String IDCONTATTO_PROPERTY = "idcontatto";
    public static final String PEC_PROPERTY = "pec";
    public static final String TEL_PROPERTY = "tel";
    public static final String WEB_PROPERTY = "web";
    public static final String PERSONAFISICA_ARRAY_PROPERTY = "personafisicaArray";
    public static final String PERSONAGIURIDICA_ARRAY_PROPERTY = "personagiuridicaArray";
    public static final String SEDEIMPRESA_ARRAY_PROPERTY = "sedeimpresaArray";
    public static final String TITOLAREDATI_ARRAY_PROPERTY = "titolaredatiArray";

    public static final String IDCONTATTO_PK_COLUMN = "IDCONTATTO";

    public void setCell(String cell) {
        writeProperty("cell", cell);
    }
    public String getCell() {
        return (String)readProperty("cell");
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

    public void setIdcontatto(Integer idcontatto) {
        writeProperty("idcontatto", idcontatto);
    }
    public Integer getIdcontatto() {
        return (Integer)readProperty("idcontatto");
    }

    public void setPec(String pec) {
        writeProperty("pec", pec);
    }
    public String getPec() {
        return (String)readProperty("pec");
    }

    public void setTel(String tel) {
        writeProperty("tel", tel);
    }
    public String getTel() {
        return (String)readProperty("tel");
    }

    public void setWeb(String web) {
        writeProperty("web", web);
    }
    public String getWeb() {
        return (String)readProperty("web");
    }

    public void addToPersonafisicaArray(Personafisica obj) {
        addToManyTarget("personafisicaArray", obj, true);
    }
    public void removeFromPersonafisicaArray(Personafisica obj) {
        removeToManyTarget("personafisicaArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Personafisica> getPersonafisicaArray() {
        return (List<Personafisica>)readProperty("personafisicaArray");
    }


    public void addToPersonagiuridicaArray(Personagiuridica obj) {
        addToManyTarget("personagiuridicaArray", obj, true);
    }
    public void removeFromPersonagiuridicaArray(Personagiuridica obj) {
        removeToManyTarget("personagiuridicaArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Personagiuridica> getPersonagiuridicaArray() {
        return (List<Personagiuridica>)readProperty("personagiuridicaArray");
    }


    public void addToSedeimpresaArray(Sedeimpresa obj) {
        addToManyTarget("sedeimpresaArray", obj, true);
    }
    public void removeFromSedeimpresaArray(Sedeimpresa obj) {
        removeToManyTarget("sedeimpresaArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Sedeimpresa> getSedeimpresaArray() {
        return (List<Sedeimpresa>)readProperty("sedeimpresaArray");
    }


    public void addToTitolaredatiArray(Titolaredati obj) {
        addToManyTarget("titolaredatiArray", obj, true);
    }
    public void removeFromTitolaredatiArray(Titolaredati obj) {
        removeToManyTarget("titolaredatiArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Titolaredati> getTitolaredatiArray() {
        return (List<Titolaredati>)readProperty("titolaredatiArray");
    }


}
