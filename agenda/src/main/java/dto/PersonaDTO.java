package dto;

public class PersonaDTO 
{
	private int id;
	private String nombre;
	private String telefono;
	private String nacimiento;
	private String email;

	public PersonaDTO(int id, String nombre, String telefono, String nacimiento, String email)
	{
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.nacimiento = nacimiento;
		this.email = email;
	}
	
	public int getId() 
	{
		return this.id;
	}

	public void setId(int idPersona) 
	{
		this.id = idPersona;
	}

	public String getNombre() 
	{
		return this.nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public String getTelefono() 
	{
		return this.telefono;
	}

	public void setTelefono(String telefono) 
	{
		this.telefono = telefono;
	}

	public String getNacimiento() {
		return this.nacimiento;
	}
	
	public String getEmail() {
		return this.email;
	}
}
