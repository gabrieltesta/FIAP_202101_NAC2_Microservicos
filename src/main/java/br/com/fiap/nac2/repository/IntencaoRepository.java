package br.com.fiap.nac2.repository;

import br.com.fiap.nac2.entity.IntencaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IntencaoRepository extends JpaRepository<IntencaoEntity, Long>{

}
