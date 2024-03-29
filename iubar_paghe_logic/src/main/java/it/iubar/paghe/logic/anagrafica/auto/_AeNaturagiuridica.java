package it.iubar.paghe.logic.anagrafica.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.anagrafica.Personagiuridica;

/**
 * Class _AeNaturagiuridica was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AeNaturagiuridica extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDNATURAGIURIDICA_PROPERTY = "idnaturagiuridica";
    public static final String NONRESIDENTE_PROPERTY = "nonresidente";
    public static final String PERSONAGIURIDICA_ARRAY_PROPERTY = "personagiuridicaArray";

    public static final String IDNATURAGIURIDICA_PK_COLUMN = "IDNATURAGIURIDICA";

    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public Short getIdnaturagiuridica() {
        return (Short)readProperty("idnaturagiuridica");
    }

    public Short getNonresidente() {
        return (Short)readProperty("nonresidente");
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


}
