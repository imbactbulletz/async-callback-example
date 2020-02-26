package callback.java;

@FunctionalInterface
public interface NetworkRequestFinishedCallback<T> {
    void onNetworkRequestCompleted(T result);
}