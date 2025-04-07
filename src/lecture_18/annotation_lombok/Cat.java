package lecture_18.annotation_lombok;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Cat {
    private String name;
    private int age;
}
