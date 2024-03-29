package axonmallorchestrationsagaljp.event;

import lombok.Data;
import lombok.ToString;

//<<< DDD / Domain Event

@Data
@ToString
public class DeliveryCancelledEvent {

    private String deliveryId;
    private String userId;
    private String address;
    private String orderId;
    private String productId;
    private Integer qty;
    private String status;
}
//>>> DDD / Domain Event
