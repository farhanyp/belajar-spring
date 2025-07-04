package dev.yp.try_springboot.run;

import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface RunRepository extends ListCrudRepository<Run, Integer> {

    List<Run> findAllByLocations(String location);

}
