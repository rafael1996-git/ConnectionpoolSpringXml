package com.ConnectionpoolSpringXml.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ConnectionpoolSpringXml.dao.IInfoDao;
import com.ConnectionpoolSpringXml.demo.entity.Usuario;


@CrossOrigin(origins = "*", methods = { RequestMethod.GET})

@RestController
public class Controllers {

	private final Logger logger = LoggerFactory.getLogger(Controllers.class);
	/**
	 * Metodo que brinda el servicio de la consulta de Cp con parametros clave_entidad tipo GET
	 * 
	 * 
	 * EXECUTE DEPLOY mvn wildfly:deploy  -P serverLocal
	 * 
	 * http://localhost:8080/api/lista/
	 * 
	 * @param /api
	 * @param /lista 
	 * @return retorna la lista 
	 * @throws Exception si no logra obtener la conexion
	 */
	 
	@Autowired
	private IInfoDao Consulta;
	  
	   @GetMapping("/lista")
	   public @ResponseBody List<Usuario> passParametersWithModelAndView(HttpServletRequest request) throws  Exception{
		   List<Usuario> lista = Consulta.GetAll();
		   logger.debug("consulta "+lista);
		    return  lista;
		}
	   @GetMapping("/")
		public List<Usuario> index(HttpServletRequest request) throws  Exception{
		   List<Usuario> lista = Consulta.GetAll();
		   logger.debug("consulta "+lista);
			return lista;
		}
}
