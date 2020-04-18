package modelo.beans;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_USUARIO")
	private int idUsuario;

	private String email;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_ALTA")
	private Date fechaAlta;

	private String nombre;

	private String password;

	@Column(name="RESULTADO_TEST")
	private int resultadoTest;

	@Column(name="TIPO_ENEAGRAMA")
	private String tipoEneagrama;

	//uni-directional many-to-one association to Eneagrama
	@ManyToOne
	@JoinColumn(name="ID_ENE")
	private Eneagrama eneagrama;

	public Usuario() {
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechaAlta() {
		return this.fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getResultadoTest() {
		return this.resultadoTest;
	}

	public void setResultadoTest(int resultadoTest) {
		this.resultadoTest = resultadoTest;
	}

	public String getTipoEneagrama() {
		return this.tipoEneagrama;
	}

	public void setTipoEneagrama(String tipoEneagrama) {
		this.tipoEneagrama = tipoEneagrama;
	}

	public Eneagrama getEneagrama() {
		return this.eneagrama;
	}

	public void setEneagrama(Eneagrama eneagrama) {
		this.eneagrama = eneagrama;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((eneagrama == null) ? 0 : eneagrama.hashCode());
		result = prime * result + ((fechaAlta == null) ? 0 : fechaAlta.hashCode());
		result = prime * result + idUsuario;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + resultadoTest;
		result = prime * result + ((tipoEneagrama == null) ? 0 : tipoEneagrama.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (eneagrama == null) {
			if (other.eneagrama != null)
				return false;
		} else if (!eneagrama.equals(other.eneagrama))
			return false;
		if (fechaAlta == null) {
			if (other.fechaAlta != null)
				return false;
		} else if (!fechaAlta.equals(other.fechaAlta))
			return false;
		if (idUsuario != other.idUsuario)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (resultadoTest != other.resultadoTest)
			return false;
		if (tipoEneagrama == null) {
			if (other.tipoEneagrama != null)
				return false;
		} else if (!tipoEneagrama.equals(other.tipoEneagrama))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", email=" + email + ", fechaAlta=" + fechaAlta + ", nombre="
				+ nombre + ", password=" + password + ", resultadoTest=" + resultadoTest + ", tipoEneagrama="
				+ tipoEneagrama + ", eneagrama=" + eneagrama + "]";
	}

	public Usuario(int idUsuario, String email, Date fechaAlta, String nombre, String password, int resultadoTest,
			String tipoEneagrama, Eneagrama eneagrama) {
		super();
		this.idUsuario = idUsuario;
		this.email = email;
		this.fechaAlta = fechaAlta;
		this.nombre = nombre;
		this.password = password;
		this.resultadoTest = resultadoTest;
		this.tipoEneagrama = tipoEneagrama;
		this.eneagrama = eneagrama;
	}

	
	
	
	
	
}