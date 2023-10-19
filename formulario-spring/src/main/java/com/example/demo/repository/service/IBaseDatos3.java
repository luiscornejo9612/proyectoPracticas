package com.example.demo.repository.service;

import java.util.ArrayList;

import com.example.demo.bean.Libro;

public interface IBaseDatos3 {
	public void inserta(Libro libro);
	public void borrar(int id);
	public void modifica(Libro libro);
	public Libro getLibro(int id);
	public ArrayList<Libro> getLibros();
	public boolean compruebaUsuario(String usuario, String password);
}

//public interface BaseDatos3 extends JpaRepository<Libro, Integer> {
/*public void inserta(Libro libro);                //save
public void borrar(int id);                        //deleteById
public void modifica(Libro libro);                 //save       
public Libro getLibro(int id);                     //findbyId
public ArrayList<Libro> getLibros();               //findAll
public boolean compruebaUsuario(
			String usuario, String password);//No*/

//}

