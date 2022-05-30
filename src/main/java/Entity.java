import com.fasterxml.jackson.annotation.JsonProperty;

public class Entity {

    public String copyright;
    public String date;
    public String explanation;
    public String hdurl;
    @JsonProperty("media_type")
    public String mediaType;
    @JsonProperty("service_version")
    public String serviceVersion;
    public String title;
    public String url;
}
