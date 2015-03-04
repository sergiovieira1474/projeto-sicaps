/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atendimento;
import hibernate.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class PacienteDAO {
    
    private Session sessao;
    private Transaction transacao;
    
    public void salvar(Paciente paciente){
        sessao = HibernateUtil.getSessionFactory()
                .openSession();
        transacao = sessao.beginTransaction();
        sessao.save(paciente);
        transacao.commit();
        sessao.close();
    }
      public void alterar(Paciente paciente) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.update(paciente);
        transacao.commit();
        sessao.close();
    }

    public void excluir(Paciente paciente) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.delete(paciente);
        transacao.commit();
        sessao.close();
    }

    public List<Paciente> listar() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Criteria criteria = sessao.createCriteria(Paciente.class);
        List<Paciente> paciente = criteria.list();
        return paciente;

    }

    public List<Paciente> pesquisaNome(String nome) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Criteria criteria = sessao.createCriteria(Paciente.class);
        criteria.add(Restrictions.like("nome", nome, MatchMode.ANYWHERE));
        criteria.addOrder(Order.asc("nome"));
        List<Paciente> paciente = criteria.list();
        return paciente;
    }
      public Paciente pesquisaCartaoSUS(String Sus) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Paciente paciente
                = (Paciente) sessao.createCriteria(Paciente.class).add(Restrictions.eq("cartaosus", Sus)).uniqueResult();
        return paciente;
    }
}
