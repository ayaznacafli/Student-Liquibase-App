package com.ms.repository;

import com.ms.model.Group;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository  extends CrudRepository<Group,Long> {
}
