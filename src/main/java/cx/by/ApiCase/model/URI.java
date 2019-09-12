package cx.by.ApiCase.model;

import cx.by.ApiCase.model.category.ReturnType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "URI")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class URI {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;
    @Column
    private String address;
    @Column
    @Enumerated(EnumType.STRING)
    private HttpStatus scode = HttpStatus.OK;
    @Column
    @Enumerated(EnumType.STRING)
    private ReturnType returnType;
    @Column
    private String name;
    @Column
    private String contentType;

}
