package edu.upc.eetac.dsa.talker.entity;

import org.glassfish.jersey.linking.InjectLinks;

import javax.ws.rs.core.Link;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergi1 on 26/10/2015.
 */
public class CommentCollection {
    @InjectLinks({})
    private List<Link> links;
    private long newestTimestamp;
    private long oldestTimestamp;
    private List<Comments> stings = new ArrayList<>();

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public long getNewestTimestamp() {
        return newestTimestamp;
    }

    public void setNewestTimestamp(long newestTimestamp) {
        this.newestTimestamp = newestTimestamp;
    }

    public long getOldestTimestamp() {
        return oldestTimestamp;
    }

    public void setOldestTimestamp(long oldestTimestamp) {
        this.oldestTimestamp = oldestTimestamp;
    }

    public List<Comments> getStings() {
        return stings;
    }

    public void setStings(List<Comments> stings) {
        this.stings = stings;
    }
}
