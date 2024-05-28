/**
 * 
 */
package com.viscaya.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.viscaya.entities.Servicios;

/**
 * @author joseviscaya
 *
 */
public interface IServiciosRepository extends CrudRepository<Servicios, Long> {
	
	public List<Servicios> findByIdApp(long idApp);

}
