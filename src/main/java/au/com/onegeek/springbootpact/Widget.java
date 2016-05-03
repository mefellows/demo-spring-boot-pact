package au.com.onegeek.springbootpact;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by mfellows on 3/05/2016.
 */
public class Widget implements Serializable {

    private String id;
    private LocalDateTime created;
    private String name;

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}