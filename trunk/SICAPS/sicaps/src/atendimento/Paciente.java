/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atendimento;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="paciente")

public class Paciente {
  @Id
    @GeneratedValue
    private int idPaciente;
    
    @Column(length=50)
    private String nomePeciente;
    
    private String Nasc;
    
    private int idade;
    
    private int peso;
    
    private int altura;
    
    private String estadoCivil;
    
    private String CPF;
    
    private String Rg;
    
    private String emissao;
    
    private String cor;
    
    private String CartaoSUS;
    
    private String Religiao;
    
    private String escolaridade;
    
    private String nomePai;
    
    private String nomeMae;
    
    private String enderecoPaciente;
    
    private int numeroCasa;
    
    private String bairroPaciente;
    
    private String pontoDeReferencia;
    
    private String municipio;
    
    private int cep;
    
    private String estadoPaciente;
    
    private String telefonePaciente;
    
    private String celularPaciente;
    
    private String profissao;
    
    private String ocupacao;
    
    private String nomeResponsavel;
    
    private String enderecoResponsavel;
    
    private int numCasaResponsavel;
    
    private String telefoneResponsavel;
    
    private String pricipalSolicitante;
    
    private String sexoPaciente;

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
     * @return the nomePeciente
     */
    public String getNomePeciente() {
        return nomePeciente;
    }

    /**
     * @param nomePeciente the nomePeciente to set
     */
    public void setNomePeciente(String nomePeciente) {
        this.nomePeciente = nomePeciente;
    }

    /**
     * @return the Nasc
     */
    public String getNasc() {
        return Nasc;
    }

    /**
     * @param Nasc the Nasc to set
     */
    public void setNasc(String Nasc) {
        this.Nasc = Nasc;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * @return the estadoCivil
     */
    public String getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * @param estadoCivil the estadoCivil to set
     */
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the Rg
     */
    public String getRg() {
        return Rg;
    }

    /**
     * @param Rg the Rg to set
     */
    public void setRg(String Rg) {
        this.Rg = Rg;
    }

    /**
     * @return the emissao
     */
    public String getEmissao() {
        return emissao;
    }

    /**
     * @param emissao the emissao to set
     */
    public void setEmissao(String emissao) {
        this.emissao = emissao;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the CartaoSUS
     */
    public String getCartaoSUS() {
        return CartaoSUS;
    }

    /**
     * @param CartaoSUS the CartaoSUS to set
     */
    public void setCartaoSUS(String CartaoSUS) {
        this.CartaoSUS = CartaoSUS;
    }

    /**
     * @return the Religiao
     */
    public String getReligiao() {
        return Religiao;
    }

    /**
     * @param Religiao the Religiao to set
     */
    public void setReligiao(String Religiao) {
        this.Religiao = Religiao;
    }

    /**
     * @return the escolaridade
     */
    public String getEscolaridade() {
        return escolaridade;
    }

    /**
     * @param escolaridade the escolaridade to set
     */
    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
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
     * @return the enderecoPaciente
     */
    public String getEnderecoPaciente() {
        return enderecoPaciente;
    }

    /**
     * @param enderecoPaciente the enderecoPaciente to set
     */
    public void setEnderecoPaciente(String enderecoPaciente) {
        this.enderecoPaciente = enderecoPaciente;
    }

    /**
     * @return the numeroCasa
     */
    public int getNumeroCasa() {
        return numeroCasa;
    }

    /**
     * @param numeroCasa the numeroCasa to set
     */
    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    /**
     * @return the bairroPaciente
     */
    public String getBairroPaciente() {
        return bairroPaciente;
    }

    /**
     * @param bairroPaciente the bairroPaciente to set
     */
    public void setBairroPaciente(String bairroPaciente) {
        this.bairroPaciente = bairroPaciente;
    }

    /**
     * @return the pontoDeReferencia
     */
    public String getPontoDeReferencia() {
        return pontoDeReferencia;
    }

    /**
     * @param pontoDeReferencia the pontoDeReferencia to set
     */
    public void setPontoDeReferencia(String pontoDeReferencia) {
        this.pontoDeReferencia = pontoDeReferencia;
    }

    /**
     * @return the municipio
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * @param municipio the municipio to set
     */
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    /**
     * @return the cep
     */
    public int getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(int cep) {
        this.cep = cep;
    }

    /**
     * @return the estadoPaciente
     */
    public String getEstadoPaciente() {
        return estadoPaciente;
    }

    /**
     * @param estadoPaciente the estadoPaciente to set
     */
    public void setEstadoPaciente(String estadoPaciente) {
        this.estadoPaciente = estadoPaciente;
    }

    /**
     * @return the telefonePaciente
     */
    public String getTelefonePaciente() {
        return telefonePaciente;
    }

    /**
     * @param telefonePaciente the telefonePaciente to set
     */
    public void setTelefonePaciente(String telefonePaciente) {
        this.telefonePaciente = telefonePaciente;
    }

    /**
     * @return the celularPaciente
     */
    public String getCelularPaciente() {
        return celularPaciente;
    }

    /**
     * @param celularPaciente the celularPaciente to set
     */
    public void setCelularPaciente(String celularPaciente) {
        this.celularPaciente = celularPaciente;
    }

    /**
     * @return the profissao
     */
    public String getProfissao() {
        return profissao;
    }

    /**
     * @param profissao the profissao to set
     */
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    /**
     * @return the ocupacao
     */
    public String getOcupacao() {
        return ocupacao;
    }

    /**
     * @param ocupacao the ocupacao to set
     */
    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    /**
     * @return the nomeResponsavel
     */
    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    /**
     * @param nomeResponsavel the nomeResponsavel to set
     */
    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    /**
     * @return the enderecoResponsavel
     */
    public String getEnderecoResponsavel() {
        return enderecoResponsavel;
    }

    /**
     * @param enderecoResponsavel the enderecoResponsavel to set
     */
    public void setEnderecoResponsavel(String enderecoResponsavel) {
        this.enderecoResponsavel = enderecoResponsavel;
    }

    /**
     * @return the numCasaResponsavel
     */
    public int getNumCasaResponsavel() {
        return numCasaResponsavel;
    }

    /**
     * @param numCasaResponsavel the numCasaResponsavel to set
     */
    public void setNumCasaResponsavel(int numCasaResponsavel) {
        this.numCasaResponsavel = numCasaResponsavel;
    }

    /**
     * @return the telefoneResponsavel
     */
    public String getTelefoneResponsavel() {
        return telefoneResponsavel;
    }

    /**
     * @param telefoneResponsavel the telefoneResponsavel to set
     */
    public void setTelefoneResponsavel(String telefoneResponsavel) {
        this.telefoneResponsavel = telefoneResponsavel;
    }

    /**
     * @return the pricipalSolicitante
     */
    public String getPricipalSolicitante() {
        return pricipalSolicitante;
    }

    /**
     * @param pricipalSolicitante the pricipalSolicitante to set
     */
    public void setPricipalSolicitante(String pricipalSolicitante) {
        this.pricipalSolicitante = pricipalSolicitante;
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
 

    
   
}