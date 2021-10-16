package smev.response;

public class Response {
    Info info;
    Object content;

    public Response() {
        this(null, null);
    }

    public Response(Object content) {
        this(null, content);
    }

    public Response(Info info, Object content) {
        if (info == null) {
            this.info = new Info();
        } else {
            this.info = info;
        }
        this.content = content;
    }

    public Response(Info info, Object content, byte[] bit) {
        if (info == null) {
            this.info = new Info();
        } else {
            this.info = info;
        }
        this.content = content;
    }


    public Info getInfo() {
        return this.info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public Object getContent() {
        return this.content;
    }

    public void setContent(Object content) {
        this.content = content;
    }


}

