/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package profissional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="profissional")

public class Profissional {

    @Id
    @GeneratedValue
    private int codigo;
    
    @Column(length=50)
    private String nomeprofissional;    
    private String RGprofissional;   
    private String CPFprofissional;   
    private String enderecoprofissional;   
    private int numprofissional;   
    private String bairroprofissional;   
    private String dataNascprofissional;   
    private String CBOprofissional;   
    private String CNESprofissional;   
    private String estadoprofissional;    
    private String estadocivilprofissional;    
    private String telefoneprofissional;    
    

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nomeprofissional
     */
    public String getNomeprofissional() {
        return nomeprofissional;
    }

    /**
     * @param nomeprofissional the nomeprofissional to set
     */
    public void setNomeprofissional(String nomeprofissional) {
        this.nomeprofissional = nomeprofissional;
    }

    /**
     * @return the RGprofissional
     */
    public String getRGprofissional() {
        return RGprofissional;
    }

    /**
     * @param RGprofissional the RGprofissional to set
     */
    public void setRGprofissional(String RGprofissional) {
        this.RGprofissional = RGprofissional;
    }

    /**
     * @return the CPFprofissional
     */
    public String getCPFprofissional() {
        return CPFprofissional;
    }

    /**
     * @param CPFprofissional the CPFprofissional to set
     */
    public void setCPFprofissional(String CPFprofissional) {
        this.CPFprofissional = CPFprofissional;
    }

    /**
     * @return the enderecoprofissional
     */
    public String getEnderecoprofissional() {
        return enderecoprofissional;
    }

    /**
     * @param enderecoprofissional the enderecoprofissional to set
     */
    public void setEnderecoprofissional(String enderecoprofissional) {
        this.enderecoprofissional = enderecoprofissional;
    }

    /**
     * @return the numprofissional
     */
    public int getNumprofissional() {
        return numprofissional;
    }

    /**
     * @param numprofissional the numprofissional to set
     */
    public void setNumprofissional(int numprofissional) {
        this.numprofissional = numprofissional;
    }

    /**
     * @return the bairroprofissional
     */
    public String getBairroprofissional() {
        return bairroprofissional;
    }

    /**
     * @param bairroprofissional the bairroprofissional to set
     */
    public void setBairroprofissional(String bairroprofissional) {
        this.bairroprofissional = bairroprofissional;
    }

    /**
     * @return the dataNascprofissional
     */
    public String getDataNascprofissional() {
        return dataNascprofissional;
    }

    /**
     * @param dataNascprofissional the dataNascprofissional to set
     */
    public void setDataNascprofissional(String dataNascprofissional) {
        this.dataNascprofissional = dataNascprofissional;
    }

    /**
     * @return the CBOprofissional
     */
    public String getCBOprofissional() {
        return CBOprofissional;
    }

    /**
     * @param CBOprofissional the CBOprofissional to set
     */
    public void setCBOprofissional(String CBOprofissional) {
        this.CBOprofissional = CBOprofissional;
    }

    /**
     * @return the CNESprofissional
     */
    public String getCNESprofissional() {
        return CNESprofissional;
    }

    /**
     * @param CNESprofissional the CNESprofissional to set
     */
    public void setCNESprofissional(String CNESprofissional) {
        this.CNESprofissional = CNESprofissional;
    }

    /**
     * @return the estadoprofissional
     */
    public String getEstadoprofissional() {
        return estadoprofissional;
    }

    /**
     * @param estadoprofissional the estadoprofissional to set
     */
    public void setEstadoprofissional(String estadoprofissional) {
        this.estadoprofissional = estadoprofissional;
    }

    /**
     * @return the estadocivilprofissional
     */
    public String getEstadocivilprofissional() {
        return estadocivilprofissional;
    }

    /**
     * @param estadocivilprofissional the estadocivilprofissional to set
     */
    public void setEstadocivilprofissional(String estadocivilprofissional) {
        this.estadocivilprofissional = estadocivilprofissional;
    }

    /**
     * @return the telefoneprofissional
     */
    public String getTelefoneprofissional() {
        return telefoneprofissional;
    }

    /**
     * @param telefoneprofissional the telefoneprofissional to set
     */
    public void setTelefoneprofissional(String telefoneprofissional) {
        this.telefoneprofissional = telefoneprofissional;
    }

    
    
    
}
