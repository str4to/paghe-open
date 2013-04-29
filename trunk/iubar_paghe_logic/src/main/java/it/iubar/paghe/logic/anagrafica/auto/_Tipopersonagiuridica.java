package it.iubar.paghe.logic.anagrafica.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.anagrafica.Personagiuridica;

/**
 * Class _Tipopersonagiuridica was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Tipopersonagiuridica extends CayenneDataObject {

    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String PERSONAGIURIDICA_ARRAY_PROPERTY = "personagiuridicaArray";

    public static final String IDTIPOPERSONAGIURIDICA_PK_COLUMN = "IDTIPOPERSONAGIURIDICA";

    public void setDescrizione(String descrizione) {
        writeProperty("descrizione", descrizione);
    }
    public String getDescrizione() {
        return (String)readProperty("descrizione");
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