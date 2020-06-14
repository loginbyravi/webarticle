package in.rkant.webarticle.db;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.rkant.webarticle.entity.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}