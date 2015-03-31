/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triagem;

import hibernate.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import atendimento.Atendimento;

/**
 *
 * @author Elessandro
 */
public class TriagemDAO {
    private Session sessao;
    private Transaction transacao;
    
    public void salvar(TriagemAdmissao triagem){
        sessao = HibernateUtil.getSessionFactory()
                .openSession();
        transacao = sessao.beginTransaction();
        sessao.save(triagem);
        transacao.commit();
        sessao.close();
    }
      public void alterar(TriagemAdmissao triagem) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.update(triagem);
        transacao.commit();
        sessao.close();
    }

    public void excluir(TriagemAdmissao triagem) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.delete(triagem);
        transacao.commit();
        sessao.close();
    }

    public List<TriagemAdmissao> listar() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Criteria criteria = sessao.createCriteria(Atendimento.class);
        List<TriagemAdmissao> triagem = criteria.list();
        return triagem;

    }

    public List<TriagemAdmissao> pesquisaNome(String nome) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Criteria criteria = sessao.createCriteria(Atendimento.class);
        criteria.add(Restrictions.like("nome", nome, MatchMode.ANYWHERE));
        criteria.addOrder(Order.asc("nome"));
        List<TriagemAdmissao> triagem = criteria.list();
        return triagem;
    }
      public TriagemAdmissao pesquisaCartaoSUS(String Sus) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        TriagemAdmissao triagem
                = (TriagemAdmissao) sessao.createCriteria(TriagemAdmissao.class).add(Restrictions.eq("CNSPaciente", Sus)).uniqueResult();
        return triagem;
    }
}
