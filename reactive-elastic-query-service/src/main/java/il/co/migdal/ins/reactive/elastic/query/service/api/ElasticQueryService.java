package il.co.migdal.ins.reactive.elastic.query.service.api;

import il.co.migdal.ins.elastic.query.service.common.model.ElasticQueryServiceResponseModel;
import reactor.core.publisher.Flux;

public interface ElasticQueryService {

    Flux<ElasticQueryServiceResponseModel> getDocumentByText(String text);
}
