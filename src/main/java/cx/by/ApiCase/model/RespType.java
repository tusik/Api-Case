package cx.by.ApiCase.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "resptype")
@Data
public class RespType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rtid;
    private Integer code;
    private String name;
}
