package il.co.migdal.ins.elastic.query.client.service.api;

import il.co.migdal.ins.elastic.model.index.api.IndexModel;

import java.util.List;

public interface ElasticQueryClient<T extends IndexModel> {

    T getIndexModelById(String id);

    List<T> getIndexModelByText(String text);

    List<T> getAllIndexModels();
}
