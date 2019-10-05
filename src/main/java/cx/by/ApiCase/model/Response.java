package cx.by.ApiCase.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "response")
@Data
public class Response {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rid;
    private Integer rtype;
    private Integer status;
    private String content;
    private String response;
}
