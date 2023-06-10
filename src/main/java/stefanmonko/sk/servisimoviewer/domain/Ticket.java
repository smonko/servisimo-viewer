package stefanmonko.sk.servisimoviewer.domain;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tickets")
@Getter
@Setter
public class Ticket {

    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

    private String reporter;

    private Date date;

    private Date deadline;

    private String description;

    private Integer status;

    private Integer severity;

    private String assignee;   

    private String item;
    
    
}
