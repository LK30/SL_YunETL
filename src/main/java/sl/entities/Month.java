package sl.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class Month {
    @Id
    private String _id;

    @Field("id")
    private int id;

    @Field("mname")
    int mname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMname() {
        return mname;
    }

    public void setMname(int mname) {
        this.mname = mname;
    }
}
