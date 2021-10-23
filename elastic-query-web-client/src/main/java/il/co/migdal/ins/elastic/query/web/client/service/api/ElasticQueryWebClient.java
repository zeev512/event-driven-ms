package il.co.migdal.ins.elastic.query.web.client.service;

import il.co.migdal.ins.elastic.query.web.client.model.ElasticQueryWebClientRequestModel;
import il.co.migdal.ins.elastic.query.web.client.model.ElasticQueryWebClientResponseModel;

import java.util.List;

public interface ElasticQueryWebClient {

    List<ElasticQueryWebClientResponseModel> getDataByText(ElasticQueryWebClientRequestModel requestModel);
}
