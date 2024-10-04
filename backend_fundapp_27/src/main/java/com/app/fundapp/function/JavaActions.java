package com.app.fundapp.function;

import com.app.fundapp.model.Stage;
import com.app.fundapp.model.Startup;
import com.app.fundapp.model.FundingRound;
import com.app.fundapp.model.Founder;
import com.app.fundapp.model.Document;
import com.app.fundapp.model.Investor;




import com.app.fundapp.enums.RoundStatus;
import com.app.fundapp.enums.StageName;
import com.app.fundapp.converter.StageNameConverter;
import com.app.fundapp.converter.RoundStatusConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  