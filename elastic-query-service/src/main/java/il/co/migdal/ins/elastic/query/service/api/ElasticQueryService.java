package il.co.migdal.ins.elastic.query.service.api;

import il.co.migdal.ins.elastic.query.model.ElasticQueryServiceAnalyticsResponseModel;
import il.co.migdal.ins.elastic.query.service.common.model.ElasticQueryServiceResponseModel;

import java.util.List;

public interface ElasticQueryService {

    ElasticQueryServiceResponseModel getDocumentById(String id);

    ElasticQueryServiceAnalyticsResponseModel getDocumentByText(String text, String accessToken);

    List<ElasticQueryServiceResponseModel> getAllDocuments();
}


