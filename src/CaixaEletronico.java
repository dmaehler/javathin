import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


public class CaixaEletronico {

	
	
	
	
	public static void main(String[] args) {
		Session sessao = HibernateUtil.getSession();
		sessao.beginTransaction();
		
		ContaCorrente minhaCC = 
				(ContaCorrente) sessao.createCriteria(ContaCorrente.class)
				.add(Restrictions.eq("conta", "123"))
				.uniqueResult();
		
		System.out.println("Saldo: " + minhaCC.getSaldo());
		minhaCC.depositar(200F);
		System.out.println("Saldo: " + minhaCC.getSaldo());
		
		sessao.update(minhaCC);
		sessao.getTransaction().commit();
		sessao.close();
		
	}

}
