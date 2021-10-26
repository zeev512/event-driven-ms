package il.co.migdal.ins.reactive.elastic.query.service.api;

import il.co.migdal.ins.elastic.model.index.api.IndexModel;
import il.co.migdal.ins.elastic.model.index.impl.TwitterIndexModel;
import reactor.core.publisher.Flux;

public interface ReactiveElasticQueryClient<T extends IndexModel> {

    Flux<TwitterIndexModel> getIndexModelByText(String text);
}
