package it.iubar.paghe.logic.anagrafica.auto;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _BancaDettagli was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _BancaDettagli extends CayenneDataObject {

    public static final String ABI_PROPERTY = "abi";
    public static final String CAB_PROPERTY = "cab";
    public static final String EMAIL_PROPERTY = "email";
    public static final String FAX_PROPERTY = "fax";
    public static final String TEL_PROPERTY = "tel";
    public static final String WEB_PROPERTY = "web";

    public static final String ABI_PK_COLUMN = "ABI";
    public static final String CAB_PK_COLUMN = "CAB";

    public void setAbi(String abi) {
        writeProperty("abi", abi);
    }
    public String getAbi() {
        return (String)readProperty("abi");
    }

    public void setCab(String cab) {
        writeProperty("cab", cab);
    }
    public String getCab() {
        return (String)readProperty("cab");
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

}
