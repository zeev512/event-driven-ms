package il.co.migdal.ins.analytics.service.transformer;

import il.co.migdal.ins.analytics.service.dataaccess.entity.AnalyticsEntity;
import il.co.migdal.ins.analytics.service.model.AnalyticsResponseModel;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class EntityToResponseModelTransformer {

    public Optional<AnalyticsResponseModel> getResponseModel(AnalyticsEntity twitterAnalyticsEntity) {
        if (twitterAnalyticsEntity == null)
            return Optional.empty();
        return Optional.ofNullable(AnalyticsResponseModel
                .builder()
                .id(twitterAnalyticsEntity.getId())
                .word(twitterAnalyticsEntity.getWord())
                .wordCount(twitterAnalyticsEntity.getWordCount())
                .build());
    }
}
