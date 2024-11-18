package com.paras.SwaggerImplementation.Repository;

import com.paras.SwaggerImplementation.Entity.Students1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Students1,Integer> {
}
