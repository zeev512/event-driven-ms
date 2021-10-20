package il.co.migdal.ins.twitterkafka.runner.api;

import twitter4j.TwitterException;

public interface StreamRunner {
    void start() throws TwitterException;
}
