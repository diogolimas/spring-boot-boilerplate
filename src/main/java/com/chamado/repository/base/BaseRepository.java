package com.chamado.repository.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;


@NoRepositoryBean
public interface BaseRepository<T, ID> extends JpaRepository<T, ID> {

	Optional<T> findById(ID id);

	<S extends T> S save(S entity);
}
