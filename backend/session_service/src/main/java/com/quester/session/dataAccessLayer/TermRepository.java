package com.quester.session.dataAccessLayer;

import com.quester.session.model.Term;
import org.springframework.data.repository.CrudRepository;

public interface TermRepository extends CrudRepository<Term, Long> {

}
