package com.app.fundapp.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

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

@Entity(name = "StartupPreviousRounds")
@Table(schema = "\"fundapp_360\"", name = "\"StartupPreviousRounds\"")
@Data
public class StartupPreviousRounds{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"SId\"")
	private Integer sId;

    
    @Column(name = "\"RoundId\"")
    private Integer roundId;
 
}