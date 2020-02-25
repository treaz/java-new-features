package com.horiaconstantin;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static java.lang.System.*;
import static java.net.http.HttpRequest.BodyPublishers.noBody;

//https://www.journaldev.com/13121/java-9-features-with-examples
public class Java9Demo {

    public static void main(String[] args) throws Exception {
        http2Client();
    }

    //    Factory Methods for Immutable List, Set, Map and Map.Entry
    void collectionFactories() {
        List<Object> emptyImmutableList = List.of();
        out.println(emptyImmutableList);

        List<String> immutableList = List.of("one", "two", "three");
        out.println(immutableList);

        Map<Integer, String> nonemptyImmutableMap = Map.of(1, "one", 2, "two", 3, "three");
        out.println(nonemptyImmutableMap);
    }

//    Java 9 Reactive Streams

    //    HTTP 2 Client
    static void http2Client() throws Exception {
        URI uri = new URI("https://rams4java.blogspot.co.uk/2016/05/java-news.html");
        HttpRequest req = HttpRequest.newBuilder(uri).GET().build();
        HttpClient client = HttpClient.newHttpClient();
        client.sendAsync(req, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println).join();
    }
}
