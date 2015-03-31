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

public class AtendimentoDAO {
    
    private Session sessao;
    private Transaction transacao;
    
    public void salvar(Atendimento paciente){
        sessao = HibernateUtil.getSessionFactory()
                .openSession();
        transacao = sessao.beginTransaction();
        sessao.save(paciente);
        transacao.commit();
        sessao.close();
    }
      public void alterar(Atendimento paciente) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.update(paciente);
        transacao.commit();
        sessao.close();
    }

    public void excluir(Atendimento paciente) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.delete(paciente);
        transacao.commit();
        sessao.close();
    }

    public List<Atendimento> listar() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Criteria criteria = sessao.createCriteria(Atendimento.class);
        List<Atendimento> paciente = criteria.list();
        return paciente;

    }

    public List<Atendimento> pesquisaNome(String nome) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Criteria criteria = sessao.createCriteria(Atendimento.class);
        criteria.add(Restrictions.like("nome", nome, MatchMode.ANYWHERE));
        criteria.addOrder(Order.asc("nome"));
        List<Atendimento> paciente = criteria.list();
        return paciente;
    }
      public Atendimento pesquisaCartaoSUS(String Sus) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Atendimento paciente
                = (Atendimento) sessao.createCriteria(Atendimento.class).add(Restrictions.eq("cartaosus", Sus)).uniqueResult();
        return paciente;
    }
}
