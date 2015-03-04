
package triagem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Elessandro
 */
@Entity
@Table(name="triagemAdmissao")

public class TriagemAdmissao {
    
  @Id
    @GeneratedValue
    private int idPaciente;
    
    @Column(length=50)
    
    private String nomePaciente;
    private String dataNascPaciente;
    private int idadePaciente;
    private double pesoPaciente;
    private double alturaPaciente;
    private String estadocivilPaciente;
    private String CPFPaciente;
    private String RGPaciente;
    private String dataEmissao;
    private String corPaciente;
    private String CNSPaciente;
    private String regiliaoPaciente;
    private String escoalridadepaciente;
    private String sexoPaciente;
    private String nomePai;
    private String nomeMae;
    private String enderecopaciente;
    private int numpaciente;
    private String bairropaciente;
    private String pontoreferencia;
    private String municipiopaciente;
    private String CEP;
    private String estado;
    private String telefonepaciente;
    private String celularpaciente;
    private String profissaopaciente;
    private String ocupacaopaciente;
    private String nomeresponsavel;
    private String enderecoresponsavel;
    private int numresponsavel;
    private String bairroresponsavel;
    private String telefoneresponsavel;
    private String solicitante;

    /**
     * @return the idPaciente
     */
    public int getIdPaciente() {
        return idPaciente;
    }

    /**
     * @param idPaciente the idPaciente to set
     */
    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    /**
     * @return the nomePaciente
     */
    public String getNomePaciente() {
        return nomePaciente;
    }

    /**
     * @param nomePaciente the nomePaciente to set
     */
    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    /**
     * @return the dataNascPaciente
     */
    public String getDataNascPaciente() {
        return dataNascPaciente;
    }

    /**
     * @param dataNascPaciente the dataNascPaciente to set
     */
    public void setDataNascPaciente(String dataNascPaciente) {
        this.dataNascPaciente = dataNascPaciente;
    }

    /**
     * @return the idadePaciente
     */
    public int getIdadePaciente() {
        return idadePaciente;
    }

    /**
     * @param idadePaciente the idadePaciente to set
     */
    public void setIdadePaciente(int idadePaciente) {
        this.idadePaciente = idadePaciente;
    }

    /**
     * @return the pesoPaciente
     */
    public double getPesoPaciente() {
        return pesoPaciente;
    }

    /**
     * @param pesoPaciente the pesoPaciente to set
     */
    public void setPesoPaciente(float pesoPaciente) {
        this.pesoPaciente = pesoPaciente;
    }

    /**
     * @return the alturaPaciente
     */
    public double getAlturaPaciente() {
        return alturaPaciente;
    }

    /**
     * @param alturaPaciente the alturaPaciente to set
     */
    public void setAlturaPaciente(float alturaPaciente) {
        this.alturaPaciente = alturaPaciente;
    }

    /**
     * @return the estadocivilPaciente
     */
    public String getEstadocivilPaciente() {
        return estadocivilPaciente;
    }

    /**
     * @param estadocivilPaciente the estadocivilPaciente to set
     */
    public void setEstadocivilPaciente(String estadocivilPaciente) {
        this.estadocivilPaciente = estadocivilPaciente;
    }

    /**
     * @return the CPFPaciente
     */
    public String getCPFPaciente() {
        return CPFPaciente;
    }

    /**
     * @param CPFPaciente the CPFPaciente to set
     */
    public void setCPFPaciente(String CPFPaciente) {
        this.CPFPaciente = CPFPaciente;
    }

    /**
     * @return the RGPaciente
     */
    public String getRGPaciente() {
        return RGPaciente;
    }

    /**
     * @param RGPaciente the RGPaciente to set
     */
    public void setRGPaciente(String RGPaciente) {
        this.RGPaciente = RGPaciente;
    }

    /**
     * @return the dataEmissao
     */
    public String getDataEmissao() {
        return dataEmissao;
    }

    /**
     * @param dataEmissao the dataEmissao to set
     */
    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    /**
     * @return the corPaciente
     */
    public String getCorPaciente() {
        return corPaciente;
    }

    /**
     * @param corPaciente the corPaciente to set
     */
    public void setCorPaciente(String corPaciente) {
        this.corPaciente = corPaciente;
    }

    /**
     * @return the CNSPaciente
     */
    public String getCNSPaciente() {
        return CNSPaciente;
    }

    /**
     * @param CNSPaciente the CNSPaciente to set
     */
    public void setCNSPaciente(String CNSPaciente) {
        this.CNSPaciente = CNSPaciente;
    }

    /**
     * @return the regiliaoPaciente
     */
    public String getRegiliaoPaciente() {
        return regiliaoPaciente;
    }

    /**
     * @param regiliaoPaciente the regiliaoPaciente to set
     */
    public void setRegiliaoPaciente(String regiliaoPaciente) {
        this.regiliaoPaciente = regiliaoPaciente;
    }

    /**
     * @return the escoalridadepaciente
     */
    public String getEscoalridadepaciente() {
        return escoalridadepaciente;
    }

    /**
     * @param escoalridadepaciente the escoalridadepaciente to set
     */
    public void setEscoalridadepaciente(String escoalridadepaciente) {
        this.escoalridadepaciente = escoalridadepaciente;
    }

    /**
     * @return the sexoPaciente
     */
    public String getSexoPaciente() {
        return sexoPaciente;
    }

