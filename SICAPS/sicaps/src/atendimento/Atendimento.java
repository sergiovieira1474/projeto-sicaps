/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atendimento;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import profissional.Profissional;
import triagem.TriagemAdmissao;

@Entity
@Table(name="atendimento")

public class Atendimento {
  @Id
    @GeneratedValue
    private int idPaciente;
    
 @Temporal(TemporalType.DATE)
 private Date datadeAtendimento;
 
 @OneToMany(fetch = FetchType.EAGER)
 private TriagemAdmissao Paciente;
 
 @ManyToOne
 private Profissional Profissional;

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
     * @return the datadeAtendimento
     */
    public Date getDatadeAtendimento() {
        return datadeAtendimento;
    }

    /**
     * @param datadeAtendimento the datadeAtendimento to set
     */
    public void setDatadeAtendimento(Date datadeAtendimento) {
        this.datadeAtendimento = datadeAtendimento;
    }

    /**
     * @return the Paciente
     */
    public TriagemAdmissao getPaciente() {
        return Paciente;
    }

    /**
     * @param Paciente the Paciente to set
     */
    public void setPaciente(TriagemAdmissao Paciente) {
        this.Paciente = Paciente;
    }

    /**
     * @return the Profissional
     */
    public Profissional getProfissional() {
        return Profissional;
    }

    /**
     * @param Profissional the Profissional to set
     */
    public void setProfissional(Profissional Profissional) {
        this.Profissional = Profissional;
    }
 
    
   
}