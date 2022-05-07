package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Trainer {

    private String name;
    private int zoomId;

    public Trainer(){
        super();
    }

    @Override
    public String toString() {
        return "Trainer {" + '\n' +
                "name: " + name + '\n' +
                "zoomId: " + zoomId + '\n' +
                '}';
    }
}
