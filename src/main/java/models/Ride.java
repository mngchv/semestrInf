package models;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Ride {
    private Long id;
    private String departure;
    private String destination;
    private String seats;
    private String price;
    private String car;
    private String time;



}
