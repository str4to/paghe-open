package it.iubar.paghe.logic.anagrafica.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.anagrafica.BancaAbi;
import it.iubar.paghe.logic.anagrafica.BancaCab;
import it.iubar.paghe.logic.anagrafica.ImpresaBanca;
import it.iubar.paghe.logic.anagrafica.Personafisica;
import it.iubar.paghe.logic.anagrafica.Titolaredati;

/**
 * Class _Posizionebancaria was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Posizionebancaria extends CayenneDataObject {

    public static final String ABI_PROPERTY = "abi";
    public static final String BIC_PROPERTY = "bic";
    public static final String BIC2_PROPERTY = "bic2";
    public static final String CAB_PROPERTY = "cab";
    public static final String CC_PROPERTY = "cc";
    public static final String CIN_PROPERTY = "cin";
    public static final String IBAN_PROPERTY = "iban";
    public static final String IDPOSIZIONEBANCARIA_PROPERTY = "idposizionebancaria";
    public static final String NOTE_PROPERTY = "note";
    public static final String IMPRESA_BANCA_ARRAY_PROPERTY = "impresaBancaArray";
    public static final String PERSONAFISICA_ARRAY_PROPERTY = "personafisicaArray";
    public static final String TITOLAREDATI_ARRAY_PROPERTY = "titolaredatiArray";
    public static final String TO_BANCA_PROPERTY = "toBanca";
    public static final String TO_FILIALE_BANCA_PROPERTY = "toFilialeBanca";

    public static final String IDPOSIZIONEBANCARIA_PK_COLUMN = "IDPOSIZIONEBANCARIA";

    public void setAbi(String abi) {
        writeProperty("abi", abi);
    }
    public String getAbi() {
        return (String)readProperty("abi");
    }

    public void setBic(String bic) {
        writeProperty("bic", bic);
    }
    public String getBic() {
        return (String)readProperty("bic");
    }

    public void setBic2(String bic2) {
        writeProperty("bic2", bic2);
    }
    public String getBic2() {
        return (String)readProperty("bic2");
    }

    public void setCab(String cab) {
        writeProperty("cab", cab);
    }
    public String getCab() {
        return (String)readProperty("cab");
    }

    public void setCc(String cc) {
        writeProperty("cc", cc);
    }
    public String getCc() {
        return (String)readProperty("cc");
    }

    public void setCin(String cin) {
        writeProperty("cin", cin);
    }
    public String getCin() {
        return (String)readProperty("cin");
    }

    public void setIban(String iban) {
        writeProperty("iban", iban);
    }
    public String getIban() {
        return (String)readProperty("iban");
    }

    public void setIdposizionebancaria(Integer idposizionebancaria) {
        writeProperty("idposizionebancaria", idposizionebancaria);
    }
    public Integer getIdposizionebancaria() {
        return (Integer)readProperty("idposizionebancaria");
    }

    public void setNote(String note) {
        writeProperty("note", note);
    }
    public String getNote() {
        return (String)readProperty("note");
    }

    public void addToImpresaBancaArray(ImpresaBanca obj) {
        addToManyTarget("impresaBancaArray", obj, true);
    }
    public void removeFromImpresaBancaArray(ImpresaBanca obj) {
        removeToManyTarget("impresaBancaArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<ImpresaBanca> getImpresaBancaArray() {
        return (List<ImpresaBanca>)readProperty("impresaBancaArray");
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


    public void setToBanca(BancaAbi toBanca) {
        setToOneTarget("toBanca", toBanca, true);
    }

    public BancaAbi getToBanca() {
        return (BancaAbi)readProperty("toBanca");
    }


    public void setToFilialeBanca(BancaCab toFilialeBanca) {
        setToOneTarget("toFilialeBanca", toFilialeBanca, true);
    }

    public BancaCab getToFilialeBanca() {
        return (BancaCab)readProperty("toFilialeBanca");
    }


}
