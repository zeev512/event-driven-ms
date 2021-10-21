package il.co.migdal.ins.elastic.index.client.service.api;

import il.co.migdal.ins.elastic.model.index.api.IndexModel;

import java.util.List;

public interface ElasticIndexClient<T extends IndexModel> {
    List<String> save(List<T> documents);
}
