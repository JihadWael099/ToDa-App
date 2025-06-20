package org.springboot.todoservice.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;
@Entity
@Validated
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TodoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "you should enter a title")
    private String title;

    @NotNull(message = "you should enter a user id")
    private int userId;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "details_id", referencedColumnName = "id")
    private ToDoDetails toDoDetails;

    @Override
    public String toString() {
        return "TodoEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", userId=" + userId +
                ", toDoDetails=" + toDoDetails +
                '}';
    }
}
