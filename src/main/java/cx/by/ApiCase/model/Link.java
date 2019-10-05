package cx.by.ApiCase.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "links")
@Data
public class Link  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uid;
    private String uri;
    private Integer rid;
}
