package axonmallorchestrationsagaljp.event;

import lombok.Data;
import lombok.ToString;

//<<< DDD / Domain Event

@Data
@ToString
public class OrderCancelledEvent {

    private String orderId;
    private String productName;
    private String productId;
    private String status;
    private Integer qty;
    private String userId;
}
//>>> DDD / Domain Event
