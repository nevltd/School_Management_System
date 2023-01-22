package com.quester.session.dataAccessLayer;

import org.springframework.data.repository.CrudRepository;
import com.quester.session.model.Session;

public interface SessionRepository extends CrudRepository<Session,Long> {
}
