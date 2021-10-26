package il.co.migdal.ins.reactive.elastic.query.web.client.service.api;

import il.co.migdal.ins.elastic.query.web.client.common.model.ElasticQueryWebClientRequestModel;
import il.co.migdal.ins.elastic.query.web.client.common.model.ElasticQueryWebClientResponseModel;
import reactor.core.publisher.Flux;

public interface ElasticQueryWebClient {

    Flux<ElasticQueryWebClientResponseModel> getDataByText(ElasticQueryWebClientRequestModel request);
}
