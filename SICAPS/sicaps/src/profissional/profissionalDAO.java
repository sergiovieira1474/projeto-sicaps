/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package profissional;

import hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import profissional.Profissional;

public class profissionalDAO {
    
    private Session sessao;
    private Transaction transacao;
    
    public void salvar(Profissional profissional){
        sessao = HibernateUtil.getSessionFactory()
                .openSession();
        transacao = sessao.beginTransaction();
        sessao.save(profissional);
        transacao.commit();
        sessao.close();
    }
    
}
