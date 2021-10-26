package il.co.migdal.ins.analytics.service.api;

import il.co.migdal.ins.analytics.service.model.AnalyticsResponseModel;

import java.util.Optional;

public interface AnalyticsService {

    Optional<AnalyticsResponseModel> getWordAnalytics(String word);
}

