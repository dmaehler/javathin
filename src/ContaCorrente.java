import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="conta_corrente")
public class ContaCorrente {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private Integer id;
	
	@Column
	private String conta;
	
	@Column
	private Float saldo = 0F;
	
	public ContaCorrente () {
		
	}
	
	public ContaCorrente (String conta) {
		this.conta = conta;
	}
	
	public String getConta() {
		return conta;
	}
	public Float getSaldo() {
		return saldo;
	}
	
	public void depositar (Float valor) {
		saldo = saldo + valor;
	}
	
	public boolean sacar (Float valor) {
		if (valor <= saldo) {
			saldo = saldo - valor;
			return true;
		} else {
			return false;
		}
	}
	
}
