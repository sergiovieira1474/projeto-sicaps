/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instituicao;

import hibernate.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Sergio
 */
public class InstituicaoDAO {

    private Session sessao;
    private Transaction transacao;

    public void salvar(Instituicao instituicao) {
        sessao = HibernateUtil.getSessionFactory()
                .openSession();
        transacao = sessao.beginTransaction();
        if(instituicao.getIdInstituicao()==0){
            sessao.save(instituicao);
        } else {
            sessao.update(instituicao);
        }
        
        transacao.commit();
        sessao.close();
    }

    public void alterar(Instituicao instituicao) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.update(instituicao);
        transacao.commit();
        sessao.close();
    }

    public void excluir(Instituicao instituicao) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.delete(instituicao);
        transacao.commit();
        sessao.close();
    }

    public List<Instituicao> listar() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Criteria criteria = sessao.createCriteria(Instituicao.class);
        List<Instituicao> instituicao = criteria.list();
        return instituicao;
    }

    public List<Instituicao> pesquisaNome(String nome) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Criteria criteria = sessao.createCriteria(Instituicao.class);
        criteria.add(Restrictions.like("nome", nome, MatchMode.ANYWHERE));
        criteria.addOrder(Order.asc("nome"));
        List<Instituicao> instituicao = criteria.list();
        return instituicao;
    }

    public Instituicao pesquisaCodigo(int codigo) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Instituicao instituicao
                = (Instituicao) sessao.createCriteria(Instituicao.class).add(Restrictions.eq("idInstituicao", codigo))
                .uniqueResult();
        sessao.close();
        return instituicao;
    }
}
