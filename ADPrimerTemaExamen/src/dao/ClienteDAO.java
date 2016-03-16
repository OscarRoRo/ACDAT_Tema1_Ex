package dao;

import java.util.List;

import dominio.Cliente;

public interface ClienteDAO {

	public void insertarCliente(Cliente cliente);
	
	public Cliente buscarClientePorNif(String nif);
	
	public List<Cliente> listarClientes();
	
	public void actualizarCliente(Cliente cliente);
	
	public void borrarCliente(Cliente cliente);
	
	public void borrarTodosClientes();
	
	
}