    /**
     * @param sexoPaciente the sexoPaciente to set
     */
    public void setSexoPaciente(String sexoPaciente) {
        this.sexoPaciente = sexoPaciente;
    }

    /**
     * @return the nomePai
     */
    public String getNomePai() {
        return nomePai;
    }

    /**
     * @param nomePai the nomePai to set
     */
    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    /**
     * @return the nomeMae
     */
    public String getNomeMae() {
        return nomeMae;
    }

    /**
     * @param nomeMae the nomeMae to set
     */
    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    /**
     * @return the enderecopaciente
     */
    public String getEnderecopaciente() {
        return enderecopaciente;
    }

    /**
     * @param enderecopaciente the enderecopaciente to set
     */
    public void setEnderecopaciente(String enderecopaciente) {
        this.enderecopaciente = enderecopaciente;
    }

    /**
     * @return the numpaciente
     */
    public int getNumpaciente() {
        return numpaciente;
    }

    /**
     * @param numpaciente the numpaciente to set
     */
    public void setNumpaciente(int numpaciente) {
        this.numpaciente = numpaciente;
    }

    /**
     * @return the bairropaciente
     */
    public String getBairropaciente() {
        return bairropaciente;
    }

    /**
     * @param bairropaciente the bairropaciente to set
     */
    public void setBairropaciente(String bairropaciente) {
        this.bairropaciente = bairropaciente;
    }

    /**
     * @return the pontoreferencia
     */
    public String getPontoreferencia() {
        return pontoreferencia;
    }

    /**
     * @param pontoreferencia the pontoreferencia to set
     */
    public void setPontoreferencia(String pontoreferencia) {
        this.pontoreferencia = pontoreferencia;
    }

    /**
     * @return the municipiopaciente
     */
    public String getMunicipiopaciente() {
        return municipiopaciente;
    }

    /**
     * @param municipiopaciente the municipiopaciente to set
     */
    public void setMunicipiopaciente(String municipiopaciente) {
        this.municipiopaciente = municipiopaciente;
    }

    /**
     * @return the CEP
     */
    public String getCEP() {
        return CEP;
    }

    /**
     * @param CEP the CEP to set
     */
    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the telefonepaciente
     */
    public String getTelefonepaciente() {
        return telefonepaciente;
    }

    /**
     * @param telefonepaciente the telefonepaciente to set
     */
    public void setTelefonepaciente(String telefonepaciente) {
        this.telefonepaciente = telefonepaciente;
    }

    /**
     * @return the celularpaciente
     */
    public String getCelularpaciente() {
        return celularpaciente;
    }

    /**
     * @param celularpaciente the celularpaciente to set
     */
    public void setCelularpaciente(String celularpaciente) {
        this.celularpaciente = celularpaciente;
    }

    /**
     * @return the profissaopaciente
     */
    public String getProfissaopaciente() {
        return profissaopaciente;
    }

    /**
     * @param profissaopaciente the profissaopaciente to set
     */
    public void setProfissaopaciente(String profissaopaciente) {
        this.profissaopaciente = profissaopaciente;
    }

    /**
     * @return the ocupacaopaciente
     */
    public String getOcupacaopaciente() {
        return ocupacaopaciente;
    }

    /**
     * @param ocupacaopaciente the ocupacaopaciente to set
     */
    public void setOcupacaopaciente(String ocupacaopaciente) {
        this.ocupacaopaciente = ocupacaopaciente;
    }

    /**
     * @return the nomeresponsavel
     */
    public String getNomeresponsavel() {
        return nomeresponsavel;
    }

    /**
     * @param nomeresponsavel the nomeresponsavel to set
     */
    public void setNomeresponsavel(String nomeresponsavel) {
        this.nomeresponsavel = nomeresponsavel;
    }

    /**
     * @return the enderecoresponsavel
     */
    public String getEnderecoresponsavel() {
        return enderecoresponsavel;
    }

    /**
     * @param enderecoresponsavel the enderecoresponsavel to set
     */
    public void setEnderecoresponsavel(String enderecoresponsavel) {
        this.enderecoresponsavel = enderecoresponsavel;
    }

    /**
     * @return the numresponsavel
     */
    public int getNumresponsavel() {
        return numresponsavel;
    }

    /**
     * @param numresponsavel the numresponsavel to set
     */
    public void setNumresponsavel(int numresponsavel) {
        this.numresponsavel = numresponsavel;
    }

    /**
     * @return the bairroresponsavel
     */
    public String getBairroresponsavel() {
        return bairroresponsavel;
    }

    /**
     * @param bairroresponsavel the bairroresponsavel to set
     */
    public void setBairroresponsavel(String bairroresponsavel) {
        this.bairroresponsavel = bairroresponsavel;
    }

    /**
     * @return the telefoneresponsavel
     */
    public String getTelefoneresponsavel() {
        return telefoneresponsavel;
    }

    /**
     * @param telefoneresponsavel the telefoneresponsavel to set
     */
    public void setTelefoneresponsavel(String telefoneresponsavel) {
        this.telefoneresponsavel = telefoneresponsavel;
    }

    /**
     * @return the solicitante
     */
    public String getSolicitante() {
        return solicitante;
    }

    /**
     * @param solicitante the solicitante to set
     */
    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }
    
    
   

   
    
}
