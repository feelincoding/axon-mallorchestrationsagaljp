package axonmallorchestrationsagaljp.command;

import java.util.List;
import lombok.Data;
import lombok.ToString;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@ToString
@Data
public class OrderCommand {

    //<<< Etc / ID Generation
    private String orderId; // Please comment here if you want user to enter the id directly
    //>>> Etc / ID Generation
    private String productName;
    private String productId;
    private String status;
    private Integer qty;
    private String userId;
}
