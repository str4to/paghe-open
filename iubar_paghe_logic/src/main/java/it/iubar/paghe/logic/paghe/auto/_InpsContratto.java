package it.iubar.paghe.logic.paghe.auto;

import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import it.iubar.paghe.logic.anagrafica.Subordinato;
import it.iubar.paghe.logic.paghe.Contrattodettaglio;
import it.iubar.paghe.logic.paghe.Elementobaseimponibile;
import it.iubar.paghe.logic.paghe.ImpresaContratto;
import it.iubar.paghe.logic.paghe.InpsContrattoGruppo;
import it.iubar.paghe.logic.paghe.InpsSettoreContratto;

/**
 * Class _InpsContratto was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _InpsContratto extends CayenneDataObject {

    public static final String ATTIVO_PROPERTY = "attivo";
    public static final String DATADECORRENZA_PROPERTY = "datadecorrenza";
    public static final String DATARINNOVOECONOMICO_PROPERTY = "datarinnovoeconomico";
    public static final String DATASCADENZAECONOMICA_PROPERTY = "datascadenzaeconomica";
    public static final String DATASCADENZANORMATIVA_PROPERTY = "datascadenzanormativa";
    public static final String DATASTIPULA_PROPERTY = "datastipula";
    public static final String DESCRIZIONE_PROPERTY = "descrizione";
    public static final String IDINPSCONTRATTO_PROPERTY = "idinpscontratto";
    public static final String PARTICONTRAENTI_PROPERTY = "particontraenti";
    public static final String ULTIMAMODIFICA_PROPERTY = "ultimamodifica";
    public static final String ULTIMAMODIFICAUSER_PROPERTY = "ultimamodificauser";
    public static final String BASEIMP_ARRAY_PROPERTY = "baseimpArray";
    public static final String CONTRATTODETTAGLIO_ARRAY_PROPERTY = "contrattodettaglioArray";
    public static final String IMPRESA_CONTRATTO_ARRAY_PROPERTY = "impresaContrattoArray";
    public static final String INPS_SETTORE_CONTRATTO_ARRAY_PROPERTY = "inpsSettoreContrattoArray";
    public static final String INPSCONTRATTOGRUPPO_ARRAY_PROPERTY = "inpscontrattogruppoArray";
    public static final String SUBORDINATO_ARRAY_PROPERTY = "subordinatoArray";

    public static final String IDINPSCONTRATTO_PK_COLUMN = "IDINPSCONTRATTO";

    public void setAttivo(Short attivo) {
        writeProperty("attivo", attivo);
    }
    public Short getAttivo() {
        return (Short)readProperty("attivo");
    }

    public void setDatadecorrenza(Date datadecorrenza) {
        writeProperty("datadecorrenza", datadecorrenza);
    }
    public Date getDatadecorrenza() {
        return (Date)readProperty("datadecorrenza");
    }

    public void setDatarinnovoeconomico(Date datarinnovoeconomico) {
        writeProperty("datarinnovoeconomico", datarinnovoeconomico);
    }
    public Date getDatarinnovoeconomico() {
        return (Date)readProperty("datarinnovoeconomico");
    }

    public void setDatascadenzaeconomica(Date datascadenzaeconomica) {
        writeProperty("datascadenzaeconomica", datascadenzaeconomica);
    }
    public Date getDatascadenzaeconomica() {
        return (Date)readProperty("datascadenzaeconomica");
    }

    public void setDatascadenzanormativa(Date datascadenzanormativa) {
        writeProperty("datascadenzanormativa", datascadenzanormativa);
    }
    public Date getDatascadenzanormativa() {
        return (Date)readProperty("datascadenzanormativa");
    }

    public void setDatastipula(Date datastipula) {
        writeProperty("datastipula", datastipula);
    }
    public Date getDatastipula() {
        return (Date)readProperty("datastipula");
    }

    public void setDescrizione(String descrizione) {
        writeProperty("descrizione", descrizione);
    }
    public String getDescrizione() {
        return (String)readProperty("descrizione");
    }

    public void setIdinpscontratto(String idinpscontratto) {
        writeProperty("idinpscontratto", idinpscontratto);
    }
    public String getIdinpscontratto() {
        return (String)readProperty("idinpscontratto");
    }

    public void setParticontraenti(String particontraenti) {
        writeProperty("particontraenti", particontraenti);
    }
    public String getParticontraenti() {
        return (String)readProperty("particontraenti");
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

    public void addToBaseimpArray(Elementobaseimponibile obj) {
        addToManyTarget("baseimpArray", obj, true);
    }
    public void removeFromBaseimpArray(Elementobaseimponibile obj) {
        removeToManyTarget("baseimpArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Elementobaseimponibile> getBaseimpArray() {
        return (List<Elementobaseimponibile>)readProperty("baseimpArray");
    }


    public void addToContrattodettaglioArray(Contrattodettaglio obj) {
        addToManyTarget("contrattodettaglioArray", obj, true);
    }
    public void removeFromContrattodettaglioArray(Contrattodettaglio obj) {
        removeToManyTarget("contrattodettaglioArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Contrattodettaglio> getContrattodettaglioArray() {
        return (List<Contrattodettaglio>)readProperty("contrattodettaglioArray");
    }


    public void addToImpresaContrattoArray(ImpresaContratto obj) {
        addToManyTarget("impresaContrattoArray", obj, true);
    }
    public void removeFromImpresaContrattoArray(ImpresaContratto obj) {
        removeToManyTarget("impresaContrattoArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<ImpresaContratto> getImpresaContrattoArray() {
        return (List<ImpresaContratto>)readProperty("impresaContrattoArray");
    }


    public void addToInpsSettoreContrattoArray(InpsSettoreContratto obj) {
        addToManyTarget("inpsSettoreContrattoArray", obj, true);
    }
    public void removeFromInpsSettoreContrattoArray(InpsSettoreContratto obj) {
        removeToManyTarget("inpsSettoreContrattoArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<InpsSettoreContratto> getInpsSettoreContrattoArray() {
        return (List<InpsSettoreContratto>)readProperty("inpsSettoreContrattoArray");
    }


    public void addToInpscontrattogruppoArray(InpsContrattoGruppo obj) {
        addToManyTarget("inpscontrattogruppoArray", obj, true);
    }
    public void removeFromInpscontrattogruppoArray(InpsContrattoGruppo obj) {
        removeToManyTarget("inpscontrattogruppoArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<InpsContrattoGruppo> getInpscontrattogruppoArray() {
        return (List<InpsContrattoGruppo>)readProperty("inpscontrattogruppoArray");
    }


    public void addToSubordinatoArray(Subordinato obj) {
        addToManyTarget("subordinatoArray", obj, true);
    }
    public void removeFromSubordinatoArray(Subordinato obj) {
        removeToManyTarget("subordinatoArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Subordinato> getSubordinatoArray() {
        return (List<Subordinato>)readProperty("subordinatoArray");
    }


}
