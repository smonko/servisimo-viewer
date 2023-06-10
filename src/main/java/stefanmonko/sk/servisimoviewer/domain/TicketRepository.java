package stefanmonko.sk.servisimoviewer.domain;

// import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {

    // List<Ticket> findTicketById(int id);
    
    public Ticket findTicketById(int id);

    // public Ticket findTicketBySeverity(Integer severity);

    List<Ticket> findTicketBySeverity(Integer severity);

    List<Ticket> findTicketByAssignee(String assignee);

    List<Ticket> findTicketByStatus(Integer status);

    List<Ticket> findTicketByItem(String item);
}
