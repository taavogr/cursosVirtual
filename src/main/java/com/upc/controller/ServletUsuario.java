package com.upc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.upc.dto.Usuario;
import com.upc.factory.Factory;
import com.upc.service.IUsuario;

/**
 * Servlet implementation class ServletUsuario
 */
@WebServlet({"/RegistrarUsuario"})
public class ServletUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	IUsuario service = Factory.getInstance().getUsuario();
    public ServletUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String path = request.getServletPath();
		
		try {
			if (path.equals("/RegistrarUsuario")) {
				insert(request,response);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: "+ e.getMessage());
		}
	}

	/**
	 * @throws Exception 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void insert(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		Usuario usuario = new Usuario();
		String nombre = request.getParameter("fisrt_name");
		String nick = request.getParameter("nick");
		String dni = request.getParameter("dni");
		String password =request.getParameter("password");
		String correo = request.getParameter("email");
		
		usuario.setNombreUsuario(nombre);
		usuario.setUsuario(nick);
		usuario.setDniUsuario(dni);
		usuario.setClave(password);
		usuario.setCorreoUsuario(correo);
		
		service.create(usuario);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
