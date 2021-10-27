package il.co.migdal.ins.elastic.query.web.client.service.api;

// import il.co.migdal.ins.elastic.query.web.client.model.ElasticQueryWebClientRequestModel;
// import il.co.migdal.ins.elastic.query.web.client.model.ElasticQueryWebClientResponseModel;

import il.co.migdal.ins.elastic.query.web.client.common.model.ElasticQueryWebClientRequestModel;
import il.co.migdal.ins.elastic.query.web.client.common.model.ElasticQueryWebClientResponseModel;

import java.util.List;

public interface ElasticQueryWebClient {

    List<ElasticQueryWebClientResponseModel> getDataByText(ElasticQueryWebClientRequestModel requestModel);
}
