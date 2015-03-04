/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Elessandro
 */
public class LoginDAO {
    private Session sessao;
    private Transaction transacao;
    
    
    public void salvar(Login login) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.save(login);
        transacao.commit();
        sessao.close();
        
    }
    
    public boolean autenticacao(String login, String senha){
        
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Login login2 = (Login) sessao.createCriteria(Login.class)
                .add(Restrictions.eq("login", login))
                .add(Restrictions.eq("senha", senha)).uniqueResult();
       
        if (login2==null){
            return false;
            
        } else {
            return true;
        }
        
    }
    
}
