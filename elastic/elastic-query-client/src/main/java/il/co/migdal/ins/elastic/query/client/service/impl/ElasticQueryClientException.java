package il.co.migdal.ins.elastic.query.client.service.impl;

public class ElasticQueryClientException extends RuntimeException {

    public ElasticQueryClientException() {
        super();
    }

    public ElasticQueryClientException(String message) {
        super(message);
    }

    public ElasticQueryClientException(String message, Throwable t) {
        super(message, t);

    }
}