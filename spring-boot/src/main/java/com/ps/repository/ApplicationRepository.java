package com.ps.repository;

import org.springframework.data.repository.CrudRepository;

import com.ps.entity.Application;

/**
 * The Interface ApplicationRepository.
 */
public interface ApplicationRepository extends CrudRepository<Application, Long> {

}
