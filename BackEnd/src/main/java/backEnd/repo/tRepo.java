package backEnd.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import backEnd.table.Table3;

@RepositoryRestResource
@CrossOrigin(origins = "*")
public interface tRepo extends JpaRepository<Table3, Integer>{

}
